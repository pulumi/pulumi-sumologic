// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs Empty = new DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs();

    @Import(name="operatorName", required=true)
    private Output<String> operatorName;

    public Output<String> operatorName() {
        return this.operatorName;
    }

    @Import(name="parameters", required=true)
    private Output<List<DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs>> parameters;

    public Output<List<DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs>> parameters() {
        return this.parameters;
    }

    private DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs() {}

    private DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs(DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs $) {
        this.operatorName = $.operatorName;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs $;

        public Builder() {
            $ = new DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs();
        }

        public Builder(DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs defaults) {
            $ = new DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs(Objects.requireNonNull(defaults));
        }

        public Builder operatorName(Output<String> operatorName) {
            $.operatorName = operatorName;
            return this;
        }

        public Builder operatorName(String operatorName) {
            return operatorName(Output.of(operatorName));
        }

        public Builder parameters(Output<List<DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs build() {
            if ($.operatorName == null) {
                throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs", "operatorName");
            }
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelQueryMetricsQueryDataOperatorArgs", "parameters");
            }
            return $;
        }
    }

}