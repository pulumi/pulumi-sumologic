// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a [Sumologic Metrics Search](https://help.sumologic.com/docs/metrics/metrics-queries/metrics-explorer/).
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
//			personalFolder, err := sumologic.GetPersonalFolder(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sumologic.NewMetricsSearch(ctx, "exampleMetricsSearch", &sumologic.MetricsSearchArgs{
//				Title:       pulumi.String("Demo Metrics Search"),
//				Description: pulumi.String("Demo search description"),
//				ParentId:    *pulumi.String(personalFolder.Id),
//				MetricsQueries: sumologic.MetricsSearchMetricsQueryArray{
//					&sumologic.MetricsSearchMetricsQueryArgs{
//						RowId: pulumi.String("A"),
//						Query: pulumi.String("metric=cpu_idle | avg"),
//					},
//				},
//				DesiredQuantizationInSecs: pulumi.Int(0),
//				TimeRange: &sumologic.MetricsSearchTimeRangeArgs{
//					BeginBoundedTimeRange: &sumologic.MetricsSearchTimeRangeBeginBoundedTimeRangeArgs{
//						From: &sumologic.MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs{
//							RelativeTimeRange: &sumologic.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs{
//								RelativeTime: pulumi.String("-30m"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Attributes reference
//
// In addition to all arguments above, the following attributes are exported:
//
// - `id` - The ID of the log search.
//
// ## Import
//
// # A metrics search can be imported using it's identifier, e.g.hcl
//
// ```sh
//
//	$ pulumi import sumologic:index/metricsSearch:MetricsSearch example_search 0000000007FFD79D
//
// ```
//
//	[1]https://help.sumologic.com/docs/metrics/metrics-queries/metrics-explorer/
type MetricsSearch struct {
	pulumi.CustomResourceState

	// Description of the search.
	Description pulumi.StringOutput `pulumi:"description"`
	// Desired quantization in seconds. Default value is `0`.
	DesiredQuantizationInSecs pulumi.IntPtrOutput `pulumi:"desiredQuantizationInSecs"`
	// Log query used to add an overlay to the chart.
	LogQuery pulumi.StringPtrOutput `pulumi:"logQuery"`
	// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
	MetricsQueries MetricsSearchMetricsQueryArrayOutput `pulumi:"metricsQueries"`
	// The identifier of the folder to create the log search in.
	ParentId pulumi.StringOutput `pulumi:"parentId"`
	// Time range of the log search. See time range schema
	TimeRange MetricsSearchTimeRangeOutput `pulumi:"timeRange"`
	// Title of the search.
	Title pulumi.StringOutput `pulumi:"title"`
}

