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
    /// Provides a Sumologic Log Search.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SumoLogic = Pulumi.SumoLogic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var personalFolder = SumoLogic.GetPersonalFolder.Invoke();
    /// 
    ///     var exampleLogSearch = new SumoLogic.LogSearch("example_log_search", new()
    ///     {
    ///         Name = "Demo Search",
    ///         Description = "Demo search description",
    ///         ParentId = personalFolder.Apply(getPersonalFolderResult =&gt; getPersonalFolderResult.Id),
    ///         QueryString = @"        _sourceCategory=api
    ///         | parse ""parameter1=*,"" as parameter1
    ///         | parse ""parameter2=*,"" as parameter2
    ///         | where parameter1 matches {{param1}}
    ///         | where parameter2 matches {{param2}}
    ///         | count by _sourceHost
    /// ",
    ///         ParsingMode = "AutoParse",
    ///         RunByReceiptTime = true,
    ///         TimeRange = new SumoLogic.Inputs.LogSearchTimeRangeArgs
    ///         {
    ///             BeginBoundedTimeRange = new SumoLogic.Inputs.LogSearchTimeRangeBeginBoundedTimeRangeArgs
    ///             {
    ///                 From = new SumoLogic.Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromArgs
    ///                 {
    ///                     RelativeTimeRange = new SumoLogic.Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs
    ///                     {
    ///                         RelativeTime = "-30m",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         QueryParameters = new[]
    ///         {
    ///             new SumoLogic.Inputs.LogSearchQueryParameterArgs
    ///             {
    ///                 Name = "param1",
    ///                 Description = "Description for param1",
    ///                 DataType = "STRING",
    ///                 Value = "*",
    ///             },
    ///             new SumoLogic.Inputs.LogSearchQueryParameterArgs
    ///             {
    ///                 Name = "param2",
    ///                 Description = "Description for param2",
    ///                 DataType = "STRING",
    ///                 Value = "*",
    ///             },
    ///         },
    ///         Schedule = new SumoLogic.Inputs.LogSearchScheduleArgs
    ///         {
    ///             CronExpression = "0 0 * * * ? *",
    ///             MuteErrorEmails = false,
    ///             Notification = new SumoLogic.Inputs.LogSearchScheduleNotificationArgs
    ///             {
    ///                 EmailSearchNotification = new SumoLogic.Inputs.LogSearchScheduleNotificationEmailSearchNotificationArgs
    ///                 {
    ///                     IncludeCsvAttachment = false,
    ///                     IncludeHistogram = false,
    ///                     IncludeQuery = true,
    ///                     IncludeResultSet = true,
    ///                     SubjectTemplate = "Search Alert: {{TriggerCondition}} found for {{SearchName}}",
    ///                     ToLists = new[]
    ///                     {
    ///                         "will@acme.com",
    ///                     },
    ///                 },
    ///             },
    ///             ParseableTimeRange = new SumoLogic.Inputs.LogSearchScheduleParseableTimeRangeArgs
    ///             {
    ///                 BeginBoundedTimeRange = new SumoLogic.Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeArgs
    ///                 {
    ///                     From = new SumoLogic.Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromArgs
    ///                     {
    ///                         RelativeTimeRange = new SumoLogic.Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs
    ///                         {
    ///                             RelativeTime = "-15m",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             ScheduleType = "1Week",
    ///             Threshold = new SumoLogic.Inputs.LogSearchScheduleThresholdArgs
    ///             {
    ///                 Count = 10,
    ///                 Operator = "gt",
    ///                 ThresholdType = "group",
    ///             },
    ///             TimeZone = "America/Los_Angeles",
    ///             Parameters = new[]
    ///             {
    ///                 new SumoLogic.Inputs.LogSearchScheduleParameterArgs
    ///                 {
    ///                     Name = "param1",
    ///                     Value = "*",
    ///                 },
    ///                 new SumoLogic.Inputs.LogSearchScheduleParameterArgs
    ///                 {
    ///                     Name = "param2",
    ///                     Value = "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Attributes reference
    /// 
    /// In addition to all arguments above, the following attributes are exported:
    /// 
    /// - `id` - The ID of the log search.
    /// 
    /// ## Import
    /// 
    /// A log search can be imported using it's identifier, e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/logSearch:LogSearch example_search 0000000007FFD79D
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/logSearch:LogSearch")]
    public partial class LogSearch : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the search.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the search.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The identifier of the folder to create the log search in.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        /// <summary>
        /// Define the parsing mode to scan the JSON format log messages. Possible values are:
        /// `AutoParse` and  `Manual`. Default value is `Manual`.
        /// 
        /// In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
        /// the `Manual` mode, no fields are parsed out automatically. For more information see
        /// [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
        /// </summary>
        [Output("parsingMode")]
        public Output<string?> ParsingMode { get; private set; } = null!;

        /// <summary>
        /// Up to 10 `query_parameter` blocks can be added one for each parameter in the `query_string`. 
        /// See query parameter schema.
        /// </summary>
        [Output("queryParameters")]
        public Output<ImmutableArray<Outputs.LogSearchQueryParameter>> QueryParameters { get; private set; } = null!;

        /// <summary>
        /// Log query to perform.
        /// </summary>
        [Output("queryString")]
        public Output<string> QueryString { get; private set; } = null!;

        /// <summary>
        /// This has the value `true` if the search is to be run by receipt time and
        /// `false` if it is to be run by message time. Default value is `false`.
        /// </summary>
        [Output("runByReceiptTime")]
        public Output<bool?> RunByReceiptTime { get; private set; } = null!;

        /// <summary>
        /// Schedule of the log search. See schedule schema
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.LogSearchSchedule?> Schedule { get; private set; } = null!;

        /// <summary>
        /// Time range of the log search. See time range schema
        /// </summary>
        [Output("timeRange")]
        public Output<Outputs.LogSearchTimeRange> TimeRange { get; private set; } = null!;


        /// <summary>
        /// Create a LogSearch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogSearch(string name, LogSearchArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/logSearch:LogSearch", name, args ?? new LogSearchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogSearch(string name, Input<string> id, LogSearchState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/logSearch:LogSearch", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogSearch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogSearch Get(string name, Input<string> id, LogSearchState? state = null, CustomResourceOptions? options = null)
        {
            return new LogSearch(name, id, state, options);
        }
    }

    public sealed class LogSearchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the search.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the search.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The identifier of the folder to create the log search in.
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        /// <summary>
        /// Define the parsing mode to scan the JSON format log messages. Possible values are:
        /// `AutoParse` and  `Manual`. Default value is `Manual`.
        /// 
        /// In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
        /// the `Manual` mode, no fields are parsed out automatically. For more information see
        /// [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
        /// </summary>
        [Input("parsingMode")]
        public Input<string>? ParsingMode { get; set; }

        [Input("queryParameters")]
        private InputList<Inputs.LogSearchQueryParameterArgs>? _queryParameters;

        /// <summary>
        /// Up to 10 `query_parameter` blocks can be added one for each parameter in the `query_string`. 
        /// See query parameter schema.
        /// </summary>
        public InputList<Inputs.LogSearchQueryParameterArgs> QueryParameters
        {
            get => _queryParameters ?? (_queryParameters = new InputList<Inputs.LogSearchQueryParameterArgs>());
            set => _queryParameters = value;
        }

        /// <summary>
        /// Log query to perform.
        /// </summary>
        [Input("queryString", required: true)]
        public Input<string> QueryString { get; set; } = null!;

        /// <summary>
        /// This has the value `true` if the search is to be run by receipt time and
        /// `false` if it is to be run by message time. Default value is `false`.
        /// </summary>
        [Input("runByReceiptTime")]
        public Input<bool>? RunByReceiptTime { get; set; }

        /// <summary>
        /// Schedule of the log search. See schedule schema
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.LogSearchScheduleArgs>? Schedule { get; set; }

        /// <summary>
        /// Time range of the log search. See time range schema
        /// </summary>
        [Input("timeRange", required: true)]
        public Input<Inputs.LogSearchTimeRangeArgs> TimeRange { get; set; } = null!;

        public LogSearchArgs()
        {
        }
        public static new LogSearchArgs Empty => new LogSearchArgs();
    }

    public sealed class LogSearchState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the search.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the search.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The identifier of the folder to create the log search in.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// Define the parsing mode to scan the JSON format log messages. Possible values are:
        /// `AutoParse` and  `Manual`. Default value is `Manual`.
        /// 
        /// In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
        /// the `Manual` mode, no fields are parsed out automatically. For more information see
        /// [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
        /// </summary>
        [Input("parsingMode")]
        public Input<string>? ParsingMode { get; set; }

        [Input("queryParameters")]
        private InputList<Inputs.LogSearchQueryParameterGetArgs>? _queryParameters;

        /// <summary>
        /// Up to 10 `query_parameter` blocks can be added one for each parameter in the `query_string`. 
        /// See query parameter schema.
        /// </summary>
        public InputList<Inputs.LogSearchQueryParameterGetArgs> QueryParameters
        {
            get => _queryParameters ?? (_queryParameters = new InputList<Inputs.LogSearchQueryParameterGetArgs>());
            set => _queryParameters = value;
        }

        /// <summary>
        /// Log query to perform.
        /// </summary>
        [Input("queryString")]
        public Input<string>? QueryString { get; set; }

        /// <summary>
        /// This has the value `true` if the search is to be run by receipt time and
        /// `false` if it is to be run by message time. Default value is `false`.
        /// </summary>
        [Input("runByReceiptTime")]
        public Input<bool>? RunByReceiptTime { get; set; }

        /// <summary>
        /// Schedule of the log search. See schedule schema
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.LogSearchScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// Time range of the log search. See time range schema
        /// </summary>
        [Input("timeRange")]
        public Input<Inputs.LogSearchTimeRangeGetArgs>? TimeRange { get; set; }

        public LogSearchState()
        {
        }
        public static new LogSearchState Empty => new LogSearchState();
    }
}