// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange {
    private String rangeName;

    private DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange() {}
    public String rangeName() {
        return this.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rangeName;
        public Builder() {}
        public Builder(DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeName = defaults.rangeName;
        }

        @CustomType.Setter
        public Builder rangeName(String rangeName) {
            if (rangeName == null) {
              throw new MissingRequiredPropertyException("DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange", "rangeName");
            }
            this.rangeName = rangeName;
            return this;
        }
        public DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange build() {
            final var _resultValue = new DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange();
            _resultValue.rangeName = rangeName;
            return _resultValue;
        }
    }
}