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
    public sealed class HierarchyLevelNextLevelNextLevel
    {
        public readonly string EntityType;
        public readonly Outputs.HierarchyLevelNextLevelNextLevelNextLevel? NextLevel;
        public readonly ImmutableArray<Outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> NextLevelsWithConditions;

        [OutputConstructor]
        private HierarchyLevelNextLevelNextLevel(
            string entityType,

            Outputs.HierarchyLevelNextLevelNextLevelNextLevel? nextLevel,

            ImmutableArray<Outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions)
        {
            EntityType = entityType;
            NextLevel = nextLevel;
            NextLevelsWithConditions = nextLevelsWithConditions;
        }
    }
}