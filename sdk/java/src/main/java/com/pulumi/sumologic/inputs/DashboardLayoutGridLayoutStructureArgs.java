// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DashboardLayoutGridLayoutStructureArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardLayoutGridLayoutStructureArgs Empty = new DashboardLayoutGridLayoutStructureArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="structure", required=true)
    private Output<String> structure;

    public Output<String> structure() {
        return this.structure;
    }

    private DashboardLayoutGridLayoutStructureArgs() {}

    private DashboardLayoutGridLayoutStructureArgs(DashboardLayoutGridLayoutStructureArgs $) {
        this.key = $.key;
        this.structure = $.structure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardLayoutGridLayoutStructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardLayoutGridLayoutStructureArgs $;

        public Builder() {
            $ = new DashboardLayoutGridLayoutStructureArgs();
        }

        public Builder(DashboardLayoutGridLayoutStructureArgs defaults) {
            $ = new DashboardLayoutGridLayoutStructureArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder structure(Output<String> structure) {
            $.structure = structure;
            return this;
        }

        public Builder structure(String structure) {
            return structure(Output.of(structure));
        }

        public DashboardLayoutGridLayoutStructureArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.structure = Objects.requireNonNull($.structure, "expected parameter 'structure' to be non-null");
            return $;
        }
    }

}