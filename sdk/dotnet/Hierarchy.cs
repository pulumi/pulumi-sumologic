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
    /// Provides a [Sumologic Hierarchy](https://help.sumologic.com/Visualizations-and-Alerts/Explore).
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
    ///     var exampleHierarchy = new SumoLogic.Hierarchy("example_hierarchy", new()
    ///     {
    ///         Name = "testK8sHierarchy",
    ///         Filter = new SumoLogic.Inputs.HierarchyFilterArgs
    ///         {
    ///             Key = "_origin",
    ///             Value = "kubernetes",
    ///         },
    ///         Levels = new[]
    ///         {
    ///             new SumoLogic.Inputs.HierarchyLevelArgs
    ///             {
    ///                 EntityType = "cluster",
    ///                 NextLevelsWithConditions = new[]
    ///                 {
    ///                     new SumoLogic.Inputs.HierarchyLevelNextLevelsWithConditionArgs
    ///                     {
    ///                         Condition = "testCondition",
    ///                         Level = new SumoLogic.Inputs.HierarchyLevelNextLevelsWithConditionLevelArgs
    ///                         {
    ///                             EntityType = "namespace",
    ///                         },
    ///                     },
    ///                 },
    ///                 NextLevel = new SumoLogic.Inputs.HierarchyLevelNextLevelArgs
    ///                 {
    ///                     EntityType = "node",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Hierarchies can be imported using the id, e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/hierarchy:Hierarchy test id
    /// ```
    /// 
    /// [1]: https://help.sumologic.com/Visualizations-and-Alerts/Explore
    /// </summary>
    [SumoLogicResourceType("sumologic:index/hierarchy:Hierarchy")]
    public partial class Hierarchy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An optional clause that a hierarchy requires to be matched.
        /// </summary>
        [Output("filter")]
        public Output<Outputs.HierarchyFilter?> Filter { get; private set; } = null!;

        /// <summary>
        /// A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
        /// </summary>
        [Output("levels")]
        public Output<ImmutableArray<Outputs.HierarchyLevel>> Levels { get; private set; } = null!;

        /// <summary>
        /// Name of the hierarchy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Hierarchy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Hierarchy(string name, HierarchyArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/hierarchy:Hierarchy", name, args ?? new HierarchyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Hierarchy(string name, Input<string> id, HierarchyState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/hierarchy:Hierarchy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Hierarchy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Hierarchy Get(string name, Input<string> id, HierarchyState? state = null, CustomResourceOptions? options = null)
        {
            return new Hierarchy(name, id, state, options);
        }
    }

    public sealed class HierarchyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional clause that a hierarchy requires to be matched.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.HierarchyFilterArgs>? Filter { get; set; }

        [Input("levels", required: true)]
        private InputList<Inputs.HierarchyLevelArgs>? _levels;

        /// <summary>
        /// A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
        /// </summary>
        public InputList<Inputs.HierarchyLevelArgs> Levels
        {
            get => _levels ?? (_levels = new InputList<Inputs.HierarchyLevelArgs>());
            set => _levels = value;
        }

        /// <summary>
        /// Name of the hierarchy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public HierarchyArgs()
        {
        }
        public static new HierarchyArgs Empty => new HierarchyArgs();
    }

    public sealed class HierarchyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional clause that a hierarchy requires to be matched.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.HierarchyFilterGetArgs>? Filter { get; set; }

        [Input("levels")]
        private InputList<Inputs.HierarchyLevelGetArgs>? _levels;

        /// <summary>
        /// A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
        /// </summary>
        public InputList<Inputs.HierarchyLevelGetArgs> Levels
        {
            get => _levels ?? (_levels = new InputList<Inputs.HierarchyLevelGetArgs>());
            set => _levels = value;
        }

        /// <summary>
        /// Name of the hierarchy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public HierarchyState()
        {
        }
        public static new HierarchyState Empty => new HierarchyState();
    }
}
