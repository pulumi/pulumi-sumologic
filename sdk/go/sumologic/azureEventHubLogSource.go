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

// Provides a [Sumologic Azure Event Hub Log Source](https://help.sumologic.com/docs/send-data/collect-from-other-data-sources/azure-monitoring/ms-azure-event-hubs-source/).
//
// __IMPORTANT:__ The Azure Event Hub credentials are stored in plain-text in the state. This is a potential security issue.
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
//			collector, err := sumologic.NewCollector(ctx, "collector", &sumologic.CollectorArgs{
//				Name:        pulumi.String("my-collector"),
//				Description: pulumi.String("Just testing this"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sumologic.NewAzureEventHubLogSource(ctx, "terraform_azure_event_hub_log_source", &sumologic.AzureEventHubLogSourceArgs{
//				Name:        pulumi.String("Azure Event Hub Log Source"),
//				Description: pulumi.String("My description"),
//				Category:    pulumi.String("azure/eventhub"),
//				ContentType: pulumi.String("AzureEventHubLog"),
//				CollectorId: collector.ID(),
//				Authentication: &sumologic.AzureEventHubLogSourceAuthenticationArgs{
//					Type:                   pulumi.String("AzureEventHubAuthentication"),
//					SharedAccessPolicyName: pulumi.String("%s"),
//					SharedAccessPolicyKey:  pulumi.String("%s"),
//				},
//				Path: &sumologic.AzureEventHubLogSourcePathArgs{
//					Type:          pulumi.String("AzureEventHubPath"),
//					Namespace:     pulumi.String("%s"),
//					EventHubName:  pulumi.String("%s"),
//					ConsumerGroup: pulumi.String("%s"),
//					Region:        pulumi.String("%s"),
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
type AzureEventHubLogSource struct {
	pulumi.CustomResourceState

	// Authentication details for connecting to Azure Event Hub.
	Authentication       AzureEventHubLogSourceAuthenticationOutput `pulumi:"authentication"`
	AutomaticDateParsing pulumi.BoolPtrOutput                       `pulumi:"automaticDateParsing"`
	Category             pulumi.StringPtrOutput                     `pulumi:"category"`
	CollectorId          pulumi.IntOutput                           `pulumi:"collectorId"`
	// Must be `AzureEventHubLog`.
	ContentType                pulumi.StringOutput                                `pulumi:"contentType"`
	CutoffRelativeTime         pulumi.StringPtrOutput                             `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            pulumi.IntPtrOutput                                `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         AzureEventHubLogSourceDefaultDateFormatArrayOutput `pulumi:"defaultDateFormats"`
	Description                pulumi.StringPtrOutput                             `pulumi:"description"`
	Fields                     pulumi.StringMapOutput                             `pulumi:"fields"`
	Filters                    AzureEventHubLogSourceFilterArrayOutput            `pulumi:"filters"`
	ForceTimezone              pulumi.BoolPtrOutput                               `pulumi:"forceTimezone"`
	HostName                   pulumi.StringPtrOutput                             `pulumi:"hostName"`
	ManualPrefixRegexp         pulumi.StringPtrOutput                             `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled pulumi.BoolPtrOutput                               `pulumi:"multilineProcessingEnabled"`
	Name                       pulumi.StringOutput                                `pulumi:"name"`
	// The location to scan for new data.
	Path                AzureEventHubLogSourcePathOutput `pulumi:"path"`
	Paused              pulumi.BoolPtrOutput             `pulumi:"paused"`
	ScanInterval        pulumi.IntPtrOutput              `pulumi:"scanInterval"`
	Timezone            pulumi.StringPtrOutput           `pulumi:"timezone"`
	Url                 pulumi.StringOutput              `pulumi:"url"`
	UseAutolineMatching pulumi.BoolPtrOutput             `pulumi:"useAutolineMatching"`
}

// NewAzureEventHubLogSource registers a new resource with the given unique name, arguments, and options.
func NewAzureEventHubLogSource(ctx *pulumi.Context,
	name string, args *AzureEventHubLogSourceArgs, opts ...pulumi.ResourceOption) (*AzureEventHubLogSource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Authentication == nil {
		return nil, errors.New("invalid value for required argument 'Authentication'")
	}
	if args.CollectorId == nil {
		return nil, errors.New("invalid value for required argument 'CollectorId'")
	}
	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AzureEventHubLogSource
	err := ctx.RegisterResource("sumologic:index/azureEventHubLogSource:AzureEventHubLogSource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureEventHubLogSource gets an existing AzureEventHubLogSource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureEventHubLogSource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureEventHubLogSourceState, opts ...pulumi.ResourceOption) (*AzureEventHubLogSource, error) {
	var resource AzureEventHubLogSource
	err := ctx.ReadResource("sumologic:index/azureEventHubLogSource:AzureEventHubLogSource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureEventHubLogSource resources.
type azureEventHubLogSourceState struct {
	// Authentication details for connecting to Azure Event Hub.
	Authentication       *AzureEventHubLogSourceAuthentication `pulumi:"authentication"`
	AutomaticDateParsing *bool                                 `pulumi:"automaticDateParsing"`
	Category             *string                               `pulumi:"category"`
	CollectorId          *int                                  `pulumi:"collectorId"`
	// Must be `AzureEventHubLog`.
	ContentType                *string                                   `pulumi:"contentType"`
	CutoffRelativeTime         *string                                   `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            *int                                      `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         []AzureEventHubLogSourceDefaultDateFormat `pulumi:"defaultDateFormats"`
	Description                *string                                   `pulumi:"description"`
	Fields                     map[string]string                         `pulumi:"fields"`
	Filters                    []AzureEventHubLogSourceFilter            `pulumi:"filters"`
	ForceTimezone              *bool                                     `pulumi:"forceTimezone"`
	HostName                   *string                                   `pulumi:"hostName"`
	ManualPrefixRegexp         *string                                   `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled *bool                                     `pulumi:"multilineProcessingEnabled"`
	Name                       *string                                   `pulumi:"name"`
	// The location to scan for new data.
	Path                *AzureEventHubLogSourcePath `pulumi:"path"`
	Paused              *bool                       `pulumi:"paused"`
	ScanInterval        *int                        `pulumi:"scanInterval"`
	Timezone            *string                     `pulumi:"timezone"`
	Url                 *string                     `pulumi:"url"`
	UseAutolineMatching *bool                       `pulumi:"useAutolineMatching"`
}

