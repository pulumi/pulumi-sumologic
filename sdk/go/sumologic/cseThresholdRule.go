// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Sumo Logic CSE [Threshold Rule](https://help.sumologic.com/Cloud_SIEM_Enterprise/CSE_Rules/05_Write_a_Threshold_Rule).
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
//			_, err := sumologic.NewCseThresholdRule(ctx, "threshold_rule", &sumologic.CseThresholdRuleArgs{
//				CountDistinct: pulumi.Bool(true),
//				CountField:    pulumi.String("dstDevice_hostname"),
//				Description:   pulumi.String("Signal description"),
//				Enabled:       pulumi.Bool(true),
//				EntitySelectors: sumologic.CseThresholdRuleEntitySelectorArray{
//					&sumologic.CseThresholdRuleEntitySelectorArgs{
//						EntityType: pulumi.String("_ip"),
//						Expression: pulumi.String("srcDevice_ip"),
//					},
//				},
//				Expression: pulumi.String("objectType = \"Network\""),
//				GroupByFields: pulumi.StringArray{
//					pulumi.String("dstDevice_hostname"),
//				},
//				IsPrototype:       pulumi.Bool(false),
//				Limit:             pulumi.Int(1000),
//				Name:              pulumi.String("Threshold Rule Example"),
//				Severity:          pulumi.Int(5),
//				SummaryExpression: pulumi.String("Signal summary"),
//				Tags: pulumi.StringArray{
//					pulumi.String("_mitreAttackTactic:TA0009"),
//				},
//				WindowSize:            pulumi.String("T30M"),
//				SuppressionWindowSize: pulumi.Int(2100000),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Threshold Rules can be imported using the field id, e.g.:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/cseThresholdRule:CseThresholdRule threshold_rule id
// ```
type CseThresholdRule struct {
	pulumi.CustomResourceState

	// Whether to count distinct values of a field, as opposed to just counting the number of records
	CountDistinct pulumi.BoolPtrOutput `pulumi:"countDistinct"`
	// The field to count if `countDistinct` is set to true
	CountField pulumi.StringPtrOutput `pulumi:"countField"`
	// The description of the generated Signals
	Description pulumi.StringOutput `pulumi:"description"`
	// Whether the rule should generate Signals
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseThresholdRuleEntitySelectorArrayOutput `pulumi:"entitySelectors"`
	// The expression for which records to match on
	Expression pulumi.StringOutput `pulumi:"expression"`
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayOutput `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrOutput `pulumi:"isPrototype"`
	// A Signal will be fired when this many records/distinct field values are matched
	Limit pulumi.IntOutput `pulumi:"limit"`
	// The name of the Rule and the generated Signals
	Name pulumi.StringOutput `pulumi:"name"`
	// The severity of the generated Signals
	Severity pulumi.IntOutput `pulumi:"severity"`
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrOutput `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrOutput `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringOutput    `pulumi:"windowSize"`
	WindowSizeMillis pulumi.StringPtrOutput `pulumi:"windowSizeMillis"`
}

// NewCseThresholdRule registers a new resource with the given unique name, arguments, and options.
func NewCseThresholdRule(ctx *pulumi.Context,
	name string, args *CseThresholdRuleArgs, opts ...pulumi.ResourceOption) (*CseThresholdRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.EntitySelectors == nil {
		return nil, errors.New("invalid value for required argument 'EntitySelectors'")
	}
	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.Limit == nil {
		return nil, errors.New("invalid value for required argument 'Limit'")
	}
	if args.Severity == nil {
		return nil, errors.New("invalid value for required argument 'Severity'")
	}
	if args.WindowSize == nil {
		return nil, errors.New("invalid value for required argument 'WindowSize'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CseThresholdRule
	err := ctx.RegisterResource("sumologic:index/cseThresholdRule:CseThresholdRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCseThresholdRule gets an existing CseThresholdRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCseThresholdRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CseThresholdRuleState, opts ...pulumi.ResourceOption) (*CseThresholdRule, error) {
	var resource CseThresholdRule
	err := ctx.ReadResource("sumologic:index/cseThresholdRule:CseThresholdRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CseThresholdRule resources.
type cseThresholdRuleState struct {
	// Whether to count distinct values of a field, as opposed to just counting the number of records
	CountDistinct *bool `pulumi:"countDistinct"`
	// The field to count if `countDistinct` is set to true
	CountField *string `pulumi:"countField"`
	// The description of the generated Signals
	Description *string `pulumi:"description"`
	// Whether the rule should generate Signals
	Enabled *bool `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors []CseThresholdRuleEntitySelector `pulumi:"entitySelectors"`
	// The expression for which records to match on
	Expression *string `pulumi:"expression"`
	// A list of fields to group records by
	GroupByFields []string `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype *bool `pulumi:"isPrototype"`
	// A Signal will be fired when this many records/distinct field values are matched
	Limit *int `pulumi:"limit"`
	// The name of the Rule and the generated Signals
	Name *string `pulumi:"name"`
	// The severity of the generated Signals
	Severity *int `pulumi:"severity"`
	// The summary of the generated Signals
	SummaryExpression *string `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize *int `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags []string `pulumi:"tags"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       *string `pulumi:"windowSize"`
	WindowSizeMillis *string `pulumi:"windowSizeMillis"`
}

