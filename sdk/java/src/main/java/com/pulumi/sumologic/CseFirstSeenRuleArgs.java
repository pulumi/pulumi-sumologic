// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.CseFirstSeenRuleEntitySelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseFirstSeenRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseFirstSeenRuleArgs Empty = new CseFirstSeenRuleArgs();

    /**
     * The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     * 
     */
    @Import(name="baselineType", required=true)
    private Output<String> baselineType;

    /**
     * @return The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     * 
     */
    public Output<String> baselineType() {
        return this.baselineType;
    }

    /**
     * The baseline window size in milliseconds
     * 
     */
    @Import(name="baselineWindowSize", required=true)
    private Output<String> baselineWindowSize;

    /**
     * @return The baseline window size in milliseconds
     * 
     */
    public Output<String> baselineWindowSize() {
        return this.baselineWindowSize;
    }

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
     * + `entityType` - (Required) The type of the entity to generate the Signal on
     * 
     */
    @Import(name="entitySelectors", required=true)
    private Output<List<CseFirstSeenRuleEntitySelectorArgs>> entitySelectors;

    /**
     * @return The entities to generate Signals on
     * + `entityType` - (Required) The type of the entity to generate the Signal on
     * 
     */
    public Output<List<CseFirstSeenRuleEntitySelectorArgs>> entitySelectors() {
        return this.entitySelectors;
    }

    /**
     * The expression for which records to match on
     * 
     */
    @Import(name="filterExpression", required=true)
    private Output<String> filterExpression;

    /**
     * @return The expression for which records to match on
     * 
     */
    public Output<String> filterExpression() {
        return this.filterExpression;
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
     * The retention window size in milliseconds
     * 
     */
    @Import(name="retentionWindowSize", required=true)
    private Output<String> retentionWindowSize;

    /**
     * @return The retention window size in milliseconds
     * 
     */
    public Output<String> retentionWindowSize() {
        return this.retentionWindowSize;
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

    /**
     * The value fields
     * 
     */
    @Import(name="valueFields", required=true)
    private Output<List<String>> valueFields;

    /**
     * @return The value fields
     * 
     */
    public Output<List<String>> valueFields() {
        return this.valueFields;
    }

    private CseFirstSeenRuleArgs() {}

    private CseFirstSeenRuleArgs(CseFirstSeenRuleArgs $) {
        this.baselineType = $.baselineType;
        this.baselineWindowSize = $.baselineWindowSize;
        this.descriptionExpression = $.descriptionExpression;
        this.enabled = $.enabled;
        this.entitySelectors = $.entitySelectors;
        this.filterExpression = $.filterExpression;
        this.groupByFields = $.groupByFields;
        this.isPrototype = $.isPrototype;
        this.name = $.name;
        this.nameExpression = $.nameExpression;
        this.retentionWindowSize = $.retentionWindowSize;
        this.severity = $.severity;
        this.summaryExpression = $.summaryExpression;
        this.suppressionWindowSize = $.suppressionWindowSize;
        this.tags = $.tags;
        this.valueFields = $.valueFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseFirstSeenRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseFirstSeenRuleArgs $;

        public Builder() {
            $ = new CseFirstSeenRuleArgs();
        }

        public Builder(CseFirstSeenRuleArgs defaults) {
            $ = new CseFirstSeenRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baselineType The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
         * 
         * @return builder
         * 
         */
        public Builder baselineType(Output<String> baselineType) {
            $.baselineType = baselineType;
            return this;
        }

        /**
         * @param baselineType The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
         * 
         * @return builder
         * 
         */
        public Builder baselineType(String baselineType) {
            return baselineType(Output.of(baselineType));
        }

        /**
         * @param baselineWindowSize The baseline window size in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder baselineWindowSize(Output<String> baselineWindowSize) {
            $.baselineWindowSize = baselineWindowSize;
            return this;
        }

        /**
         * @param baselineWindowSize The baseline window size in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder baselineWindowSize(String baselineWindowSize) {
            return baselineWindowSize(Output.of(baselineWindowSize));
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
         * + `entityType` - (Required) The type of the entity to generate the Signal on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(Output<List<CseFirstSeenRuleEntitySelectorArgs>> entitySelectors) {
            $.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * + `entityType` - (Required) The type of the entity to generate the Signal on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(List<CseFirstSeenRuleEntitySelectorArgs> entitySelectors) {
            return entitySelectors(Output.of(entitySelectors));
        }

        /**
         * @param entitySelectors The entities to generate Signals on
         * + `entityType` - (Required) The type of the entity to generate the Signal on
         * 
         * @return builder
         * 
         */
        public Builder entitySelectors(CseFirstSeenRuleEntitySelectorArgs... entitySelectors) {
            return entitySelectors(List.of(entitySelectors));
        }

        /**
         * @param filterExpression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder filterExpression(Output<String> filterExpression) {
            $.filterExpression = filterExpression;
            return this;
        }

        /**
         * @param filterExpression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder filterExpression(String filterExpression) {
            return filterExpression(Output.of(filterExpression));
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
         * @param retentionWindowSize The retention window size in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder retentionWindowSize(Output<String> retentionWindowSize) {
            $.retentionWindowSize = retentionWindowSize;
            return this;
        }

        /**
         * @param retentionWindowSize The retention window size in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder retentionWindowSize(String retentionWindowSize) {
            return retentionWindowSize(Output.of(retentionWindowSize));
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

        /**
         * @param valueFields The value fields
         * 
         * @return builder
         * 
         */
        public Builder valueFields(Output<List<String>> valueFields) {
            $.valueFields = valueFields;
            return this;
        }

        /**
         * @param valueFields The value fields
         * 
         * @return builder
         * 
         */
        public Builder valueFields(List<String> valueFields) {
            return valueFields(Output.of(valueFields));
        }

        /**
         * @param valueFields The value fields
         * 
         * @return builder
         * 
         */
        public Builder valueFields(String... valueFields) {
            return valueFields(List.of(valueFields));
        }

        public CseFirstSeenRuleArgs build() {
            if ($.baselineType == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "baselineType");
            }
            if ($.baselineWindowSize == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "baselineWindowSize");
            }
            if ($.descriptionExpression == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "descriptionExpression");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "enabled");
            }
            if ($.entitySelectors == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "entitySelectors");
            }
            if ($.filterExpression == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "filterExpression");
            }
            if ($.nameExpression == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "nameExpression");
            }
            if ($.retentionWindowSize == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "retentionWindowSize");
            }
            if ($.severity == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "severity");
            }
            if ($.valueFields == null) {
                throw new MissingRequiredPropertyException("CseFirstSeenRuleArgs", "valueFields");
            }
            return $;
        }
    }

}