type AzureEventHubLogSourceState struct {
	// Authentication details for connecting to Azure Event Hub.
	Authentication       AzureEventHubLogSourceAuthenticationPtrInput
	AutomaticDateParsing pulumi.BoolPtrInput
	Category             pulumi.StringPtrInput
	CollectorId          pulumi.IntPtrInput
	// Must be `AzureEventHubLog`.
	ContentType                pulumi.StringPtrInput
	CutoffRelativeTime         pulumi.StringPtrInput
	CutoffTimestamp            pulumi.IntPtrInput
	DefaultDateFormats         AzureEventHubLogSourceDefaultDateFormatArrayInput
	Description                pulumi.StringPtrInput
	Fields                     pulumi.StringMapInput
	Filters                    AzureEventHubLogSourceFilterArrayInput
	ForceTimezone              pulumi.BoolPtrInput
	HostName                   pulumi.StringPtrInput
	ManualPrefixRegexp         pulumi.StringPtrInput
	MultilineProcessingEnabled pulumi.BoolPtrInput
	Name                       pulumi.StringPtrInput
	// The location to scan for new data.
	Path                AzureEventHubLogSourcePathPtrInput
	Paused              pulumi.BoolPtrInput
	ScanInterval        pulumi.IntPtrInput
	Timezone            pulumi.StringPtrInput
	Url                 pulumi.StringPtrInput
	UseAutolineMatching pulumi.BoolPtrInput
}

func (AzureEventHubLogSourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureEventHubLogSourceState)(nil)).Elem()
}

