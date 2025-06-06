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
    public sealed class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithCondition
    {
        /// <summary>
        /// Condition to be checked against for level.entityType value, for now full string match.
        /// </summary>
        public readonly string Condition;
        /// <summary>
        /// A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
        /// </summary>
        public readonly Outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevel Level;

        [OutputConstructor]
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithCondition(
            string condition,

            Outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevel level)
        {
            Condition = condition;
            Level = level;
        }
    }
}
