// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel
    {
        /// <summary>
        /// Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
        /// </summary>
        public readonly string EntityType;
        /// <summary>
        /// Next level without a condition.
        /// 
        /// The following attributes are exported:
        /// </summary>
        public readonly Outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel? NextLevel;
        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public readonly ImmutableArray<Outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithCondition> NextLevelsWithConditions;

        [OutputConstructor]
        private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel(
            string entityType,

            Outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel? nextLevel,

            ImmutableArray<Outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithCondition> nextLevelsWithConditions)
        {
            EntityType = entityType;
            NextLevel = nextLevel;
            NextLevelsWithConditions = nextLevelsWithConditions;
        }
    }
}