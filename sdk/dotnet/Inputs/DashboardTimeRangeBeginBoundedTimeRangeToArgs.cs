// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardTimeRangeBeginBoundedTimeRangeToArgs : global::Pulumi.ResourceArgs
    {
        [Input("epochTimeRange")]
        public Input<Inputs.DashboardTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs>? EpochTimeRange { get; set; }

        [Input("iso8601TimeRange")]
        public Input<Inputs.DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs>? Iso8601TimeRange { get; set; }

        [Input("literalTimeRange")]
        public Input<Inputs.DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs>? LiteralTimeRange { get; set; }

        [Input("relativeTimeRange")]
        public Input<Inputs.DashboardTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs>? RelativeTimeRange { get; set; }

        public DashboardTimeRangeBeginBoundedTimeRangeToArgs()
        {
        }
        public static new DashboardTimeRangeBeginBoundedTimeRangeToArgs Empty => new DashboardTimeRangeBeginBoundedTimeRangeToArgs();
    }
}
