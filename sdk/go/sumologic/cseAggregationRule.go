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

// Provides a Sumo Logic CSE [Aggregation Rule](https://help.sumologic.com/Cloud_SIEM_Enterprise/CSE_Rules/09_Write_an_Aggregation_Rule).
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
//			_, err := sumologic.NewCseAggregationRule(ctx, "aggregation_rule", &sumologic.CseAggregationRuleArgs{
//				AggregationFunctions: sumologic.CseAggregationRuleAggregationFunctionArray{
//					&sumologic.CseAggregationRuleAggregationFunctionArgs{
//						Name:     pulumi.String("distinct_eventid_count"),
//						Function: pulumi.String("count_distinct"),
//						Arguments: pulumi.StringArray{
//							pulumi.String("metadata_deviceEventId"),
//						},
//					},
//				},
//				DescriptionExpression: pulumi.String("Signal description"),
//				Enabled:               pulumi.Bool(true),
//				EntitySelectors: sumologic.CseAggregationRuleEntitySelectorArray{
//					&sumologic.CseAggregationRuleEntitySelectorArgs{
//						EntityType: pulumi.String("_ip"),
//						Expression: pulumi.String("srcDevice_ip"),
//					},
//				},
//				GroupByEntity: pulumi.Bool(true),
//				GroupByFields: pulumi.StringArray{
//					pulumi.String("dstDevice_hostname"),
//				},
//				MatchExpression: pulumi.String("objectType = \"Network\""),
//				IsPrototype:     pulumi.Bool(false),
//				Name:            pulumi.String("Aggregation Rule Example"),
//				NameExpression:  pulumi.String("Signal name"),
//				SeverityMapping: &sumologic.CseAggregationRuleSeverityMappingArgs{
//					Type:    pulumi.String("constant"),
//					Default: pulumi.Int(5),
//				},
//				SummaryExpression: pulumi.String("Signal summary"),
//				Tags: pulumi.StringArray{
//					pulumi.String("_mitreAttackTactic:TA0009"),
//				},
//				TriggerExpression:     pulumi.String("distinct_eventid_count > 5"),
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
// Aggregation Rules can be imported using the field id, e.g.:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/cseAggregationRule:CseAggregationRule aggregation_rule id
// ```
type CseAggregationRule struct {
	pulumi.CustomResourceState

	// One or more named aggregation functions
	AggregationFunctions CseAggregationRuleAggregationFunctionArrayOutput `pulumi:"aggregationFunctions"`
	// The description of the generated Signals
	DescriptionExpression pulumi.StringOutput `pulumi:"descriptionExpression"`
	// Whether the rule should generate Signals
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseAggregationRuleEntitySelectorArrayOutput `pulumi:"entitySelectors"`
	// Whether to group records by the specified entity fields
	GroupByEntity pulumi.BoolPtrOutput `pulumi:"groupByEntity"`
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayOutput `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrOutput `pulumi:"isPrototype"`
	// The expression for which records to match on
	MatchExpression pulumi.StringOutput `pulumi:"matchExpression"`
	// The name of the Rule
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the generated Signals
	NameExpression pulumi.StringOutput `pulumi:"nameExpression"`
	// The configuration of how the severity of the Signals should be mapped from the Records
	SeverityMapping CseAggregationRuleSeverityMappingOutput `pulumi:"severityMapping"`
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrOutput `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrOutput `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The expression to determine whether a Signal should be created based on the aggregation results
	TriggerExpression pulumi.StringOutput `pulumi:"triggerExpression"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringOutput    `pulumi:"windowSize"`
	WindowSizeMillis pulumi.StringPtrOutput `pulumi:"windowSizeMillis"`
}

