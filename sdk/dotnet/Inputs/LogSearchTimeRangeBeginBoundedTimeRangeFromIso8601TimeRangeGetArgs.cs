// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time as a string in ISO 8601 format.
        /// </summary>
        [Input("iso8601Time", required: true)]
        public Input<string> Iso8601Time { get; set; } = null!;

        public LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs()
        {
        }
        public static new LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs Empty => new LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeGetArgs();
    }
}