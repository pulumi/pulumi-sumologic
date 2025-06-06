// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := sumologic.LookupRoleV2(ctx, &sumologic.LookupRoleV2Args{
//				Name: pulumi.StringRef("MyRole"),
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
//			_, err := sumologic.LookupRoleV2(ctx, &sumologic.LookupRoleV2Args{
//				Id: pulumi.StringRef("1234567890"),
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
// A role can be looked up by either `id` or `name`. One of those attributes needs to be specified.
//
// If both `id` and `name` have been specified, `id` takes precedence.
//
// ## Attributes reference
//
// The following attributes are exported:
//
// - `id` - The internal ID of the role. This can be used to create users having that role.
// - `name` - The name of the role.
// - `description` - The description of the role.
// - `capabilities` - The list of capabilities associated with the role.
// - `selectedViews` - List of views with specific view level filters in accordance to the selectionType chosen.
// - `auditDataFilter` - The search filter which would be applied on partitions which belong to Audit Data product area. Help Doc : (https://help.sumologic.com/docs/manage/security/audit-index/).
// - `securityDataFilter` - The search filter which would be applied on partitions which belong to Security Data product area.
// - `logAnalyticsFilter` - The search filter which would be applied on partitions which belong to Log Analytics product area.
// - `selectionType` - Describes the Permission Construct for the list of views in "selectedViews" parameter.
// ### Values in selection type are :
//   - `All` selectionType would allow access to all views in the org.
//   - `Allow` selectionType would allow access to specific views mentioned in "selectedViews" parameter.
//   - `Deny` selectionType would deny access to specific views mentioned in "selectedViews" parameter.
func LookupRoleV2(ctx *pulumi.Context, args *LookupRoleV2Args, opts ...pulumi.InvokeOption) (*LookupRoleV2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRoleV2Result
	err := ctx.Invoke("sumologic:index/getRoleV2:getRoleV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoleV2.
type LookupRoleV2Args struct {
	Id   *string `pulumi:"id"`
	Name *string `pulumi:"name"`
}

// A collection of values returned by getRoleV2.
type LookupRoleV2Result struct {
	AuditDataFilter    string                  `pulumi:"auditDataFilter"`
	Capabilities       []string                `pulumi:"capabilities"`
	Description        string                  `pulumi:"description"`
	Id                 string                  `pulumi:"id"`
	LogAnalyticsFilter string                  `pulumi:"logAnalyticsFilter"`
	Name               string                  `pulumi:"name"`
	SecurityDataFilter string                  `pulumi:"securityDataFilter"`
	SelectedViews      []GetRoleV2SelectedView `pulumi:"selectedViews"`
	SelectionType      string                  `pulumi:"selectionType"`
}

func LookupRoleV2Output(ctx *pulumi.Context, args LookupRoleV2OutputArgs, opts ...pulumi.InvokeOption) LookupRoleV2ResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRoleV2ResultOutput, error) {
			args := v.(LookupRoleV2Args)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("sumologic:index/getRoleV2:getRoleV2", args, LookupRoleV2ResultOutput{}, options).(LookupRoleV2ResultOutput), nil
		}).(LookupRoleV2ResultOutput)
}

// A collection of arguments for invoking getRoleV2.
type LookupRoleV2OutputArgs struct {
	Id   pulumi.StringPtrInput `pulumi:"id"`
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupRoleV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleV2Args)(nil)).Elem()
}

// A collection of values returned by getRoleV2.
type LookupRoleV2ResultOutput struct{ *pulumi.OutputState }

func (LookupRoleV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleV2Result)(nil)).Elem()
}

func (o LookupRoleV2ResultOutput) ToLookupRoleV2ResultOutput() LookupRoleV2ResultOutput {
	return o
}

func (o LookupRoleV2ResultOutput) ToLookupRoleV2ResultOutputWithContext(ctx context.Context) LookupRoleV2ResultOutput {
	return o
}

func (o LookupRoleV2ResultOutput) AuditDataFilter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.AuditDataFilter }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) Capabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRoleV2Result) []string { return v.Capabilities }).(pulumi.StringArrayOutput)
}

func (o LookupRoleV2ResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) LogAnalyticsFilter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.LogAnalyticsFilter }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) SecurityDataFilter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.SecurityDataFilter }).(pulumi.StringOutput)
}

func (o LookupRoleV2ResultOutput) SelectedViews() GetRoleV2SelectedViewArrayOutput {
	return o.ApplyT(func(v LookupRoleV2Result) []GetRoleV2SelectedView { return v.SelectedViews }).(GetRoleV2SelectedViewArrayOutput)
}

func (o LookupRoleV2ResultOutput) SelectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleV2Result) string { return v.SelectionType }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRoleV2ResultOutput{})
}
