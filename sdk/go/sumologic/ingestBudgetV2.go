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

// Provides a [Sumologic Ingest Budget v2][1].
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
//			_, err := sumologic.NewIngestBudgetV2(ctx, "budget", &sumologic.IngestBudgetV2Args{
//				Name:           pulumi.String("testBudget"),
//				Scope:          pulumi.String("_sourceCategory=*prod*nginx*"),
//				BudgetType:     pulumi.String("dailyVolume"),
//				CapacityBytes:  pulumi.Int(30000000000),
//				Description:    pulumi.String("For testing purposes"),
//				Timezone:       pulumi.String("Etc/UTC"),
//				Action:         pulumi.String("keepCollecting"),
//				ResetTime:      pulumi.String("00:00"),
//				AuditThreshold: pulumi.Int(85),
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
// Ingest budgets can be imported using the budget ID or name, e.g.:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/ingestBudgetV2:IngestBudgetV2 budget 00000000000123AB
// ```
//
// ```sh
// $ pulumi import sumologic:index/ingestBudgetV2:IngestBudgetV2 dev_budget "DevelopersBudget"
// ```
//
// [1]: https://help.sumologic.com/Beta/Metadata_Ingest_Budgets
//
// [2]: https://en.wikipedia.org/wiki/Tz_database
type IngestBudgetV2 struct {
	pulumi.CustomResourceState

	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringOutput `pulumi:"action"`
	// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
	//
	// The following attributes are exported:
	AuditThreshold pulumi.IntPtrOutput `pulumi:"auditThreshold"`
	// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
	BudgetType pulumi.StringPtrOutput `pulumi:"budgetType"`
	// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
	CapacityBytes pulumi.IntOutput `pulumi:"capacityBytes"`
	// The description of the collector.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringOutput `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringOutput `pulumi:"resetTime"`
	// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
	Scope pulumi.StringOutput `pulumi:"scope"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringOutput `pulumi:"timezone"`
}

// NewIngestBudgetV2 registers a new resource with the given unique name, arguments, and options.
func NewIngestBudgetV2(ctx *pulumi.Context,
	name string, args *IngestBudgetV2Args, opts ...pulumi.ResourceOption) (*IngestBudgetV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.CapacityBytes == nil {
		return nil, errors.New("invalid value for required argument 'CapacityBytes'")
	}
	if args.ResetTime == nil {
		return nil, errors.New("invalid value for required argument 'ResetTime'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Timezone == nil {
		return nil, errors.New("invalid value for required argument 'Timezone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IngestBudgetV2
	err := ctx.RegisterResource("sumologic:index/ingestBudgetV2:IngestBudgetV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIngestBudgetV2 gets an existing IngestBudgetV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIngestBudgetV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IngestBudgetV2State, opts ...pulumi.ResourceOption) (*IngestBudgetV2, error) {
	var resource IngestBudgetV2
	err := ctx.ReadResource("sumologic:index/ingestBudgetV2:IngestBudgetV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IngestBudgetV2 resources.
type ingestBudgetV2State struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action *string `pulumi:"action"`
	// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
	//
	// The following attributes are exported:
	AuditThreshold *int `pulumi:"auditThreshold"`
	// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
	BudgetType *string `pulumi:"budgetType"`
	// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
	CapacityBytes *int `pulumi:"capacityBytes"`
	// The description of the collector.
	Description *string `pulumi:"description"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name *string `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime *string `pulumi:"resetTime"`
	// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
	Scope *string `pulumi:"scope"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone *string `pulumi:"timezone"`
}

type IngestBudgetV2State struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringPtrInput
	// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
	//
	// The following attributes are exported:
	AuditThreshold pulumi.IntPtrInput
	// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
	BudgetType pulumi.StringPtrInput
	// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
	CapacityBytes pulumi.IntPtrInput
	// The description of the collector.
	Description pulumi.StringPtrInput
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringPtrInput
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringPtrInput
	// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
	Scope pulumi.StringPtrInput
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringPtrInput
}

