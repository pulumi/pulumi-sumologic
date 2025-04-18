// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsSloBurnRateConditionCriticalArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsSloBurnRateConditionCriticalArgs Empty = new MonitorTriggerConditionsSloBurnRateConditionCriticalArgs();

    @Import(name="burnRateThreshold")
    private @Nullable Output<Double> burnRateThreshold;

    public Optional<Output<Double>> burnRateThreshold() {
        return Optional.ofNullable(this.burnRateThreshold);
    }

    @Import(name="burnRates")
    private @Nullable Output<List<MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs>> burnRates;

    public Optional<Output<List<MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs>>> burnRates() {
        return Optional.ofNullable(this.burnRates);
    }

    @Import(name="timeRange")
    private @Nullable Output<String> timeRange;

    public Optional<Output<String>> timeRange() {
        return Optional.ofNullable(this.timeRange);
    }

    private MonitorTriggerConditionsSloBurnRateConditionCriticalArgs() {}

    private MonitorTriggerConditionsSloBurnRateConditionCriticalArgs(MonitorTriggerConditionsSloBurnRateConditionCriticalArgs $) {
        this.burnRateThreshold = $.burnRateThreshold;
        this.burnRates = $.burnRates;
        this.timeRange = $.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsSloBurnRateConditionCriticalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsSloBurnRateConditionCriticalArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsSloBurnRateConditionCriticalArgs();
        }

        public Builder(MonitorTriggerConditionsSloBurnRateConditionCriticalArgs defaults) {
            $ = new MonitorTriggerConditionsSloBurnRateConditionCriticalArgs(Objects.requireNonNull(defaults));
        }

        public Builder burnRateThreshold(@Nullable Output<Double> burnRateThreshold) {
            $.burnRateThreshold = burnRateThreshold;
            return this;
        }

        public Builder burnRateThreshold(Double burnRateThreshold) {
            return burnRateThreshold(Output.of(burnRateThreshold));
        }

        public Builder burnRates(@Nullable Output<List<MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs>> burnRates) {
            $.burnRates = burnRates;
            return this;
        }

        public Builder burnRates(List<MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs> burnRates) {
            return burnRates(Output.of(burnRates));
        }

        public Builder burnRates(MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateArgs... burnRates) {
            return burnRates(List.of(burnRates));
        }

        public Builder timeRange(@Nullable Output<String> timeRange) {
            $.timeRange = timeRange;
            return this;
        }

        public Builder timeRange(String timeRange) {
            return timeRange(Output.of(timeRange));
        }

        public MonitorTriggerConditionsSloBurnRateConditionCriticalArgs build() {
            return $;
        }
    }

}
