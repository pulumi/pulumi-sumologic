// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CseChainRuleExpressionsAndLimit {
    /**
     * @return The expression for which records to match on
     * 
     */
    private String expression;
    /**
     * @return How many times this expression must match for the Signal to fire
     * 
     */
    private Integer limit;

    private CseChainRuleExpressionsAndLimit() {}
    /**
     * @return The expression for which records to match on
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return How many times this expression must match for the Signal to fire
     * 
     */
    public Integer limit() {
        return this.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CseChainRuleExpressionsAndLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        private Integer limit;
        public Builder() {}
        public Builder(CseChainRuleExpressionsAndLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.limit = defaults.limit;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        @CustomType.Setter
        public Builder limit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public CseChainRuleExpressionsAndLimit build() {
            final var o = new CseChainRuleExpressionsAndLimit();
            o.expression = expression;
            o.limit = limit;
            return o;
        }
    }
}