// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange {
    private String relativeTime;

    private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange() {}
    public String relativeTime() {
        return this.relativeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String relativeTime;
        public Builder() {}
        public Builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativeTime = defaults.relativeTime;
        }

        @CustomType.Setter
        public Builder relativeTime(String relativeTime) {
            if (relativeTime == null) {
              throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange", "relativeTime");
            }
            this.relativeTime = relativeTime;
            return this;
        }
        public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange build() {
            final var _resultValue = new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange();
            _resultValue.relativeTime = relativeTime;
            return _resultValue;
        }
    }
}
