// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class HierarchyLevelNextLevelArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        [Input("nextLevel")]
        public Input<Inputs.HierarchyLevelNextLevelNextLevelArgs>? NextLevel { get; set; }

        [Input("nextLevelsWithConditions")]
        private InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionArgs>? _nextLevelsWithConditions;
        public InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionArgs> NextLevelsWithConditions
        {
            get => _nextLevelsWithConditions ?? (_nextLevelsWithConditions = new InputList<Inputs.HierarchyLevelNextLevelNextLevelsWithConditionArgs>());
            set => _nextLevelsWithConditions = value;
        }

        public HierarchyLevelNextLevelArgs()
        {
        }
        public static new HierarchyLevelNextLevelArgs Empty => new HierarchyLevelNextLevelArgs();
    }
}