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
    public sealed class MonitorTriggerConditionsLogsStaticConditionCriticalResolution
    {
        /// <summary>
        /// The resolution window that the recovery condition must be met in each evaluation that happens within this entire duration before the alert is recovered (resolved). If not specified, the time range of your trigger will be used.
        /// </summary>
        public readonly string? ResolutionWindow;
        public readonly double? Threshold;
        public readonly string? ThresholdType;

        [OutputConstructor]
        private MonitorTriggerConditionsLogsStaticConditionCriticalResolution(
            string? resolutionWindow,

            double? threshold,

            string? thresholdType)
        {
            ResolutionWindow = resolutionWindow;
            Threshold = threshold;
            ThresholdType = thresholdType;
        }
    }
}
