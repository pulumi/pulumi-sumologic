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
    public sealed class DashboardPanelSumoSearchPanelLinkedDashboard
    {
        public readonly string Id;
        public readonly bool? IncludeTimeRange;
        public readonly bool? IncludeVariables;
        public readonly string? RelativePath;

        [OutputConstructor]
        private DashboardPanelSumoSearchPanelLinkedDashboard(
            string id,

            bool? includeTimeRange,

            bool? includeVariables,

            string? relativePath)
        {
            Id = id;
            IncludeTimeRange = includeTimeRange;
            IncludeVariables = includeVariables;
            RelativePath = relativePath;
        }
    }
}
