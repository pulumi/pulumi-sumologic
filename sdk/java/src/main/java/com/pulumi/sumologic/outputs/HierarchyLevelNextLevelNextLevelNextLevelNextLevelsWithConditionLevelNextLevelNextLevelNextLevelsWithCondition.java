// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private String condition;
    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;

    private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition() {}
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public String condition() {
        return this.condition;
    }
    public HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.level = defaults.level;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        @CustomType.Setter
        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition build() {
            final var o = new HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition();
            o.condition = condition;
            o.level = level;
            return o;
        }
    }
}