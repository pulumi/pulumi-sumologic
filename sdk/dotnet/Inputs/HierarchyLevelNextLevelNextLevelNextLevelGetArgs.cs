// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelNextLevelNextLevelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// Next level without a condition.
        /// 
        /// The following attributes are exported:
        /// </summary>
        [Input("nextLevel")]
        public Input<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelGetArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionGetArgs>? _nextLevelsWithConditions;

        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionGetArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionGetArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelNextLevelNextLevelGetArgs()
        {
        }
        public static new HierarchyLevelNextLevelNextLevelNextLevelGetArgs Empty => new HierarchyLevelNextLevelNextLevelNextLevelGetArgs();
    }
}
