// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MonitorTriggerConditionsLogsOutlierConditionWarningArgs : global::Pulumi.ResourceArgs
    {
        [Input("consecutive")]
        public Input<int>? Consecutive { get; set; }

        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        [Input("window")]
        public Input<int>? Window { get; set; }

        public MonitorTriggerConditionsLogsOutlierConditionWarningArgs()
        {
        }
        public static new MonitorTriggerConditionsLogsOutlierConditionWarningArgs Empty => new MonitorTriggerConditionsLogsOutlierConditionWarningArgs();
    }
}
