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
    public sealed class LogSearchTimeRange
    {
        /// <summary>
        /// Bounded time range. See
        /// begin_bounded_time_range schema schema for details.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeBeginBoundedTimeRange? BeginBoundedTimeRange;
        /// <summary>
        /// Literal time range. See
        /// complete_literal_time_range schema for details.
        /// </summary>
        public readonly Outputs.LogSearchTimeRangeCompleteLiteralTimeRange? CompleteLiteralTimeRange;

        [OutputConstructor]
        private LogSearchTimeRange(
            Outputs.LogSearchTimeRangeBeginBoundedTimeRange? beginBoundedTimeRange,

            Outputs.LogSearchTimeRangeCompleteLiteralTimeRange? completeLiteralTimeRange)
        {
            BeginBoundedTimeRange = beginBoundedTimeRange;
            CompleteLiteralTimeRange = completeLiteralTimeRange;
        }
    }
}