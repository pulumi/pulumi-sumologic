// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevel
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
        public readonly Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevel? NextLevel;
        /// <summary>
        /// Zero or more next levels with conditions.
        /// </summary>
        public readonly ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition> NextLevelsWithConditions;

        [OutputConstructor]
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevel(
            string entityType,

            Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevel? nextLevel,

            ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions)
        {
            EntityType = entityType;
            NextLevel = nextLevel;
            NextLevelsWithConditions = nextLevelsWithConditions;
        }
    }
}
