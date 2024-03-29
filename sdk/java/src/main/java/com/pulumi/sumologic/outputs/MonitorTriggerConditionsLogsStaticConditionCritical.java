// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.MonitorTriggerConditionsLogsStaticConditionCriticalAlert;
import com.pulumi.sumologic.outputs.MonitorTriggerConditionsLogsStaticConditionCriticalResolution;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorTriggerConditionsLogsStaticConditionCritical {
    private MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert;
    private MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution;
    private String timeRange;

    private MonitorTriggerConditionsLogsStaticConditionCritical() {}
    public MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert() {
        return this.alert;
    }
    public MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution() {
        return this.resolution;
    }
    public String timeRange() {
        return this.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTriggerConditionsLogsStaticConditionCritical defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert;
        private MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution;
        private String timeRange;
        public Builder() {}
        public Builder(MonitorTriggerConditionsLogsStaticConditionCritical defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.resolution = defaults.resolution;
    	      this.timeRange = defaults.timeRange;
        }

        @CustomType.Setter
        public Builder alert(MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert) {
            if (alert == null) {
              throw new MissingRequiredPropertyException("MonitorTriggerConditionsLogsStaticConditionCritical", "alert");
            }
            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder resolution(MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution) {
            if (resolution == null) {
              throw new MissingRequiredPropertyException("MonitorTriggerConditionsLogsStaticConditionCritical", "resolution");
            }
            this.resolution = resolution;
            return this;
        }
        @CustomType.Setter
        public Builder timeRange(String timeRange) {
            if (timeRange == null) {
              throw new MissingRequiredPropertyException("MonitorTriggerConditionsLogsStaticConditionCritical", "timeRange");
            }
            this.timeRange = timeRange;
            return this;
        }
        public MonitorTriggerConditionsLogsStaticConditionCritical build() {
            final var _resultValue = new MonitorTriggerConditionsLogsStaticConditionCritical();
            _resultValue.alert = alert;
            _resultValue.resolution = resolution;
            _resultValue.timeRange = timeRange;
            return _resultValue;
        }
    }
}
