// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricsSearchV2QueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricsSearchV2QueryArgs Empty = new MetricsSearchV2QueryArgs();

    /**
     * Will ONLY be specified for metrics queries. The provider only supports `Advanced` as metrics query mode.
     * 
     */
    @Import(name="metricsQueryMode")
    private @Nullable Output<String> metricsQueryMode;

    /**
     * @return Will ONLY be specified for metrics queries. The provider only supports `Advanced` as metrics query mode.
     * 
     */
    public Optional<Output<String>> metricsQueryMode() {
        return Optional.ofNullable(this.metricsQueryMode);
    }

    /**
     * Key for the query row, A to Z letter.
     * 
     */
    @Import(name="queryKey", required=true)
    private Output<String> queryKey;

    /**
     * @return Key for the query row, A to Z letter.
     * 
     */
    public Output<String> queryKey() {
        return this.queryKey;
    }

    /**
     * A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
     * 
     */
    @Import(name="queryString", required=true)
    private Output<String> queryString;

    /**
     * @return A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
     * 
     */
    public Output<String> queryString() {
        return this.queryString;
    }

    /**
     * The type of the query, either `Metrics` or `Logs`.
     * 
     */
    @Import(name="queryType", required=true)
    private Output<String> queryType;

    /**
     * @return The type of the query, either `Metrics` or `Logs`.
     * 
     */
    public Output<String> queryType() {
        return this.queryType;
    }

    private MetricsSearchV2QueryArgs() {}

    private MetricsSearchV2QueryArgs(MetricsSearchV2QueryArgs $) {
        this.metricsQueryMode = $.metricsQueryMode;
        this.queryKey = $.queryKey;
        this.queryString = $.queryString;
        this.queryType = $.queryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricsSearchV2QueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricsSearchV2QueryArgs $;

        public Builder() {
            $ = new MetricsSearchV2QueryArgs();
        }

        public Builder(MetricsSearchV2QueryArgs defaults) {
            $ = new MetricsSearchV2QueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsQueryMode Will ONLY be specified for metrics queries. The provider only supports `Advanced` as metrics query mode.
         * 
         * @return builder
         * 
         */
        public Builder metricsQueryMode(@Nullable Output<String> metricsQueryMode) {
            $.metricsQueryMode = metricsQueryMode;
            return this;
        }

        /**
         * @param metricsQueryMode Will ONLY be specified for metrics queries. The provider only supports `Advanced` as metrics query mode.
         * 
         * @return builder
         * 
         */
        public Builder metricsQueryMode(String metricsQueryMode) {
            return metricsQueryMode(Output.of(metricsQueryMode));
        }

        /**
         * @param queryKey Key for the query row, A to Z letter.
         * 
         * @return builder
         * 
         */
        public Builder queryKey(Output<String> queryKey) {
            $.queryKey = queryKey;
            return this;
        }

        /**
         * @param queryKey Key for the query row, A to Z letter.
         * 
         * @return builder
         * 
         */
        public Builder queryKey(String queryKey) {
            return queryKey(Output.of(queryKey));
        }

        /**
         * @param queryString A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
         * 
         * @return builder
         * 
         */
        public Builder queryString(Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param queryType The type of the query, either `Metrics` or `Logs`.
         * 
         * @return builder
         * 
         */
        public Builder queryType(Output<String> queryType) {
            $.queryType = queryType;
            return this;
        }

        /**
         * @param queryType The type of the query, either `Metrics` or `Logs`.
         * 
         * @return builder
         * 
         */
        public Builder queryType(String queryType) {
            return queryType(Output.of(queryType));
        }

        public MetricsSearchV2QueryArgs build() {
            if ($.queryKey == null) {
                throw new MissingRequiredPropertyException("MetricsSearchV2QueryArgs", "queryKey");
            }
            if ($.queryString == null) {
                throw new MissingRequiredPropertyException("MetricsSearchV2QueryArgs", "queryString");
            }
            if ($.queryType == null) {
                throw new MissingRequiredPropertyException("MetricsSearchV2QueryArgs", "queryType");
            }
            return $;
        }
    }

}
