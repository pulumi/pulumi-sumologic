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
    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel
    {
        public readonly string EntityType;
        public readonly Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevel? NextLevel;
        public readonly ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition> NextLevelsWithConditions;

        [OutputConstructor]
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevel(
            string entityType,

            Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevel? nextLevel,

            ImmutableArray<Outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions)
        {
            EntityType = entityType;
            NextLevel = nextLevel;
            NextLevelsWithConditions = nextLevelsWithConditions;
        }
    }
}