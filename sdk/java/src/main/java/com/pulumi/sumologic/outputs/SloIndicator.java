// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.SloIndicatorRequestBasedEvaluation;
import com.pulumi.sumologic.outputs.SloIndicatorWindowBasedEvaluation;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloIndicator {
    private @Nullable SloIndicatorRequestBasedEvaluation requestBasedEvaluation;
    private @Nullable SloIndicatorWindowBasedEvaluation windowBasedEvaluation;

    private SloIndicator() {}
    public Optional<SloIndicatorRequestBasedEvaluation> requestBasedEvaluation() {
        return Optional.ofNullable(this.requestBasedEvaluation);
    }
    public Optional<SloIndicatorWindowBasedEvaluation> windowBasedEvaluation() {
        return Optional.ofNullable(this.windowBasedEvaluation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloIndicator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SloIndicatorRequestBasedEvaluation requestBasedEvaluation;
        private @Nullable SloIndicatorWindowBasedEvaluation windowBasedEvaluation;
        public Builder() {}
        public Builder(SloIndicator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestBasedEvaluation = defaults.requestBasedEvaluation;
    	      this.windowBasedEvaluation = defaults.windowBasedEvaluation;
        }

        @CustomType.Setter
        public Builder requestBasedEvaluation(@Nullable SloIndicatorRequestBasedEvaluation requestBasedEvaluation) {
            this.requestBasedEvaluation = requestBasedEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder windowBasedEvaluation(@Nullable SloIndicatorWindowBasedEvaluation windowBasedEvaluation) {
            this.windowBasedEvaluation = windowBasedEvaluation;
            return this;
        }
        public SloIndicator build() {
            final var o = new SloIndicator();
            o.requestBasedEvaluation = requestBasedEvaluation;
            o.windowBasedEvaluation = windowBasedEvaluation;
            return o;
        }
    }
}