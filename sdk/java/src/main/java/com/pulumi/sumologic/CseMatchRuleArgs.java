// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.CseMatchRuleEntitySelectorArgs;
import com.pulumi.sumologic.inputs.CseMatchRuleSeverityMappingArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseMatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseMatchRuleArgs Empty = new CseMatchRuleArgs();

    /**
     * The description of the generated Signals
     * 
     */
    @Import(name="descriptionExpression", required=true)
    private Output<String> descriptionExpression;

    /**
     * @return The description of the generated Signals
     * 
     */
    public Output<String> descriptionExpression() {
        return this.descriptionExpression;
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
     * + `entityType` - (Required) The type of the entity to generate the Signal on.
     * 
     */
    @Import(name="entitySelectors", required=true)
    private Output<List<CseMatchRuleEntitySelectorArgs>> entitySelectors;

    /**
     * @return The entities to generate Signals on
     * + `entityType` - (Required) The type of the entity to generate the Signal on.
     * 
     */
    public Output<List<CseMatchRuleEntitySelectorArgs>> entitySelectors() {
        return this.entitySelectors;
    }

    /**
     * The expression for which records to match on
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The expression for which records to match on
     * 
     */
    public Output<String> expression() {
        return this.expression;
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
     * The name of the Rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the generated Signals
     * 
     */
    @Import(name="nameExpression", required=true)
    private Output<String> nameExpression;

    /**
     * @return The name of the generated Signals
     * 
     */
    public Output<String> nameExpression() {
        return this.nameExpression;
    }

    /**
     * The configuration of how the severity of the Signals should be mapped from the Records
     * 
     */
    @Import(name="severityMapping", required=true)
    private Output<CseMatchRuleSeverityMappingArgs> severityMapping;

    /**
     * @return The configuration of how the severity of the Signals should be mapped from the Records
     * 
     */
    public Output<CseMatchRuleSeverityMappingArgs> severityMapping() {
        return this.severityMapping;
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
     * For how long to suppress Signal generation, in milliseconds. Must be greater than 0 and less than the global limit of 7 days.
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="suppressionWindowSize")
    private @Nullable Output<Integer> suppressionWindowSize;

    /**
     * @return For how long to suppress Signal generation, in milliseconds. Must be greater than 0 and less than the global limit of 7 days.
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<Integer>> suppressionWindowSize() {
        return Optional.ofNullable(this.suppressionWindowSize);
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

    private CseMatchRuleArgs() {}

    private CseMatchRuleArgs(CseMatchRuleArgs $) {
        this.descriptionExpression = $.descriptionExpression;
        this.enabled = $.enabled;
        this.entitySelectors = $.entitySelectors;
        this.expression = $.expression;
        this.isPrototype = $.isPrototype;
        this.name = $.name;
        this.nameExpression = $.nameExpression;
        this.severityMapping = $.severityMapping;
        this.summaryExpression = $.summaryExpression;
        this.suppressionWindowSize = $.suppressionWindowSize;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseMatchRuleArgs $;

        public Builder() {
            $ = new CseMatchRuleArgs();
        }

        public Builder(CseMatchRuleArgs defaults) {
            $ = new CseMatchRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param descriptionExpression The description of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder descriptionExpression(Output<String> descriptionExpression) {
            $.descriptionExpression = descriptionExpression;
            return this;
        }

        /**
         * @param descriptionExpression The description of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder descriptionExpression(String descriptionExpression) {
            return descriptionExpression(Output.of(descriptionExpression));
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
         * + `entityType` - (Required) The type of the entity to generate the Signal on.
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(Output<List<CseMatchRuleEntitySelectorArgs>> entitySelectors) {
            $.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * + `entityType` - (Required) The type of the entity to generate the Signal on.
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(List<CseMatchRuleEntitySelectorArgs> entitySelectors) {
            return entitySelectors(Output.of(entitySelectors));
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * + `entityType` - (Required) The type of the entity to generate the Signal on.
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(CseMatchRuleEntitySelectorArgs... entitySelectors) {
            return entitySelectors(List.of(entitySelectors));
        }

        /**
         * @param expression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
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
         * @param name The name of the Rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameExpression The name of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder nameExpression(Output<String> nameExpression) {
            $.nameExpression = nameExpression;
            return this;
        }

        /**
         * @param nameExpression The name of the generated Signals
         * 
         * @return builder
         * 
         */
        public Builder nameExpression(String nameExpression) {
            return nameExpression(Output.of(nameExpression));
        }

        /**
         * @param severityMapping The configuration of how the severity of the Signals should be mapped from the Records
         * 
         * @return builder
         * 
         */
        public Builder severityMapping(Output<CseMatchRuleSeverityMappingArgs> severityMapping) {
            $.severityMapping = severityMapping;
            return this;
        }

        /**
         * @param severityMapping The configuration of how the severity of the Signals should be mapped from the Records
         * 
         * @return builder
         * 
         */
        public Builder severityMapping(CseMatchRuleSeverityMappingArgs severityMapping) {
            return severityMapping(Output.of(severityMapping));
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
         * @param suppressionWindowSize For how long to suppress Signal generation, in milliseconds. Must be greater than 0 and less than the global limit of 7 days.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder suppressionWindowSize(@Nullable Output<Integer> suppressionWindowSize) {
            $.suppressionWindowSize = suppressionWindowSize;
            return this;
        }

        /**
         * @param suppressionWindowSize For how long to suppress Signal generation, in milliseconds. Must be greater than 0 and less than the global limit of 7 days.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder suppressionWindowSize(Integer suppressionWindowSize) {
            return suppressionWindowSize(Output.of(suppressionWindowSize));
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

        public CseMatchRuleArgs build() {
            if ($.descriptionExpression == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "descriptionExpression");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "enabled");
            }
            if ($.entitySelectors == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "entitySelectors");
            }
            if ($.expression == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "expression");
            }
            if ($.nameExpression == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "nameExpression");
            }
            if ($.severityMapping == null) {
                throw new MissingRequiredPropertyException("CseMatchRuleArgs", "severityMapping");
            }
            return $;
        }
    }

}
