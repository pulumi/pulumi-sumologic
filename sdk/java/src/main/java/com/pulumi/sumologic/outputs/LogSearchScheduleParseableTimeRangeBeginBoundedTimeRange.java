// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom;
import com.pulumi.sumologic.outputs.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange {
    private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from;
    private @Nullable LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to;

    private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange() {}
    public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from() {
        return this.from;
    }
    public Optional<LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from;
        private @Nullable LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to;
        public Builder() {}
        public Builder(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from) {
            if (from == null) {
              throw new MissingRequiredPropertyException("LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange", "from");
            }
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to) {

            this.to = to;
            return this;
        }
        public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange build() {
            final var _resultValue = new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange();
            _resultValue.from = from;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}