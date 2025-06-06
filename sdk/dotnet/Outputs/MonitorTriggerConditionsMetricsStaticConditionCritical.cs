// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class MonitorTriggerConditionsMetricsStaticConditionCritical
    {
        public readonly Outputs.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert Alert;
        public readonly string OccurrenceType;
        public readonly Outputs.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution Resolution;
        public readonly string TimeRange;

        [OutputConstructor]
        private MonitorTriggerConditionsMetricsStaticConditionCritical(
            Outputs.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert alert,

            string occurrenceType,

            Outputs.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution resolution,

            string timeRange)
        {
            Alert = alert;
            OccurrenceType = occurrenceType;
            Resolution = resolution;
            TimeRange = timeRange;
        }
    }
}
