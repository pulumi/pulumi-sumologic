// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeArgs;
import com.pulumi.sumologic.inputs.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeArgs;
import com.pulumi.sumologic.inputs.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeArgs;
import com.pulumi.sumologic.inputs.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs Empty = new MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs();

    /**
     * Time since the epoch.
     * 
     */
    @Import(name="epochTimeRange")
    private @Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeArgs> epochTimeRange;

    /**
     * @return Time since the epoch.
     * 
     */
    public Optional<Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeArgs>> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }

    /**
     * Time in ISO 8601 format.
     * 
     */
    @Import(name="iso8601TimeRange")
    private @Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeArgs> iso8601TimeRange;

    /**
     * @return Time in ISO 8601 format.
     * 
     */
    public Optional<Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeArgs>> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }

    /**
     * Time in literal format.
     * 
     */
    @Import(name="literalTimeRange")
    private @Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeArgs> literalTimeRange;

    /**
     * @return Time in literal format.
     * 
     */
    public Optional<Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeArgs>> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }

    /**
     * Time in relative format.
     * 
     */
    @Import(name="relativeTimeRange")
    private @Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs> relativeTimeRange;

    /**
     * @return Time in relative format.
     * 
     */
    public Optional<Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs>> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    private MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs() {}

    private MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs(MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs $) {
        this.epochTimeRange = $.epochTimeRange;
        this.iso8601TimeRange = $.iso8601TimeRange;
        this.literalTimeRange = $.literalTimeRange;
        this.relativeTimeRange = $.relativeTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs $;

        public Builder() {
            $ = new MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs();
        }

        public Builder(MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs defaults) {
            $ = new MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param epochTimeRange Time since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder epochTimeRange(@Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeArgs> epochTimeRange) {
            $.epochTimeRange = epochTimeRange;
            return this;
        }

        /**
         * @param epochTimeRange Time since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder epochTimeRange(MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeArgs epochTimeRange) {
            return epochTimeRange(Output.of(epochTimeRange));
        }

        /**
         * @param iso8601TimeRange Time in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601TimeRange(@Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeArgs> iso8601TimeRange) {
            $.iso8601TimeRange = iso8601TimeRange;
            return this;
        }

        /**
         * @param iso8601TimeRange Time in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601TimeRange(MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeArgs iso8601TimeRange) {
            return iso8601TimeRange(Output.of(iso8601TimeRange));
        }

        /**
         * @param literalTimeRange Time in literal format.
         * 
         * @return builder
         * 
         */
        public Builder literalTimeRange(@Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeArgs> literalTimeRange) {
            $.literalTimeRange = literalTimeRange;
            return this;
        }

        /**
         * @param literalTimeRange Time in literal format.
         * 
         * @return builder
         * 
         */
        public Builder literalTimeRange(MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeArgs literalTimeRange) {
            return literalTimeRange(Output.of(literalTimeRange));
        }

        /**
         * @param relativeTimeRange Time in relative format.
         * 
         * @return builder
         * 
         */
        public Builder relativeTimeRange(@Nullable Output<MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs> relativeTimeRange) {
            $.relativeTimeRange = relativeTimeRange;
            return this;
        }

        /**
         * @param relativeTimeRange Time in relative format.
         * 
         * @return builder
         * 
         */
        public Builder relativeTimeRange(MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs relativeTimeRange) {
            return relativeTimeRange(Output.of(relativeTimeRange));
        }

        public MetricsSearchTimeRangeBeginBoundedTimeRangeFromArgs build() {
            return $;
        }
    }

}