// Copyright 2016-2018, Pulumi Corporation.
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
	"path/filepath"
	"unicode"

	"github.com/SumoLogic/terraform-provider-sumologic/sumologic"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-sumologic/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "sumologic"
	// modules:
	mainMod = "index" // the y module
)

var namespaceMap = map[string]string{
	mainPkg: "SumoLogic",
}

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(sumologic.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "sumologic",
		Description: "A Pulumi package for creating and managing sumologic cloud resources.",
		Keywords:    []string{"pulumi", "sumologic"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-sumologic",
		GitHubOrg:   "SumoLogic",
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
			"sumologic_aws_inventory_source":  {Tok: makeResource(mainMod, "AwsInventorySource")},
			"sumologic_aws_xray_source":       {Tok: makeResource(mainMod, "AwsXraySource")},
			"sumologic_cloud_to_cloud_source": {Tok: makeResource(mainMod, "CloudToCloudSource")},
			"sumologic_cloudfront_source":     {Tok: makeResource(mainMod, "CloudfrontSource")},
			"sumologic_cloudsyslog_source":    {Tok: makeResource(mainMod, "CloudSyslogSource")},
			"sumologic_cloudtrail_source":     {Tok: makeResource(mainMod, "CloudtrailSource")},
			"sumologic_cloudwatch_source":     {Tok: makeResource(mainMod, "CloudwatchSource")},
			"sumologic_collector":             {Tok: makeResource(mainMod, "Collector")},
			"sumologic_collector_ingest_budget_assignment": {
				Tok:                makeResource(mainMod, "CollectorIngestBudgetAssignment"),
				DeprecationMessage: "Use Collector.fields instead to assign an ingest bucket.",
				Docs:               noUpstreamDocs(),
			},
			"sumologic_connection": {Tok: makeResource(mainMod, "Connection")},
			"sumologic_content":    {Tok: makeResource(mainMod, "Content")},
			"sumologic_content_permission": {
				Tok: makeResource(mainMod, "ContentPermission"),
				Docs: &tfbridge.DocInfo{
					Source: "content_permission_source.html.markdown",
				},
			},
			"sumologic_cse_aggregation_rule":          {Tok: makeResource(mainMod, "CseAggregationRule")},
			"sumologic_cse_chain_rule":                {Tok: makeResource(mainMod, "CseChainRule")},
			"sumologic_cse_custom_entity_type":        {Tok: makeResource(mainMod, "CseCustomEntityType")},
			"sumologic_cse_custom_insight":            {Tok: makeResource(mainMod, "CseCustomInsight")},
			"sumologic_cse_entity_criticality_config": {Tok: makeResource(mainMod, "CseEntityCriticalityConfig")},
			"sumologic_cse_entity_entity_group_configuration": {
				Tok: makeResource(mainMod, "CseEntityEntityGroupConfiguration"),
			},
			"sumologic_cse_entity_normalization_config": {
				Tok: makeResource(mainMod, "CseEntityNormalizationConfig"),
			},
			"sumologic_cse_inventory_entity_group_configuration": {
				Tok: makeResource(mainMod, "CseInventoryEntityGroupConfiguration"),
			},
			"sumologic_cse_insights_configuration": {Tok: makeResource(mainMod, "CseInsightsConfiguration")},
			"sumologic_cse_insights_resolution":    {Tok: makeResource(mainMod, "CseInsightsResolution")},
			"sumologic_cse_insights_status":        {Tok: makeResource(mainMod, "CseInsightsStatus")},
			"sumologic_cse_log_mapping":            {Tok: makeResource(mainMod, "CseLogMapping")},
			"sumologic_cse_match_list": {
				Tok: makeResource(mainMod, "CseMatchList"),
				Docs: &tfbridge.DocInfo{
					Source: "cse_log_match_list.html.markdown",
				},
			},
			"sumologic_cse_match_rule":             {Tok: makeResource(mainMod, "CseMatchRule")},
			"sumologic_cse_network_block":          {Tok: makeResource(mainMod, "CseNetworkBlock")},
			"sumologic_cse_rule_tuning_expression": {Tok: makeResource(mainMod, "CseRuleTuningExpression")},
			"sumologic_cse_threshold_rule":         {Tok: makeResource(mainMod, "CseThresholdRule")},
			"sumologic_dashboard":                  {Tok: makeResource(mainMod, "Dashboard")},
			"sumologic_elb_source":                 {Tok: makeResource(mainMod, "ElbSource")},
			"sumologic_field":                      {Tok: makeResource(mainMod, "Field")},
			"sumologic_field_extraction_rule":      {Tok: makeResource(mainMod, "FieldExtractionRule")},
			"sumologic_folder":                     {Tok: makeResource(mainMod, "Folder")},
			"sumologic_gcp_metrics_source":         {Tok: makeResource(mainMod, "GcpMetricsSource")},
			"sumologic_gcp_source":                 {Tok: makeResource(mainMod, "GcpSource")},
			"sumologic_hierarchy":                  {Tok: makeResource(mainMod, "Hierarchy")},
			"sumologic_http_source":                {Tok: makeResource(mainMod, "HttpSource")},
			"sumologic_ingest_budget":              {Tok: makeResource(mainMod, "IngestBudget")},
			"sumologic_ingest_budget_v2":           {Tok: makeResource(mainMod, "IngestBudgetV2")},
			"sumologic_installed_collector":        {Tok: makeResource(mainMod, "InstalledCollector")},
			"sumologic_kinesis_log_source":         {Tok: makeResource(mainMod, "KineisLogSource")},
			"sumologic_kinesis_metrics_source":     {Tok: makeResource(mainMod, "KinesisMetricsSource")},
			"sumologic_lookup_table":               {Tok: makeResource(mainMod, "LookupTable")},
			"sumologic_metadata_source":            {Tok: makeResource(mainMod, "MetadataSource")},
			"sumologic_monitor":                    {Tok: makeResource(mainMod, "Monitor")},
			"sumologic_monitor_folder":             {Tok: makeResource(mainMod, "MonitorFolder")},
			"sumologic_partition":                  {Tok: makeResource(mainMod, "Partition")},
			"sumologic_password_policy":            {Tok: makeResource(mainMod, "PasswordPolicy")},
			"sumologic_policies":                   {Tok: makeResource(mainMod, "Policies")},
			"sumologic_polling_source":             {Tok: makeResource(mainMod, "PollingSource")},
			"sumologic_role":                       {Tok: makeResource(mainMod, "Role")},
			"sumologic_saml_configuration":         {Tok: makeResource(mainMod, "SamlConfiguration")},
			"sumologic_slo":                        {Tok: makeResource(mainMod, "Slo")},
			"sumologic_slo_folder":                 {Tok: makeResource(mainMod, "SloFolder")},
			"sumologic_scheduled_view":             {Tok: makeResource(mainMod, "ScheduledView")},
			"sumologic_subdomain": {
				Tok: makeResource(mainMod, "Subdomain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"subdomain": {
						CSharpName: "SubdomainName",
					},
				},
			},
			"sumologic_s3_source":       {Tok: makeResource(mainMod, "S3Source")},
			"sumologic_s3_audit_source": {Tok: makeResource(mainMod, "S3AuditSource")},
			"sumologic_token":           {Tok: makeResource(mainMod, "Token")},
			"sumologic_user":            {Tok: makeResource(mainMod, "User")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"sumologic_admin_recommended_folder":       {Tok: makeDataSource(mainMod, "getAdminRecommendedFolder")},
			"sumologic_caller_identity":                {Tok: makeDataSource(mainMod, "getCallerIdentity")},
			"sumologic_collector":                      {Tok: makeDataSource(mainMod, "getCollector")},
			"sumologic_cse_log_mapping_vendor_product": {Tok: makeDataSource(mainMod, "getCseLogMappingVendorProduct")},
			"sumologic_folder":                         {Tok: makeDataSource(mainMod, "getFolder")},
			"sumologic_http_source":                    {Tok: makeDataSource(mainMod, "getHttpSource")},
			"sumologic_my_user_id": {
				Tok: makeDataSource(mainMod, "getMyUserId"),
				// This data source is not public in the upstream docs and is probably superceded by getCallerIdentity,
				// but there are no comments in the upstream repo at the time of writing that directly indicate that
				// this data source is deprecated:
				Docs: noUpstreamDocs(),
			},
			"sumologic_personal_folder": {Tok: makeDataSource(mainMod, "getPersonalFolder")},
			"sumologic_role":            {Tok: makeDataSource(mainMod, "getRole")},
			"sumologic_user":            {Tok: makeDataSource(mainMod, "getUser")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}

func noUpstreamDocs() *tfbridge.DocInfo {
	return &tfbridge.DocInfo{
		Markdown: []byte(" "),
	}
}
