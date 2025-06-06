// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an easy way to retrieve all Sumo Logic v2 apps.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sumologic.GetApps(ctx, &sumologic.GetAppsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sumologic.GetApps(ctx, &sumologic.GetAppsArgs{
//				Name:   pulumi.StringRef("MySQL - OpenTelemetry"),
//				Author: pulumi.StringRef("Sumo Logic"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Attributes reference
//
// The following attributes are exported:
//
// - `uuid` - UUID of the app.
// - `name` - Name of the app.
// - `description` - Description of the app.
// - `latestVersion` - Latest version of the app.
// - `icon` - URL of the icon for the app.
// - `author` - Author of the app.
// - `accountTypes` - URL of the icon for the app
// - `logAnalyticsFilter` - The search filter which would be applied on partitions which belong to Log Analytics product area.
// - `beta` - URL of the icon for the app.
// - `installs` - Number of times the app was installed.
// - `appType` - Type of an app.
// - `attributes` - A map of attributes for this app. Attributes allow to group apps based on different criteria.
// ### Values in attributes type are :
//   - `category`
//   - `useCase`
//   - `collection`
//
// - `family` - Provides a mechanism to link different apps.
// - `installable` - Whether the app is installable or not as not all apps are installable.
// - `showOnMarketplace` - Whether the app should show up on sumologic.com/applications webpage.
func GetApps(ctx *pulumi.Context, args *GetAppsArgs, opts ...pulumi.InvokeOption) (*GetAppsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppsResult
	err := ctx.Invoke("sumologic:index/getApps:getApps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApps.
type GetAppsArgs struct {
	Author *string `pulumi:"author"`
	Name   *string `pulumi:"name"`
}

// A collection of values returned by getApps.
type GetAppsResult struct {
	Apps   []GetAppsApp `pulumi:"apps"`
	Author *string      `pulumi:"author"`
	Id     string       `pulumi:"id"`
	Name   *string      `pulumi:"name"`
}

func GetAppsOutput(ctx *pulumi.Context, args GetAppsOutputArgs, opts ...pulumi.InvokeOption) GetAppsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAppsResultOutput, error) {
			args := v.(GetAppsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sumologic:index/getApps:getApps", args, GetAppsResultOutput{}, options).(GetAppsResultOutput), nil
		}).(GetAppsResultOutput)
}

// A collection of arguments for invoking getApps.
type GetAppsOutputArgs struct {
	Author pulumi.StringPtrInput `pulumi:"author"`
	Name   pulumi.StringPtrInput `pulumi:"name"`
}

func (GetAppsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsArgs)(nil)).Elem()
}

// A collection of values returned by getApps.
type GetAppsResultOutput struct{ *pulumi.OutputState }

func (GetAppsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppsResult)(nil)).Elem()
}

func (o GetAppsResultOutput) ToGetAppsResultOutput() GetAppsResultOutput {
	return o
}

func (o GetAppsResultOutput) ToGetAppsResultOutputWithContext(ctx context.Context) GetAppsResultOutput {
	return o
}

func (o GetAppsResultOutput) Apps() GetAppsAppArrayOutput {
	return o.ApplyT(func(v GetAppsResult) []GetAppsApp { return v.Apps }).(GetAppsAppArrayOutput)
}

func (o GetAppsResultOutput) Author() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAppsResult) *string { return v.Author }).(pulumi.StringPtrOutput)
}

func (o GetAppsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAppsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppsResultOutput{})
}
