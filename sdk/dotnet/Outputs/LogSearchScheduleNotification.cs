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
    public sealed class LogSearchScheduleNotification
    {
        public readonly Outputs.LogSearchScheduleNotificationAlertSearchNotification? AlertSearchNotification;
        public readonly Outputs.LogSearchScheduleNotificationCseSignalNotification? CseSignalNotification;
        public readonly Outputs.LogSearchScheduleNotificationEmailSearchNotification? EmailSearchNotification;
        public readonly Outputs.LogSearchScheduleNotificationSaveToLookupNotification? SaveToLookupNotification;
        public readonly Outputs.LogSearchScheduleNotificationSaveToViewNotification? SaveToViewNotification;
        public readonly Outputs.LogSearchScheduleNotificationServiceNowSearchNotification? ServiceNowSearchNotification;
        public readonly Outputs.LogSearchScheduleNotificationWebhookSearchNotification? WebhookSearchNotification;

        [OutputConstructor]
        private LogSearchScheduleNotification(
            Outputs.LogSearchScheduleNotificationAlertSearchNotification? alertSearchNotification,

            Outputs.LogSearchScheduleNotificationCseSignalNotification? cseSignalNotification,

            Outputs.LogSearchScheduleNotificationEmailSearchNotification? emailSearchNotification,

            Outputs.LogSearchScheduleNotificationSaveToLookupNotification? saveToLookupNotification,

            Outputs.LogSearchScheduleNotificationSaveToViewNotification? saveToViewNotification,

            Outputs.LogSearchScheduleNotificationServiceNowSearchNotification? serviceNowSearchNotification,

            Outputs.LogSearchScheduleNotificationWebhookSearchNotification? webhookSearchNotification)
        {
            AlertSearchNotification = alertSearchNotification;
            CseSignalNotification = cseSignalNotification;
            EmailSearchNotification = emailSearchNotification;
            SaveToLookupNotification = saveToLookupNotification;
            SaveToViewNotification = saveToViewNotification;
            ServiceNowSearchNotification = serviceNowSearchNotification;
            WebhookSearchNotification = webhookSearchNotification;
        }
    }
}