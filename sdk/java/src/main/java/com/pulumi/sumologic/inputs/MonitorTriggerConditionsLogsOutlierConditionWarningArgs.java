// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorTriggerConditionsLogsOutlierConditionWarningArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsLogsOutlierConditionWarningArgs Empty = new MonitorTriggerConditionsLogsOutlierConditionWarningArgs();

    @Import(name="consecutive")
    private @Nullable Output<Integer> consecutive;

    public Optional<Output<Integer>> consecutive() {
        return Optional.ofNullable(this.consecutive);
    }

    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    @Import(name="window")
    private @Nullable Output<Integer> window;

    public Optional<Output<Integer>> window() {
        return Optional.ofNullable(this.window);
    }

    private MonitorTriggerConditionsLogsOutlierConditionWarningArgs() {}

    private MonitorTriggerConditionsLogsOutlierConditionWarningArgs(MonitorTriggerConditionsLogsOutlierConditionWarningArgs $) {
        this.consecutive = $.consecutive;
        this.threshold = $.threshold;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsLogsOutlierConditionWarningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsLogsOutlierConditionWarningArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsLogsOutlierConditionWarningArgs();
        }

        public Builder(MonitorTriggerConditionsLogsOutlierConditionWarningArgs defaults) {
            $ = new MonitorTriggerConditionsLogsOutlierConditionWarningArgs(Objects.requireNonNull(defaults));
        }

        public Builder consecutive(@Nullable Output<Integer> consecutive) {
            $.consecutive = consecutive;
            return this;
        }

        public Builder consecutive(Integer consecutive) {
            return consecutive(Output.of(consecutive));
        }

        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder window(@Nullable Output<Integer> window) {
            $.window = window;
            return this;
        }

        public Builder window(Integer window) {
            return window(Output.of(window));
        }

        public MonitorTriggerConditionsLogsOutlierConditionWarningArgs build() {
            return $;
        }
    }

}
