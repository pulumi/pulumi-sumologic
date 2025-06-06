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

// Provides a [Sumologic CloudWatch source](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics).
//
// __IMPORTANT:__ The AWS credentials are stored in plain-text in the state. This is a potential security issue.
//
// ## Import
//
// CloudWatch sources can be imported using the collector and source IDs (`collector/source`), e.g.:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/cloudwatchSource:CloudwatchSource test 123/456
// ```
//
// CloudWatch sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/cloudwatchSource:CloudwatchSource test my-test-collector/my-test-source
// ```
//
// [1]: https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources
// [2]: https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics
type CloudwatchSource struct {
	pulumi.CustomResourceState

	// Authentication details for connecting to the S3 bucket.
	Authentication       CloudwatchSourceAuthenticationOutput `pulumi:"authentication"`
	AutomaticDateParsing pulumi.BoolPtrOutput                 `pulumi:"automaticDateParsing"`
	Category             pulumi.StringPtrOutput               `pulumi:"category"`
	CollectorId          pulumi.IntOutput                     `pulumi:"collectorId"`
	// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
	ContentType                pulumi.StringOutput                          `pulumi:"contentType"`
	CutoffRelativeTime         pulumi.StringPtrOutput                       `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            pulumi.IntPtrOutput                          `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         CloudwatchSourceDefaultDateFormatArrayOutput `pulumi:"defaultDateFormats"`
	Description                pulumi.StringPtrOutput                       `pulumi:"description"`
	Fields                     pulumi.StringMapOutput                       `pulumi:"fields"`
	Filters                    CloudwatchSourceFilterArrayOutput            `pulumi:"filters"`
	ForceTimezone              pulumi.BoolPtrOutput                         `pulumi:"forceTimezone"`
	HashAlgorithm              pulumi.StringPtrOutput                       `pulumi:"hashAlgorithm"`
	HostName                   pulumi.StringPtrOutput                       `pulumi:"hostName"`
	ManualPrefixRegexp         pulumi.StringPtrOutput                       `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled pulumi.BoolPtrOutput                         `pulumi:"multilineProcessingEnabled"`
	Name                       pulumi.StringOutput                          `pulumi:"name"`
	// The location to scan for new data.
	Path CloudwatchSourcePathOutput `pulumi:"path"`
	// When set to true, the scanner is paused. To disable, set to false.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
	ScanInterval pulumi.IntPtrOutput    `pulumi:"scanInterval"`
	Timezone     pulumi.StringPtrOutput `pulumi:"timezone"`
	// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](<https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)>).
	Url                 pulumi.StringOutput  `pulumi:"url"`
	UseAutolineMatching pulumi.BoolPtrOutput `pulumi:"useAutolineMatching"`
}

// NewCloudwatchSource registers a new resource with the given unique name, arguments, and options.
func NewCloudwatchSource(ctx *pulumi.Context,
	name string, args *CloudwatchSourceArgs, opts ...pulumi.ResourceOption) (*CloudwatchSource, error) {
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
	var resource CloudwatchSource
	err := ctx.RegisterResource("sumologic:index/cloudwatchSource:CloudwatchSource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudwatchSource gets an existing CloudwatchSource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudwatchSource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudwatchSourceState, opts ...pulumi.ResourceOption) (*CloudwatchSource, error) {
	var resource CloudwatchSource
	err := ctx.ReadResource("sumologic:index/cloudwatchSource:CloudwatchSource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudwatchSource resources.
type cloudwatchSourceState struct {
	// Authentication details for connecting to the S3 bucket.
	Authentication       *CloudwatchSourceAuthentication `pulumi:"authentication"`
	AutomaticDateParsing *bool                           `pulumi:"automaticDateParsing"`
	Category             *string                         `pulumi:"category"`
	CollectorId          *int                            `pulumi:"collectorId"`
	// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
	ContentType                *string                             `pulumi:"contentType"`
	CutoffRelativeTime         *string                             `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            *int                                `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         []CloudwatchSourceDefaultDateFormat `pulumi:"defaultDateFormats"`
	Description                *string                             `pulumi:"description"`
	Fields                     map[string]string                   `pulumi:"fields"`
	Filters                    []CloudwatchSourceFilter            `pulumi:"filters"`
	ForceTimezone              *bool                               `pulumi:"forceTimezone"`
	HashAlgorithm              *string                             `pulumi:"hashAlgorithm"`
	HostName                   *string                             `pulumi:"hostName"`
	ManualPrefixRegexp         *string                             `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled *bool                               `pulumi:"multilineProcessingEnabled"`
	Name                       *string                             `pulumi:"name"`
	// The location to scan for new data.
	Path *CloudwatchSourcePath `pulumi:"path"`
	// When set to true, the scanner is paused. To disable, set to false.
	Paused *bool `pulumi:"paused"`
	// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
	ScanInterval *int    `pulumi:"scanInterval"`
	Timezone     *string `pulumi:"timezone"`
	// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](<https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)>).
	Url                 *string `pulumi:"url"`
	UseAutolineMatching *bool   `pulumi:"useAutolineMatching"`
}

