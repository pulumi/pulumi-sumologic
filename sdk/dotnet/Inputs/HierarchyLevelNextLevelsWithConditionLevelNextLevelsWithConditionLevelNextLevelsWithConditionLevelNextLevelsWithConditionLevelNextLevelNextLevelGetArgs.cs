// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        [Input("nextLevel")]
        public Input<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelGetArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionGetArgs>? _nextLevelsWithConditions;
        public InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionGetArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionGetArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelGetArgs()
        {
        }
        public static new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelGetArgs Empty => new HierarchyLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelGetArgs();
    }
}