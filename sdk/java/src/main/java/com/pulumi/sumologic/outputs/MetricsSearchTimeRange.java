// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.MetricsSearchTimeRangeBeginBoundedTimeRange;
import com.pulumi.sumologic.outputs.MetricsSearchTimeRangeCompleteLiteralTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricsSearchTimeRange {
    private @Nullable MetricsSearchTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
    private @Nullable MetricsSearchTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;

    private MetricsSearchTimeRange() {}
    public Optional<MetricsSearchTimeRangeBeginBoundedTimeRange> beginBoundedTimeRange() {
        return Optional.ofNullable(this.beginBoundedTimeRange);
    }
    public Optional<MetricsSearchTimeRangeCompleteLiteralTimeRange> completeLiteralTimeRange() {
        return Optional.ofNullable(this.completeLiteralTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSearchTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MetricsSearchTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
        private @Nullable MetricsSearchTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;
        public Builder() {}
        public Builder(MetricsSearchTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginBoundedTimeRange = defaults.beginBoundedTimeRange;
    	      this.completeLiteralTimeRange = defaults.completeLiteralTimeRange;
        }

        @CustomType.Setter
        public Builder beginBoundedTimeRange(@Nullable MetricsSearchTimeRangeBeginBoundedTimeRange beginBoundedTimeRange) {

            this.beginBoundedTimeRange = beginBoundedTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder completeLiteralTimeRange(@Nullable MetricsSearchTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange) {

            this.completeLiteralTimeRange = completeLiteralTimeRange;
            return this;
        }
        public MetricsSearchTimeRange build() {
            final var _resultValue = new MetricsSearchTimeRange();
            _resultValue.beginBoundedTimeRange = beginBoundedTimeRange;
            _resultValue.completeLiteralTimeRange = completeLiteralTimeRange;
            return _resultValue;
        }
    }
}