// NewCseAggregationRule registers a new resource with the given unique name, arguments, and options.
func NewCseAggregationRule(ctx *pulumi.Context,
	name string, args *CseAggregationRuleArgs, opts ...pulumi.ResourceOption) (*CseAggregationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AggregationFunctions == nil {
		return nil, errors.New("invalid value for required argument 'AggregationFunctions'")
	}
	if args.DescriptionExpression == nil {
		return nil, errors.New("invalid value for required argument 'DescriptionExpression'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.EntitySelectors == nil {
		return nil, errors.New("invalid value for required argument 'EntitySelectors'")
	}
	if args.MatchExpression == nil {
		return nil, errors.New("invalid value for required argument 'MatchExpression'")
	}
	if args.NameExpression == nil {
		return nil, errors.New("invalid value for required argument 'NameExpression'")
	}
	if args.SeverityMapping == nil {
		return nil, errors.New("invalid value for required argument 'SeverityMapping'")
	}
	if args.TriggerExpression == nil {
		return nil, errors.New("invalid value for required argument 'TriggerExpression'")
	}
	if args.WindowSize == nil {
		return nil, errors.New("invalid value for required argument 'WindowSize'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CseAggregationRule
	err := ctx.RegisterResource("sumologic:index/cseAggregationRule:CseAggregationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCseAggregationRule gets an existing CseAggregationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCseAggregationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CseAggregationRuleState, opts ...pulumi.ResourceOption) (*CseAggregationRule, error) {
	var resource CseAggregationRule
	err := ctx.ReadResource("sumologic:index/cseAggregationRule:CseAggregationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CseAggregationRule resources.
type cseAggregationRuleState struct {
	// One or more named aggregation functions
	AggregationFunctions []CseAggregationRuleAggregationFunction `pulumi:"aggregationFunctions"`
	// The description of the generated Signals
	DescriptionExpression *string `pulumi:"descriptionExpression"`
	// Whether the rule should generate Signals
	Enabled *bool `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors []CseAggregationRuleEntitySelector `pulumi:"entitySelectors"`
	// Whether to group records by the specified entity fields
	GroupByEntity *bool `pulumi:"groupByEntity"`
	// A list of fields to group records by
	GroupByFields []string `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype *bool `pulumi:"isPrototype"`
	// The expression for which records to match on
	MatchExpression *string `pulumi:"matchExpression"`
	// The name of the Rule
	Name *string `pulumi:"name"`
	// The name of the generated Signals
	NameExpression *string `pulumi:"nameExpression"`
	// The configuration of how the severity of the Signals should be mapped from the Records
	SeverityMapping *CseAggregationRuleSeverityMapping `pulumi:"severityMapping"`
	// The summary of the generated Signals
	SummaryExpression *string `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize *int `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags []string `pulumi:"tags"`
	// The expression to determine whether a Signal should be created based on the aggregation results
	TriggerExpression *string `pulumi:"triggerExpression"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       *string `pulumi:"windowSize"`
	WindowSizeMillis *string `pulumi:"windowSizeMillis"`
}

type CseAggregationRuleState struct {
	// One or more named aggregation functions
	AggregationFunctions CseAggregationRuleAggregationFunctionArrayInput
	// The description of the generated Signals
	DescriptionExpression pulumi.StringPtrInput
	// Whether the rule should generate Signals
	Enabled pulumi.BoolPtrInput
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseAggregationRuleEntitySelectorArrayInput
	// Whether to group records by the specified entity fields
	GroupByEntity pulumi.BoolPtrInput
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayInput
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrInput
	// The expression for which records to match on
	MatchExpression pulumi.StringPtrInput
	// The name of the Rule
	Name pulumi.StringPtrInput
	// The name of the generated Signals
	NameExpression pulumi.StringPtrInput
	// The configuration of how the severity of the Signals should be mapped from the Records
	SeverityMapping CseAggregationRuleSeverityMappingPtrInput
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrInput
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrInput
	// The tags of the generated Signals
	Tags pulumi.StringArrayInput
	// The expression to determine whether a Signal should be created based on the aggregation results
	TriggerExpression pulumi.StringPtrInput
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringPtrInput
	WindowSizeMillis pulumi.StringPtrInput
}

func (CseAggregationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*cseAggregationRuleState)(nil)).Elem()
}

type cseAggregationRuleArgs struct {
	// One or more named aggregation functions
	AggregationFunctions []CseAggregationRuleAggregationFunction `pulumi:"aggregationFunctions"`
	// The description of the generated Signals
	DescriptionExpression string `pulumi:"descriptionExpression"`
	// Whether the rule should generate Signals
	Enabled bool `pulumi:"enabled"`
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors []CseAggregationRuleEntitySelector `pulumi:"entitySelectors"`
	// Whether to group records by the specified entity fields
	GroupByEntity *bool `pulumi:"groupByEntity"`
	// A list of fields to group records by
	GroupByFields []string `pulumi:"groupByFields"`
	// Whether the generated Signals should be prototype Signals
	IsPrototype *bool `pulumi:"isPrototype"`
	// The expression for which records to match on
	MatchExpression string `pulumi:"matchExpression"`
	// The name of the Rule
	Name *string `pulumi:"name"`
	// The name of the generated Signals
	NameExpression string `pulumi:"nameExpression"`
	// The configuration of how the severity of the Signals should be mapped from the Records
	SeverityMapping CseAggregationRuleSeverityMapping `pulumi:"severityMapping"`
	// The summary of the generated Signals
	SummaryExpression *string `pulumi:"summaryExpression"`
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize *int `pulumi:"suppressionWindowSize"`
	// The tags of the generated Signals
	Tags []string `pulumi:"tags"`
	// The expression to determine whether a Signal should be created based on the aggregation results
	TriggerExpression string `pulumi:"triggerExpression"`
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       string  `pulumi:"windowSize"`
	WindowSizeMillis *string `pulumi:"windowSizeMillis"`
}

// The set of arguments for constructing a CseAggregationRule resource.
type CseAggregationRuleArgs struct {
	// One or more named aggregation functions
	AggregationFunctions CseAggregationRuleAggregationFunctionArrayInput
	// The description of the generated Signals
	DescriptionExpression pulumi.StringInput
	// Whether the rule should generate Signals
	Enabled pulumi.BoolInput
	// The entities to generate Signals on
	// + `entityType` - (Required) The type of the entity to generate the Signal on.
	EntitySelectors CseAggregationRuleEntitySelectorArrayInput
	// Whether to group records by the specified entity fields
	GroupByEntity pulumi.BoolPtrInput
	// A list of fields to group records by
	GroupByFields pulumi.StringArrayInput
	// Whether the generated Signals should be prototype Signals
	IsPrototype pulumi.BoolPtrInput
	// The expression for which records to match on
	MatchExpression pulumi.StringInput
	// The name of the Rule
	Name pulumi.StringPtrInput
	// The name of the generated Signals
	NameExpression pulumi.StringInput
	// The configuration of how the severity of the Signals should be mapped from the Records
	SeverityMapping CseAggregationRuleSeverityMappingInput
	// The summary of the generated Signals
	SummaryExpression pulumi.StringPtrInput
	// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
	//
	// The following attributes are exported:
	SuppressionWindowSize pulumi.IntPtrInput
	// The tags of the generated Signals
	Tags pulumi.StringArrayInput
	// The expression to determine whether a Signal should be created based on the aggregation results
	TriggerExpression pulumi.StringInput
	// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
	WindowSize       pulumi.StringInput
	WindowSizeMillis pulumi.StringPtrInput
}

func (CseAggregationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cseAggregationRuleArgs)(nil)).Elem()
}

type CseAggregationRuleInput interface {
	pulumi.Input

	ToCseAggregationRuleOutput() CseAggregationRuleOutput
	ToCseAggregationRuleOutputWithContext(ctx context.Context) CseAggregationRuleOutput
}

func (*CseAggregationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**CseAggregationRule)(nil)).Elem()
}

func (i *CseAggregationRule) ToCseAggregationRuleOutput() CseAggregationRuleOutput {
	return i.ToCseAggregationRuleOutputWithContext(context.Background())
}

func (i *CseAggregationRule) ToCseAggregationRuleOutputWithContext(ctx context.Context) CseAggregationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseAggregationRuleOutput)
}

// CseAggregationRuleArrayInput is an input type that accepts CseAggregationRuleArray and CseAggregationRuleArrayOutput values.
// You can construct a concrete instance of `CseAggregationRuleArrayInput` via:
//
//	CseAggregationRuleArray{ CseAggregationRuleArgs{...} }
type CseAggregationRuleArrayInput interface {
	pulumi.Input

	ToCseAggregationRuleArrayOutput() CseAggregationRuleArrayOutput
	ToCseAggregationRuleArrayOutputWithContext(context.Context) CseAggregationRuleArrayOutput
}

type CseAggregationRuleArray []CseAggregationRuleInput

func (CseAggregationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CseAggregationRule)(nil)).Elem()
}

func (i CseAggregationRuleArray) ToCseAggregationRuleArrayOutput() CseAggregationRuleArrayOutput {
	return i.ToCseAggregationRuleArrayOutputWithContext(context.Background())
}

func (i CseAggregationRuleArray) ToCseAggregationRuleArrayOutputWithContext(ctx context.Context) CseAggregationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseAggregationRuleArrayOutput)
}

// CseAggregationRuleMapInput is an input type that accepts CseAggregationRuleMap and CseAggregationRuleMapOutput values.
// You can construct a concrete instance of `CseAggregationRuleMapInput` via:
//
//	CseAggregationRuleMap{ "key": CseAggregationRuleArgs{...} }
type CseAggregationRuleMapInput interface {
	pulumi.Input

	ToCseAggregationRuleMapOutput() CseAggregationRuleMapOutput
	ToCseAggregationRuleMapOutputWithContext(context.Context) CseAggregationRuleMapOutput
}

type CseAggregationRuleMap map[string]CseAggregationRuleInput

func (CseAggregationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CseAggregationRule)(nil)).Elem()
}

func (i CseAggregationRuleMap) ToCseAggregationRuleMapOutput() CseAggregationRuleMapOutput {
	return i.ToCseAggregationRuleMapOutputWithContext(context.Background())
}

func (i CseAggregationRuleMap) ToCseAggregationRuleMapOutputWithContext(ctx context.Context) CseAggregationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CseAggregationRuleMapOutput)
}

type CseAggregationRuleOutput struct{ *pulumi.OutputState }

func (CseAggregationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CseAggregationRule)(nil)).Elem()
}

func (o CseAggregationRuleOutput) ToCseAggregationRuleOutput() CseAggregationRuleOutput {
	return o
}

func (o CseAggregationRuleOutput) ToCseAggregationRuleOutputWithContext(ctx context.Context) CseAggregationRuleOutput {
	return o
}

// One or more named aggregation functions
func (o CseAggregationRuleOutput) AggregationFunctions() CseAggregationRuleAggregationFunctionArrayOutput {
	return o.ApplyT(func(v *CseAggregationRule) CseAggregationRuleAggregationFunctionArrayOutput {
		return v.AggregationFunctions
	}).(CseAggregationRuleAggregationFunctionArrayOutput)
}

// The description of the generated Signals
func (o CseAggregationRuleOutput) DescriptionExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.DescriptionExpression }).(pulumi.StringOutput)
}

// Whether the rule should generate Signals
func (o CseAggregationRuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The entities to generate Signals on
// + `entityType` - (Required) The type of the entity to generate the Signal on.
func (o CseAggregationRuleOutput) EntitySelectors() CseAggregationRuleEntitySelectorArrayOutput {
	return o.ApplyT(func(v *CseAggregationRule) CseAggregationRuleEntitySelectorArrayOutput { return v.EntitySelectors }).(CseAggregationRuleEntitySelectorArrayOutput)
}

// Whether to group records by the specified entity fields
func (o CseAggregationRuleOutput) GroupByEntity() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.BoolPtrOutput { return v.GroupByEntity }).(pulumi.BoolPtrOutput)
}

// A list of fields to group records by
func (o CseAggregationRuleOutput) GroupByFields() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringArrayOutput { return v.GroupByFields }).(pulumi.StringArrayOutput)
}

// Whether the generated Signals should be prototype Signals
func (o CseAggregationRuleOutput) IsPrototype() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.BoolPtrOutput { return v.IsPrototype }).(pulumi.BoolPtrOutput)
}

// The expression for which records to match on
func (o CseAggregationRuleOutput) MatchExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.MatchExpression }).(pulumi.StringOutput)
}

// The name of the Rule
func (o CseAggregationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the generated Signals
func (o CseAggregationRuleOutput) NameExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.NameExpression }).(pulumi.StringOutput)
}

// The configuration of how the severity of the Signals should be mapped from the Records
func (o CseAggregationRuleOutput) SeverityMapping() CseAggregationRuleSeverityMappingOutput {
	return o.ApplyT(func(v *CseAggregationRule) CseAggregationRuleSeverityMappingOutput { return v.SeverityMapping }).(CseAggregationRuleSeverityMappingOutput)
}

// The summary of the generated Signals
func (o CseAggregationRuleOutput) SummaryExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringPtrOutput { return v.SummaryExpression }).(pulumi.StringPtrOutput)
}

// For how long to suppress Signal generation, in milliseconds. Must be greater than `windowSize` and less than the global limit of 7 days.
//
// The following attributes are exported:
func (o CseAggregationRuleOutput) SuppressionWindowSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.IntPtrOutput { return v.SuppressionWindowSize }).(pulumi.IntPtrOutput)
}

// The tags of the generated Signals
func (o CseAggregationRuleOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The expression to determine whether a Signal should be created based on the aggregation results
func (o CseAggregationRuleOutput) TriggerExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.TriggerExpression }).(pulumi.StringOutput)
}

// How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, T05D or CUSTOM
func (o CseAggregationRuleOutput) WindowSize() pulumi.StringOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringOutput { return v.WindowSize }).(pulumi.StringOutput)
}

func (o CseAggregationRuleOutput) WindowSizeMillis() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CseAggregationRule) pulumi.StringPtrOutput { return v.WindowSizeMillis }).(pulumi.StringPtrOutput)
}

type CseAggregationRuleArrayOutput struct{ *pulumi.OutputState }

func (CseAggregationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CseAggregationRule)(nil)).Elem()
}

func (o CseAggregationRuleArrayOutput) ToCseAggregationRuleArrayOutput() CseAggregationRuleArrayOutput {
	return o
}

func (o CseAggregationRuleArrayOutput) ToCseAggregationRuleArrayOutputWithContext(ctx context.Context) CseAggregationRuleArrayOutput {
	return o
}

func (o CseAggregationRuleArrayOutput) Index(i pulumi.IntInput) CseAggregationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CseAggregationRule {
		return vs[0].([]*CseAggregationRule)[vs[1].(int)]
	}).(CseAggregationRuleOutput)
}

type CseAggregationRuleMapOutput struct{ *pulumi.OutputState }

func (CseAggregationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CseAggregationRule)(nil)).Elem()
}

func (o CseAggregationRuleMapOutput) ToCseAggregationRuleMapOutput() CseAggregationRuleMapOutput {
	return o
}

func (o CseAggregationRuleMapOutput) ToCseAggregationRuleMapOutputWithContext(ctx context.Context) CseAggregationRuleMapOutput {
	return o
}

func (o CseAggregationRuleMapOutput) MapIndex(k pulumi.StringInput) CseAggregationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CseAggregationRule {
		return vs[0].(map[string]*CseAggregationRule)[vs[1].(string)]
	}).(CseAggregationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CseAggregationRuleInput)(nil)).Elem(), &CseAggregationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*CseAggregationRuleArrayInput)(nil)).Elem(), CseAggregationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CseAggregationRuleMapInput)(nil)).Elem(), CseAggregationRuleMap{})
	pulumi.RegisterOutputType(CseAggregationRuleOutput{})
	pulumi.RegisterOutputType(CseAggregationRuleArrayOutput{})
	pulumi.RegisterOutputType(CseAggregationRuleMapOutput{})
}
