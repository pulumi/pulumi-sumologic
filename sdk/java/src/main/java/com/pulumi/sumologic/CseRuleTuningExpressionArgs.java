// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseRuleTuningExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseRuleTuningExpressionArgs Empty = new CseRuleTuningExpressionArgs();

    /**
     * The description of the rule tuning expression.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the rule tuning expression.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Enabled flag.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enabled flag.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
     * 
     */
    @Import(name="exclude", required=true)
    private Output<Boolean> exclude;

    /**
     * @return Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
     * 
     */
    public Output<Boolean> exclude() {
        return this.exclude;
    }

    /**
     * Expression to match.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Expression to match.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Set to true if this tuning expression should be applied to all rules.
     * 
     */
    @Import(name="isGlobal", required=true)
    private Output<Boolean> isGlobal;

    /**
     * @return Set to true if this tuning expression should be applied to all rules.
     * 
     */
    public Output<Boolean> isGlobal() {
        return this.isGlobal;
    }

    /**
     * The name of the rule tuning expression.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule tuning expression.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
     * 
     */
    @Import(name="ruleIds", required=true)
    private Output<List<String>> ruleIds;

    /**
     * @return List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
     * 
     */
    public Output<List<String>> ruleIds() {
        return this.ruleIds;
    }

    private CseRuleTuningExpressionArgs() {}

    private CseRuleTuningExpressionArgs(CseRuleTuningExpressionArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.exclude = $.exclude;
        this.expression = $.expression;
        this.isGlobal = $.isGlobal;
        this.name = $.name;
        this.ruleIds = $.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseRuleTuningExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseRuleTuningExpressionArgs $;

        public Builder() {
            $ = new CseRuleTuningExpressionArgs();
        }

        public Builder(CseRuleTuningExpressionArgs defaults) {
            $ = new CseRuleTuningExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the rule tuning expression.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the rule tuning expression.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Enabled flag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enabled flag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param exclude Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
         * 
         * @return builder
         * 
         */
        public Builder exclude(Output<Boolean> exclude) {
            $.exclude = exclude;
            return this;
        }

        /**
         * @param exclude Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
         * 
         * @return builder
         * 
         */
        public Builder exclude(Boolean exclude) {
            return exclude(Output.of(exclude));
        }

        /**
         * @param expression Expression to match.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Expression to match.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param isGlobal Set to true if this tuning expression should be applied to all rules.
         * 
         * @return builder
         * 
         */
        public Builder isGlobal(Output<Boolean> isGlobal) {
            $.isGlobal = isGlobal;
            return this;
        }

        /**
         * @param isGlobal Set to true if this tuning expression should be applied to all rules.
         * 
         * @return builder
         * 
         */
        public Builder isGlobal(Boolean isGlobal) {
            return isGlobal(Output.of(isGlobal));
        }

        /**
         * @param name The name of the rule tuning expression.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule tuning expression.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleIds List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(Output<List<String>> ruleIds) {
            $.ruleIds = ruleIds;
            return this;
        }

        /**
         * @param ruleIds List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(List<String> ruleIds) {
            return ruleIds(Output.of(ruleIds));
        }

        /**
         * @param ruleIds List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
         * 
         * @return builder
         * 
         */
        public Builder ruleIds(String... ruleIds) {
            return ruleIds(List.of(ruleIds));
        }

        public CseRuleTuningExpressionArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.exclude = Objects.requireNonNull($.exclude, "expected parameter 'exclude' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.isGlobal = Objects.requireNonNull($.isGlobal, "expected parameter 'isGlobal' to be non-null");
            $.ruleIds = Objects.requireNonNull($.ruleIds, "expected parameter 'ruleIds' to be non-null");
            return $;
        }
    }

}