type azureEventHubLogSourceArgs struct {
	// Authentication details for connecting to Azure Event Hub.
	Authentication       AzureEventHubLogSourceAuthentication `pulumi:"authentication"`
	AutomaticDateParsing *bool                                `pulumi:"automaticDateParsing"`
	Category             *string                              `pulumi:"category"`
	CollectorId          int                                  `pulumi:"collectorId"`
	// Must be `AzureEventHubLog`.
	ContentType                string                                    `pulumi:"contentType"`
	CutoffRelativeTime         *string                                   `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            *int                                      `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         []AzureEventHubLogSourceDefaultDateFormat `pulumi:"defaultDateFormats"`
	Description                *string                                   `pulumi:"description"`
	Fields                     map[string]string                         `pulumi:"fields"`
	Filters                    []AzureEventHubLogSourceFilter            `pulumi:"filters"`
	ForceTimezone              *bool                                     `pulumi:"forceTimezone"`
	HostName                   *string                                   `pulumi:"hostName"`
	ManualPrefixRegexp         *string                                   `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled *bool                                     `pulumi:"multilineProcessingEnabled"`
	Name                       *string                                   `pulumi:"name"`
	// The location to scan for new data.
	Path                AzureEventHubLogSourcePath `pulumi:"path"`
	Paused              *bool                      `pulumi:"paused"`
	ScanInterval        *int                       `pulumi:"scanInterval"`
	Timezone            *string                    `pulumi:"timezone"`
	UseAutolineMatching *bool                      `pulumi:"useAutolineMatching"`
}

// The set of arguments for constructing a AzureEventHubLogSource resource.
type AzureEventHubLogSourceArgs struct {
	// Authentication details for connecting to Azure Event Hub.
	Authentication       AzureEventHubLogSourceAuthenticationInput
	AutomaticDateParsing pulumi.BoolPtrInput
	Category             pulumi.StringPtrInput
	CollectorId          pulumi.IntInput
	// Must be `AzureEventHubLog`.
	ContentType                pulumi.StringInput
	CutoffRelativeTime         pulumi.StringPtrInput
	CutoffTimestamp            pulumi.IntPtrInput
	DefaultDateFormats         AzureEventHubLogSourceDefaultDateFormatArrayInput
	Description                pulumi.StringPtrInput
	Fields                     pulumi.StringMapInput
	Filters                    AzureEventHubLogSourceFilterArrayInput
	ForceTimezone              pulumi.BoolPtrInput
	HostName                   pulumi.StringPtrInput
	ManualPrefixRegexp         pulumi.StringPtrInput
	MultilineProcessingEnabled pulumi.BoolPtrInput
	Name                       pulumi.StringPtrInput
	// The location to scan for new data.
	Path                AzureEventHubLogSourcePathInput
	Paused              pulumi.BoolPtrInput
	ScanInterval        pulumi.IntPtrInput
	Timezone            pulumi.StringPtrInput
	UseAutolineMatching pulumi.BoolPtrInput
}

func (AzureEventHubLogSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureEventHubLogSourceArgs)(nil)).Elem()
}

type AzureEventHubLogSourceInput interface {
	pulumi.Input

	ToAzureEventHubLogSourceOutput() AzureEventHubLogSourceOutput
	ToAzureEventHubLogSourceOutputWithContext(ctx context.Context) AzureEventHubLogSourceOutput
}

func (*AzureEventHubLogSource) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureEventHubLogSource)(nil)).Elem()
}

func (i *AzureEventHubLogSource) ToAzureEventHubLogSourceOutput() AzureEventHubLogSourceOutput {
	return i.ToAzureEventHubLogSourceOutputWithContext(context.Background())
}

func (i *AzureEventHubLogSource) ToAzureEventHubLogSourceOutputWithContext(ctx context.Context) AzureEventHubLogSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureEventHubLogSourceOutput)
}

// AzureEventHubLogSourceArrayInput is an input type that accepts AzureEventHubLogSourceArray and AzureEventHubLogSourceArrayOutput values.
// You can construct a concrete instance of `AzureEventHubLogSourceArrayInput` via:
//
//	AzureEventHubLogSourceArray{ AzureEventHubLogSourceArgs{...} }
type AzureEventHubLogSourceArrayInput interface {
	pulumi.Input

	ToAzureEventHubLogSourceArrayOutput() AzureEventHubLogSourceArrayOutput
	ToAzureEventHubLogSourceArrayOutputWithContext(context.Context) AzureEventHubLogSourceArrayOutput
}

type AzureEventHubLogSourceArray []AzureEventHubLogSourceInput

func (AzureEventHubLogSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureEventHubLogSource)(nil)).Elem()
}

func (i AzureEventHubLogSourceArray) ToAzureEventHubLogSourceArrayOutput() AzureEventHubLogSourceArrayOutput {
	return i.ToAzureEventHubLogSourceArrayOutputWithContext(context.Background())
}

func (i AzureEventHubLogSourceArray) ToAzureEventHubLogSourceArrayOutputWithContext(ctx context.Context) AzureEventHubLogSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureEventHubLogSourceArrayOutput)
}

// AzureEventHubLogSourceMapInput is an input type that accepts AzureEventHubLogSourceMap and AzureEventHubLogSourceMapOutput values.
// You can construct a concrete instance of `AzureEventHubLogSourceMapInput` via:
//
//	AzureEventHubLogSourceMap{ "key": AzureEventHubLogSourceArgs{...} }
type AzureEventHubLogSourceMapInput interface {
	pulumi.Input

	ToAzureEventHubLogSourceMapOutput() AzureEventHubLogSourceMapOutput
	ToAzureEventHubLogSourceMapOutputWithContext(context.Context) AzureEventHubLogSourceMapOutput
}

type AzureEventHubLogSourceMap map[string]AzureEventHubLogSourceInput

func (AzureEventHubLogSourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureEventHubLogSource)(nil)).Elem()
}

func (i AzureEventHubLogSourceMap) ToAzureEventHubLogSourceMapOutput() AzureEventHubLogSourceMapOutput {
	return i.ToAzureEventHubLogSourceMapOutputWithContext(context.Background())
}

func (i AzureEventHubLogSourceMap) ToAzureEventHubLogSourceMapOutputWithContext(ctx context.Context) AzureEventHubLogSourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureEventHubLogSourceMapOutput)
}

type AzureEventHubLogSourceOutput struct{ *pulumi.OutputState }

func (AzureEventHubLogSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureEventHubLogSource)(nil)).Elem()
}

func (o AzureEventHubLogSourceOutput) ToAzureEventHubLogSourceOutput() AzureEventHubLogSourceOutput {
	return o
}

func (o AzureEventHubLogSourceOutput) ToAzureEventHubLogSourceOutputWithContext(ctx context.Context) AzureEventHubLogSourceOutput {
	return o
}

// Authentication details for connecting to Azure Event Hub.
func (o AzureEventHubLogSourceOutput) Authentication() AzureEventHubLogSourceAuthenticationOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) AzureEventHubLogSourceAuthenticationOutput { return v.Authentication }).(AzureEventHubLogSourceAuthenticationOutput)
}

func (o AzureEventHubLogSourceOutput) AutomaticDateParsing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.BoolPtrOutput { return v.AutomaticDateParsing }).(pulumi.BoolPtrOutput)
}

func (o AzureEventHubLogSourceOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.Category }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) CollectorId() pulumi.IntOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.IntOutput { return v.CollectorId }).(pulumi.IntOutput)
}

// Must be `AzureEventHubLog`.
func (o AzureEventHubLogSourceOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

func (o AzureEventHubLogSourceOutput) CutoffRelativeTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.CutoffRelativeTime }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) CutoffTimestamp() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.IntPtrOutput { return v.CutoffTimestamp }).(pulumi.IntPtrOutput)
}

func (o AzureEventHubLogSourceOutput) DefaultDateFormats() AzureEventHubLogSourceDefaultDateFormatArrayOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) AzureEventHubLogSourceDefaultDateFormatArrayOutput {
		return v.DefaultDateFormats
	}).(AzureEventHubLogSourceDefaultDateFormatArrayOutput)
}

func (o AzureEventHubLogSourceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) Fields() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringMapOutput { return v.Fields }).(pulumi.StringMapOutput)
}

func (o AzureEventHubLogSourceOutput) Filters() AzureEventHubLogSourceFilterArrayOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) AzureEventHubLogSourceFilterArrayOutput { return v.Filters }).(AzureEventHubLogSourceFilterArrayOutput)
}

func (o AzureEventHubLogSourceOutput) ForceTimezone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.BoolPtrOutput { return v.ForceTimezone }).(pulumi.BoolPtrOutput)
}

func (o AzureEventHubLogSourceOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.HostName }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) ManualPrefixRegexp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.ManualPrefixRegexp }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) MultilineProcessingEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.BoolPtrOutput { return v.MultilineProcessingEnabled }).(pulumi.BoolPtrOutput)
}

func (o AzureEventHubLogSourceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The location to scan for new data.
func (o AzureEventHubLogSourceOutput) Path() AzureEventHubLogSourcePathOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) AzureEventHubLogSourcePathOutput { return v.Path }).(AzureEventHubLogSourcePathOutput)
}

func (o AzureEventHubLogSourceOutput) Paused() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.BoolPtrOutput { return v.Paused }).(pulumi.BoolPtrOutput)
}

func (o AzureEventHubLogSourceOutput) ScanInterval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.IntPtrOutput { return v.ScanInterval }).(pulumi.IntPtrOutput)
}

func (o AzureEventHubLogSourceOutput) Timezone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringPtrOutput { return v.Timezone }).(pulumi.StringPtrOutput)
}

func (o AzureEventHubLogSourceOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

func (o AzureEventHubLogSourceOutput) UseAutolineMatching() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureEventHubLogSource) pulumi.BoolPtrOutput { return v.UseAutolineMatching }).(pulumi.BoolPtrOutput)
}

type AzureEventHubLogSourceArrayOutput struct{ *pulumi.OutputState }

func (AzureEventHubLogSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureEventHubLogSource)(nil)).Elem()
}

func (o AzureEventHubLogSourceArrayOutput) ToAzureEventHubLogSourceArrayOutput() AzureEventHubLogSourceArrayOutput {
	return o
}

func (o AzureEventHubLogSourceArrayOutput) ToAzureEventHubLogSourceArrayOutputWithContext(ctx context.Context) AzureEventHubLogSourceArrayOutput {
	return o
}

func (o AzureEventHubLogSourceArrayOutput) Index(i pulumi.IntInput) AzureEventHubLogSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureEventHubLogSource {
		return vs[0].([]*AzureEventHubLogSource)[vs[1].(int)]
	}).(AzureEventHubLogSourceOutput)
}

type AzureEventHubLogSourceMapOutput struct{ *pulumi.OutputState }

func (AzureEventHubLogSourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureEventHubLogSource)(nil)).Elem()
}

func (o AzureEventHubLogSourceMapOutput) ToAzureEventHubLogSourceMapOutput() AzureEventHubLogSourceMapOutput {
	return o
}

func (o AzureEventHubLogSourceMapOutput) ToAzureEventHubLogSourceMapOutputWithContext(ctx context.Context) AzureEventHubLogSourceMapOutput {
	return o
}

func (o AzureEventHubLogSourceMapOutput) MapIndex(k pulumi.StringInput) AzureEventHubLogSourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureEventHubLogSource {
		return vs[0].(map[string]*AzureEventHubLogSource)[vs[1].(string)]
	}).(AzureEventHubLogSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureEventHubLogSourceInput)(nil)).Elem(), &AzureEventHubLogSource{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureEventHubLogSourceArrayInput)(nil)).Elem(), AzureEventHubLogSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureEventHubLogSourceMapInput)(nil)).Elem(), AzureEventHubLogSourceMap{})
	pulumi.RegisterOutputType(AzureEventHubLogSourceOutput{})
	pulumi.RegisterOutputType(AzureEventHubLogSourceArrayOutput{})
	pulumi.RegisterOutputType(AzureEventHubLogSourceMapOutput{})
}