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
    public sealed class DashboardPanelTracesListPanelQueryMetricsQueryDataOperator
    {
        public readonly string OperatorName;
        public readonly ImmutableArray<Outputs.DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameter> Parameters;

        [OutputConstructor]
        private DashboardPanelTracesListPanelQueryMetricsQueryDataOperator(
            string operatorName,

            ImmutableArray<Outputs.DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameter> parameters)
        {
            OperatorName = operatorName;
            Parameters = parameters;
        }
    }
}
