// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelSumoSearchPanelColoringRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("colorThresholds")]
        private InputList<Inputs.DashboardPanelSumoSearchPanelColoringRuleColorThresholdArgs>? _colorThresholds;
        public InputList<Inputs.DashboardPanelSumoSearchPanelColoringRuleColorThresholdArgs> ColorThresholds
        {
            get => _colorThresholds ?? (_colorThresholds = new InputList<Inputs.DashboardPanelSumoSearchPanelColoringRuleColorThresholdArgs>());
            set => _colorThresholds = value;
        }

        [Input("multipleSeriesAggregateFunction", required: true)]
        public Input<string> MultipleSeriesAggregateFunction { get; set; } = null!;

        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        [Input("singleSeriesAggregateFunction", required: true)]
        public Input<string> SingleSeriesAggregateFunction { get; set; } = null!;

        public DashboardPanelSumoSearchPanelColoringRuleArgs()
        {
        }
        public static new DashboardPanelSumoSearchPanelColoringRuleArgs Empty => new DashboardPanelSumoSearchPanelColoringRuleArgs();
    }
}