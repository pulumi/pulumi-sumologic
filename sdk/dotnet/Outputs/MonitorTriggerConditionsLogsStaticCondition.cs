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
    public sealed class MonitorTriggerConditionsLogsStaticCondition
    {
        public readonly Outputs.MonitorTriggerConditionsLogsStaticConditionCritical? Critical;
        public readonly string? Field;
        public readonly Outputs.MonitorTriggerConditionsLogsStaticConditionWarning? Warning;

        [OutputConstructor]
        private MonitorTriggerConditionsLogsStaticCondition(
            Outputs.MonitorTriggerConditionsLogsStaticConditionCritical? critical,

            string? field,

            Outputs.MonitorTriggerConditionsLogsStaticConditionWarning? warning)
        {
            Critical = critical;
            Field = field;
            Warning = warning;
        }
    }
}
