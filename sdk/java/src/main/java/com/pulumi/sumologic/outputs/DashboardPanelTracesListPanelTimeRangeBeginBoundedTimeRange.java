// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange {
    private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom from;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo to;

    private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange() {}
    public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom from() {
        return this.from;
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom from;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo to;
        public Builder() {}
        public Builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom from) {
            if (from == null) {
              throw new MissingRequiredPropertyException("DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange", "from");
            }
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo to) {

            this.to = to;
            return this;
        }
        public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange build() {
            final var _resultValue = new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRange();
            _resultValue.from = from;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}