// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class DashboardTimeRangeBeginBoundedTimeRangeFrom
    {
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromEpochTimeRange? EpochTimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange? Iso8601TimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange? LiteralTimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange? RelativeTimeRange;

        [OutputConstructor]
        private DashboardTimeRangeBeginBoundedTimeRangeFrom(
            Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromEpochTimeRange? epochTimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange? iso8601TimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange? literalTimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange? relativeTimeRange)
        {
            EpochTimeRange = epochTimeRange;
            Iso8601TimeRange = iso8601TimeRange;
            LiteralTimeRange = literalTimeRange;
            RelativeTimeRange = relativeTimeRange;
        }
    }
}
