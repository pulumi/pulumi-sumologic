// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LogSearchTimeRangeCompleteLiteralTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchTimeRangeCompleteLiteralTimeRangeArgs Empty = new LogSearchTimeRangeCompleteLiteralTimeRangeArgs();

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

    private LogSearchTimeRangeCompleteLiteralTimeRangeArgs() {}

    private LogSearchTimeRangeCompleteLiteralTimeRangeArgs(LogSearchTimeRangeCompleteLiteralTimeRangeArgs $) {
        this.rangeName = $.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchTimeRangeCompleteLiteralTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchTimeRangeCompleteLiteralTimeRangeArgs $;

        public Builder() {
            $ = new LogSearchTimeRangeCompleteLiteralTimeRangeArgs();
        }

        public Builder(LogSearchTimeRangeCompleteLiteralTimeRangeArgs defaults) {
            $ = new LogSearchTimeRangeCompleteLiteralTimeRangeArgs(Objects.requireNonNull(defaults));
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

        public LogSearchTimeRangeCompleteLiteralTimeRangeArgs build() {
            $.rangeName = Objects.requireNonNull($.rangeName, "expected parameter 'rangeName' to be non-null");
            return $;
        }
    }

}