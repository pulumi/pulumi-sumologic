// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;


public final class MonitorTriggerConditionsSloSliConditionCriticalArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorTriggerConditionsSloSliConditionCriticalArgs Empty = new MonitorTriggerConditionsSloSliConditionCriticalArgs();

    @Import(name="sliThreshold", required=true)
    private Output<Double> sliThreshold;

    public Output<Double> sliThreshold() {
        return this.sliThreshold;
    }

    private MonitorTriggerConditionsSloSliConditionCriticalArgs() {}

    private MonitorTriggerConditionsSloSliConditionCriticalArgs(MonitorTriggerConditionsSloSliConditionCriticalArgs $) {
        this.sliThreshold = $.sliThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorTriggerConditionsSloSliConditionCriticalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorTriggerConditionsSloSliConditionCriticalArgs $;

        public Builder() {
            $ = new MonitorTriggerConditionsSloSliConditionCriticalArgs();
        }

        public Builder(MonitorTriggerConditionsSloSliConditionCriticalArgs defaults) {
            $ = new MonitorTriggerConditionsSloSliConditionCriticalArgs(Objects.requireNonNull(defaults));
        }

        public Builder sliThreshold(Output<Double> sliThreshold) {
            $.sliThreshold = sliThreshold;
            return this;
        }

        public Builder sliThreshold(Double sliThreshold) {
            return sliThreshold(Output.of(sliThreshold));
        }

        public MonitorTriggerConditionsSloSliConditionCriticalArgs build() {
            if ($.sliThreshold == null) {
                throw new MissingRequiredPropertyException("MonitorTriggerConditionsSloSliConditionCriticalArgs", "sliThreshold");
            }
            return $;
        }
    }

}