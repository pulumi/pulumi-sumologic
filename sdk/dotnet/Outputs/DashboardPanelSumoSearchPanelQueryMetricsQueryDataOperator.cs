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
    public sealed class DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator
    {
        public readonly string OperatorName;
        public readonly ImmutableArray<Outputs.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> Parameters;

        [OutputConstructor]
        private DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator(
            string operatorName,

            ImmutableArray<Outputs.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameters)
        {
            OperatorName = operatorName;
            Parameters = parameters;
        }
    }
}
