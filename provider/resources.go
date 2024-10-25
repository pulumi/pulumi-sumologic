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
	"bytes"
	"fmt"
	"os"
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
		DocRules:         &tfbridge.DocRuleInfo{EditRules: editRules},
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

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		replaceRefresh,
		fixInstallationExample,
		fixInstallationUsages,
	)
}

// Fix up TF command to Pulumi equivalent
var replaceRefresh = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		b := bytes.ReplaceAll(
			content,
			[]byte("-refresh-only"),
			[]byte("--refresh"),
		)
		return b, nil
	},
}

// In the upstream example, two providers are defined in the same code block.
// Pulumi Convert is not set up to handle this case, so this edit breaks the example up into two separate code blocks.
var fixInstallationExample = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		input, err := os.ReadFile("provider/installation-replaces/example-input.md")
		if err != nil {
			return nil, err
		}
		replace, err := os.ReadFile("provider/installation-replaces/example-desired.md")
		if err != nil {
			return nil, err
		}
		b := bytes.ReplaceAll(
			content,
			input,
			replace)
		return b, nil
	},
}

var fixInstallationUsages = tfbridge.DocsEdit{
	Path: "index.html.markdown",
	Edit: func(_ string, content []byte) ([]byte, error) {
		files := []string{
			"usage1",
			"usage2",
			"usage3",
		}
		for _, file := range files {
			input, err := os.ReadFile("provider/installation-replaces/" + file + "-input.md")
			if err != nil {
				return nil, err
			}
			content = bytes.ReplaceAll(
				content,
				input,
				nil)

		}
		return content, nil
	},
}
