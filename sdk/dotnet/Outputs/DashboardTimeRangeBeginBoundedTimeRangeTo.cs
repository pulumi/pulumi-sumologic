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
    public sealed class DashboardTimeRangeBeginBoundedTimeRangeTo
    {
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRange? EpochTimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? Iso8601TimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? LiteralTimeRange;
        public readonly Outputs.DashboardTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? RelativeTimeRange;

        [OutputConstructor]
        private DashboardTimeRangeBeginBoundedTimeRangeTo(
            Outputs.DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRange? epochTimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? iso8601TimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? literalTimeRange,

            Outputs.DashboardTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? relativeTimeRange)
        {
            EpochTimeRange = epochTimeRange;
            Iso8601TimeRange = iso8601TimeRange;
            LiteralTimeRange = literalTimeRange;
            RelativeTimeRange = relativeTimeRange;
        }
    }
}