// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetricsSearchMetricsQuery {
    /**
     * @return A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
     * Strictly speaking, both filters and operators are optional.
     * Most of the [Metrics Operators](https://help.sumologic.com/?cid=10144) are allowed in the query string except `fillmissing`, `outlier`, `quantize` and `timeshift`.
     * In practice, your metric queries will almost always contain filters that narrow the scope of your query.
     * For more information about the query language see [Metrics Queries](https://help.sumologic.com/?cid=1079).
     * 
     */
    private String query;
    /**
     * @return Row id for the query row, A to Z letter.
     * 
     */
    private String rowId;

    private MetricsSearchMetricsQuery() {}
    /**
     * @return A metric query consists of a metric, one or more filters and optionally, one or more [Metrics Operators](https://help.sumologic.com/?cid=10144).
     * Strictly speaking, both filters and operators are optional.
     * Most of the [Metrics Operators](https://help.sumologic.com/?cid=10144) are allowed in the query string except `fillmissing`, `outlier`, `quantize` and `timeshift`.
     * In practice, your metric queries will almost always contain filters that narrow the scope of your query.
     * For more information about the query language see [Metrics Queries](https://help.sumologic.com/?cid=1079).
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return Row id for the query row, A to Z letter.
     * 
     */
    public String rowId() {
        return this.rowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSearchMetricsQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        private String rowId;
        public Builder() {}
        public Builder(MetricsSearchMetricsQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.rowId = defaults.rowId;
        }

        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder rowId(String rowId) {
            this.rowId = Objects.requireNonNull(rowId);
            return this;
        }
        public MetricsSearchMetricsQuery build() {
            final var o = new MetricsSearchMetricsQuery();
            o.query = query;
            o.rowId = rowId;
            return o;
        }
    }
}