type CloudwatchSourceState struct {
	// Authentication details for connecting to the S3 bucket.
	Authentication       CloudwatchSourceAuthenticationPtrInput
	AutomaticDateParsing pulumi.BoolPtrInput
	Category             pulumi.StringPtrInput
	CollectorId          pulumi.IntPtrInput
	// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
	ContentType                pulumi.StringPtrInput
	CutoffRelativeTime         pulumi.StringPtrInput
	CutoffTimestamp            pulumi.IntPtrInput
	DefaultDateFormats         CloudwatchSourceDefaultDateFormatArrayInput
	Description                pulumi.StringPtrInput
	Fields                     pulumi.StringMapInput
	Filters                    CloudwatchSourceFilterArrayInput
	ForceTimezone              pulumi.BoolPtrInput
	HashAlgorithm              pulumi.StringPtrInput
	HostName                   pulumi.StringPtrInput
	ManualPrefixRegexp         pulumi.StringPtrInput
	MultilineProcessingEnabled pulumi.BoolPtrInput
	Name                       pulumi.StringPtrInput
	// The location to scan for new data.
	Path CloudwatchSourcePathPtrInput
	// When set to true, the scanner is paused. To disable, set to false.
	Paused pulumi.BoolPtrInput
	// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
	ScanInterval pulumi.IntPtrInput
	Timezone     pulumi.StringPtrInput
	// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](<https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)>).
	Url                 pulumi.StringPtrInput
	UseAutolineMatching pulumi.BoolPtrInput
}

func (CloudwatchSourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudwatchSourceState)(nil)).Elem()
}

type cloudwatchSourceArgs struct {
	// Authentication details for connecting to the S3 bucket.
	Authentication       CloudwatchSourceAuthentication `pulumi:"authentication"`
	AutomaticDateParsing *bool                          `pulumi:"automaticDateParsing"`
	Category             *string                        `pulumi:"category"`
	CollectorId          int                            `pulumi:"collectorId"`
	// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
	ContentType                string                              `pulumi:"contentType"`
	CutoffRelativeTime         *string                             `pulumi:"cutoffRelativeTime"`
	CutoffTimestamp            *int                                `pulumi:"cutoffTimestamp"`
	DefaultDateFormats         []CloudwatchSourceDefaultDateFormat `pulumi:"defaultDateFormats"`
	Description                *string                             `pulumi:"description"`
	Fields                     map[string]string                   `pulumi:"fields"`
	Filters                    []CloudwatchSourceFilter            `pulumi:"filters"`
	ForceTimezone              *bool                               `pulumi:"forceTimezone"`
	HashAlgorithm              *string                             `pulumi:"hashAlgorithm"`
	HostName                   *string                             `pulumi:"hostName"`
	ManualPrefixRegexp         *string                             `pulumi:"manualPrefixRegexp"`
	MultilineProcessingEnabled *bool                               `pulumi:"multilineProcessingEnabled"`
	Name                       *string                             `pulumi:"name"`
	// The location to scan for new data.
	Path CloudwatchSourcePath `pulumi:"path"`
	// When set to true, the scanner is paused. To disable, set to false.
	Paused *bool `pulumi:"paused"`
	// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
	ScanInterval        *int    `pulumi:"scanInterval"`
	Timezone            *string `pulumi:"timezone"`
	UseAutolineMatching *bool   `pulumi:"useAutolineMatching"`
}

// The set of arguments for constructing a CloudwatchSource resource.
type CloudwatchSourceArgs struct {
	// Authentication details for connecting to the S3 bucket.
	Authentication       CloudwatchSourceAuthenticationInput
	AutomaticDateParsing pulumi.BoolPtrInput
	Category             pulumi.StringPtrInput
	CollectorId          pulumi.IntInput
	// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
	ContentType                pulumi.StringInput
	CutoffRelativeTime         pulumi.StringPtrInput
	CutoffTimestamp            pulumi.IntPtrInput
	DefaultDateFormats         CloudwatchSourceDefaultDateFormatArrayInput
	Description                pulumi.StringPtrInput
	Fields                     pulumi.StringMapInput
	Filters                    CloudwatchSourceFilterArrayInput
	ForceTimezone              pulumi.BoolPtrInput
	HashAlgorithm              pulumi.StringPtrInput
	HostName                   pulumi.StringPtrInput
	ManualPrefixRegexp         pulumi.StringPtrInput
	MultilineProcessingEnabled pulumi.BoolPtrInput
	Name                       pulumi.StringPtrInput
	// The location to scan for new data.
	Path CloudwatchSourcePathInput
	// When set to true, the scanner is paused. To disable, set to false.
	Paused pulumi.BoolPtrInput
	// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
	ScanInterval        pulumi.IntPtrInput
	Timezone            pulumi.StringPtrInput
	UseAutolineMatching pulumi.BoolPtrInput
}

