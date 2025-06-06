// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic
{
    /// <summary>
    /// ## Import
    /// 
    /// Kinesis Metrics sources can be imported using the collector and source IDs (`collector/source`), e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/kinesisMetricsSource:KinesisMetricsSource test 123/456
    /// ```
    /// 
    /// HTTP sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/kinesisMetricsSource:KinesisMetricsSource test my-test-collector/my-test-source
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/kinesisMetricsSource:KinesisMetricsSource")]
    public partial class KinesisMetricsSource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Authentication details for connecting to the S3 bucket.
        /// </summary>
        [Output("authentication")]
        public Output<Outputs.KinesisMetricsSourceAuthentication> Authentication { get; private set; } = null!;

        [Output("automaticDateParsing")]
        public Output<bool?> AutomaticDateParsing { get; private set; } = null!;

        [Output("category")]
        public Output<string?> Category { get; private set; } = null!;

        [Output("collectorId")]
        public Output<int> CollectorId { get; private set; } = null!;

        /// <summary>
        /// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
        /// </summary>
        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        [Output("cutoffRelativeTime")]
        public Output<string?> CutoffRelativeTime { get; private set; } = null!;

        [Output("cutoffTimestamp")]
        public Output<int?> CutoffTimestamp { get; private set; } = null!;

        [Output("defaultDateFormats")]
        public Output<ImmutableArray<Outputs.KinesisMetricsSourceDefaultDateFormat>> DefaultDateFormats { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("fields")]
        public Output<ImmutableDictionary<string, string>?> Fields { get; private set; } = null!;

        [Output("filters")]
        public Output<ImmutableArray<Outputs.KinesisMetricsSourceFilter>> Filters { get; private set; } = null!;

        [Output("forceTimezone")]
        public Output<bool?> ForceTimezone { get; private set; } = null!;

        [Output("hashAlgorithm")]
        public Output<string?> HashAlgorithm { get; private set; } = null!;

        [Output("hostName")]
        public Output<string?> HostName { get; private set; } = null!;

        [Output("manualPrefixRegexp")]
        public Output<string?> ManualPrefixRegexp { get; private set; } = null!;

        [Output("messagePerRequest")]
        public Output<bool?> MessagePerRequest { get; private set; } = null!;

        [Output("multilineProcessingEnabled")]
        public Output<bool?> MultilineProcessingEnabled { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The location to scan for new data.
        /// </summary>
        [Output("path")]
        public Output<Outputs.KinesisMetricsSourcePath> Path { get; private set; } = null!;

        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;

        /// <summary>
        /// The HTTP endpoint to used while creating Kinesis Firehose on AWS.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        [Output("useAutolineMatching")]
        public Output<bool?> UseAutolineMatching { get; private set; } = null!;


        /// <summary>
        /// Create a KinesisMetricsSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KinesisMetricsSource(string name, KinesisMetricsSourceArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/kinesisMetricsSource:KinesisMetricsSource", name, args ?? new KinesisMetricsSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KinesisMetricsSource(string name, Input<string> id, KinesisMetricsSourceState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/kinesisMetricsSource:KinesisMetricsSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KinesisMetricsSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KinesisMetricsSource Get(string name, Input<string> id, KinesisMetricsSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new KinesisMetricsSource(name, id, state, options);
        }
    }

    public sealed class KinesisMetricsSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication details for connecting to the S3 bucket.
        /// </summary>
        [Input("authentication", required: true)]
        public Input<Inputs.KinesisMetricsSourceAuthenticationArgs> Authentication { get; set; } = null!;

        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("collectorId", required: true)]
        public Input<int> CollectorId { get; set; } = null!;

        /// <summary>
        /// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        [Input("cutoffRelativeTime")]
        public Input<string>? CutoffRelativeTime { get; set; }

        [Input("cutoffTimestamp")]
        public Input<int>? CutoffTimestamp { get; set; }

        [Input("defaultDateFormats")]
        private InputList<Inputs.KinesisMetricsSourceDefaultDateFormatArgs>? _defaultDateFormats;
        public InputList<Inputs.KinesisMetricsSourceDefaultDateFormatArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.KinesisMetricsSourceDefaultDateFormatArgs>());
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
        private InputList<Inputs.KinesisMetricsSourceFilterArgs>? _filters;
        public InputList<Inputs.KinesisMetricsSourceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.KinesisMetricsSourceFilterArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

        [Input("hashAlgorithm")]
        public Input<string>? HashAlgorithm { get; set; }

        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("manualPrefixRegexp")]
        public Input<string>? ManualPrefixRegexp { get; set; }

        [Input("messagePerRequest")]
        public Input<bool>? MessagePerRequest { get; set; }

        [Input("multilineProcessingEnabled")]
        public Input<bool>? MultilineProcessingEnabled { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The location to scan for new data.
        /// </summary>
        [Input("path", required: true)]
        public Input<Inputs.KinesisMetricsSourcePathArgs> Path { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public KinesisMetricsSourceArgs()
        {
        }
        public static new KinesisMetricsSourceArgs Empty => new KinesisMetricsSourceArgs();
    }

    public sealed class KinesisMetricsSourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication details for connecting to the S3 bucket.
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.KinesisMetricsSourceAuthenticationGetArgs>? Authentication { get; set; }

        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("collectorId")]
        public Input<int>? CollectorId { get; set; }

        /// <summary>
        /// The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        [Input("cutoffRelativeTime")]
        public Input<string>? CutoffRelativeTime { get; set; }

        [Input("cutoffTimestamp")]
        public Input<int>? CutoffTimestamp { get; set; }

        [Input("defaultDateFormats")]
        private InputList<Inputs.KinesisMetricsSourceDefaultDateFormatGetArgs>? _defaultDateFormats;
        public InputList<Inputs.KinesisMetricsSourceDefaultDateFormatGetArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.KinesisMetricsSourceDefaultDateFormatGetArgs>());
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
        private InputList<Inputs.KinesisMetricsSourceFilterGetArgs>? _filters;
        public InputList<Inputs.KinesisMetricsSourceFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.KinesisMetricsSourceFilterGetArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

        [Input("hashAlgorithm")]
        public Input<string>? HashAlgorithm { get; set; }

        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("manualPrefixRegexp")]
        public Input<string>? ManualPrefixRegexp { get; set; }

        [Input("messagePerRequest")]
        public Input<bool>? MessagePerRequest { get; set; }

        [Input("multilineProcessingEnabled")]
        public Input<bool>? MultilineProcessingEnabled { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The location to scan for new data.
        /// </summary>
        [Input("path")]
        public Input<Inputs.KinesisMetricsSourcePathGetArgs>? Path { get; set; }

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        /// <summary>
        /// The HTTP endpoint to used while creating Kinesis Firehose on AWS.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public KinesisMetricsSourceState()
        {
        }
        public static new KinesisMetricsSourceState Empty => new KinesisMetricsSourceState();
    }
}
