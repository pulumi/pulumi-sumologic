// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange;
import com.pulumi.sumologic.outputs.DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom {
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
    private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;

    private DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom() {}
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }
    public Optional<DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
        private @Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;
        public Builder() {}
        public Builder(DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epochTimeRange = defaults.epochTimeRange;
    	      this.iso8601TimeRange = defaults.iso8601TimeRange;
    	      this.literalTimeRange = defaults.literalTimeRange;
    	      this.relativeTimeRange = defaults.relativeTimeRange;
        }

        @CustomType.Setter
        public Builder epochTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange) {

            this.epochTimeRange = epochTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder iso8601TimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange) {

            this.iso8601TimeRange = iso8601TimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder literalTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange) {

            this.literalTimeRange = literalTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder relativeTimeRange(@Nullable DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange) {

            this.relativeTimeRange = relativeTimeRange;
            return this;
        }
        public DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom build() {
            final var _resultValue = new DashboardPanelTracesListPanelTimeRangeBeginBoundedTimeRangeFrom();
            _resultValue.epochTimeRange = epochTimeRange;
            _resultValue.iso8601TimeRange = iso8601TimeRange;
            _resultValue.literalTimeRange = literalTimeRange;
            _resultValue.relativeTimeRange = relativeTimeRange;
            return _resultValue;
        }
    }
}