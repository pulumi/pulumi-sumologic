// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchScheduleNotificationSaveToViewNotificationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the View(Index) to save the results to.
        /// </summary>
        [Input("viewName", required: true)]
        public Input<string> ViewName { get; set; } = null!;

        public LogSearchScheduleNotificationSaveToViewNotificationGetArgs()
        {
        }
        public static new LogSearchScheduleNotificationSaveToViewNotificationGetArgs Empty => new LogSearchScheduleNotificationSaveToViewNotificationGetArgs();
    }
}
