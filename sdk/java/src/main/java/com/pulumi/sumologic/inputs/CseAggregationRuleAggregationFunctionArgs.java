// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CseAggregationRuleAggregationFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseAggregationRuleAggregationFunctionArgs Empty = new CseAggregationRuleAggregationFunctionArgs();

    /**
     * One or more expressions to pass as arguments to the function
     * 
     */
    @Import(name="arguments", required=true)
    private Output<List<String>> arguments;

    /**
     * @return One or more expressions to pass as arguments to the function
     * 
     */
    public Output<List<String>> arguments() {
        return this.arguments;
    }

    /**
     * The function to aggregate with
     * 
     */
    @Import(name="function", required=true)
    private Output<String> function;

    /**
     * @return The function to aggregate with
     * 
     */
    public Output<String> function() {
        return this.function;
    }

    /**
     * The name to use to reference the result in the trigger_expression
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name to use to reference the result in the trigger_expression
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CseAggregationRuleAggregationFunctionArgs() {}

    private CseAggregationRuleAggregationFunctionArgs(CseAggregationRuleAggregationFunctionArgs $) {
        this.arguments = $.arguments;
        this.function = $.function;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseAggregationRuleAggregationFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseAggregationRuleAggregationFunctionArgs $;

        public Builder() {
            $ = new CseAggregationRuleAggregationFunctionArgs();
        }

        public Builder(CseAggregationRuleAggregationFunctionArgs defaults) {
            $ = new CseAggregationRuleAggregationFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments One or more expressions to pass as arguments to the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(Output<List<String>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments One or more expressions to pass as arguments to the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(List<String> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param arguments One or more expressions to pass as arguments to the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(String... arguments) {
            return arguments(List.of(arguments));
        }

        /**
         * @param function The function to aggregate with
         * 
         * @return builder
         * 
         */
        public Builder function(Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The function to aggregate with
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param name The name to use to reference the result in the trigger_expression
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use to reference the result in the trigger_expression
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CseAggregationRuleAggregationFunctionArgs build() {
            if ($.arguments == null) {
                throw new MissingRequiredPropertyException("CseAggregationRuleAggregationFunctionArgs", "arguments");
            }
            if ($.function == null) {
                throw new MissingRequiredPropertyException("CseAggregationRuleAggregationFunctionArgs", "function");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("CseAggregationRuleAggregationFunctionArgs", "name");
            }
            return $;
        }
    }

}