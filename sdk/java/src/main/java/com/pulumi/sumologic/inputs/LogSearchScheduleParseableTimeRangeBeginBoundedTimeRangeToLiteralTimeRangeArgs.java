// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs Empty = new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs();

    /**
     * Name of complete literal time range. One of `today`, `yesterday`, `previous_week`, and
     * `previous_month`.
     * 
     */
    @Import(name="rangeName", required=true)
    private Output<String> rangeName;

    /**
     * @return Name of complete literal time range. One of `today`, `yesterday`, `previous_week`, and
     * `previous_month`.
     * 
     */
    public Output<String> rangeName() {
        return this.rangeName;
    }

    private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs() {}

    private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs $) {
        this.rangeName = $.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs $;

        public Builder() {
            $ = new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs();
        }

        public Builder(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs defaults) {
            $ = new LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rangeName Name of complete literal time range. One of `today`, `yesterday`, `previous_week`, and
         * `previous_month`.
         * 
         * @return builder
         * 
         */
        public Builder rangeName(Output<String> rangeName) {
            $.rangeName = rangeName;
            return this;
        }

        /**
         * @param rangeName Name of complete literal time range. One of `today`, `yesterday`, `previous_week`, and
         * `previous_month`.
         * 
         * @return builder
         * 
         */
        public Builder rangeName(String rangeName) {
            return rangeName(Output.of(rangeName));
        }

        public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeArgs build() {
            $.rangeName = Objects.requireNonNull($.rangeName, "expected parameter 'rangeName' to be non-null");
            return $;
        }
    }

}