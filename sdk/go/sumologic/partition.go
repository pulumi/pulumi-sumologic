// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a [Sumologic Partition](https://help.sumologic.com/docs/manage/partitions/data-tiers/).
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
//			_, err := sumologic.NewPartition(ctx, "examplePartition", &sumologic.PartitionArgs{
//				Name:                      pulumi.String("examplePartition"),
//				RoutingExpression:         pulumi.String("_sourcecategory=*/IAC"),
//				AnalyticsTier:             pulumi.String("continuous"),
//				IsCompliant:               pulumi.Bool(false),
//				IsIncludedInDefaultSearch: pulumi.Bool(true),
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
// ## Attributes reference
//
// The following attributes are exported:
//
// - `id` - Unique identifier for the partition.
//
// ## Import
//
// Partitions can can be imported using the id. The list of partitions and their ids can be obtained using the Sumologic [partions api][2].
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/partition:Partition partition 1234567890
// ```
//
// [2]: https://api.sumologic.com/docs/#operation/listPartitions
//
// [1]: https://help.sumologic.com/docs/manage/partitions/data-tiers/
type Partition struct {
	pulumi.CustomResourceState

	AnalyticsTier    pulumi.StringPtrOutput `pulumi:"analyticsTier"`
	DataForwardingId pulumi.StringOutput    `pulumi:"dataForwardingId"`
	IndexType        pulumi.StringOutput    `pulumi:"indexType"`
	IsActive         pulumi.BoolOutput      `pulumi:"isActive"`
	// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
	IsCompliant pulumi.BoolPtrOutput `pulumi:"isCompliant"`
	// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
	IsIncludedInDefaultSearch pulumi.BoolPtrOutput `pulumi:"isIncludedInDefaultSearch"`
	// The name of the partition.
	Name pulumi.StringOutput `pulumi:"name"`
	// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
	ReduceRetentionPeriodImmediately pulumi.BoolPtrOutput `pulumi:"reduceRetentionPeriodImmediately"`
	// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
	RetentionPeriod pulumi.IntPtrOutput `pulumi:"retentionPeriod"`
	// The query that defines the data to be included in the partition.
	RoutingExpression pulumi.StringPtrOutput `pulumi:"routingExpression"`
	TotalBytes        pulumi.IntOutput       `pulumi:"totalBytes"`
}

// NewPartition registers a new resource with the given unique name, arguments, and options.
func NewPartition(ctx *pulumi.Context,
	name string, args *PartitionArgs, opts ...pulumi.ResourceOption) (*Partition, error) {
	if args == nil {
		args = &PartitionArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Partition
	err := ctx.RegisterResource("sumologic:index/partition:Partition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPartition gets an existing Partition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPartition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PartitionState, opts ...pulumi.ResourceOption) (*Partition, error) {
	var resource Partition
	err := ctx.ReadResource("sumologic:index/partition:Partition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Partition resources.
type partitionState struct {
	AnalyticsTier    *string `pulumi:"analyticsTier"`
	DataForwardingId *string `pulumi:"dataForwardingId"`
	IndexType        *string `pulumi:"indexType"`
	IsActive         *bool   `pulumi:"isActive"`
	// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
	IsCompliant *bool `pulumi:"isCompliant"`
	// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
	IsIncludedInDefaultSearch *bool `pulumi:"isIncludedInDefaultSearch"`
	// The name of the partition.
	Name *string `pulumi:"name"`
	// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
	ReduceRetentionPeriodImmediately *bool `pulumi:"reduceRetentionPeriodImmediately"`
	// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
	RetentionPeriod *int `pulumi:"retentionPeriod"`
	// The query that defines the data to be included in the partition.
	RoutingExpression *string `pulumi:"routingExpression"`
	TotalBytes        *int    `pulumi:"totalBytes"`
}

type PartitionState struct {
	AnalyticsTier    pulumi.StringPtrInput
	DataForwardingId pulumi.StringPtrInput
	IndexType        pulumi.StringPtrInput
	IsActive         pulumi.BoolPtrInput
	// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
	IsCompliant pulumi.BoolPtrInput
	// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
	IsIncludedInDefaultSearch pulumi.BoolPtrInput
	// The name of the partition.
	Name pulumi.StringPtrInput
	// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
	ReduceRetentionPeriodImmediately pulumi.BoolPtrInput
	// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
	RetentionPeriod pulumi.IntPtrInput
	// The query that defines the data to be included in the partition.
	RoutingExpression pulumi.StringPtrInput
	TotalBytes        pulumi.IntPtrInput
}

func (PartitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*partitionState)(nil)).Elem()
}

type partitionArgs struct {
	AnalyticsTier *string `pulumi:"analyticsTier"`
	// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
	IsCompliant *bool `pulumi:"isCompliant"`
	// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
	IsIncludedInDefaultSearch *bool `pulumi:"isIncludedInDefaultSearch"`
	// The name of the partition.
	Name *string `pulumi:"name"`
	// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
	ReduceRetentionPeriodImmediately *bool `pulumi:"reduceRetentionPeriodImmediately"`
	// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
	RetentionPeriod *int `pulumi:"retentionPeriod"`
	// The query that defines the data to be included in the partition.
	RoutingExpression *string `pulumi:"routingExpression"`
}

// The set of arguments for constructing a Partition resource.
type PartitionArgs struct {
	AnalyticsTier pulumi.StringPtrInput
	// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
	IsCompliant pulumi.BoolPtrInput
	// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
	IsIncludedInDefaultSearch pulumi.BoolPtrInput
	// The name of the partition.
	Name pulumi.StringPtrInput
	// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
	ReduceRetentionPeriodImmediately pulumi.BoolPtrInput
	// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
	RetentionPeriod pulumi.IntPtrInput
	// The query that defines the data to be included in the partition.
	RoutingExpression pulumi.StringPtrInput
}

func (PartitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*partitionArgs)(nil)).Elem()
}

