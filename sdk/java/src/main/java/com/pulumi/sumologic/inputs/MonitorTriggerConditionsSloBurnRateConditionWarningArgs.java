// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsSloBurnRateConditionWarningArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsSloBurnRateConditionWarningArgs Empty = new MonitorTriggerConditionsSloBurnRateConditionWarningArgs();

    @Import(name="burnRateThreshold")
    private @Nullable Output<Double> burnRateThreshold;

    public Optional<Output<Double>> burnRateThreshold() {
        return Optional.ofNullable(this.burnRateThreshold);
    }

    @Import(name="burnRates")
    private @Nullable Output<List<MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs>> burnRates;

    public Optional<Output<List<MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs>>> burnRates() {
        return Optional.ofNullable(this.burnRates);
    }

    @Import(name="timeRange")
    private @Nullable Output<String> timeRange;

    public Optional<Output<String>> timeRange() {
        return Optional.ofNullable(this.timeRange);
    }

    private MonitorTriggerConditionsSloBurnRateConditionWarningArgs() {}

    private MonitorTriggerConditionsSloBurnRateConditionWarningArgs(MonitorTriggerConditionsSloBurnRateConditionWarningArgs $) {
        this.burnRateThreshold = $.burnRateThreshold;
        this.burnRates = $.burnRates;
        this.timeRange = $.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsSloBurnRateConditionWarningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsSloBurnRateConditionWarningArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsSloBurnRateConditionWarningArgs();
        }

        public Builder(MonitorTriggerConditionsSloBurnRateConditionWarningArgs defaults) {
            $ = new MonitorTriggerConditionsSloBurnRateConditionWarningArgs(Objects.requireNonNull(defaults));
        }

        public Builder burnRateThreshold(@Nullable Output<Double> burnRateThreshold) {
            $.burnRateThreshold = burnRateThreshold;
            return this;
        }

        public Builder burnRateThreshold(Double burnRateThreshold) {
            return burnRateThreshold(Output.of(burnRateThreshold));
        }

        public Builder burnRates(@Nullable Output<List<MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs>> burnRates) {
            $.burnRates = burnRates;
            return this;
        }

        public Builder burnRates(List<MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs> burnRates) {
            return burnRates(Output.of(burnRates));
        }

        public Builder burnRates(MonitorTriggerConditionsSloBurnRateConditionWarningBurnRateArgs... burnRates) {
            return burnRates(List.of(burnRates));
        }

        public Builder timeRange(@Nullable Output<String> timeRange) {
            $.timeRange = timeRange;
            return this;
        }

        public Builder timeRange(String timeRange) {
            return timeRange(Output.of(timeRange));
        }

        public MonitorTriggerConditionsSloBurnRateConditionWarningArgs build() {
            return $;
        }
    }

}