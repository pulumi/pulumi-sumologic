// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelQueryMetricsQueryData;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelTracesListPanelQuery {
    private @Nullable DashboardPanelTracesListPanelQueryMetricsQueryData metricsQueryData;
    private @Nullable String metricsQueryMode;
    private @Nullable Integer outputCardinalityLimit;
    private @Nullable String parseMode;
    private String queryKey;
    private String queryString;
    private String queryType;
    private @Nullable String timeSource;
    private @Nullable Boolean transient_;

    private DashboardPanelTracesListPanelQuery() {}
    public Optional<DashboardPanelTracesListPanelQueryMetricsQueryData> metricsQueryData() {
        return Optional.ofNullable(this.metricsQueryData);
    }
    public Optional<String> metricsQueryMode() {
        return Optional.ofNullable(this.metricsQueryMode);
    }
    public Optional<Integer> outputCardinalityLimit() {
        return Optional.ofNullable(this.outputCardinalityLimit);
    }
    public Optional<String> parseMode() {
        return Optional.ofNullable(this.parseMode);
    }
    public String queryKey() {
        return this.queryKey;
    }
    public String queryString() {
        return this.queryString;
    }
    public String queryType() {
        return this.queryType;
    }
    public Optional<String> timeSource() {
        return Optional.ofNullable(this.timeSource);
    }
    public Optional<Boolean> transient_() {
        return Optional.ofNullable(this.transient_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelTracesListPanelQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardPanelTracesListPanelQueryMetricsQueryData metricsQueryData;
        private @Nullable String metricsQueryMode;
        private @Nullable Integer outputCardinalityLimit;
        private @Nullable String parseMode;
        private String queryKey;
        private String queryString;
        private String queryType;
        private @Nullable String timeSource;
        private @Nullable Boolean transient_;
        public Builder() {}
        public Builder(DashboardPanelTracesListPanelQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricsQueryData = defaults.metricsQueryData;
    	      this.metricsQueryMode = defaults.metricsQueryMode;
    	      this.outputCardinalityLimit = defaults.outputCardinalityLimit;
    	      this.parseMode = defaults.parseMode;
    	      this.queryKey = defaults.queryKey;
    	      this.queryString = defaults.queryString;
    	      this.queryType = defaults.queryType;
    	      this.timeSource = defaults.timeSource;
    	      this.transient_ = defaults.transient_;
        }

        @CustomType.Setter
        public Builder metricsQueryData(@Nullable DashboardPanelTracesListPanelQueryMetricsQueryData metricsQueryData) {

            this.metricsQueryData = metricsQueryData;
            return this;
        }
        @CustomType.Setter
        public Builder metricsQueryMode(@Nullable String metricsQueryMode) {

            this.metricsQueryMode = metricsQueryMode;
            return this;
        }
        @CustomType.Setter
        public Builder outputCardinalityLimit(@Nullable Integer outputCardinalityLimit) {

            this.outputCardinalityLimit = outputCardinalityLimit;
            return this;
        }
        @CustomType.Setter
        public Builder parseMode(@Nullable String parseMode) {

            this.parseMode = parseMode;
            return this;
        }
        @CustomType.Setter
        public Builder queryKey(String queryKey) {
            if (queryKey == null) {
              throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelQuery", "queryKey");
            }
            this.queryKey = queryKey;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(String queryString) {
            if (queryString == null) {
              throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelQuery", "queryString");
            }
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder queryType(String queryType) {
            if (queryType == null) {
              throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelQuery", "queryType");
            }
            this.queryType = queryType;
            return this;
        }
        @CustomType.Setter
        public Builder timeSource(@Nullable String timeSource) {

            this.timeSource = timeSource;
            return this;
        }
        @CustomType.Setter("transient")
        public Builder transient_(@Nullable Boolean transient_) {

            this.transient_ = transient_;
            return this;
        }
        public DashboardPanelTracesListPanelQuery build() {
            final var _resultValue = new DashboardPanelTracesListPanelQuery();
            _resultValue.metricsQueryData = metricsQueryData;
            _resultValue.metricsQueryMode = metricsQueryMode;
            _resultValue.outputCardinalityLimit = outputCardinalityLimit;
            _resultValue.parseMode = parseMode;
            _resultValue.queryKey = queryKey;
            _resultValue.queryString = queryString;
            _resultValue.queryType = queryType;
            _resultValue.timeSource = timeSource;
            _resultValue.transient_ = transient_;
            return _resultValue;
        }
    }
}
