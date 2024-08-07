// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.MonitorTriggerConditionsSloBurnRateConditionCriticalArgs;
import com.pulumi.sumologic.inputs.MonitorTriggerConditionsSloBurnRateConditionWarningArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsSloBurnRateConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsSloBurnRateConditionArgs Empty = new MonitorTriggerConditionsSloBurnRateConditionArgs();

    @Import(name="critical")
    private @Nullable Output<MonitorTriggerConditionsSloBurnRateConditionCriticalArgs> critical;

    public Optional<Output<MonitorTriggerConditionsSloBurnRateConditionCriticalArgs>> critical() {
        return Optional.ofNullable(this.critical);
    }

    @Import(name="warning")
    private @Nullable Output<MonitorTriggerConditionsSloBurnRateConditionWarningArgs> warning;

    public Optional<Output<MonitorTriggerConditionsSloBurnRateConditionWarningArgs>> warning() {
        return Optional.ofNullable(this.warning);
    }

    private MonitorTriggerConditionsSloBurnRateConditionArgs() {}

    private MonitorTriggerConditionsSloBurnRateConditionArgs(MonitorTriggerConditionsSloBurnRateConditionArgs $) {
        this.critical = $.critical;
        this.warning = $.warning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsSloBurnRateConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsSloBurnRateConditionArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsSloBurnRateConditionArgs();
        }

        public Builder(MonitorTriggerConditionsSloBurnRateConditionArgs defaults) {
            $ = new MonitorTriggerConditionsSloBurnRateConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder critical(@Nullable Output<MonitorTriggerConditionsSloBurnRateConditionCriticalArgs> critical) {
            $.critical = critical;
            return this;
        }

        public Builder critical(MonitorTriggerConditionsSloBurnRateConditionCriticalArgs critical) {
            return critical(Output.of(critical));
        }

        public Builder warning(@Nullable Output<MonitorTriggerConditionsSloBurnRateConditionWarningArgs> warning) {
            $.warning = warning;
            return this;
        }

        public Builder warning(MonitorTriggerConditionsSloBurnRateConditionWarningArgs warning) {
            return warning(Output.of(warning));
        }

        public MonitorTriggerConditionsSloBurnRateConditionArgs build() {
            return $;
        }
    }

}
