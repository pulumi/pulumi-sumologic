// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToGetArgs : Pulumi.ResourceArgs
    {
        [Input("epochTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeGetArgs>? EpochTimeRange { get; set; }

        [Input("iso8601TimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeGetArgs>? Iso8601TimeRange { get; set; }

        [Input("literalTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeGetArgs>? LiteralTimeRange { get; set; }

        [Input("relativeTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeGetArgs>? RelativeTimeRange { get; set; }

        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToGetArgs()
        {
        }
    }
}