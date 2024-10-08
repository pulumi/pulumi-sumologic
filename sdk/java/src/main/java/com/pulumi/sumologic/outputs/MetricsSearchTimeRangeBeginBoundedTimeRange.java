// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom;
import com.pulumi.sumologic.outputs.MetricsSearchTimeRangeBeginBoundedTimeRangeTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricsSearchTimeRangeBeginBoundedTimeRange {
    /**
     * @return Start boundary of bounded time range. See
     * time_range_boundary schema for details.
     * 
     */
    private MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from;
    /**
     * @return End boundary of bounded time range. See
     * time_range_boundary schema for details.
     * 
     */
    private @Nullable MetricsSearchTimeRangeBeginBoundedTimeRangeTo to;

    private MetricsSearchTimeRangeBeginBoundedTimeRange() {}
    /**
     * @return Start boundary of bounded time range. See
     * time_range_boundary schema for details.
     * 
     */
    public MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from() {
        return this.from;
    }
    /**
     * @return End boundary of bounded time range. See
     * time_range_boundary schema for details.
     * 
     */
    public Optional<MetricsSearchTimeRangeBeginBoundedTimeRangeTo> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSearchTimeRangeBeginBoundedTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from;
        private @Nullable MetricsSearchTimeRangeBeginBoundedTimeRangeTo to;
        public Builder() {}
        public Builder(MetricsSearchTimeRangeBeginBoundedTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from) {
            if (from == null) {
              throw new MissingRequiredPropertyException("MetricsSearchTimeRangeBeginBoundedTimeRange", "from");
            }
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable MetricsSearchTimeRangeBeginBoundedTimeRangeTo to) {

            this.to = to;
            return this;
        }
        public MetricsSearchTimeRangeBeginBoundedTimeRange build() {
            final var _resultValue = new MetricsSearchTimeRangeBeginBoundedTimeRange();
            _resultValue.from = from;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}
