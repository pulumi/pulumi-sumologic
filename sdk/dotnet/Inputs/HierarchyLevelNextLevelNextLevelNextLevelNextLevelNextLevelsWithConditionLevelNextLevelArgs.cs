// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        [Input("nextLevel")]
        public Input<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs>? _nextLevelsWithConditions;
        public InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs()
        {
        }
        public static new HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs Empty => new HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelArgs();
    }
}