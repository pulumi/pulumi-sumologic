// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs Empty = new MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs();

    @Import(name="occurrenceType")
    private @Nullable Output<String> occurrenceType;

    public Optional<Output<String>> occurrenceType() {
        return Optional.ofNullable(this.occurrenceType);
    }

    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    @Import(name="thresholdType")
    private @Nullable Output<String> thresholdType;

    public Optional<Output<String>> thresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }

    private MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs() {}

    private MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs(MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs $) {
        this.occurrenceType = $.occurrenceType;
        this.threshold = $.threshold;
        this.thresholdType = $.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs();
        }

        public Builder(MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs defaults) {
            $ = new MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs(Objects.requireNonNull(defaults));
        }

        public Builder occurrenceType(@Nullable Output<String> occurrenceType) {
            $.occurrenceType = occurrenceType;
            return this;
        }

        public Builder occurrenceType(String occurrenceType) {
            return occurrenceType(Output.of(occurrenceType));
        }

        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder thresholdType(@Nullable Output<String> thresholdType) {
            $.thresholdType = thresholdType;
            return this;
        }

        public Builder thresholdType(String thresholdType) {
            return thresholdType(Output.of(thresholdType));
        }

        public MonitorTriggerConditionsMetricsStaticConditionCriticalResolutionArgs build() {
            return $;
        }
    }

}