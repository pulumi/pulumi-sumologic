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
    public sealed class MonitorTriggerConditionsLogsStaticConditionCriticalAlert
    {
        public readonly double? Threshold;
        public readonly string? ThresholdType;

        [OutputConstructor]
        private MonitorTriggerConditionsLogsStaticConditionCriticalAlert(
            double? threshold,

            string? thresholdType)
        {
            Threshold = threshold;
            ThresholdType = thresholdType;
        }
    }
}
