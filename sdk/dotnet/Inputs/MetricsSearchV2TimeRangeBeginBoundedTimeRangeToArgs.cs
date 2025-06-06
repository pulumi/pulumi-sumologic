// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MetricsSearchV2TimeRangeBeginBoundedTimeRangeToArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time since the epoch.
        /// </summary>
        [Input("epochTimeRange")]
        public Input<Inputs.MetricsSearchV2TimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs>? EpochTimeRange { get; set; }

        /// <summary>
        /// Time in ISO 8601 format.
        /// </summary>
        [Input("iso8601TimeRange")]
        public Input<Inputs.MetricsSearchV2TimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs>? Iso8601TimeRange { get; set; }

        /// <summary>
        /// Time in literal format.
        /// </summary>
        [Input("literalTimeRange")]
        public Input<Inputs.MetricsSearchV2TimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs>? LiteralTimeRange { get; set; }

        /// <summary>
        /// Time in relative format.
        /// </summary>
        [Input("relativeTimeRange")]
        public Input<Inputs.MetricsSearchV2TimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs>? RelativeTimeRange { get; set; }

        public MetricsSearchV2TimeRangeBeginBoundedTimeRangeToArgs()
        {
        }
        public static new MetricsSearchV2TimeRangeBeginBoundedTimeRangeToArgs Empty => new MetricsSearchV2TimeRangeBeginBoundedTimeRangeToArgs();
    }
}
