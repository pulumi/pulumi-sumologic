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
    /// Provides a Sumologic CSE Automation.
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
    ///     var insightAutomation = new SumoLogic.CseAutomation("insightAutomation", new()
    ///     {
    ///         CseResourceType = "INSIGHT",
    ///         ExecutionTypes = new[]
    ///         {
    ///             "NEW_INSIGHT",
    ///             "INSIGHT_CLOSED",
    ///         },
    ///         PlaybookId = "638079aedb99cafada1e80a0",
    ///     });
    /// 
    ///     var entityAutomation = new SumoLogic.CseAutomation("entityAutomation", new()
    ///     {
    ///         CseResourceSubTypes = new[]
    ///         {
    ///             "_ip",
    ///         },
    ///         CseResourceType = "ENTITY",
    ///         ExecutionTypes = new[]
    ///         {
    ///             "ON_DEMAND",
    ///         },
    ///         PlaybookId = "638079aedb99cafada1e80a0",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Automation can be imported using the field id, e.g.hcl
    /// 
    /// ```sh
    ///  $ pulumi import sumologic:index/cseAutomation:CseAutomation automation id
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/cseAutomation:CseAutomation")]
    public partial class CseAutomation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CSE Resource sub-type when cse_resource_type is specified as "ENTITY". Examples: "_ip", "_mac".
        /// </summary>
        [Output("cseResourceSubTypes")]
        public Output<ImmutableArray<string>> CseResourceSubTypes { get; private set; } = null!;

        /// <summary>
        /// CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
        /// </summary>
        [Output("cseResourceType")]
        public Output<string> CseResourceType { get; private set; } = null!;

        /// <summary>
        /// Automation description.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
        /// </summary>
        [Output("executionTypes")]
        public Output<ImmutableArray<string>> ExecutionTypes { get; private set; } = null!;

        /// <summary>
        /// Automation name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("playbookId")]
        public Output<string> PlaybookId { get; private set; } = null!;


        /// <summary>
        /// Create a CseAutomation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CseAutomation(string name, CseAutomationArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/cseAutomation:CseAutomation", name, args ?? new CseAutomationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CseAutomation(string name, Input<string> id, CseAutomationState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/cseAutomation:CseAutomation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CseAutomation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CseAutomation Get(string name, Input<string> id, CseAutomationState? state = null, CustomResourceOptions? options = null)
        {
            return new CseAutomation(name, id, state, options);
        }
    }

    public sealed class CseAutomationArgs : global::Pulumi.ResourceArgs
    {
        [Input("cseResourceSubTypes")]
        private InputList<string>? _cseResourceSubTypes;

        /// <summary>
        /// CSE Resource sub-type when cse_resource_type is specified as "ENTITY". Examples: "_ip", "_mac".
        /// </summary>
        public InputList<string> CseResourceSubTypes
        {
            get => _cseResourceSubTypes ?? (_cseResourceSubTypes = new InputList<string>());
            set => _cseResourceSubTypes = value;
        }

        /// <summary>
        /// CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
        /// </summary>
        [Input("cseResourceType", required: true)]
        public Input<string> CseResourceType { get; set; } = null!;

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("executionTypes", required: true)]
        private InputList<string>? _executionTypes;

        /// <summary>
        /// Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
        /// </summary>
        public InputList<string> ExecutionTypes
        {
            get => _executionTypes ?? (_executionTypes = new InputList<string>());
            set => _executionTypes = value;
        }

        [Input("playbookId", required: true)]
        public Input<string> PlaybookId { get; set; } = null!;

        public CseAutomationArgs()
        {
        }
        public static new CseAutomationArgs Empty => new CseAutomationArgs();
    }

    public sealed class CseAutomationState : global::Pulumi.ResourceArgs
    {
        [Input("cseResourceSubTypes")]
        private InputList<string>? _cseResourceSubTypes;

        /// <summary>
        /// CSE Resource sub-type when cse_resource_type is specified as "ENTITY". Examples: "_ip", "_mac".
        /// </summary>
        public InputList<string> CseResourceSubTypes
        {
            get => _cseResourceSubTypes ?? (_cseResourceSubTypes = new InputList<string>());
            set => _cseResourceSubTypes = value;
        }

        /// <summary>
        /// CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
        /// </summary>
        [Input("cseResourceType")]
        public Input<string>? CseResourceType { get; set; }

        /// <summary>
        /// Automation description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("executionTypes")]
        private InputList<string>? _executionTypes;

        /// <summary>
        /// Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
        /// </summary>
        public InputList<string> ExecutionTypes
        {
            get => _executionTypes ?? (_executionTypes = new InputList<string>());
            set => _executionTypes = value;
        }

        /// <summary>
        /// Automation name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("playbookId")]
        public Input<string>? PlaybookId { get; set; }

        public CseAutomationState()
        {
        }
        public static new CseAutomationState Empty => new CseAutomationState();
    }
}