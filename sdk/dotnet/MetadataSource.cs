// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic
{
    /// <summary>
    /// Provides a Sumologic Metadata (Tag) source. This source allows you to collect tags from EC2 instances running on AWS.
    /// 
    /// __IMPORTANT:__ The AWS credentials are stored in plain-text in the state. This is a potential security issue.
    /// 
    /// ## Argument reference
    /// 
    /// In addition to the common properties, the following arguments are supported:
    /// 
    ///  - `content_type` - (Required) The content-type of the collected data. For Metadata source this is `AwsMetadata`. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
    ///  - `scan_interval` - (Required) Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
    ///  - `paused` - (Required) When set to true, the scanner is paused. To disable, set to false.
    ///  - `authentication` - (Required) Authentication details for AWS access.
    ///      + `type` - (Required) Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication`
    ///      + `access_key` - (Required) Your AWS access key if using type `S3BucketAuthentication`
    ///      + `secret_key` - (Required) Your AWS secret key if using type `S3BucketAuthentication`
    ///      + `role_arn` - (Required) Your AWS role ARN if using type `AWSRoleBasedAuthentication`
    ///  - `path` - (Required) The location to scan for new data.
    ///      + `type` - (Required) type of polling source. Only allowed value is `AwsMetadataPath`.
    ///      + `limit_to_regions` - (Optional) List of Amazon regions.
    ///      + `limit_to_namespaces` - List of namespaces. For `AwsMetadataPath` the only valid namespace is `AWS/EC2`.
    ///      + `tag_filters` - (Optional) Leave this field blank to collect all tags configured for the EC2 instance. To collect a subset of tags, follow the instructions in [Define EC2 tag filters][2]
    /// 
    /// ### See also
    ///   * [Sumologic &gt; Sources &gt; Sources for Hosted Collectors &gt; AWS &gt; AWS Metadata (Tag) Source][3]
    ///   * [Common Source Properties][4]
    /// 
    /// ## Import
    /// 
    /// Metadata sources can be imported using the collector and source IDs (`collector/source`), e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/metadataSource:MetadataSource test 123/456
    /// ```
    /// 
    ///  Metadata sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/metadataSource:MetadataSource test my-test-collector/my-test-source
    /// ```
    /// 
    ///  [1]https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources [2]:https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-Metadata-(Tag)-Source#Define_EC2_tag_filters [3]:https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-Metadata-(Tag)-Source [4]:https://github.com/SumoLogic/terraform-provider-sumologic/tree/master/website#common-source-properties
    /// </summary>
    [SumoLogicResourceType("sumologic:index/metadataSource:MetadataSource")]
    public partial class MetadataSource : Pulumi.CustomResource
    {
        [Output("authentication")]
        public Output<Outputs.MetadataSourceAuthentication> Authentication { get; private set; } = null!;

        [Output("automaticDateParsing")]
        public Output<bool?> AutomaticDateParsing { get; private set; } = null!;

        [Output("category")]
        public Output<string?> Category { get; private set; } = null!;

        [Output("collectorId")]
        public Output<int> CollectorId { get; private set; } = null!;

        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        [Output("cutoffRelativeTime")]
        public Output<string?> CutoffRelativeTime { get; private set; } = null!;

        [Output("cutoffTimestamp")]
        public Output<int?> CutoffTimestamp { get; private set; } = null!;

        [Output("defaultDateFormats")]
        public Output<ImmutableArray<Outputs.MetadataSourceDefaultDateFormat>> DefaultDateFormats { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("fields")]
        public Output<ImmutableDictionary<string, string>?> Fields { get; private set; } = null!;

        [Output("filters")]
        public Output<ImmutableArray<Outputs.MetadataSourceFilter>> Filters { get; private set; } = null!;

        [Output("forceTimezone")]
        public Output<bool?> ForceTimezone { get; private set; } = null!;

        [Output("hostName")]
        public Output<string?> HostName { get; private set; } = null!;

        [Output("manualPrefixRegexp")]
        public Output<string?> ManualPrefixRegexp { get; private set; } = null!;

        [Output("multilineProcessingEnabled")]
        public Output<bool?> MultilineProcessingEnabled { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("path")]
        public Output<Outputs.MetadataSourcePath> Path { get; private set; } = null!;

        [Output("paused")]
        public Output<bool> Paused { get; private set; } = null!;

        [Output("scanInterval")]
        public Output<int> ScanInterval { get; private set; } = null!;

        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;

        /// <summary>
        /// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)).
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        [Output("useAutolineMatching")]
        public Output<bool?> UseAutolineMatching { get; private set; } = null!;


        /// <summary>
        /// Create a MetadataSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetadataSource(string name, MetadataSourceArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/metadataSource:MetadataSource", name, args ?? new MetadataSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetadataSource(string name, Input<string> id, MetadataSourceState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/metadataSource:MetadataSource", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MetadataSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetadataSource Get(string name, Input<string> id, MetadataSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new MetadataSource(name, id, state, options);
        }
    }

    public sealed class MetadataSourceArgs : Pulumi.ResourceArgs
    {
        [Input("authentication", required: true)]
        public Input<Inputs.MetadataSourceAuthenticationArgs> Authentication { get; set; } = null!;

        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("collectorId", required: true)]
        public Input<int> CollectorId { get; set; } = null!;

        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        [Input("cutoffRelativeTime")]
        public Input<string>? CutoffRelativeTime { get; set; }

        [Input("cutoffTimestamp")]
        public Input<int>? CutoffTimestamp { get; set; }

        [Input("defaultDateFormats")]
        private InputList<Inputs.MetadataSourceDefaultDateFormatArgs>? _defaultDateFormats;
        public InputList<Inputs.MetadataSourceDefaultDateFormatArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.MetadataSourceDefaultDateFormatArgs>());
            set => _defaultDateFormats = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("fields")]
        private InputMap<string>? _fields;
        public InputMap<string> Fields
        {
            get => _fields ?? (_fields = new InputMap<string>());
            set => _fields = value;
        }

        [Input("filters")]
        private InputList<Inputs.MetadataSourceFilterArgs>? _filters;
        public InputList<Inputs.MetadataSourceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.MetadataSourceFilterArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("manualPrefixRegexp")]
        public Input<string>? ManualPrefixRegexp { get; set; }

        [Input("multilineProcessingEnabled")]
        public Input<bool>? MultilineProcessingEnabled { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("path", required: true)]
        public Input<Inputs.MetadataSourcePathArgs> Path { get; set; } = null!;

        [Input("paused", required: true)]
        public Input<bool> Paused { get; set; } = null!;

        [Input("scanInterval", required: true)]
        public Input<int> ScanInterval { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public MetadataSourceArgs()
        {
        }
    }

    public sealed class MetadataSourceState : Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.MetadataSourceAuthenticationGetArgs>? Authentication { get; set; }

        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("collectorId")]
        public Input<int>? CollectorId { get; set; }

        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        [Input("cutoffRelativeTime")]
        public Input<string>? CutoffRelativeTime { get; set; }

        [Input("cutoffTimestamp")]
        public Input<int>? CutoffTimestamp { get; set; }

        [Input("defaultDateFormats")]
        private InputList<Inputs.MetadataSourceDefaultDateFormatGetArgs>? _defaultDateFormats;
        public InputList<Inputs.MetadataSourceDefaultDateFormatGetArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.MetadataSourceDefaultDateFormatGetArgs>());
            set => _defaultDateFormats = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("fields")]
        private InputMap<string>? _fields;
        public InputMap<string> Fields
        {
            get => _fields ?? (_fields = new InputMap<string>());
            set => _fields = value;
        }

        [Input("filters")]
        private InputList<Inputs.MetadataSourceFilterGetArgs>? _filters;
        public InputList<Inputs.MetadataSourceFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.MetadataSourceFilterGetArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("manualPrefixRegexp")]
        public Input<string>? ManualPrefixRegexp { get; set; }

        [Input("multilineProcessingEnabled")]
        public Input<bool>? MultilineProcessingEnabled { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("path")]
        public Input<Inputs.MetadataSourcePathGetArgs>? Path { get; set; }

        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        [Input("scanInterval")]
        public Input<int>? ScanInterval { get; set; }

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        /// <summary>
        /// The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)).
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public MetadataSourceState()
        {
        }
    }
}