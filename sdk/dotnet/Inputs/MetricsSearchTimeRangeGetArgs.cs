// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MetricsSearchTimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bounded time range. See
        /// begin_bounded_time_range schema schema for details.
        /// </summary>
        [Input("beginBoundedTimeRange")]
        public Input<Inputs.MetricsSearchTimeRangeBeginBoundedTimeRangeGetArgs>? BeginBoundedTimeRange { get; set; }

        /// <summary>
        /// Literal time range. See
        /// complete_literal_time_range schema for details.
        /// </summary>
        [Input("completeLiteralTimeRange")]
        public Input<Inputs.MetricsSearchTimeRangeCompleteLiteralTimeRangeGetArgs>? CompleteLiteralTimeRange { get; set; }

        public MetricsSearchTimeRangeGetArgs()
        {
        }
        public static new MetricsSearchTimeRangeGetArgs Empty => new MetricsSearchTimeRangeGetArgs();
    }
}
