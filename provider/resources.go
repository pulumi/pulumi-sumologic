// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package sumologic

import (
	"fmt"
	"path"

	_ "embed" // embed package blank import

	"github.com/SumoLogic/terraform-provider-sumologic/sumologic"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"

	"github.com/pulumi/pulumi-sumologic/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "sumologic"
	// modules:
	mainMod = "index" // the main module
)

var namespaceMap = map[string]string{
	mainPkg: "SumoLogic",
}

//go:embed cmd/pulumi-resource-sumologic/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(sumologic.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "sumologic",
		Description:      "A Pulumi package for creating and managing sumologic cloud resources.",
		Keywords:         []string{"pulumi", "sumologic"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		Repository:       "https://github.com/pulumi/pulumi-sumologic",
		GitHubOrg:        "SumoLogic",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		Config: map[string]*tfbridge.SchemaInfo{
			"environment": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SUMOLOGIC_ENVIRONMENT"},
				},
			},
			"base_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SUMOLOGIC_BASE_URL"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"sumologic_cloudsyslog_source": {
				// Manual mapping required to keep compatible with the non-standard capitalization
				// of "cloudsyslog" -> CloudSyslog".
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "CloudSyslogSource"),
			},

			"sumologic_collector_ingest_budget_assignment": {
				DeprecationMessage: "Use Collector.fields instead to assign an ingest bucket.",
				Docs:               &tfbridge.DocInfo{AllowMissing: true},
			},
			"sumologic_content_permission": {
				Docs: &tfbridge.DocInfo{
					Source: "content_permission_source.html.markdown",
				},
			},
			"sumologic_cse_match_list": {
				Docs: &tfbridge.DocInfo{
					Source: "cse_log_match_list.html.markdown",
				},
			},
			"sumologic_subdomain": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"subdomain": {
						CSharpName: "SubdomainName",
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"sumologic_my_user_id": {
				// This data source is not public in the upstream docs and is probably superseded
				// by getCallerIdentity, but there are no comments in the upstream repo at the time
				// of writing that directly indicate that this data source is deprecated:
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("sumologic_",
		mainMod, tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}
