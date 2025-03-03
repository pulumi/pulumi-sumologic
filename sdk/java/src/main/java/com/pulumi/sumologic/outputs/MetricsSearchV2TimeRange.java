// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.MetricsSearchV2TimeRangeBeginBoundedTimeRange;
import com.pulumi.sumologic.outputs.MetricsSearchV2TimeRangeCompleteLiteralTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricsSearchV2TimeRange {
    /**
     * @return Bounded time range. See
     * begin_bounded_time_range schema schema for details.
     * 
     */
    private @Nullable MetricsSearchV2TimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
    /**
     * @return Literal time range. See
     * complete_literal_time_range schema for details.
     * 
     */
    private @Nullable MetricsSearchV2TimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;

    private MetricsSearchV2TimeRange() {}
    /**
     * @return Bounded time range. See
     * begin_bounded_time_range schema schema for details.
     * 
     */
    public Optional<MetricsSearchV2TimeRangeBeginBoundedTimeRange> beginBoundedTimeRange() {
        return Optional.ofNullable(this.beginBoundedTimeRange);
    }
    /**
     * @return Literal time range. See
     * complete_literal_time_range schema for details.
     * 
     */
    public Optional<MetricsSearchV2TimeRangeCompleteLiteralTimeRange> completeLiteralTimeRange() {
        return Optional.ofNullable(this.completeLiteralTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSearchV2TimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MetricsSearchV2TimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
        private @Nullable MetricsSearchV2TimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;
        public Builder() {}
        public Builder(MetricsSearchV2TimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginBoundedTimeRange = defaults.beginBoundedTimeRange;
    	      this.completeLiteralTimeRange = defaults.completeLiteralTimeRange;
        }

        @CustomType.Setter
        public Builder beginBoundedTimeRange(@Nullable MetricsSearchV2TimeRangeBeginBoundedTimeRange beginBoundedTimeRange) {

            this.beginBoundedTimeRange = beginBoundedTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder completeLiteralTimeRange(@Nullable MetricsSearchV2TimeRangeCompleteLiteralTimeRange completeLiteralTimeRange) {

            this.completeLiteralTimeRange = completeLiteralTimeRange;
            return this;
        }
        public MetricsSearchV2TimeRange build() {
            final var _resultValue = new MetricsSearchV2TimeRange();
            _resultValue.beginBoundedTimeRange = beginBoundedTimeRange;
            _resultValue.completeLiteralTimeRange = completeLiteralTimeRange;
            return _resultValue;
        }
    }
}
