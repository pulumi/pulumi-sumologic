// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs : global::Pulumi.ResourceArgs
    {
        [Input("iso8601Time", required: true)]
        public Input<string> Iso8601Time { get; set; } = null!;

        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs()
        {
        }
        public static new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs Empty => new DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs();
    }
}
