// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs Empty = new MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs();

    @Import(name="minDataPoints")
    private @Nullable Output<Integer> minDataPoints;

    public Optional<Output<Integer>> minDataPoints() {
        return Optional.ofNullable(this.minDataPoints);
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

    private MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs() {}

    private MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs(MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs $) {
        this.minDataPoints = $.minDataPoints;
        this.threshold = $.threshold;
        this.thresholdType = $.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs();
        }

        public Builder(MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs defaults) {
            $ = new MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs(Objects.requireNonNull(defaults));
        }

        public Builder minDataPoints(@Nullable Output<Integer> minDataPoints) {
            $.minDataPoints = minDataPoints;
            return this;
        }

        public Builder minDataPoints(Integer minDataPoints) {
            return minDataPoints(Output.of(minDataPoints));
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

        public MonitorTriggerConditionsMetricsStaticConditionWarningAlertArgs build() {
            return $;
        }
    }

}