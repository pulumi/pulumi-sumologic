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
    public sealed class DashboardPanelSumoSearchPanelColoringRule
    {
        public readonly ImmutableArray<Outputs.DashboardPanelSumoSearchPanelColoringRuleColorThreshold> ColorThresholds;
        public readonly string MultipleSeriesAggregateFunction;
        public readonly string Scope;
        public readonly string SingleSeriesAggregateFunction;

        [OutputConstructor]
        private DashboardPanelSumoSearchPanelColoringRule(
            ImmutableArray<Outputs.DashboardPanelSumoSearchPanelColoringRuleColorThreshold> colorThresholds,

            string multipleSeriesAggregateFunction,

            string scope,

            string singleSeriesAggregateFunction)
        {
            ColorThresholds = colorThresholds;
            MultipleSeriesAggregateFunction = multipleSeriesAggregateFunction;
            Scope = scope;
            SingleSeriesAggregateFunction = singleSeriesAggregateFunction;
        }
    }
}