// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("epochTimeRange")]
        public Input<Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeGetArgs>? EpochTimeRange { get; set; }

        [Input("iso8601TimeRange")]
        public Input<Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs>? Iso8601TimeRange { get; set; }

        [Input("literalTimeRange")]
        public Input<Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeGetArgs>? LiteralTimeRange { get; set; }

        [Input("relativeTimeRange")]
        public Input<Inputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeGetArgs>? RelativeTimeRange { get; set; }

        public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromGetArgs()
        {
        }
        public static new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromGetArgs Empty => new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromGetArgs();
    }
}