// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs;
import java.lang.String;
import java.util.Objects;


public final class HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs();

    @Import(name="condition", required=true)
    private Output<String> condition;

    public Output<String> condition() {
        return this.condition;
    }

    /**
     * A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
     * 
     */
    @Import(name="level", required=true)
    private Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level;

    /**
     * @return A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
     * 
     */
    public Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level() {
        return this.level;
    }

    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs $) {
        this.condition = $.condition;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param level A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
         * 
         * @return builder
         * 
         */
        public Builder level(Output<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
         * 
         * @return builder
         * 
         */
        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs level) {
            return level(Output.of(level));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs build() {
            if ($.condition == null) {
                throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs", "condition");
            }
            if ($.level == null) {
                throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs", "level");
            }
            return $;
        }
    }

}