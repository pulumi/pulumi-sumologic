// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator {
    private String operatorName;
    private List<DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameters;

    private DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator() {}
    public String operatorName() {
        return this.operatorName;
    }
    public List<DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operatorName;
        private List<DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameters;
        public Builder() {}
        public Builder(DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder operatorName(String operatorName) {
            if (operatorName == null) {
              throw new MissingRequiredPropertyException("DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator", "operatorName");
            }
            this.operatorName = operatorName;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameters) {
            if (parameters == null) {
              throw new MissingRequiredPropertyException("DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator", "parameters");
            }
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator build() {
            final var _resultValue = new DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator();
            _resultValue.operatorName = operatorName;
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}