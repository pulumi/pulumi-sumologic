// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.SloIndicatorRequestBasedEvaluationQuery;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloIndicatorRequestBasedEvaluation {
    /**
     * @return Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
     * , `GreaterThanOrEqual`.
     * 
     */
    private @Nullable String op;
    /**
     * @return The queries to use.
     * 
     */
    private List<SloIndicatorRequestBasedEvaluationQuery> queries;
    /**
     * @return The type of query to use. Valid values are `Metrics` or `Logs`.
     * 
     */
    private String queryType;
    /**
     * @return Compared against threshold query&#39;s raw data points to determine success criteria.
     * 
     */
    private @Nullable Double threshold;

    private SloIndicatorRequestBasedEvaluation() {}
    /**
     * @return Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
     * , `GreaterThanOrEqual`.
     * 
     */
    public Optional<String> op() {
        return Optional.ofNullable(this.op);
    }
    /**
     * @return The queries to use.
     * 
     */
    public List<SloIndicatorRequestBasedEvaluationQuery> queries() {
        return this.queries;
    }
    /**
     * @return The type of query to use. Valid values are `Metrics` or `Logs`.
     * 
     */
    public String queryType() {
        return this.queryType;
    }
    /**
     * @return Compared against threshold query&#39;s raw data points to determine success criteria.
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloIndicatorRequestBasedEvaluation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String op;
        private List<SloIndicatorRequestBasedEvaluationQuery> queries;
        private String queryType;
        private @Nullable Double threshold;
        public Builder() {}
        public Builder(SloIndicatorRequestBasedEvaluation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.op = defaults.op;
    	      this.queries = defaults.queries;
    	      this.queryType = defaults.queryType;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder op(@Nullable String op) {
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder queries(List<SloIndicatorRequestBasedEvaluationQuery> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }
        public Builder queries(SloIndicatorRequestBasedEvaluationQuery... queries) {
            return queries(List.of(queries));
        }
        @CustomType.Setter
        public Builder queryType(String queryType) {
            this.queryType = Objects.requireNonNull(queryType);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public SloIndicatorRequestBasedEvaluation build() {
            final var o = new SloIndicatorRequestBasedEvaluation();
            o.op = op;
            o.queries = queries;
            o.queryType = queryType;
            o.threshold = threshold;
            return o;
        }
    }
}