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
    /// Provides a [Sumologic Local File Source](https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/).
    /// 
    /// ## Import
    /// 
    /// Local file sources can be imported using the collector and source IDs, e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/localFileSource:LocalFileSource test 123/456
    /// ```
    /// 
    ///  Local file sources can also be imported using the collector name and source name, e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/localFileSource:LocalFileSource test my-test-collector/my-test-source
    /// ```
    /// 
    ///  [1]https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/ [2]https://help.sumologic.com/Manage/Fields [3]https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/#supported-encoding-for-local-file-sources
    /// </summary>
    [SumoLogicResourceType("sumologic:index/localFileSource:LocalFileSource")]
    public partial class LocalFileSource : global::Pulumi.CustomResource
    {
        [Output("automaticDateParsing")]
        public Output<bool?> AutomaticDateParsing { get; private set; } = null!;

        /// <summary>
        /// The default source category for the source.
        /// </summary>
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
        public Output<ImmutableArray<Outputs.LocalFileSourceDefaultDateFormat>> DefaultDateFormats { get; private set; } = null!;

        [Output("denyLists")]
        public Output<ImmutableArray<string>> DenyLists { get; private set; } = null!;

        /// <summary>
        /// The description of the source.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Defines the encoding form. Default is "UTF-8". Other supported encodings are listed [here](https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/#supported-encoding-for-local-file-sources).
        /// </summary>
        [Output("encoding")]
        public Output<string?> Encoding { get; private set; } = null!;

        /// <summary>
        /// Map containing [key/value pairs][2].
        /// </summary>
        [Output("fields")]
        public Output<ImmutableDictionary<string, string>?> Fields { get; private set; } = null!;

        [Output("filters")]
        public Output<ImmutableArray<Outputs.LocalFileSourceFilter>> Filters { get; private set; } = null!;

        [Output("forceTimezone")]
        public Output<bool?> ForceTimezone { get; private set; } = null!;

        [Output("hostName")]
        public Output<string?> HostName { get; private set; } = null!;

        [Output("manualPrefixRegexp")]
        public Output<string?> ManualPrefixRegexp { get; private set; } = null!;

        [Output("multilineProcessingEnabled")]
        public Output<bool?> MultilineProcessingEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the local file source. This is required, and has to be unique. Changing this will force recreation the source.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A valid path expression (full path) of the file to collect. For files on Windows systems (not including Windows Events), enter the absolute path including the drive letter. Escape special characters and spaces with a backslash (). If you are collecting from Windows using CIFS/SMB, see Prerequisites for Windows Log Collection. Use a single asterisk wildcard [*] for file or folder names. Example:[var/foo/*.log]. Use two asterisks [**]to recurse within directories and subdirectories. Example: [var/*/.log].
        /// </summary>
        [Output("pathExpression")]
        public Output<string> PathExpression { get; private set; } = null!;

        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;

        [Output("useAutolineMatching")]
        public Output<bool?> UseAutolineMatching { get; private set; } = null!;


        /// <summary>
        /// Create a LocalFileSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LocalFileSource(string name, LocalFileSourceArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/localFileSource:LocalFileSource", name, args ?? new LocalFileSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LocalFileSource(string name, Input<string> id, LocalFileSourceState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/localFileSource:LocalFileSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LocalFileSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LocalFileSource Get(string name, Input<string> id, LocalFileSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new LocalFileSource(name, id, state, options);
        }
    }

    public sealed class LocalFileSourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        /// <summary>
        /// The default source category for the source.
        /// </summary>
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
        private InputList<Inputs.LocalFileSourceDefaultDateFormatArgs>? _defaultDateFormats;
        public InputList<Inputs.LocalFileSourceDefaultDateFormatArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.LocalFileSourceDefaultDateFormatArgs>());
            set => _defaultDateFormats = value;
        }

        [Input("denyLists")]
        private InputList<string>? _denyLists;
        public InputList<string> DenyLists
        {
            get => _denyLists ?? (_denyLists = new InputList<string>());
            set => _denyLists = value;
        }

        /// <summary>
        /// The description of the source.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Defines the encoding form. Default is "UTF-8". Other supported encodings are listed [here](https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/#supported-encoding-for-local-file-sources).
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("fields")]
        private InputMap<string>? _fields;

        /// <summary>
        /// Map containing [key/value pairs][2].
        /// </summary>
        public InputMap<string> Fields
        {
            get => _fields ?? (_fields = new InputMap<string>());
            set => _fields = value;
        }

        [Input("filters")]
        private InputList<Inputs.LocalFileSourceFilterArgs>? _filters;
        public InputList<Inputs.LocalFileSourceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.LocalFileSourceFilterArgs>());
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

        /// <summary>
        /// The name of the local file source. This is required, and has to be unique. Changing this will force recreation the source.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A valid path expression (full path) of the file to collect. For files on Windows systems (not including Windows Events), enter the absolute path including the drive letter. Escape special characters and spaces with a backslash (). If you are collecting from Windows using CIFS/SMB, see Prerequisites for Windows Log Collection. Use a single asterisk wildcard [*] for file or folder names. Example:[var/foo/*.log]. Use two asterisks [**]to recurse within directories and subdirectories. Example: [var/*/.log].
        /// </summary>
        [Input("pathExpression", required: true)]
        public Input<string> PathExpression { get; set; } = null!;

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public LocalFileSourceArgs()
        {
        }
        public static new LocalFileSourceArgs Empty => new LocalFileSourceArgs();
    }

    public sealed class LocalFileSourceState : global::Pulumi.ResourceArgs
    {
        [Input("automaticDateParsing")]
        public Input<bool>? AutomaticDateParsing { get; set; }

        /// <summary>
        /// The default source category for the source.
        /// </summary>
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
        private InputList<Inputs.LocalFileSourceDefaultDateFormatGetArgs>? _defaultDateFormats;
        public InputList<Inputs.LocalFileSourceDefaultDateFormatGetArgs> DefaultDateFormats
        {
            get => _defaultDateFormats ?? (_defaultDateFormats = new InputList<Inputs.LocalFileSourceDefaultDateFormatGetArgs>());
            set => _defaultDateFormats = value;
        }

        [Input("denyLists")]
        private InputList<string>? _denyLists;
        public InputList<string> DenyLists
        {
            get => _denyLists ?? (_denyLists = new InputList<string>());
            set => _denyLists = value;
        }

        /// <summary>
        /// The description of the source.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Defines the encoding form. Default is "UTF-8". Other supported encodings are listed [here](https://help.sumologic.com/docs/send-data/installed-collectors/sources/local-file-source/#supported-encoding-for-local-file-sources).
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        [Input("fields")]
        private InputMap<string>? _fields;

        /// <summary>
        /// Map containing [key/value pairs][2].
        /// </summary>
        public InputMap<string> Fields
        {
            get => _fields ?? (_fields = new InputMap<string>());
            set => _fields = value;
        }

        [Input("filters")]
        private InputList<Inputs.LocalFileSourceFilterGetArgs>? _filters;
        public InputList<Inputs.LocalFileSourceFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.LocalFileSourceFilterGetArgs>());
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

        /// <summary>
        /// The name of the local file source. This is required, and has to be unique. Changing this will force recreation the source.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A valid path expression (full path) of the file to collect. For files on Windows systems (not including Windows Events), enter the absolute path including the drive letter. Escape special characters and spaces with a backslash (). If you are collecting from Windows using CIFS/SMB, see Prerequisites for Windows Log Collection. Use a single asterisk wildcard [*] for file or folder names. Example:[var/foo/*.log]. Use two asterisks [**]to recurse within directories and subdirectories. Example: [var/*/.log].
        /// </summary>
        [Input("pathExpression")]
        public Input<string>? PathExpression { get; set; }

        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("useAutolineMatching")]
        public Input<bool>? UseAutolineMatching { get; set; }

        public LocalFileSourceState()
        {
        }
        public static new LocalFileSourceState Empty => new LocalFileSourceState();
    }
}