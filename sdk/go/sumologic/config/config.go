// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

func GetAccessId(ctx *pulumi.Context) string {
	return config.Get(ctx, "sumologic:accessId")
}
func GetAccessKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "sumologic:accessKey")
}
func GetAdminMode(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "sumologic:adminMode")
}
func GetBaseUrl(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "sumologic:baseUrl")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SUMOLOGIC_BASE_URL"); d != nil {
		value = d.(string)
	}
	return value
}
func GetEnvironment(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "sumologic:environment")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "SUMOLOGIC_ENVIRONMENT"); d != nil {
		value = d.(string)
	}
	return value
}
