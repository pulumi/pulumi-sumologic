// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.CseChainRuleEntitySelectorArgs;
import com.pulumi.sumologic.inputs.CseChainRuleExpressionsAndLimitArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseChainRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseChainRuleArgs Empty = new CseChainRuleArgs();

    /**
     * The description of the generated Signals
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the generated Signals
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Whether the rule should generate Signals
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the rule should generate Signals
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The entities to generate Signals on
     * 
     */
    @Import(name="entitySelectors", required=true)
    private Output<List<CseChainRuleEntitySelectorArgs>> entitySelectors;

    /**
     * @return The entities to generate Signals on
     * 
     */
    public Output<List<CseChainRuleEntitySelectorArgs>> entitySelectors() {
        return this.entitySelectors;
    }

    /**
     * The list of expressions and associated limits to make up the conditions of the chain rule
     * 
     */
    @Import(name="expressionsAndLimits", required=true)
    private Output<List<CseChainRuleExpressionsAndLimitArgs>> expressionsAndLimits;

    /**
     * @return The list of expressions and associated limits to make up the conditions of the chain rule
     * 
     */
    public Output<List<CseChainRuleExpressionsAndLimitArgs>> expressionsAndLimits() {
        return this.expressionsAndLimits;
    }

    /**
     * A list of fields to group records by
     * 
     */
    @Import(name="groupByFields")
    private @Nullable Output<List<String>> groupByFields;

    /**
     * @return A list of fields to group records by
     * 
     */
    public Optional<Output<List<String>>> groupByFields() {
        return Optional.ofNullable(this.groupByFields);
    }

    /**
     * Whether the generated Signals should be prototype Signals
     * 
     */
    @Import(name="isPrototype")
    private @Nullable Output<Boolean> isPrototype;

    /**
     * @return Whether the generated Signals should be prototype Signals
     * 
     */
    public Optional<Output<Boolean>> isPrototype() {
        return Optional.ofNullable(this.isPrototype);
    }

    /**
     * The name of the Rule and the generated SignalS
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Rule and the generated SignalS
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
     * 
     */
    @Import(name="ordered")
    private @Nullable Output<Boolean> ordered;

    /**
     * @return Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
     * 
     */
    public Optional<Output<Boolean>> ordered() {
        return Optional.ofNullable(this.ordered);
    }

    /**
     * The severity of the generated Signals
     * 
     */
    @Import(name="severity", required=true)
    private Output<Integer> severity;

    /**
     * @return The severity of the generated Signals
     * 
     */
    public Output<Integer> severity() {
        return this.severity;
    }

    /**
     * The summary of the generated Signals
     * 
     */
    @Import(name="summaryExpression")
    private @Nullable Output<String> summaryExpression;

    /**
     * @return The summary of the generated Signals
     * 
     */
    public Optional<Output<String>> summaryExpression() {
        return Optional.ofNullable(this.summaryExpression);
    }

    /**
     * The tags of the generated Signals
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags of the generated Signals
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
     * 
     */
    @Import(name="windowSize", required=true)
    private Output<String> windowSize;

    /**
     * @return How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
     * 
     */
    public Output<String> windowSize() {
        return this.windowSize;
    }

    private CseChainRuleArgs() {}

    private CseChainRuleArgs(CseChainRuleArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.entitySelectors = $.entitySelectors;
        this.expressionsAndLimits = $.expressionsAndLimits;
        this.groupByFields = $.groupByFields;
        this.isPrototype = $.isPrototype;
        this.name = $.name;
        this.ordered = $.ordered;
        this.severity = $.severity;
        this.summaryExpression = $.summaryExpression;
        this.tags = $.tags;
        this.windowSize = $.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseChainRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseChainRuleArgs $;

        public Builder() {
            $ = new CseChainRuleArgs();
        }

        public Builder(CseChainRuleArgs defaults) {
            $ = new CseChainRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether the rule should generate Signals
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the rule should generate Signals
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(Output<List<CseChainRuleEntitySelectorArgs>> entitySelectors) {
            $.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(List<CseChainRuleEntitySelectorArgs> entitySelectors) {
            return entitySelectors(Output.of(entitySelectors));
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(CseChainRuleEntitySelectorArgs... entitySelectors) {
            return entitySelectors(List.of(entitySelectors));
        }

        /**
         * @param expressionsAndLimits The list of expressions and associated limits to make up the conditions of the chain rule
         * 
         * @return builder
         * 
         */
        public Builder expressionsAndLimits(Output<List<CseChainRuleExpressionsAndLimitArgs>> expressionsAndLimits) {
            $.expressionsAndLimits = expressionsAndLimits;
            return this;
        }

        /**
         * @param expressionsAndLimits The list of expressions and associated limits to make up the conditions of the chain rule
         * 
         * @return builder
         * 
         */
        public Builder expressionsAndLimits(List<CseChainRuleExpressionsAndLimitArgs> expressionsAndLimits) {
            return expressionsAndLimits(Output.of(expressionsAndLimits));
        }

        /**
         * @param expressionsAndLimits The list of expressions and associated limits to make up the conditions of the chain rule
         * 
         * @return builder
         * 
         */
        public Builder expressionsAndLimits(CseChainRuleExpressionsAndLimitArgs... expressionsAndLimits) {
            return expressionsAndLimits(List.of(expressionsAndLimits));
        }

        /**
         * @param groupByFields A list of fields to group records by
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(@Nullable Output<List<String>> groupByFields) {
            $.groupByFields = groupByFields;
            return this;
        }

        /**
         * @param groupByFields A list of fields to group records by
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(List<String> groupByFields) {
            return groupByFields(Output.of(groupByFields));
        }

        /**
         * @param groupByFields A list of fields to group records by
         * 
         * @return builder
         * 
         */
        public Builder groupByFields(String... groupByFields) {
            return groupByFields(List.of(groupByFields));
        }

        /**
         * @param isPrototype Whether the generated Signals should be prototype Signals
         * 
         * @return builder
         * 
         */
        public Builder isPrototype(@Nullable Output<Boolean> isPrototype) {
            $.isPrototype = isPrototype;
            return this;
        }

        /**
         * @param isPrototype Whether the generated Signals should be prototype Signals
         * 
         * @return builder
         * 
         */
        public Builder isPrototype(Boolean isPrototype) {
            return isPrototype(Output.of(isPrototype));
        }

        /**
         * @param name The name of the Rule and the generated SignalS
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Rule and the generated SignalS
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ordered Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
         * 
         * @return builder
         * 
         */
        public Builder ordered(@Nullable Output<Boolean> ordered) {
            $.ordered = ordered;
            return this;
        }

        /**
         * @param ordered Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
         * 
         * @return builder
         * 
         */
        public Builder ordered(Boolean ordered) {
            return ordered(Output.of(ordered));
        }

        /**
         * @param severity The severity of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder severity(Output<Integer> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The severity of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder severity(Integer severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param summaryExpression The summary of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder summaryExpression(@Nullable Output<String> summaryExpression) {
            $.summaryExpression = summaryExpression;
            return this;
        }

        /**
         * @param summaryExpression The summary of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder summaryExpression(String summaryExpression) {
            return summaryExpression(Output.of(summaryExpression));
        }

        /**
         * @param tags The tags of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param windowSize How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
         * 
         * @return builder
         * 
         */
        public Builder windowSize(Output<String> windowSize) {
            $.windowSize = windowSize;
            return this;
        }

        /**
         * @param windowSize How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
         * 
         * @return builder
         * 
         */
        public Builder windowSize(String windowSize) {
            return windowSize(Output.of(windowSize));
        }

        public CseChainRuleArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.entitySelectors = Objects.requireNonNull($.entitySelectors, "expected parameter 'entitySelectors' to be non-null");
            $.expressionsAndLimits = Objects.requireNonNull($.expressionsAndLimits, "expected parameter 'expressionsAndLimits' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            $.windowSize = Objects.requireNonNull($.windowSize, "expected parameter 'windowSize' to be non-null");
            return $;
        }
    }

}