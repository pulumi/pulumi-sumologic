// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Condition to be checked against for level.entityType value, for now full string match.
        /// </summary>
        [Input("condition", required: true)]
        public Input<string> Condition { get; set; } = null!;

        [Input("level", required: true)]
        public Input<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs> Level { get; set; } = null!;

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs()
        {
        }
        public static new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs Empty => new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs();
    }
}
