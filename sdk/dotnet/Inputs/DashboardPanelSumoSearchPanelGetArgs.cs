// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelSumoSearchPanelGetArgs : Pulumi.ResourceArgs
    {
        [Input("coloringRule")]
        public Input<Inputs.DashboardPanelSumoSearchPanelColoringRuleGetArgs>? ColoringRule { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("keepVisualSettingsConsistentWithParent")]
        public Input<bool>? KeepVisualSettingsConsistentWithParent { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("linkedDashboard")]
        public Input<Inputs.DashboardPanelSumoSearchPanelLinkedDashboardGetArgs>? LinkedDashboard { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardPanelSumoSearchPanelQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardPanelSumoSearchPanelQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardPanelSumoSearchPanelQueryGetArgs>());
            set => _queries = value;
        }

        [Input("timeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeGetArgs>? TimeRange { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("visualSettings")]
        public Input<string>? VisualSettings { get; set; }

        public DashboardPanelSumoSearchPanelGetArgs()
        {
        }
    }
}