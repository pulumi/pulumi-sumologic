// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MonitorTriggerConditionsMetricsMissingDataConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsMetricsMissingDataConditionArgs Empty = new MonitorTriggerConditionsMetricsMissingDataConditionArgs();

    @Import(name="timeRange", required=true)
    private Output<String> timeRange;

    public Output<String> timeRange() {
        return this.timeRange;
    }

    @Import(name="triggerSource", required=true)
    private Output<String> triggerSource;

    public Output<String> triggerSource() {
        return this.triggerSource;
    }

    private MonitorTriggerConditionsMetricsMissingDataConditionArgs() {}

    private MonitorTriggerConditionsMetricsMissingDataConditionArgs(MonitorTriggerConditionsMetricsMissingDataConditionArgs $) {
        this.timeRange = $.timeRange;
        this.triggerSource = $.triggerSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsMetricsMissingDataConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsMetricsMissingDataConditionArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsMetricsMissingDataConditionArgs();
        }

        public Builder(MonitorTriggerConditionsMetricsMissingDataConditionArgs defaults) {
            $ = new MonitorTriggerConditionsMetricsMissingDataConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder timeRange(Output<String> timeRange) {
            $.timeRange = timeRange;
            return this;
        }

        public Builder timeRange(String timeRange) {
            return timeRange(Output.of(timeRange));
        }

        public Builder triggerSource(Output<String> triggerSource) {
            $.triggerSource = triggerSource;
            return this;
        }

        public Builder triggerSource(String triggerSource) {
            return triggerSource(Output.of(triggerSource));
        }

        public MonitorTriggerConditionsMetricsMissingDataConditionArgs build() {
            $.timeRange = Objects.requireNonNull($.timeRange, "expected parameter 'timeRange' to be non-null");
            $.triggerSource = Objects.requireNonNull($.triggerSource, "expected parameter 'triggerSource' to be non-null");
            return $;
        }
    }

}