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
    public sealed class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom
    {
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange? EpochTimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange? Iso8601TimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange? LiteralTimeRange;
        public readonly Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange? RelativeTimeRange;

        [OutputConstructor]
        private DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom(
            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange? epochTimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange? iso8601TimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange? literalTimeRange,

            Outputs.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange? relativeTimeRange)
        {
            EpochTimeRange = epochTimeRange;
            Iso8601TimeRange = iso8601TimeRange;
            LiteralTimeRange = literalTimeRange;
            RelativeTimeRange = relativeTimeRange;
        }
    }
}