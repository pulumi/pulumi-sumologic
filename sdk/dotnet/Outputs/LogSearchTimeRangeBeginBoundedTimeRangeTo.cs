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
    public sealed class LogSearchTimeRangeBeginBoundedTimeRangeTo
    {
        /// <summary>
        /// Time since the epoch.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRange? EpochTimeRange;
        /// <summary>
        /// Time in ISO 8601 format.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? Iso8601TimeRange;
        /// <summary>
        /// Time in literal format.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? LiteralTimeRange;
        /// <summary>
        /// Time in relative format.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? RelativeTimeRange;

        [OutputConstructor]
        private LogSearchTimeRangeBeginBoundedTimeRangeTo(
            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRange? epochTimeRange,

            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRange? iso8601TimeRange,

            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRange? literalTimeRange,

            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRange? relativeTimeRange)
        {
            EpochTimeRange = epochTimeRange;
            Iso8601TimeRange = iso8601TimeRange;
            LiteralTimeRange = literalTimeRange;
            RelativeTimeRange = relativeTimeRange;
        }
    }
}
