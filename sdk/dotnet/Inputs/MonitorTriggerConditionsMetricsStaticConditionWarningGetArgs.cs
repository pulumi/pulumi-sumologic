// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MonitorTriggerConditionsMetricsStaticConditionWarningGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alert", required: true)]
        public Input<Inputs.MonitorTriggerConditionsMetricsStaticConditionWarningAlertGetArgs> Alert { get; set; } = null!;

        [Input("occurrenceType", required: true)]
        public Input<string> OccurrenceType { get; set; } = null!;

        [Input("resolution", required: true)]
        public Input<Inputs.MonitorTriggerConditionsMetricsStaticConditionWarningResolutionGetArgs> Resolution { get; set; } = null!;

        [Input("timeRange", required: true)]
        public Input<string> TimeRange { get; set; } = null!;

        public MonitorTriggerConditionsMetricsStaticConditionWarningGetArgs()
        {
        }
        public static new MonitorTriggerConditionsMetricsStaticConditionWarningGetArgs Empty => new MonitorTriggerConditionsMetricsStaticConditionWarningGetArgs();
    }
}
