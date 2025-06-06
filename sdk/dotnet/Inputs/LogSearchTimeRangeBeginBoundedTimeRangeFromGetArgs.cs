// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchTimeRangeBeginBoundedTimeRangeFromGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time since the epoch.
        /// </summary>
        [Input("epochTimeRange")]
        public Input<Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeGetArgs>? EpochTimeRange { get; set; }

        /// <summary>
        /// Time in ISO 8601 format.
        /// </summary>
        [Input("iso8601TimeRange")]
        public Input<Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs>? Iso8601TimeRange { get; set; }

        /// <summary>
        /// Time in literal format.
        /// </summary>
        [Input("literalTimeRange")]
        public Input<Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeGetArgs>? LiteralTimeRange { get; set; }

        /// <summary>
        /// Time in relative format.
        /// </summary>
        [Input("relativeTimeRange")]
        public Input<Inputs.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeGetArgs>? RelativeTimeRange { get; set; }

        public LogSearchTimeRangeBeginBoundedTimeRangeFromGetArgs()
        {
        }
        public static new LogSearchTimeRangeBeginBoundedTimeRangeFromGetArgs Empty => new LogSearchTimeRangeBeginBoundedTimeRangeFromGetArgs();
    }
}