type CseThresholdRuleState struct {
	// Whether to count distinct values of a field, as opposed to just counting the number of records
	CountDistinct pulumi.BoolPtrInput
	// The field to count if `countDistinct` is set to true
	CountField pulumi.StringPtrInput
	// The description of the generated Signals
	Description pulumi.StringPtrInput
	// Whether the rule should generate Signals
	Enabled pulumi.BoolPtrInput
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseThresholdRuleEntitySelectorArrayInput
	// The expression for which records to match on
	Expression pulumi.StringPtrInput
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayInput
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrInput
	// A Signal will be fired when this many records/distinct field values are matched
	Limit pulumi.IntPtrInput
	// The name of the Rule and the generated Signals
	Name pulumi.StringPtrInput
	// The severity of the generated Signals
	Severity pulumi.IntPtrInput
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrInput
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrInput
	// The tags of the generated Signals
	Tags pulumi.StringArrayInput
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringPtrInput
	WindowSizeMillis pulumi.StringPtrInput
}

func (CseThresholdRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*cseThresholdRuleState)(nil)).Elem()
}

type cseThresholdRuleArgs struct {
	// Whether to count distinct values of a field, as opposed to just counting the number of records
	CountDistinct *bool `pulumi:"countDistinct"`
	// The field to count if `countDistinct` is set to true
	CountField *string `pulumi:"countField"`
	// The description of the generated Signals
	Description string `pulumi:"description"`
	// Whether the rule should generate Signals
	Enabled bool `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors []CseThresholdRuleEntitySelector `pulumi:"entitySelectors"`
	// The expression for which records to match on
	Expression string `pulumi:"expression"`
	// A list of fields to group records by
	GroupByFields []string `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype *bool `pulumi:"isPrototype"`
	// A Signal will be fired when this many records/distinct field values are matched
	Limit int `pulumi:"limit"`
	// The name of the Rule and the generated Signals
	Name *string `pulumi:"name"`
	// The severity of the generated Signals
	Severity int `pulumi:"severity"`
	// The summary of the generated Signals
	SummaryExpression *string `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize *int `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags []string `pulumi:"tags"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       string  `pulumi:"windowSize"`
	WindowSizeMillis *string `pulumi:"windowSizeMillis"`
}

// The set of arguments for constructing a CseThresholdRule resource.
type CseThresholdRuleArgs struct {
	// Whether to count distinct values of a field, as opposed to just counting the number of records
	CountDistinct pulumi.BoolPtrInput
	// The field to count if `countDistinct` is set to true
	CountField pulumi.StringPtrInput
	// The description of the generated Signals
	Description pulumi.StringInput
	// Whether the rule should generate Signals
	Enabled pulumi.BoolInput
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseThresholdRuleEntitySelectorArrayInput
	// The expression for which records to match on
	Expression pulumi.StringInput
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayInput
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrInput
	// A Signal will be fired when this many records/distinct field values are matched
	Limit pulumi.IntInput
	// The name of the Rule and the generated Signals
	Name pulumi.StringPtrInput
	// The severity of the generated Signals
	Severity pulumi.IntInput
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrInput
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrInput
	// The tags of the generated Signals
	Tags pulumi.StringArrayInput
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringInput
	WindowSizeMillis pulumi.StringPtrInput
}

func (CseThresholdRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cseThresholdRuleArgs)(nil)).Elem()
}

type CseThresholdRuleInput interface {
	pulumi.Input

	ToCseThresholdRuleOutput() CseThresholdRuleOutput
	ToCseThresholdRuleOutputWithContext(ctx context.Context) CseThresholdRuleOutput
}

func (*CseThresholdRule) ElementType() reflect.Type {
	return reflect.TypeOf((**CseThresholdRule)(nil)).Elem()
}

func (i *CseThresholdRule) ToCseThresholdRuleOutput() CseThresholdRuleOutput {
	return i.ToCseThresholdRuleOutputWithContext(context.Background())
}

func (i *CseThresholdRule) ToCseThresholdRuleOutputWithContext(ctx context.Context) CseThresholdRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseThresholdRuleOutput)
}

// CseThresholdRuleArrayInput is an input type that accepts CseThresholdRuleArray and CseThresholdRuleArrayOutput values.
// You can construct a concrete instance of `CseThresholdRuleArrayInput` via:
//
//	CseThresholdRuleArray{ CseThresholdRuleArgs{...} }
type CseThresholdRuleArrayInput interface {
	pulumi.Input

	ToCseThresholdRuleArrayOutput() CseThresholdRuleArrayOutput
	ToCseThresholdRuleArrayOutputWithContext(context.Context) CseThresholdRuleArrayOutput
}

type CseThresholdRuleArray []CseThresholdRuleInput

func (CseThresholdRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CseThresholdRule)(nil)).Elem()
}

func (i CseThresholdRuleArray) ToCseThresholdRuleArrayOutput() CseThresholdRuleArrayOutput {
	return i.ToCseThresholdRuleArrayOutputWithContext(context.Background())
}

func (i CseThresholdRuleArray) ToCseThresholdRuleArrayOutputWithContext(ctx context.Context) CseThresholdRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseThresholdRuleArrayOutput)
}

// CseThresholdRuleMapInput is an input type that accepts CseThresholdRuleMap and CseThresholdRuleMapOutput values.
// You can construct a concrete instance of `CseThresholdRuleMapInput` via:
//
//	CseThresholdRuleMap{ "key": CseThresholdRuleArgs{...} }
type CseThresholdRuleMapInput interface {
	pulumi.Input

	ToCseThresholdRuleMapOutput() CseThresholdRuleMapOutput
	ToCseThresholdRuleMapOutputWithContext(context.Context) CseThresholdRuleMapOutput
}

type CseThresholdRuleMap map[string]CseThresholdRuleInput

func (CseThresholdRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CseThresholdRule)(nil)).Elem()
}

func (i CseThresholdRuleMap) ToCseThresholdRuleMapOutput() CseThresholdRuleMapOutput {
	return i.ToCseThresholdRuleMapOutputWithContext(context.Background())
}

func (i CseThresholdRuleMap) ToCseThresholdRuleMapOutputWithContext(ctx context.Context) CseThresholdRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseThresholdRuleMapOutput)
}

type CseThresholdRuleOutput struct{ *pulumi.OutputState }

func (CseThresholdRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CseThresholdRule)(nil)).Elem()
}

func (o CseThresholdRuleOutput) ToCseThresholdRuleOutput() CseThresholdRuleOutput {
	return o
}

func (o CseThresholdRuleOutput) ToCseThresholdRuleOutputWithContext(ctx context.Context) CseThresholdRuleOutput {
	return o
}

// Whether to count distinct values of a field, as opposed to just counting the number of records
func (o CseThresholdRuleOutput) CountDistinct() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.BoolPtrOutput { return v.CountDistinct }).(pulumi.BoolPtrOutput)
}

// The field to count if `countDistinct` is set to true
func (o CseThresholdRuleOutput) CountField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringPtrOutput { return v.CountField }).(pulumi.StringPtrOutput)
}

// The description of the generated Signals
func (o CseThresholdRuleOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Whether the rule should generate Signals
func (o CseThresholdRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The entities to generate Signals on
// + `entityType` - (Required) The type of the entity to generate the Signal on.
func (o CseThresholdRuleOutput) EntitySelectors() CseThresholdRuleEntitySelectorArrayOutput {
	return o.ApplyT(func(v *CseThresholdRule) CseThresholdRuleEntitySelectorArrayOutput { return v.EntitySelectors }).(CseThresholdRuleEntitySelectorArrayOutput)
}

// The expression for which records to match on
func (o CseThresholdRuleOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringOutput { return v.Expression }).(pulumi.StringOutput)
}

// A list of fields to group records by
func (o CseThresholdRuleOutput) GroupByFields() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringArrayOutput { return v.GroupByFields }).(pulumi.StringArrayOutput)
}

// Whether the generated Signals should be prototype Signals
func (o CseThresholdRuleOutput) IsPrototype() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.BoolPtrOutput { return v.IsPrototype }).(pulumi.BoolPtrOutput)
}

// A Signal will be fired when this many records/distinct field values are matched
func (o CseThresholdRuleOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.IntOutput { return v.Limit }).(pulumi.IntOutput)
}

// The name of the Rule and the generated Signals
func (o CseThresholdRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The severity of the generated Signals
func (o CseThresholdRuleOutput) Severity() pulumi.IntOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.IntOutput { return v.Severity }).(pulumi.IntOutput)
}

// The summary of the generated Signals
func (o CseThresholdRuleOutput) SummaryExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringPtrOutput { return v.SummaryExpression }).(pulumi.StringPtrOutput)
}

// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
//
// The following attributes are exported:
func (o CseThresholdRuleOutput) SuppressionWindowSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.IntPtrOutput { return v.SuppressionWindowSize }).(pulumi.IntPtrOutput)
}

// The tags of the generated Signals
func (o CseThresholdRuleOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
func (o CseThresholdRuleOutput) WindowSize() pulumi.StringOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringOutput { return v.WindowSize }).(pulumi.StringOutput)
}

func (o CseThresholdRuleOutput) WindowSizeMillis() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CseThresholdRule) pulumi.StringPtrOutput { return v.WindowSizeMillis }).(pulumi.StringPtrOutput)
}

type CseThresholdRuleArrayOutput struct{ *pulumi.OutputState }

func (CseThresholdRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CseThresholdRule)(nil)).Elem()
}

func (o CseThresholdRuleArrayOutput) ToCseThresholdRuleArrayOutput() CseThresholdRuleArrayOutput {
	return o
}

func (o CseThresholdRuleArrayOutput) ToCseThresholdRuleArrayOutputWithContext(ctx context.Context) CseThresholdRuleArrayOutput {
	return o
}

func (o CseThresholdRuleArrayOutput) Index(i pulumi.IntInput) CseThresholdRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CseThresholdRule {
		return vs[0].([]*CseThresholdRule)[vs[1].(int)]
	}).(CseThresholdRuleOutput)
}

type CseThresholdRuleMapOutput struct{ *pulumi.OutputState }

func (CseThresholdRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CseThresholdRule)(nil)).Elem()
}

func (o CseThresholdRuleMapOutput) ToCseThresholdRuleMapOutput() CseThresholdRuleMapOutput {
	return o
}

func (o CseThresholdRuleMapOutput) ToCseThresholdRuleMapOutputWithContext(ctx context.Context) CseThresholdRuleMapOutput {
	return o
}

func (o CseThresholdRuleMapOutput) MapIndex(k pulumi.StringInput) CseThresholdRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CseThresholdRule {
		return vs[0].(map[string]*CseThresholdRule)[vs[1].(string)]
	}).(CseThresholdRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CseThresholdRuleInput)(nil)).Elem(), &CseThresholdRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*CseThresholdRuleArrayInput)(nil)).Elem(), CseThresholdRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CseThresholdRuleMapInput)(nil)).Elem(), CseThresholdRuleMap{})
	pulumi.RegisterOutputType(CseThresholdRuleOutput{})
	pulumi.RegisterOutputType(CseThresholdRuleArrayOutput{})
	pulumi.RegisterOutputType(CseThresholdRuleMapOutput{})
}
