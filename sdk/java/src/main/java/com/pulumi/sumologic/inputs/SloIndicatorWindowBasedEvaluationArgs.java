// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.SloIndicatorWindowBasedEvaluationQueryArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloIndicatorWindowBasedEvaluationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloIndicatorWindowBasedEvaluationArgs Empty = new SloIndicatorWindowBasedEvaluationArgs();

    /**
     * Aggregation function applied over each window to arrive at SLI. Valid values are `Avg`
     * , `Sum`, `Count`, `Max`, `Min` and `p[1-99]`.
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<String> aggregation;

    /**
     * @return Aggregation function applied over each window to arrive at SLI. Valid values are `Avg`
     * , `Sum`, `Count`, `Max`, `Min` and `p[1-99]`.
     * 
     */
    public Optional<Output<String>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
     * , `GreaterThanOrEqual`.
     * 
     */
    @Import(name="op", required=true)
    private Output<String> op;

    /**
     * @return Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
     * , `GreaterThanOrEqual`.
     * 
     */
    public Output<String> op() {
        return this.op;
    }

    /**
     * The queries to use.
     * 
     */
    @Import(name="queries", required=true)
    private Output<List<SloIndicatorWindowBasedEvaluationQueryArgs>> queries;

    /**
     * @return The queries to use.
     * 
     */
    public Output<List<SloIndicatorWindowBasedEvaluationQueryArgs>> queries() {
        return this.queries;
    }

    /**
     * The type of query to use. Valid values are `Metrics` or `Logs`.
     * 
     */
    @Import(name="queryType", required=true)
    private Output<String> queryType;

    /**
     * @return The type of query to use. Valid values are `Metrics` or `Logs`.
     * 
     */
    public Output<String> queryType() {
        return this.queryType;
    }

    /**
     * The size of the window to use, minimum of `1m` and maximum of `1h`. Only applicable for Window
     * based evaluation.
     * 
     */
    @Import(name="size", required=true)
    private Output<String> size;

    /**
     * @return The size of the window to use, minimum of `1m` and maximum of `1h`. Only applicable for Window
     * based evaluation.
     * 
     */
    public Output<String> size() {
        return this.size;
    }

    /**
     * Compared against threshold query&#39;s raw data points to determine success criteria.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return Compared against threshold query&#39;s raw data points to determine success criteria.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    private SloIndicatorWindowBasedEvaluationArgs() {}

    private SloIndicatorWindowBasedEvaluationArgs(SloIndicatorWindowBasedEvaluationArgs $) {
        this.aggregation = $.aggregation;
        this.op = $.op;
        this.queries = $.queries;
        this.queryType = $.queryType;
        this.size = $.size;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloIndicatorWindowBasedEvaluationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloIndicatorWindowBasedEvaluationArgs $;

        public Builder() {
            $ = new SloIndicatorWindowBasedEvaluationArgs();
        }

        public Builder(SloIndicatorWindowBasedEvaluationArgs defaults) {
            $ = new SloIndicatorWindowBasedEvaluationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation Aggregation function applied over each window to arrive at SLI. Valid values are `Avg`
         * , `Sum`, `Count`, `Max`, `Min` and `p[1-99]`.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation Aggregation function applied over each window to arrive at SLI. Valid values are `Avg`
         * , `Sum`, `Count`, `Max`, `Min` and `p[1-99]`.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        /**
         * @param op Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
         * , `GreaterThanOrEqual`.
         * 
         * @return builder
         * 
         */
        public Builder op(Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
         * , `GreaterThanOrEqual`.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        /**
         * @param queries The queries to use.
         * 
         * @return builder
         * 
         */
        public Builder queries(Output<List<SloIndicatorWindowBasedEvaluationQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        /**
         * @param queries The queries to use.
         * 
         * @return builder
         * 
         */
        public Builder queries(List<SloIndicatorWindowBasedEvaluationQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        /**
         * @param queries The queries to use.
         * 
         * @return builder
         * 
         */
        public Builder queries(SloIndicatorWindowBasedEvaluationQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param queryType The type of query to use. Valid values are `Metrics` or `Logs`.
         * 
         * @return builder
         * 
         */
        public Builder queryType(Output<String> queryType) {
            $.queryType = queryType;
            return this;
        }

        /**
         * @param queryType The type of query to use. Valid values are `Metrics` or `Logs`.
         * 
         * @return builder
         * 
         */
        public Builder queryType(String queryType) {
            return queryType(Output.of(queryType));
        }

        /**
         * @param size The size of the window to use, minimum of `1m` and maximum of `1h`. Only applicable for Window
         * based evaluation.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the window to use, minimum of `1m` and maximum of `1h`. Only applicable for Window
         * based evaluation.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param threshold Compared against threshold query&#39;s raw data points to determine success criteria.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Compared against threshold query&#39;s raw data points to determine success criteria.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public SloIndicatorWindowBasedEvaluationArgs build() {
            $.op = Objects.requireNonNull($.op, "expected parameter 'op' to be non-null");
            $.queries = Objects.requireNonNull($.queries, "expected parameter 'queries' to be non-null");
            $.queryType = Objects.requireNonNull($.queryType, "expected parameter 'queryType' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}