// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.CseAggregationRuleSeverityMappingMappingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseAggregationRuleSeverityMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseAggregationRuleSeverityMappingArgs Empty = new CseAggregationRuleSeverityMappingArgs();

    /**
     * The severity to use in the &#34;constant&#34; case or to fall back to if the field used by &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; is not populated.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Integer> default_;

    /**
     * @return The severity to use in the &#34;constant&#34; case or to fall back to if the field used by &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; is not populated.
     * 
     */
    public Optional<Output<Integer>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * The field to use in the &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; cases.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return The field to use in the &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; cases.
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * The map of record values to severities to use in the &#34;fieldValueMapping&#34; case
     * 
     */
    @Import(name="mappings")
    private @Nullable Output<List<CseAggregationRuleSeverityMappingMappingArgs>> mappings;

    /**
     * @return The map of record values to severities to use in the &#34;fieldValueMapping&#34; case
     * 
     */
    public Optional<Output<List<CseAggregationRuleSeverityMappingMappingArgs>>> mappings() {
        return Optional.ofNullable(this.mappings);
    }

    /**
     * Must be set to &#34;eq&#34; currently
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Must be set to &#34;eq&#34; currently
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CseAggregationRuleSeverityMappingArgs() {}

    private CseAggregationRuleSeverityMappingArgs(CseAggregationRuleSeverityMappingArgs $) {
        this.default_ = $.default_;
        this.field = $.field;
        this.mappings = $.mappings;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseAggregationRuleSeverityMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseAggregationRuleSeverityMappingArgs $;

        public Builder() {
            $ = new CseAggregationRuleSeverityMappingArgs();
        }

        public Builder(CseAggregationRuleSeverityMappingArgs defaults) {
            $ = new CseAggregationRuleSeverityMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ The severity to use in the &#34;constant&#34; case or to fall back to if the field used by &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; is not populated.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Integer> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ The severity to use in the &#34;constant&#34; case or to fall back to if the field used by &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; is not populated.
         * 
         * @return builder
         * 
         */
        public Builder default_(Integer default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param field The field to use in the &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; cases.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The field to use in the &#34;fieldValue&#34;/&#34;fieldValueMapping&#34; cases.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param mappings The map of record values to severities to use in the &#34;fieldValueMapping&#34; case
         * 
         * @return builder
         * 
         */
        public Builder mappings(@Nullable Output<List<CseAggregationRuleSeverityMappingMappingArgs>> mappings) {
            $.mappings = mappings;
            return this;
        }

        /**
         * @param mappings The map of record values to severities to use in the &#34;fieldValueMapping&#34; case
         * 
         * @return builder
         * 
         */
        public Builder mappings(List<CseAggregationRuleSeverityMappingMappingArgs> mappings) {
            return mappings(Output.of(mappings));
        }

        /**
         * @param mappings The map of record values to severities to use in the &#34;fieldValueMapping&#34; case
         * 
         * @return builder
         * 
         */
        public Builder mappings(CseAggregationRuleSeverityMappingMappingArgs... mappings) {
            return mappings(List.of(mappings));
        }

        /**
         * @param type Must be set to &#34;eq&#34; currently
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Must be set to &#34;eq&#34; currently
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CseAggregationRuleSeverityMappingArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}