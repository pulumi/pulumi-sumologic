// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo {
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange;

    private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo() {}
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange;
        public Builder() {}
        public Builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epochTimeRange = defaults.epochTimeRange;
    	      this.iso8601TimeRange = defaults.iso8601TimeRange;
    	      this.literalTimeRange = defaults.literalTimeRange;
    	      this.relativeTimeRange = defaults.relativeTimeRange;
        }

        @CustomType.Setter
        public Builder epochTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToEpochTimeRange epochTimeRange) {

            this.epochTimeRange = epochTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder iso8601TimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToIso8601TimeRange iso8601TimeRange) {

            this.iso8601TimeRange = iso8601TimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder literalTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange literalTimeRange) {

            this.literalTimeRange = literalTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder relativeTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeToRelativeTimeRange relativeTimeRange) {

            this.relativeTimeRange = relativeTimeRange;
            return this;
        }
        public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo build() {
            final var _resultValue = new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeTo();
            _resultValue.epochTimeRange = epochTimeRange;
            _resultValue.iso8601TimeRange = iso8601TimeRange;
            _resultValue.literalTimeRange = literalTimeRange;
            _resultValue.relativeTimeRange = relativeTimeRange;
            return _resultValue;
        }
    }
}