func (CloudwatchSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudwatchSourceArgs)(nil)).Elem()
}

type CloudwatchSourceInput interface {
	pulumi.Input

	ToCloudwatchSourceOutput() CloudwatchSourceOutput
	ToCloudwatchSourceOutputWithContext(ctx context.Context) CloudwatchSourceOutput
}

func (*CloudwatchSource) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudwatchSource)(nil)).Elem()
}

func (i *CloudwatchSource) ToCloudwatchSourceOutput() CloudwatchSourceOutput {
	return i.ToCloudwatchSourceOutputWithContext(context.Background())
}

func (i *CloudwatchSource) ToCloudwatchSourceOutputWithContext(ctx context.Context) CloudwatchSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudwatchSourceOutput)
}

// CloudwatchSourceArrayInput is an input type that accepts CloudwatchSourceArray and CloudwatchSourceArrayOutput values.
// You can construct a concrete instance of `CloudwatchSourceArrayInput` via:
//
//	CloudwatchSourceArray{ CloudwatchSourceArgs{...} }
type CloudwatchSourceArrayInput interface {
	pulumi.Input

	ToCloudwatchSourceArrayOutput() CloudwatchSourceArrayOutput
	ToCloudwatchSourceArrayOutputWithContext(context.Context) CloudwatchSourceArrayOutput
}

type CloudwatchSourceArray []CloudwatchSourceInput

func (CloudwatchSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudwatchSource)(nil)).Elem()
}

func (i CloudwatchSourceArray) ToCloudwatchSourceArrayOutput() CloudwatchSourceArrayOutput {
	return i.ToCloudwatchSourceArrayOutputWithContext(context.Background())
}

func (i CloudwatchSourceArray) ToCloudwatchSourceArrayOutputWithContext(ctx context.Context) CloudwatchSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudwatchSourceArrayOutput)
}

// CloudwatchSourceMapInput is an input type that accepts CloudwatchSourceMap and CloudwatchSourceMapOutput values.
// You can construct a concrete instance of `CloudwatchSourceMapInput` via:
//
//	CloudwatchSourceMap{ "key": CloudwatchSourceArgs{...} }
type CloudwatchSourceMapInput interface {
	pulumi.Input

	ToCloudwatchSourceMapOutput() CloudwatchSourceMapOutput
	ToCloudwatchSourceMapOutputWithContext(context.Context) CloudwatchSourceMapOutput
}

type CloudwatchSourceMap map[string]CloudwatchSourceInput

func (CloudwatchSourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudwatchSource)(nil)).Elem()
}

func (i CloudwatchSourceMap) ToCloudwatchSourceMapOutput() CloudwatchSourceMapOutput {
	return i.ToCloudwatchSourceMapOutputWithContext(context.Background())
}

func (i CloudwatchSourceMap) ToCloudwatchSourceMapOutputWithContext(ctx context.Context) CloudwatchSourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudwatchSourceMapOutput)
}

type CloudwatchSourceOutput struct{ *pulumi.OutputState }

func (CloudwatchSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudwatchSource)(nil)).Elem()
}

func (o CloudwatchSourceOutput) ToCloudwatchSourceOutput() CloudwatchSourceOutput {
	return o
}

func (o CloudwatchSourceOutput) ToCloudwatchSourceOutputWithContext(ctx context.Context) CloudwatchSourceOutput {
	return o
}

// Authentication details for connecting to the S3 bucket.
func (o CloudwatchSourceOutput) Authentication() CloudwatchSourceAuthenticationOutput {
	return o.ApplyT(func(v *CloudwatchSource) CloudwatchSourceAuthenticationOutput { return v.Authentication }).(CloudwatchSourceAuthenticationOutput)
}

func (o CloudwatchSourceOutput) AutomaticDateParsing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.BoolPtrOutput { return v.AutomaticDateParsing }).(pulumi.BoolPtrOutput)
}

func (o CloudwatchSourceOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.Category }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) CollectorId() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.IntOutput { return v.CollectorId }).(pulumi.IntOutput)
}

// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
func (o CloudwatchSourceOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

func (o CloudwatchSourceOutput) CutoffRelativeTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.CutoffRelativeTime }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) CutoffTimestamp() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.IntPtrOutput { return v.CutoffTimestamp }).(pulumi.IntPtrOutput)
}

func (o CloudwatchSourceOutput) DefaultDateFormats() CloudwatchSourceDefaultDateFormatArrayOutput {
	return o.ApplyT(func(v *CloudwatchSource) CloudwatchSourceDefaultDateFormatArrayOutput { return v.DefaultDateFormats }).(CloudwatchSourceDefaultDateFormatArrayOutput)
}

func (o CloudwatchSourceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) Fields() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringMapOutput { return v.Fields }).(pulumi.StringMapOutput)
}

func (o CloudwatchSourceOutput) Filters() CloudwatchSourceFilterArrayOutput {
	return o.ApplyT(func(v *CloudwatchSource) CloudwatchSourceFilterArrayOutput { return v.Filters }).(CloudwatchSourceFilterArrayOutput)
}

func (o CloudwatchSourceOutput) ForceTimezone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.BoolPtrOutput { return v.ForceTimezone }).(pulumi.BoolPtrOutput)
}

func (o CloudwatchSourceOutput) HashAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.HashAlgorithm }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.HostName }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) ManualPrefixRegexp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.ManualPrefixRegexp }).(pulumi.StringPtrOutput)
}

func (o CloudwatchSourceOutput) MultilineProcessingEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.BoolPtrOutput { return v.MultilineProcessingEnabled }).(pulumi.BoolPtrOutput)
}

func (o CloudwatchSourceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The location to scan for new data.
func (o CloudwatchSourceOutput) Path() CloudwatchSourcePathOutput {
	return o.ApplyT(func(v *CloudwatchSource) CloudwatchSourcePathOutput { return v.Path }).(CloudwatchSourcePathOutput)
}

// When set to true, the scanner is paused. To disable, set to false.
func (o CloudwatchSourceOutput) Paused() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.BoolPtrOutput { return v.Paused }).(pulumi.BoolPtrOutput)
}

// Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
func (o CloudwatchSourceOutput) ScanInterval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.IntPtrOutput { return v.ScanInterval }).(pulumi.IntPtrOutput)
}

func (o CloudwatchSourceOutput) Timezone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringPtrOutput { return v.Timezone }).(pulumi.StringPtrOutput)
}

// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](<https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)>).
func (o CloudwatchSourceOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

func (o CloudwatchSourceOutput) UseAutolineMatching() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CloudwatchSource) pulumi.BoolPtrOutput { return v.UseAutolineMatching }).(pulumi.BoolPtrOutput)
}

type CloudwatchSourceArrayOutput struct{ *pulumi.OutputState }

func (CloudwatchSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudwatchSource)(nil)).Elem()
}

func (o CloudwatchSourceArrayOutput) ToCloudwatchSourceArrayOutput() CloudwatchSourceArrayOutput {
	return o
}

func (o CloudwatchSourceArrayOutput) ToCloudwatchSourceArrayOutputWithContext(ctx context.Context) CloudwatchSourceArrayOutput {
	return o
}

func (o CloudwatchSourceArrayOutput) Index(i pulumi.IntInput) CloudwatchSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudwatchSource {
		return vs[0].([]*CloudwatchSource)[vs[1].(int)]
	}).(CloudwatchSourceOutput)
}

type CloudwatchSourceMapOutput struct{ *pulumi.OutputState }

func (CloudwatchSourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudwatchSource)(nil)).Elem()
}

func (o CloudwatchSourceMapOutput) ToCloudwatchSourceMapOutput() CloudwatchSourceMapOutput {
	return o
}

func (o CloudwatchSourceMapOutput) ToCloudwatchSourceMapOutputWithContext(ctx context.Context) CloudwatchSourceMapOutput {
	return o
}

func (o CloudwatchSourceMapOutput) MapIndex(k pulumi.StringInput) CloudwatchSourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudwatchSource {
		return vs[0].(map[string]*CloudwatchSource)[vs[1].(string)]
	}).(CloudwatchSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudwatchSourceInput)(nil)).Elem(), &CloudwatchSource{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudwatchSourceArrayInput)(nil)).Elem(), CloudwatchSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudwatchSourceMapInput)(nil)).Elem(), CloudwatchSourceMap{})
	pulumi.RegisterOutputType(CloudwatchSourceOutput{})
	pulumi.RegisterOutputType(CloudwatchSourceArrayOutput{})
	pulumi.RegisterOutputType(CloudwatchSourceMapOutput{})
}
