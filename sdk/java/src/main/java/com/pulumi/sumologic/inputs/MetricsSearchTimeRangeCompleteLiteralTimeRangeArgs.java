// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs Empty = new MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs();

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

    private MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs() {}

    private MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs(MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs $) {
        this.rangeName = $.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs $;

        public Builder() {
            $ = new MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs();
        }

        public Builder(MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs defaults) {
            $ = new MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs(Objects.requireNonNull(defaults));
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

        public MetricsSearchTimeRangeCompleteLiteralTimeRangeArgs build() {
            $.rangeName = Objects.requireNonNull($.rangeName, "expected parameter 'rangeName' to be non-null");
            return $;
        }
    }

}