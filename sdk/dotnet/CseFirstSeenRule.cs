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
    /// Provides a Sumo Logic CSE [First Seen Rule](https://help.sumologic.com/docs/cse/rules/write-first-seen-rule/).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using SumoLogic = Pulumi.SumoLogic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var firstSeenRule = new SumoLogic.CseFirstSeenRule("firstSeenRule", new()
    ///     {
    ///         BaselineType = "PER_ENTITY",
    ///         BaselineWindowSize = "35000",
    ///         DescriptionExpression = "First User Login - {{ user_username }}",
    ///         Enabled = true,
    ///         EntitySelectors = new[]
    ///         {
    ///             new SumoLogic.Inputs.CseFirstSeenRuleEntitySelectorArgs
    ///             {
    ///                 EntityType = "_username",
    ///                 Expression = "user_username",
    ///             },
    ///             new SumoLogic.Inputs.CseFirstSeenRuleEntitySelectorArgs
    ///             {
    ///                 EntityType = "_hostname",
    ///                 Expression = "dstDevice_hostname",
    ///             },
    ///         },
    ///         FilterExpression = "objectType=\"Network\"",
    ///         GroupByFields = new[]
    ///         {
    ///             "user_username",
    ///         },
    ///         IsPrototype = false,
    ///         NameExpression = "First User Login - {{ user_username }}",
    ///         RetentionWindowSize = "86400000",
    ///         Severity = 1,
    ///         ValueFields = new[]
    ///         {
    ///             "dstDevice_hostname",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// First Seen Rules can be imported using the field id, e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/cseFirstSeenRule:CseFirstSeenRule first_seen_rule id
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/cseFirstSeenRule:CseFirstSeenRule")]
    public partial class CseFirstSeenRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
        /// </summary>
        [Output("baselineType")]
        public Output<string> BaselineType { get; private set; } = null!;

        /// <summary>
        /// The baseline window size in milliseconds
        /// </summary>
        [Output("baselineWindowSize")]
        public Output<string> BaselineWindowSize { get; private set; } = null!;

        /// <summary>
        /// The description of the generated Signals
        /// </summary>
        [Output("descriptionExpression")]
        public Output<string> DescriptionExpression { get; private set; } = null!;

        /// <summary>
        /// Whether the rule should generate Signals
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The entities to generate Signals on
        /// </summary>
        [Output("entitySelectors")]
        public Output<ImmutableArray<Outputs.CseFirstSeenRuleEntitySelector>> EntitySelectors { get; private set; } = null!;

        /// <summary>
        /// The expression for which records to match on
        /// </summary>
        [Output("filterExpression")]
        public Output<string> FilterExpression { get; private set; } = null!;

        /// <summary>
        /// A list of fields to group records by
        /// </summary>
        [Output("groupByFields")]
        public Output<ImmutableArray<string>> GroupByFields { get; private set; } = null!;

        /// <summary>
        /// Whether the generated Signals should be prototype Signals
        /// </summary>
        [Output("isPrototype")]
        public Output<bool?> IsPrototype { get; private set; } = null!;

        /// <summary>
        /// The name of the Rule
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the generated Signals
        /// </summary>
        [Output("nameExpression")]
        public Output<string> NameExpression { get; private set; } = null!;

        /// <summary>
        /// The retention window size in milliseconds
        /// </summary>
        [Output("retentionWindowSize")]
        public Output<string> RetentionWindowSize { get; private set; } = null!;

        /// <summary>
        /// The severity of the generated Signals
        /// </summary>
        [Output("severity")]
        public Output<int> Severity { get; private set; } = null!;

        /// <summary>
        /// The summary of the generated Signals
        /// </summary>
        [Output("summaryExpression")]
        public Output<string?> SummaryExpression { get; private set; } = null!;

        /// <summary>
        /// The tags of the generated Signals
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The value fields
        /// </summary>
        [Output("valueFields")]
        public Output<ImmutableArray<string>> ValueFields { get; private set; } = null!;


        /// <summary>
        /// Create a CseFirstSeenRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CseFirstSeenRule(string name, CseFirstSeenRuleArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/cseFirstSeenRule:CseFirstSeenRule", name, args ?? new CseFirstSeenRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CseFirstSeenRule(string name, Input<string> id, CseFirstSeenRuleState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/cseFirstSeenRule:CseFirstSeenRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CseFirstSeenRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CseFirstSeenRule Get(string name, Input<string> id, CseFirstSeenRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new CseFirstSeenRule(name, id, state, options);
        }
    }

    public sealed class CseFirstSeenRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
        /// </summary>
        [Input("baselineType", required: true)]
        public Input<string> BaselineType { get; set; } = null!;

        /// <summary>
        /// The baseline window size in milliseconds
        /// </summary>
        [Input("baselineWindowSize", required: true)]
        public Input<string> BaselineWindowSize { get; set; } = null!;

        /// <summary>
        /// The description of the generated Signals
        /// </summary>
        [Input("descriptionExpression", required: true)]
        public Input<string> DescriptionExpression { get; set; } = null!;

        /// <summary>
        /// Whether the rule should generate Signals
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("entitySelectors", required: true)]
        private InputList<Inputs.CseFirstSeenRuleEntitySelectorArgs>? _entitySelectors;

        /// <summary>
        /// The entities to generate Signals on
        /// </summary>
        public InputList<Inputs.CseFirstSeenRuleEntitySelectorArgs> EntitySelectors
        {
            get => _entitySelectors ?? (_entitySelectors = new InputList<Inputs.CseFirstSeenRuleEntitySelectorArgs>());
            set => _entitySelectors = value;
        }

        /// <summary>
        /// The expression for which records to match on
        /// </summary>
        [Input("filterExpression", required: true)]
        public Input<string> FilterExpression { get; set; } = null!;

        [Input("groupByFields")]
        private InputList<string>? _groupByFields;

        /// <summary>
        /// A list of fields to group records by
        /// </summary>
        public InputList<string> GroupByFields
        {
            get => _groupByFields ?? (_groupByFields = new InputList<string>());
            set => _groupByFields = value;
        }

        /// <summary>
        /// Whether the generated Signals should be prototype Signals
        /// </summary>
        [Input("isPrototype")]
        public Input<bool>? IsPrototype { get; set; }

        /// <summary>
        /// The name of the Rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the generated Signals
        /// </summary>
        [Input("nameExpression", required: true)]
        public Input<string> NameExpression { get; set; } = null!;

        /// <summary>
        /// The retention window size in milliseconds
        /// </summary>
        [Input("retentionWindowSize", required: true)]
        public Input<string> RetentionWindowSize { get; set; } = null!;

        /// <summary>
        /// The severity of the generated Signals
        /// </summary>
        [Input("severity", required: true)]
        public Input<int> Severity { get; set; } = null!;

        /// <summary>
        /// The summary of the generated Signals
        /// </summary>
        [Input("summaryExpression")]
        public Input<string>? SummaryExpression { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags of the generated Signals
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("valueFields", required: true)]
        private InputList<string>? _valueFields;

        /// <summary>
        /// The value fields
        /// </summary>
        public InputList<string> ValueFields
        {
            get => _valueFields ?? (_valueFields = new InputList<string>());
            set => _valueFields = value;
        }

        public CseFirstSeenRuleArgs()
        {
        }
        public static new CseFirstSeenRuleArgs Empty => new CseFirstSeenRuleArgs();
    }

    public sealed class CseFirstSeenRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
        /// </summary>
        [Input("baselineType")]
        public Input<string>? BaselineType { get; set; }

        /// <summary>
        /// The baseline window size in milliseconds
        /// </summary>
        [Input("baselineWindowSize")]
        public Input<string>? BaselineWindowSize { get; set; }

        /// <summary>
        /// The description of the generated Signals
        /// </summary>
        [Input("descriptionExpression")]
        public Input<string>? DescriptionExpression { get; set; }

        /// <summary>
        /// Whether the rule should generate Signals
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entitySelectors")]
        private InputList<Inputs.CseFirstSeenRuleEntitySelectorGetArgs>? _entitySelectors;

        /// <summary>
        /// The entities to generate Signals on
        /// </summary>
        public InputList<Inputs.CseFirstSeenRuleEntitySelectorGetArgs> EntitySelectors
        {
            get => _entitySelectors ?? (_entitySelectors = new InputList<Inputs.CseFirstSeenRuleEntitySelectorGetArgs>());
            set => _entitySelectors = value;
        }

        /// <summary>
        /// The expression for which records to match on
        /// </summary>
        [Input("filterExpression")]
        public Input<string>? FilterExpression { get; set; }

        [Input("groupByFields")]
        private InputList<string>? _groupByFields;

        /// <summary>
        /// A list of fields to group records by
        /// </summary>
        public InputList<string> GroupByFields
        {
            get => _groupByFields ?? (_groupByFields = new InputList<string>());
            set => _groupByFields = value;
        }

        /// <summary>
        /// Whether the generated Signals should be prototype Signals
        /// </summary>
        [Input("isPrototype")]
        public Input<bool>? IsPrototype { get; set; }

        /// <summary>
        /// The name of the Rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the generated Signals
        /// </summary>
        [Input("nameExpression")]
        public Input<string>? NameExpression { get; set; }

        /// <summary>
        /// The retention window size in milliseconds
        /// </summary>
        [Input("retentionWindowSize")]
        public Input<string>? RetentionWindowSize { get; set; }

        /// <summary>
        /// The severity of the generated Signals
        /// </summary>
        [Input("severity")]
        public Input<int>? Severity { get; set; }

        /// <summary>
        /// The summary of the generated Signals
        /// </summary>
        [Input("summaryExpression")]
        public Input<string>? SummaryExpression { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags of the generated Signals
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("valueFields")]
        private InputList<string>? _valueFields;

        /// <summary>
        /// The value fields
        /// </summary>
        public InputList<string> ValueFields
        {
            get => _valueFields ?? (_valueFields = new InputList<string>());
            set => _valueFields = value;
        }

        public CseFirstSeenRuleState()
        {
        }
        public static new CseFirstSeenRuleState Empty => new CseFirstSeenRuleState();
    }
}