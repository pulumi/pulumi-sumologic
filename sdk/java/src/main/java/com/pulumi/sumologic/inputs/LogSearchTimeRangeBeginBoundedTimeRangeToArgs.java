// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs;
import com.pulumi.sumologic.inputs.LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs;
import com.pulumi.sumologic.inputs.LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs;
import com.pulumi.sumologic.inputs.LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogSearchTimeRangeBeginBoundedTimeRangeToArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchTimeRangeBeginBoundedTimeRangeToArgs Empty = new LogSearchTimeRangeBeginBoundedTimeRangeToArgs();

    /**
     * Time since the epoch.
     * 
     */
    @Import(name="epochTimeRange")
    private @Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs> epochTimeRange;

    /**
     * @return Time since the epoch.
     * 
     */
    public Optional<Output<LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs>> epochTimeRange() {
        return Optional.ofNullable(this.epochTimeRange);
    }

    /**
     * Time in ISO 8601 format.
     * 
     */
    @Import(name="iso8601TimeRange")
    private @Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs> iso8601TimeRange;

    /**
     * @return Time in ISO 8601 format.
     * 
     */
    public Optional<Output<LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs>> iso8601TimeRange() {
        return Optional.ofNullable(this.iso8601TimeRange);
    }

    /**
     * Time in literal format.
     * 
     */
    @Import(name="literalTimeRange")
    private @Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs> literalTimeRange;

    /**
     * @return Time in literal format.
     * 
     */
    public Optional<Output<LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs>> literalTimeRange() {
        return Optional.ofNullable(this.literalTimeRange);
    }

    /**
     * Time in relative format.
     * 
     */
    @Import(name="relativeTimeRange")
    private @Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs> relativeTimeRange;

    /**
     * @return Time in relative format.
     * 
     */
    public Optional<Output<LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs>> relativeTimeRange() {
        return Optional.ofNullable(this.relativeTimeRange);
    }

    private LogSearchTimeRangeBeginBoundedTimeRangeToArgs() {}

    private LogSearchTimeRangeBeginBoundedTimeRangeToArgs(LogSearchTimeRangeBeginBoundedTimeRangeToArgs $) {
        this.epochTimeRange = $.epochTimeRange;
        this.iso8601TimeRange = $.iso8601TimeRange;
        this.literalTimeRange = $.literalTimeRange;
        this.relativeTimeRange = $.relativeTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchTimeRangeBeginBoundedTimeRangeToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchTimeRangeBeginBoundedTimeRangeToArgs $;

        public Builder() {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToArgs();
        }

        public Builder(LogSearchTimeRangeBeginBoundedTimeRangeToArgs defaults) {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param epochTimeRange Time since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder epochTimeRange(@Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs> epochTimeRange) {
            $.epochTimeRange = epochTimeRange;
            return this;
        }

        /**
         * @param epochTimeRange Time since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder epochTimeRange(LogSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeArgs epochTimeRange) {
            return epochTimeRange(Output.of(epochTimeRange));
        }

        /**
         * @param iso8601TimeRange Time in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601TimeRange(@Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs> iso8601TimeRange) {
            $.iso8601TimeRange = iso8601TimeRange;
            return this;
        }

        /**
         * @param iso8601TimeRange Time in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601TimeRange(LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs iso8601TimeRange) {
            return iso8601TimeRange(Output.of(iso8601TimeRange));
        }

        /**
         * @param literalTimeRange Time in literal format.
         * 
         * @return builder
         * 
         */
        public Builder literalTimeRange(@Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs> literalTimeRange) {
            $.literalTimeRange = literalTimeRange;
            return this;
        }

        /**
         * @param literalTimeRange Time in literal format.
         * 
         * @return builder
         * 
         */
        public Builder literalTimeRange(LogSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs literalTimeRange) {
            return literalTimeRange(Output.of(literalTimeRange));
        }

        /**
         * @param relativeTimeRange Time in relative format.
         * 
         * @return builder
         * 
         */
        public Builder relativeTimeRange(@Nullable Output<LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs> relativeTimeRange) {
            $.relativeTimeRange = relativeTimeRange;
            return this;
        }

        /**
         * @param relativeTimeRange Time in relative format.
         * 
         * @return builder
         * 
         */
        public Builder relativeTimeRange(LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs relativeTimeRange) {
            return relativeTimeRange(Output.of(relativeTimeRange));
        }

        public LogSearchTimeRangeBeginBoundedTimeRangeToArgs build() {
            return $;
        }
    }

}
