// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Condition to be checked against for level.entityType value, for now full string match.
        /// </summary>
        [Input("condition", required: true)]
        public Input<string> Condition { get; set; } = null!;

        [Input("level", required: true)]
        public Input<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> Level { get; set; } = null!;

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs()
        {
        }
        public static new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs Empty => new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs();
    }
}