// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class MonitorTriggerConditionsSloBurnRateConditionWarning
    {
        public readonly double? BurnRateThreshold;
        public readonly ImmutableArray<Outputs.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate> BurnRates;
        public readonly string? TimeRange;

        [OutputConstructor]
        private MonitorTriggerConditionsSloBurnRateConditionWarning(
            double? burnRateThreshold,

            ImmutableArray<Outputs.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate> burnRates,

            string? timeRange)
        {
            BurnRateThreshold = burnRateThreshold;
            BurnRates = burnRates;
            TimeRange = timeRange;
        }
    }
}