type PartitionInput interface {
	pulumi.Input

	ToPartitionOutput() PartitionOutput
	ToPartitionOutputWithContext(ctx context.Context) PartitionOutput
}

func (*Partition) ElementType() reflect.Type {
	return reflect.TypeOf((**Partition)(nil)).Elem()
}

func (i *Partition) ToPartitionOutput() PartitionOutput {
	return i.ToPartitionOutputWithContext(context.Background())
}

func (i *Partition) ToPartitionOutputWithContext(ctx context.Context) PartitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PartitionOutput)
}

// PartitionArrayInput is an input type that accepts PartitionArray and PartitionArrayOutput values.
// You can construct a concrete instance of `PartitionArrayInput` via:
//
//	PartitionArray{ PartitionArgs{...} }
type PartitionArrayInput interface {
	pulumi.Input

	ToPartitionArrayOutput() PartitionArrayOutput
	ToPartitionArrayOutputWithContext(context.Context) PartitionArrayOutput
}

type PartitionArray []PartitionInput

func (PartitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Partition)(nil)).Elem()
}

func (i PartitionArray) ToPartitionArrayOutput() PartitionArrayOutput {
	return i.ToPartitionArrayOutputWithContext(context.Background())
}

func (i PartitionArray) ToPartitionArrayOutputWithContext(ctx context.Context) PartitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PartitionArrayOutput)
}

// PartitionMapInput is an input type that accepts PartitionMap and PartitionMapOutput values.
// You can construct a concrete instance of `PartitionMapInput` via:
//
//	PartitionMap{ "key": PartitionArgs{...} }
type PartitionMapInput interface {
	pulumi.Input

	ToPartitionMapOutput() PartitionMapOutput
	ToPartitionMapOutputWithContext(context.Context) PartitionMapOutput
}

type PartitionMap map[string]PartitionInput

func (PartitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Partition)(nil)).Elem()
}

func (i PartitionMap) ToPartitionMapOutput() PartitionMapOutput {
	return i.ToPartitionMapOutputWithContext(context.Background())
}

func (i PartitionMap) ToPartitionMapOutputWithContext(ctx context.Context) PartitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PartitionMapOutput)
}

type PartitionOutput struct{ *pulumi.OutputState }

func (PartitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Partition)(nil)).Elem()
}

func (o PartitionOutput) ToPartitionOutput() PartitionOutput {
	return o
}

func (o PartitionOutput) ToPartitionOutputWithContext(ctx context.Context) PartitionOutput {
	return o
}

