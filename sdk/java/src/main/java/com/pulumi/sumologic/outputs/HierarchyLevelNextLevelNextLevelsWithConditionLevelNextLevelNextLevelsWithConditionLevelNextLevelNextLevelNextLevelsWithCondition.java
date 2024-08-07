// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private String condition;
    /**
     * @return A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
     * 
     */
    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;

    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition() {}
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return A hierarchy of entities. The order is up-down, left to right levels with condition, then level without condition. Maximum supported total depth is 6.
     * 
     */
    public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.level = defaults.level;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder level(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level) {
            if (level == null) {
              throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition", "level");
            }
            this.level = level;
            return this;
        }
        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition build() {
            final var _resultValue = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition();
            _resultValue.condition = condition;
            _resultValue.level = level;
            return _resultValue;
        }
    }
}
