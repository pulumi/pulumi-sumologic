// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange {
    private String iso8601Time;

    private DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange() {}
    public String iso8601Time() {
        return this.iso8601Time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iso8601Time;
        public Builder() {}
        public Builder(DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iso8601Time = defaults.iso8601Time;
        }

        @CustomType.Setter
        public Builder iso8601Time(String iso8601Time) {
            if (iso8601Time == null) {
              throw new MissingRequiredPropertyException("DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange", "iso8601Time");
            }
            this.iso8601Time = iso8601Time;
            return this;
        }
        public DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange build() {
            final var _resultValue = new DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange();
            _resultValue.iso8601Time = iso8601Time;
            return _resultValue;
        }
    }
}
