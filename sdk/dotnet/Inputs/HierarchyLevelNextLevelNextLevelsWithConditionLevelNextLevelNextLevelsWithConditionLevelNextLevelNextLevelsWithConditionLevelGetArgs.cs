// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
        /// </summary>
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        /// <summary>
        /// Next level without a condition.
        /// </summary>
        [Input("nextLevel")]
        public Input<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelGetArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs>? _nextLevelsWithConditions;

        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionGetArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelGetArgs()
        {
        }
        public static new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelGetArgs Empty => new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelGetArgs();
    }
}