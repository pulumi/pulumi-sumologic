// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CseChainRuleEntitySelector {
    private String entityType;
    /**
     * @return The expression for which records to match on
     * 
     */
    private String expression;

    private CseChainRuleEntitySelector() {}
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return The expression for which records to match on
     * 
     */
    public String expression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CseChainRuleEntitySelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityType;
        private String expression;
        public Builder() {}
        public Builder(CseChainRuleEntitySelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.expression = defaults.expression;
        }

        @CustomType.Setter
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public CseChainRuleEntitySelector build() {
            final var o = new CseChainRuleEntitySelector();
            o.entityType = entityType;
            o.expression = expression;
            return o;
        }
    }
}