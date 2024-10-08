// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs Empty = new LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs();

    /**
     * Time as a string in ISO 8601 format.
     * 
     */
    @Import(name="iso8601Time", required=true)
    private Output<String> iso8601Time;

    /**
     * @return Time as a string in ISO 8601 format.
     * 
     */
    public Output<String> iso8601Time() {
        return this.iso8601Time;
    }

    private LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs() {}

    private LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs(LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs $) {
        this.iso8601Time = $.iso8601Time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs $;

        public Builder() {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs();
        }

        public Builder(LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs defaults) {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iso8601Time Time as a string in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601Time(Output<String> iso8601Time) {
            $.iso8601Time = iso8601Time;
            return this;
        }

        /**
         * @param iso8601Time Time as a string in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder iso8601Time(String iso8601Time) {
            return iso8601Time(Output.of(iso8601Time));
        }

        public LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs build() {
            if ($.iso8601Time == null) {
                throw new MissingRequiredPropertyException("LogSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeArgs", "iso8601Time");
            }
            return $;
        }
    }

}