func (o PartitionOutput) AnalyticsTier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.StringPtrOutput { return v.AnalyticsTier }).(pulumi.StringPtrOutput)
}

func (o PartitionOutput) DataForwardingId() pulumi.StringOutput {
	return o.ApplyT(func(v *Partition) pulumi.StringOutput { return v.DataForwardingId }).(pulumi.StringOutput)
}

func (o PartitionOutput) IndexType() pulumi.StringOutput {
	return o.ApplyT(func(v *Partition) pulumi.StringOutput { return v.IndexType }).(pulumi.StringOutput)
}

func (o PartitionOutput) IsActive() pulumi.BoolOutput {
	return o.ApplyT(func(v *Partition) pulumi.BoolOutput { return v.IsActive }).(pulumi.BoolOutput)
}

// Whether the partition is compliant or not. Mark a partition as compliant if it contains data used for compliance or audit purpose. Retention for a compliant partition can only be increased and cannot be reduced after the partition is marked compliant. A partition once marked compliant, cannot be marked non-compliant later.
func (o PartitionOutput) IsCompliant() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.BoolPtrOutput { return v.IsCompliant }).(pulumi.BoolPtrOutput)
}

// Indicates whether the partition is included in the default search scope. When executing a query such as "error | count," certain partitions are automatically part of the search scope. However, for specific partitions, the user must explicitly mention the partition using the _index term, as in "_index=webApp error | count". This property governs the default inclusion of the partition in the search scope. Configuring this property is exclusively permitted for flex partitions.
func (o PartitionOutput) IsIncludedInDefaultSearch() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.BoolPtrOutput { return v.IsIncludedInDefaultSearch }).(pulumi.BoolPtrOutput)
}

// The name of the partition.
func (o PartitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Partition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
func (o PartitionOutput) ReduceRetentionPeriodImmediately() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.BoolPtrOutput { return v.ReduceRetentionPeriodImmediately }).(pulumi.BoolPtrOutput)
}

// The number of days to retain data in the partition, or -1 to use the default value for your account. Only relevant if your account has variable retention enabled.
func (o PartitionOutput) RetentionPeriod() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.IntPtrOutput { return v.RetentionPeriod }).(pulumi.IntPtrOutput)
}

// The query that defines the data to be included in the partition.
func (o PartitionOutput) RoutingExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Partition) pulumi.StringPtrOutput { return v.RoutingExpression }).(pulumi.StringPtrOutput)
}

func (o PartitionOutput) TotalBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *Partition) pulumi.IntOutput { return v.TotalBytes }).(pulumi.IntOutput)
}

type PartitionArrayOutput struct{ *pulumi.OutputState }

func (PartitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Partition)(nil)).Elem()
}

func (o PartitionArrayOutput) ToPartitionArrayOutput() PartitionArrayOutput {
	return o
}

func (o PartitionArrayOutput) ToPartitionArrayOutputWithContext(ctx context.Context) PartitionArrayOutput {
	return o
}

func (o PartitionArrayOutput) Index(i pulumi.IntInput) PartitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Partition {
		return vs[0].([]*Partition)[vs[1].(int)]
	}).(PartitionOutput)
}

type PartitionMapOutput struct{ *pulumi.OutputState }

func (PartitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Partition)(nil)).Elem()
}

func (o PartitionMapOutput) ToPartitionMapOutput() PartitionMapOutput {
	return o
}

func (o PartitionMapOutput) ToPartitionMapOutputWithContext(ctx context.Context) PartitionMapOutput {
	return o
}

func (o PartitionMapOutput) MapIndex(k pulumi.StringInput) PartitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Partition {
		return vs[0].(map[string]*Partition)[vs[1].(string)]
	}).(PartitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PartitionInput)(nil)).Elem(), &Partition{})
	pulumi.RegisterInputType(reflect.TypeOf((*PartitionArrayInput)(nil)).Elem(), PartitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PartitionMapInput)(nil)).Elem(), PartitionMap{})
	pulumi.RegisterOutputType(PartitionOutput{})
	pulumi.RegisterOutputType(PartitionArrayOutput{})
	pulumi.RegisterOutputType(PartitionMapOutput{})
}
