// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MonitorTriggerConditionsLogsStaticConditionCriticalGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alert", required: true)]
        public Input<Inputs.MonitorTriggerConditionsLogsStaticConditionCriticalAlertGetArgs> Alert { get; set; } = null!;

        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        [Input("resolution", required: true)]
        public Input<Inputs.MonitorTriggerConditionsLogsStaticConditionCriticalResolutionGetArgs> Resolution { get; set; } = null!;

        [Input("timeRange", required: true)]
        public Input<string> TimeRange { get; set; } = null!;

        public MonitorTriggerConditionsLogsStaticConditionCriticalGetArgs()
        {
        }
        public static new MonitorTriggerConditionsLogsStaticConditionCriticalGetArgs Empty => new MonitorTriggerConditionsLogsStaticConditionCriticalGetArgs();
    }
}
