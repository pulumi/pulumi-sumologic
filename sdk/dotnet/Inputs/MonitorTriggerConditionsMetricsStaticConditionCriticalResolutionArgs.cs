// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs : global::Pulumi.ResourceArgs
    {
        [Input("minDataPoints")]
        public Input<int>? MinDataPoints { get; set; }

        [Input("occurrenceType")]
        public Input<string>? OccurrenceType { get; set; }

        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        [Input("thresholdType")]
        public Input<string>? ThresholdType { get; set; }

        public MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs()
        {
        }
        public static new MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs Empty => new MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs();
    }
}
