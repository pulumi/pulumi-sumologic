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
    /// ## Import
    /// 
    /// Sumo Logic Google Cloud Platform sources can be imported using the collector and source IDs (`collector/source`), e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/gcpSource:GcpSource test 100000001/100000001
    /// ```
    /// 
    ///  Sumo Logic Google Cloud Platform sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/gcpSource:GcpSource test my-test-collector/my-test-source
    /// ```
    /// 
    ///  [1]https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources [2]https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Google-Cloud-Platform-Source
    /// </summary>
    [SumoLogicResourceType("sumologic:index/gcpSource:GcpSource")]
    public partial class GcpSource : Pulumi.CustomResource
    {
        [Output("authentication")]
        public Output<Outputs.GcpSourceAuthentication?> Authentication { get; private set; } = null!;

        [Output("automaticDateParsing")]
        public Output<bool?> AutomaticDateParsing { get; private set; } = null!;

        [Output("category")]
        public Output<string?> Category { get; private set; } = null!;

        [Output("collectorId")]
        public Output<int> CollectorId { get; private set; } = null!;

        [Output("contentType")]
        public Output<string?> ContentType { get; private set; } = null!;

        [Output("cutoffRelativeTime")]
        public Output<string?> CutoffRelativeTime { get; private set; } = null!;

        [Output("cutoffTimestamp")]
        public Output<int?> CutoffTimestamp { get; private set; } = null!;

        [Output("defaultDateFormats")]
        public Output<ImmutableArray<Outputs.GcpSourceDefaultDateFormat>> DefaultDateFormats { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("fields")]
        public Output<ImmutableDictionary<string, string>?> Fields { get; private set; } = null!;

        [Output("filters")]
        public Output<ImmutableArray<Outputs.GcpSourceFilter>> Filters { get; private set; } = null!;

        [Output("forceTimezone")]
        public Output<bool?> ForceTimezone { get; private set; } = null!;

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

        [Output("path")]
        public Output<Outputs.GcpSourcePath?> Path { get; private set; } = null!;

        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;

        /// <summary>
        /// The HTTP endpoint to use for sending data to this source.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        [Output("useAutolineMatching")]
        public Output<bool?> UseAutolineMatching { get; private set; } = null!;


        /// <summary>
        /// Create a GcpSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GcpSource(string name, GcpSourceArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/gcpSource:GcpSource", name, args ?? new GcpSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GcpSource(string name, Input<string> id, GcpSourceState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/gcpSource:GcpSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GcpSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GcpSource Get(string name, Input<string> id, GcpSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new GcpSource(name, id, state, options);
        }
    }

    public sealed class GcpSourceArgs : Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.GcpSourceAuthenticationArgs>? Authentication { get; set; }

        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("collectorId", required: true)]
        public Input<int> CollectorId { get; set; } = null!;

        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        [Input("cutoffRelativeTime")]
        public Input<string>? CutoffRelativeTime { get; set; }

        [Input("cutoffTimestamp")]
        public Input<int>? CutoffTimestamp { get; set; }

        [Input("defaultDateFormats")]
        private InputList<Inputs.GcpSourceDefaultDateFormatArgs>? _defaultDateFormats;
        public InputList<Inputs.GcpSourceDefaultDateFormatArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.GcpSourceDefaultDateFormatArgs>());
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
        private InputList<Inputs.GcpSourceFilterArgs>? _filters;
        public InputList<Inputs.GcpSourceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GcpSourceFilterArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

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

        [Input("path")]
        public Input<Inputs.GcpSourcePathArgs>? Path { get; set; }

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public GcpSourceArgs()
        {
        }
    }

    public sealed class GcpSourceState : Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.GcpSourceAuthenticationGetArgs>? Authentication { get; set; }

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
        private InputList<Inputs.GcpSourceDefaultDateFormatGetArgs>? _defaultDateFormats;
        public InputList<Inputs.GcpSourceDefaultDateFormatGetArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.GcpSourceDefaultDateFormatGetArgs>());
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
        private InputList<Inputs.GcpSourceFilterGetArgs>? _filters;
        public InputList<Inputs.GcpSourceFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GcpSourceFilterGetArgs>());
            set => _filters = value;
        }

        [Input("forceTimezone")]
        public Input<bool>? ForceTimezone { get; set; }

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

        [Input("path")]
        public Input<Inputs.GcpSourcePathGetArgs>? Path { get; set; }

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        /// <summary>
        /// The HTTP endpoint to use for sending data to this source.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public GcpSourceState()
        {
        }
    }
}