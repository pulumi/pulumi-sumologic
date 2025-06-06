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
    public sealed class DashboardPanelTracesListPanel
    {
        public readonly string? Id;
        public readonly bool? KeepVisualSettingsConsistentWithParent;
        public readonly string Key;
        public readonly ImmutableArray<Outputs.DashboardPanelTracesListPanelQuery> Queries;
        /// <summary>
        /// Time range of the dashboard. See time range schema
        /// for details.
        /// </summary>
        public readonly Outputs.DashboardPanelTracesListPanelTimeRange? TimeRange;
        /// <summary>
        /// Title of the dashboard.
        /// </summary>
        public readonly string? Title;
        public readonly string? VisualSettings;

        [OutputConstructor]
        private DashboardPanelTracesListPanel(
            string? id,

            bool? keepVisualSettingsConsistentWithParent,

            string key,

            ImmutableArray<Outputs.DashboardPanelTracesListPanelQuery> queries,

            Outputs.DashboardPanelTracesListPanelTimeRange? timeRange,

            string? title,

            string? visualSettings)
        {
            Id = id;
            KeepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            Key = key;
            Queries = queries;
            TimeRange = timeRange;
            Title = title;
            VisualSettings = visualSettings;
        }
    }
}
