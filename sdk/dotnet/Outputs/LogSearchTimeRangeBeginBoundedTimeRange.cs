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
    public sealed class LogSearchTimeRangeBeginBoundedTimeRange
    {
        /// <summary>
        /// Start boundary of bounded time range. See
        /// time_range_boundary schema for details.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeFrom From;
        /// <summary>
        /// End boundary of bounded time range. See
        /// time_range_boundary schema for details.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRangeTo? To;

        [OutputConstructor]
        private LogSearchTimeRangeBeginBoundedTimeRange(
            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeFrom from,

            Outputs.LogSearchTimeRangeBeginBoundedTimeRangeTo? to)
        {
            From = from;
            To = to;
        }
    }
}
