// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchTimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bounded time range. See
        /// begin_bounded_time_range schema schema for details.
        /// </summary>
        [Input("beginBoundedTimeRange")]
        public Input<Inputs.LogSearchTimeRangeBeginBoundedTimeRangeGetArgs>? BeginBoundedTimeRange { get; set; }

        /// <summary>
        /// Literal time range. See
        /// complete_literal_time_range schema for details.
        /// </summary>
        [Input("completeLiteralTimeRange")]
        public Input<Inputs.LogSearchTimeRangeCompleteLiteralTimeRangeGetArgs>? CompleteLiteralTimeRange { get; set; }

        public LogSearchTimeRangeGetArgs()
        {
        }
        public static new LogSearchTimeRangeGetArgs Empty => new LogSearchTimeRangeGetArgs();
    }
}