func (IngestBudgetV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*ingestBudgetV2State)(nil)).Elem()
}

type ingestBudgetV2Args struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action string `pulumi:"action"`
	// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
	//
	// The following attributes are exported:
	AuditThreshold *int `pulumi:"auditThreshold"`
	// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
	BudgetType *string `pulumi:"budgetType"`
	// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
	CapacityBytes int `pulumi:"capacityBytes"`
	// The description of the collector.
	Description *string `pulumi:"description"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name *string `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime string `pulumi:"resetTime"`
	// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
	Scope string `pulumi:"scope"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone string `pulumi:"timezone"`
}

// The set of arguments for constructing a IngestBudgetV2 resource.
type IngestBudgetV2Args struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringInput
	// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
	//
	// The following attributes are exported:
	AuditThreshold pulumi.IntPtrInput
	// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
	BudgetType pulumi.StringPtrInput
	// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
	CapacityBytes pulumi.IntInput
	// The description of the collector.
	Description pulumi.StringPtrInput
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringPtrInput
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringInput
	// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
	Scope pulumi.StringInput
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringInput
}

func (IngestBudgetV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*ingestBudgetV2Args)(nil)).Elem()
}

type IngestBudgetV2Input interface {
	pulumi.Input

	ToIngestBudgetV2Output() IngestBudgetV2Output
	ToIngestBudgetV2OutputWithContext(ctx context.Context) IngestBudgetV2Output
}

func (*IngestBudgetV2) ElementType() reflect.Type {
	return reflect.TypeOf((**IngestBudgetV2)(nil)).Elem()
}

func (i *IngestBudgetV2) ToIngestBudgetV2Output() IngestBudgetV2Output {
	return i.ToIngestBudgetV2OutputWithContext(context.Background())
}

func (i *IngestBudgetV2) ToIngestBudgetV2OutputWithContext(ctx context.Context) IngestBudgetV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetV2Output)
}

// IngestBudgetV2ArrayInput is an input type that accepts IngestBudgetV2Array and IngestBudgetV2ArrayOutput values.
// You can construct a concrete instance of `IngestBudgetV2ArrayInput` via:
//
//	IngestBudgetV2Array{ IngestBudgetV2Args{...} }
type IngestBudgetV2ArrayInput interface {
	pulumi.Input

	ToIngestBudgetV2ArrayOutput() IngestBudgetV2ArrayOutput
	ToIngestBudgetV2ArrayOutputWithContext(context.Context) IngestBudgetV2ArrayOutput
}

type IngestBudgetV2Array []IngestBudgetV2Input

func (IngestBudgetV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngestBudgetV2)(nil)).Elem()
}

func (i IngestBudgetV2Array) ToIngestBudgetV2ArrayOutput() IngestBudgetV2ArrayOutput {
	return i.ToIngestBudgetV2ArrayOutputWithContext(context.Background())
}

func (i IngestBudgetV2Array) ToIngestBudgetV2ArrayOutputWithContext(ctx context.Context) IngestBudgetV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetV2ArrayOutput)
}

// IngestBudgetV2MapInput is an input type that accepts IngestBudgetV2Map and IngestBudgetV2MapOutput values.
// You can construct a concrete instance of `IngestBudgetV2MapInput` via:
//
//	IngestBudgetV2Map{ "key": IngestBudgetV2Args{...} }
type IngestBudgetV2MapInput interface {
	pulumi.Input

	ToIngestBudgetV2MapOutput() IngestBudgetV2MapOutput
	ToIngestBudgetV2MapOutputWithContext(context.Context) IngestBudgetV2MapOutput
}

type IngestBudgetV2Map map[string]IngestBudgetV2Input

func (IngestBudgetV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngestBudgetV2)(nil)).Elem()
}

func (i IngestBudgetV2Map) ToIngestBudgetV2MapOutput() IngestBudgetV2MapOutput {
	return i.ToIngestBudgetV2MapOutputWithContext(context.Background())
}

func (i IngestBudgetV2Map) ToIngestBudgetV2MapOutputWithContext(ctx context.Context) IngestBudgetV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetV2MapOutput)
}

type IngestBudgetV2Output struct{ *pulumi.OutputState }

func (IngestBudgetV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**IngestBudgetV2)(nil)).Elem()
}

func (o IngestBudgetV2Output) ToIngestBudgetV2Output() IngestBudgetV2Output {
	return o
}

func (o IngestBudgetV2Output) ToIngestBudgetV2OutputWithContext(ctx context.Context) IngestBudgetV2Output {
	return o
}

// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
func (o IngestBudgetV2Output) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
//
// The following attributes are exported:
func (o IngestBudgetV2Output) AuditThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.IntPtrOutput { return v.AuditThreshold }).(pulumi.IntPtrOutput)
}

// The type of budget. Supported values are:  * `dailyVolume` * `minuteVolume`. Default value is `dailyVolume`.
func (o IngestBudgetV2Output) BudgetType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringPtrOutput { return v.BudgetType }).(pulumi.StringPtrOutput)
}

// Capacity of the ingest budget, in bytes. It takes a few minutes for Collectors to stop collecting when capacity is reached. We recommend setting a soft limit that is lower than your needed hard limit. The capacity bytes unit varies based on the budgetType field. For `dailyVolume` budgetType the capacity specified is in bytes/day whereas for `minuteVolume` budgetType its bytes/min.
func (o IngestBudgetV2Output) CapacityBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.IntOutput { return v.CapacityBytes }).(pulumi.IntOutput)
}

// The description of the collector.
func (o IngestBudgetV2Output) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Display name of the ingest budget. This must be unique across all of the ingest budgets
func (o IngestBudgetV2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
func (o IngestBudgetV2Output) ResetTime() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringOutput { return v.ResetTime }).(pulumi.StringOutput)
}

// A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
func (o IngestBudgetV2Output) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
func (o IngestBudgetV2Output) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudgetV2) pulumi.StringOutput { return v.Timezone }).(pulumi.StringOutput)
}

type IngestBudgetV2ArrayOutput struct{ *pulumi.OutputState }

func (IngestBudgetV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngestBudgetV2)(nil)).Elem()
}

func (o IngestBudgetV2ArrayOutput) ToIngestBudgetV2ArrayOutput() IngestBudgetV2ArrayOutput {
	return o
}

func (o IngestBudgetV2ArrayOutput) ToIngestBudgetV2ArrayOutputWithContext(ctx context.Context) IngestBudgetV2ArrayOutput {
	return o
}

func (o IngestBudgetV2ArrayOutput) Index(i pulumi.IntInput) IngestBudgetV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IngestBudgetV2 {
		return vs[0].([]*IngestBudgetV2)[vs[1].(int)]
	}).(IngestBudgetV2Output)
}

type IngestBudgetV2MapOutput struct{ *pulumi.OutputState }

func (IngestBudgetV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngestBudgetV2)(nil)).Elem()
}

func (o IngestBudgetV2MapOutput) ToIngestBudgetV2MapOutput() IngestBudgetV2MapOutput {
	return o
}

func (o IngestBudgetV2MapOutput) ToIngestBudgetV2MapOutputWithContext(ctx context.Context) IngestBudgetV2MapOutput {
	return o
}

func (o IngestBudgetV2MapOutput) MapIndex(k pulumi.StringInput) IngestBudgetV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IngestBudgetV2 {
		return vs[0].(map[string]*IngestBudgetV2)[vs[1].(string)]
	}).(IngestBudgetV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetV2Input)(nil)).Elem(), &IngestBudgetV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetV2ArrayInput)(nil)).Elem(), IngestBudgetV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetV2MapInput)(nil)).Elem(), IngestBudgetV2Map{})
	pulumi.RegisterOutputType(IngestBudgetV2Output{})
	pulumi.RegisterOutputType(IngestBudgetV2ArrayOutput{})
	pulumi.RegisterOutputType(IngestBudgetV2MapOutput{})
}
