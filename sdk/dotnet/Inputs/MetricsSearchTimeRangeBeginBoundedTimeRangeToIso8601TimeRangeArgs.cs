// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time as a string in ISO 8601 format.
        /// </summary>
        [Input("iso8601Time", required: true)]
        public Input<string> Iso8601Time { get; set; } = null!;

        public MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs()
        {
        }
        public static new MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs Empty => new MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs();
    }
}