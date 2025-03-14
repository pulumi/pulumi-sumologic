// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs Empty = new MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs();

    /**
     * Relative time as a string consisting of following elements:
     * 1. `-` (optional): minus sign indicates time in the past,
     * 2. `&lt;number&gt;`: number of time units,
     * 3. `&lt;time_unit&gt;`: time unit; possible values are: `w` (week), `d` (day), `h` (hour), `m` (minute), `s` (second).
     * 
     * Multiple pairs of `&lt;number&gt;&lt;time_unit&gt;` may be provided, and they may be in any order. For example,
     * `-2w5d3h` points to the moment in time 2 weeks, 5 days and 3 hours ago.
     * 
     */
    @Import(name="relativeTime", required=true)
    private Output<String> relativeTime;

    /**
     * @return Relative time as a string consisting of following elements:
     * 1. `-` (optional): minus sign indicates time in the past,
     * 2. `&lt;number&gt;`: number of time units,
     * 3. `&lt;time_unit&gt;`: time unit; possible values are: `w` (week), `d` (day), `h` (hour), `m` (minute), `s` (second).
     * 
     * Multiple pairs of `&lt;number&gt;&lt;time_unit&gt;` may be provided, and they may be in any order. For example,
     * `-2w5d3h` points to the moment in time 2 weeks, 5 days and 3 hours ago.
     * 
     */
    public Output<String> relativeTime() {
        return this.relativeTime;
    }

    private MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs() {}

    private MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs(MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs $) {
        this.relativeTime = $.relativeTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs $;

        public Builder() {
            $ = new MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs();
        }

        public Builder(MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs defaults) {
            $ = new MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param relativeTime Relative time as a string consisting of following elements:
         * 1. `-` (optional): minus sign indicates time in the past,
         * 2. `&lt;number&gt;`: number of time units,
         * 3. `&lt;time_unit&gt;`: time unit; possible values are: `w` (week), `d` (day), `h` (hour), `m` (minute), `s` (second).
         * 
         * Multiple pairs of `&lt;number&gt;&lt;time_unit&gt;` may be provided, and they may be in any order. For example,
         * `-2w5d3h` points to the moment in time 2 weeks, 5 days and 3 hours ago.
         * 
         * @return builder
         * 
         */
        public Builder relativeTime(Output<String> relativeTime) {
            $.relativeTime = relativeTime;
            return this;
        }

        /**
         * @param relativeTime Relative time as a string consisting of following elements:
         * 1. `-` (optional): minus sign indicates time in the past,
         * 2. `&lt;number&gt;`: number of time units,
         * 3. `&lt;time_unit&gt;`: time unit; possible values are: `w` (week), `d` (day), `h` (hour), `m` (minute), `s` (second).
         * 
         * Multiple pairs of `&lt;number&gt;&lt;time_unit&gt;` may be provided, and they may be in any order. For example,
         * `-2w5d3h` points to the moment in time 2 weeks, 5 days and 3 hours ago.
         * 
         * @return builder
         * 
         */
        public Builder relativeTime(String relativeTime) {
            return relativeTime(Output.of(relativeTime));
        }

        public MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs build() {
            if ($.relativeTime == null) {
                throw new MissingRequiredPropertyException("MetricsSearchV2TimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeArgs", "relativeTime");
            }
            return $;
        }
    }

}
