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
    public sealed class MonitorNotification
    {
        public readonly Outputs.MonitorNotificationNotification Notification;
        public readonly ImmutableArray<string> RunForTriggerTypes;

        [OutputConstructor]
        private MonitorNotification(
            Outputs.MonitorNotificationNotification notification,

            ImmutableArray<string> runForTriggerTypes)
        {
            Notification = notification;
            RunForTriggerTypes = runForTriggerTypes;
        }
    }
}
