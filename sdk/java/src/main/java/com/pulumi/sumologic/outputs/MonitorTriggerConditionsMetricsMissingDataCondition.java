// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorTriggerConditionsMetricsMissingDataCondition {
    private String timeRange;
    private String triggerSource;

    private MonitorTriggerConditionsMetricsMissingDataCondition() {}
    public String timeRange() {
        return this.timeRange;
    }
    public String triggerSource() {
        return this.triggerSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTriggerConditionsMetricsMissingDataCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String timeRange;
        private String triggerSource;
        public Builder() {}
        public Builder(MonitorTriggerConditionsMetricsMissingDataCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeRange = defaults.timeRange;
    	      this.triggerSource = defaults.triggerSource;
        }

        @CustomType.Setter
        public Builder timeRange(String timeRange) {
            if (timeRange == null) {
              throw new MissingRequiredPropertyException("MonitorTriggerConditionsMetricsMissingDataCondition", "timeRange");
            }
            this.timeRange = timeRange;
            return this;
        }
        @CustomType.Setter
        public Builder triggerSource(String triggerSource) {
            if (triggerSource == null) {
              throw new MissingRequiredPropertyException("MonitorTriggerConditionsMetricsMissingDataCondition", "triggerSource");
            }
            this.triggerSource = triggerSource;
            return this;
        }
        public MonitorTriggerConditionsMetricsMissingDataCondition build() {
            final var _resultValue = new MonitorTriggerConditionsMetricsMissingDataCondition();
            _resultValue.timeRange = timeRange;
            _resultValue.triggerSource = triggerSource;
            return _resultValue;
        }
    }
}