// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs();

    @Import(name="entityType", required=true)
    private Output<String> entityType;

    public Output<String> entityType() {
        return this.entityType;
    }

    @Import(name="nextLevel")
    private @Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs> nextLevel;

    public Optional<Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs>> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }

    @Import(name="nextLevelsWithConditions")
    private @Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions;

    public Optional<Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs>>> nextLevelsWithConditions() {
        return Optional.ofNullable(this.nextLevelsWithConditions);
    }

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs $) {
        this.entityType = $.entityType;
        this.nextLevel = $.nextLevel;
        this.nextLevelsWithConditions = $.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        public Builder nextLevel(@Nullable Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs> nextLevel) {
            $.nextLevel = nextLevel;
            return this;
        }

        public Builder nextLevel(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelArgs nextLevel) {
            return nextLevel(Output.of(nextLevel));
        }

        public Builder nextLevelsWithConditions(@Nullable Output<List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs>> nextLevelsWithConditions) {
            $.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }

        public Builder nextLevelsWithConditions(List<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs> nextLevelsWithConditions) {
            return nextLevelsWithConditions(Output.of(nextLevelsWithConditions));
        }

        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs build() {
            if ($.entityType == null) {
                throw new MissingRequiredPropertyException("HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelArgs", "entityType");
            }
            return $;
        }
    }

}