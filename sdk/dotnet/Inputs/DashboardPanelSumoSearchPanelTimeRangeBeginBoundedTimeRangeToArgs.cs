// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToArgs : global::Pulumi.ResourceArgs
    {
        [Input("epochTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs>? EpochTimeRange { get; set; }

        [Input("iso8601TimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs>? Iso8601TimeRange { get; set; }

        [Input("literalTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs>? LiteralTimeRange { get; set; }

        [Input("relativeTimeRange")]
        public Input<Inputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs>? RelativeTimeRange { get; set; }

        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToArgs()
        {
        }
        public static new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToArgs Empty => new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToArgs();
    }
}
