// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MonitorTriggerConditionsLogsStaticConditionWarningResolutionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resolution window that the recovery condition must be met in each evaluation that happens within this entire duration before the alert is recovered (resolved). If not specified, the time range of your trigger will be used.
        /// </summary>
        [Input("resolutionWindow")]
        public Input<string>? ResolutionWindow { get; set; }

        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        [Input("thresholdType")]
        public Input<string>? ThresholdType { get; set; }

        public MonitorTriggerConditionsLogsStaticConditionWarningResolutionArgs()
        {
        }
        public static new MonitorTriggerConditionsLogsStaticConditionWarningResolutionArgs Empty => new MonitorTriggerConditionsLogsStaticConditionWarningResolutionArgs();
    }
}
