// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelArgs;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs();

    /**
     * Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<String> entityType;

    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }

    /**
     * Next level without a condition.
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="nextLevel")
    private @Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelArgs> nextLevel;

    /**
     * @return Next level without a condition.
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelArgs>> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }

    /**
     * Zero or more next levels with conditions.
     * 
     */
    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions;

    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public Optional<Output<List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs(HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevel = $.nextLevel;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityType Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
         * 
         * @return builder
         * 
         */
        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param nextLevel Next level without a condition.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(@Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelArgs> nextLevel) {
            $.nextLevel = nextLevel;
            return this;
        }

        /**
         * @param nextLevel Next level without a condition.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder nextLevel(HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelArgs nextLevel) {
            return nextLevel(Output.of(nextLevel));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(@Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        /**
         * @param nextLevelsWithConditions Zero or more next levels with conditions.
         * 
         * @return builder
         * 
         */
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelNextLevelNextLevelsWithConditionArgs... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs build() {
            if ($.entityType == null) {
                throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelNextLevelNextLevelArgs", "entityType");
            }
            return $;
        }
    }

}