// NewMetricsSearch registers a new resource with the given unique name, arguments, and options.
func NewMetricsSearch(ctx *pulumi.Context,
	name string, args *MetricsSearchArgs, opts ...pulumi.ResourceOption) (*MetricsSearch, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.MetricsQueries == nil {
		return nil, errors.New("invalid value for required argument 'MetricsQueries'")
	}
	if args.ParentId == nil {
		return nil, errors.New("invalid value for required argument 'ParentId'")
	}
	if args.TimeRange == nil {
		return nil, errors.New("invalid value for required argument 'TimeRange'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MetricsSearch
	err := ctx.RegisterResource("sumologic:index/metricsSearch:MetricsSearch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetricsSearch gets an existing MetricsSearch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetricsSearch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetricsSearchState, opts ...pulumi.ResourceOption) (*MetricsSearch, error) {
	var resource MetricsSearch
	err := ctx.ReadResource("sumologic:index/metricsSearch:MetricsSearch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetricsSearch resources.
type metricsSearchState struct {
	// Description of the search.
	Description *string `pulumi:"description"`
	// Desired quantization in seconds. Default value is `0`.
	DesiredQuantizationInSecs *int `pulumi:"desiredQuantizationInSecs"`
	// Log query used to add an overlay to the chart.
	LogQuery *string `pulumi:"logQuery"`
	// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
	MetricsQueries []MetricsSearchMetricsQuery `pulumi:"metricsQueries"`
	// The identifier of the folder to create the log search in.
	ParentId *string `pulumi:"parentId"`
	// Time range of the log search. See time range schema
	TimeRange *MetricsSearchTimeRange `pulumi:"timeRange"`
	// Title of the search.
	Title *string `pulumi:"title"`
}

type MetricsSearchState struct {
	// Description of the search.
	Description pulumi.StringPtrInput
	// Desired quantization in seconds. Default value is `0`.
	DesiredQuantizationInSecs pulumi.IntPtrInput
	// Log query used to add an overlay to the chart.
	LogQuery pulumi.StringPtrInput
	// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
	MetricsQueries MetricsSearchMetricsQueryArrayInput
	// The identifier of the folder to create the log search in.
	ParentId pulumi.StringPtrInput
	// Time range of the log search. See time range schema
	TimeRange MetricsSearchTimeRangePtrInput
	// Title of the search.
	Title pulumi.StringPtrInput
}

func (MetricsSearchState) ElementType() reflect.Type {
	return reflect.TypeOf((*metricsSearchState)(nil)).Elem()
}

type metricsSearchArgs struct {
	// Description of the search.
	Description string `pulumi:"description"`
	// Desired quantization in seconds. Default value is `0`.
	DesiredQuantizationInSecs *int `pulumi:"desiredQuantizationInSecs"`
	// Log query used to add an overlay to the chart.
	LogQuery *string `pulumi:"logQuery"`
	// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
	MetricsQueries []MetricsSearchMetricsQuery `pulumi:"metricsQueries"`
	// The identifier of the folder to create the log search in.
	ParentId string `pulumi:"parentId"`
	// Time range of the log search. See time range schema
	TimeRange MetricsSearchTimeRange `pulumi:"timeRange"`
	// Title of the search.
	Title string `pulumi:"title"`
}

// The set of arguments for constructing a MetricsSearch resource.
type MetricsSearchArgs struct {
	// Description of the search.
	Description pulumi.StringInput
	// Desired quantization in seconds. Default value is `0`.
	DesiredQuantizationInSecs pulumi.IntPtrInput
	// Log query used to add an overlay to the chart.
	LogQuery pulumi.StringPtrInput
	// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
	MetricsQueries MetricsSearchMetricsQueryArrayInput
	// The identifier of the folder to create the log search in.
	ParentId pulumi.StringInput
	// Time range of the log search. See time range schema
	TimeRange MetricsSearchTimeRangeInput
	// Title of the search.
	Title pulumi.StringInput
}

func (MetricsSearchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metricsSearchArgs)(nil)).Elem()
}

type MetricsSearchInput interface {
	pulumi.Input

	ToMetricsSearchOutput() MetricsSearchOutput
	ToMetricsSearchOutputWithContext(ctx context.Context) MetricsSearchOutput
}

func (*MetricsSearch) ElementType() reflect.Type {
	return reflect.TypeOf((**MetricsSearch)(nil)).Elem()
}

func (i *MetricsSearch) ToMetricsSearchOutput() MetricsSearchOutput {
	return i.ToMetricsSearchOutputWithContext(context.Background())
}

func (i *MetricsSearch) ToMetricsSearchOutputWithContext(ctx context.Context) MetricsSearchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricsSearchOutput)
}

// MetricsSearchArrayInput is an input type that accepts MetricsSearchArray and MetricsSearchArrayOutput values.
// You can construct a concrete instance of `MetricsSearchArrayInput` via:
//
//	MetricsSearchArray{ MetricsSearchArgs{...} }
type MetricsSearchArrayInput interface {
	pulumi.Input

	ToMetricsSearchArrayOutput() MetricsSearchArrayOutput
	ToMetricsSearchArrayOutputWithContext(context.Context) MetricsSearchArrayOutput
}

type MetricsSearchArray []MetricsSearchInput

func (MetricsSearchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetricsSearch)(nil)).Elem()
}

func (i MetricsSearchArray) ToMetricsSearchArrayOutput() MetricsSearchArrayOutput {
	return i.ToMetricsSearchArrayOutputWithContext(context.Background())
}

func (i MetricsSearchArray) ToMetricsSearchArrayOutputWithContext(ctx context.Context) MetricsSearchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricsSearchArrayOutput)
}

// MetricsSearchMapInput is an input type that accepts MetricsSearchMap and MetricsSearchMapOutput values.
// You can construct a concrete instance of `MetricsSearchMapInput` via:
//
//	MetricsSearchMap{ "key": MetricsSearchArgs{...} }
type MetricsSearchMapInput interface {
	pulumi.Input

	ToMetricsSearchMapOutput() MetricsSearchMapOutput
	ToMetricsSearchMapOutputWithContext(context.Context) MetricsSearchMapOutput
}

