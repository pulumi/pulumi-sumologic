// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("epochMillis", required: true)]
        public Input<int> EpochMillis { get; set; } = null!;

        public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeGetArgs()
        {
        }
        public static new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeGetArgs Empty => new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRangeGetArgs();
    }
}
