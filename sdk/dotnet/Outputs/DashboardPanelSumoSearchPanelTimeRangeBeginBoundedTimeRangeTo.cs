// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo
    {
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange? EpochTimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? Iso8601TimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? LiteralTimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? RelativeTimeRange;

        [OutputConstructor]
        private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo(
            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange? epochTimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? iso8601TimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? literalTimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? relativeTimeRange)
        {
            EpochTimeRange = epochTimeRange;
            Iso8601TimeRange = iso8601TimeRange;
            LiteralTimeRange = literalTimeRange;
            RelativeTimeRange = relativeTimeRange;
        }
    }
}