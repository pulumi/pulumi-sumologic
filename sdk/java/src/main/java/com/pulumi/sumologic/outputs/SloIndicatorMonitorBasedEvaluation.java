// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.SloIndicatorMonitorBasedEvaluationMonitorTriggers;
import java.util.Objects;

@CustomType
public final class SloIndicatorMonitorBasedEvaluation {
    /**
     * @return Monitor details on which SLO will be based. Only single monitor is supported here.
     * 
     */
    private SloIndicatorMonitorBasedEvaluationMonitorTriggers monitorTriggers;

    private SloIndicatorMonitorBasedEvaluation() {}
    /**
     * @return Monitor details on which SLO will be based. Only single monitor is supported here.
     * 
     */
    public SloIndicatorMonitorBasedEvaluationMonitorTriggers monitorTriggers() {
        return this.monitorTriggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloIndicatorMonitorBasedEvaluation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SloIndicatorMonitorBasedEvaluationMonitorTriggers monitorTriggers;
        public Builder() {}
        public Builder(SloIndicatorMonitorBasedEvaluation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorTriggers = defaults.monitorTriggers;
        }

        @CustomType.Setter
        public Builder monitorTriggers(SloIndicatorMonitorBasedEvaluationMonitorTriggers monitorTriggers) {
            if (monitorTriggers == null) {
              throw new MissingRequiredPropertyException("SloIndicatorMonitorBasedEvaluation", "monitorTriggers");
            }
            this.monitorTriggers = monitorTriggers;
            return this;
        }
        public SloIndicatorMonitorBasedEvaluation build() {
            final var _resultValue = new SloIndicatorMonitorBasedEvaluation();
            _resultValue.monitorTriggers = monitorTriggers;
            return _resultValue;
        }
    }
}