type MetricsSearchMap map[string]MetricsSearchInput

func (MetricsSearchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetricsSearch)(nil)).Elem()
}

func (i MetricsSearchMap) ToMetricsSearchMapOutput() MetricsSearchMapOutput {
	return i.ToMetricsSearchMapOutputWithContext(context.Background())
}

func (i MetricsSearchMap) ToMetricsSearchMapOutputWithContext(ctx context.Context) MetricsSearchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricsSearchMapOutput)
}

type MetricsSearchOutput struct{ *pulumi.OutputState }

func (MetricsSearchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetricsSearch)(nil)).Elem()
}

func (o MetricsSearchOutput) ToMetricsSearchOutput() MetricsSearchOutput {
	return o
}

func (o MetricsSearchOutput) ToMetricsSearchOutputWithContext(ctx context.Context) MetricsSearchOutput {
	return o
}

// Description of the search.
func (o MetricsSearchOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricsSearch) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Desired quantization in seconds. Default value is `0`.
func (o MetricsSearchOutput) DesiredQuantizationInSecs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MetricsSearch) pulumi.IntPtrOutput { return v.DesiredQuantizationInSecs }).(pulumi.IntPtrOutput)
}

// Log query used to add an overlay to the chart.
func (o MetricsSearchOutput) LogQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetricsSearch) pulumi.StringPtrOutput { return v.LogQuery }).(pulumi.StringPtrOutput)
}

// Array of objects MetricsSearchQuery. Metrics queries, up to the maximum of six.
func (o MetricsSearchOutput) MetricsQueries() MetricsSearchMetricsQueryArrayOutput {
	return o.ApplyT(func(v *MetricsSearch) MetricsSearchMetricsQueryArrayOutput { return v.MetricsQueries }).(MetricsSearchMetricsQueryArrayOutput)
}

// The identifier of the folder to create the log search in.
func (o MetricsSearchOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricsSearch) pulumi.StringOutput { return v.ParentId }).(pulumi.StringOutput)
}

// Time range of the log search. See time range schema
func (o MetricsSearchOutput) TimeRange() MetricsSearchTimeRangeOutput {
	return o.ApplyT(func(v *MetricsSearch) MetricsSearchTimeRangeOutput { return v.TimeRange }).(MetricsSearchTimeRangeOutput)
}

// Title of the search.
func (o MetricsSearchOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricsSearch) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

type MetricsSearchArrayOutput struct{ *pulumi.OutputState }

func (MetricsSearchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetricsSearch)(nil)).Elem()
}

func (o MetricsSearchArrayOutput) ToMetricsSearchArrayOutput() MetricsSearchArrayOutput {
	return o
}

func (o MetricsSearchArrayOutput) ToMetricsSearchArrayOutputWithContext(ctx context.Context) MetricsSearchArrayOutput {
	return o
}

func (o MetricsSearchArrayOutput) Index(i pulumi.IntInput) MetricsSearchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetricsSearch {
		return vs[0].([]*MetricsSearch)[vs[1].(int)]
	}).(MetricsSearchOutput)
}

type MetricsSearchMapOutput struct{ *pulumi.OutputState }

func (MetricsSearchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetricsSearch)(nil)).Elem()
}

func (o MetricsSearchMapOutput) ToMetricsSearchMapOutput() MetricsSearchMapOutput {
	return o
}

func (o MetricsSearchMapOutput) ToMetricsSearchMapOutputWithContext(ctx context.Context) MetricsSearchMapOutput {
	return o
}

func (o MetricsSearchMapOutput) MapIndex(k pulumi.StringInput) MetricsSearchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetricsSearch {
		return vs[0].(map[string]*MetricsSearch)[vs[1].(string)]
	}).(MetricsSearchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetricsSearchInput)(nil)).Elem(), &MetricsSearch{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetricsSearchArrayInput)(nil)).Elem(), MetricsSearchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetricsSearchMapInput)(nil)).Elem(), MetricsSearchMap{})
	pulumi.RegisterOutputType(MetricsSearchOutput{})
	pulumi.RegisterOutputType(MetricsSearchArrayOutput{})
	pulumi.RegisterOutputType(MetricsSearchMapOutput{})
}