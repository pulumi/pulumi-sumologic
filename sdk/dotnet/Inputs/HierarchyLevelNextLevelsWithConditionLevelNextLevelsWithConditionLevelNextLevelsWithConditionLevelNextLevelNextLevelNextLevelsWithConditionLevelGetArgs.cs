// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelGetArgs : global::Pulumi.ResourceArgs
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
        public Input<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelGetArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs>? _nextLevelsWithConditions;

        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelGetArgs()
        {
        }
        public static new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelGetArgs Empty => new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelGetArgs();
    }
}
