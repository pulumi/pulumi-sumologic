// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DashboardTopologyLabelMapDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardTopologyLabelMapDataArgs Empty = new DashboardTopologyLabelMapDataArgs();

    @Import(name="label", required=true)
    private Output<String> label;

    public Output<String> label() {
        return this.label;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private DashboardTopologyLabelMapDataArgs() {}

    private DashboardTopologyLabelMapDataArgs(DashboardTopologyLabelMapDataArgs $) {
        this.label = $.label;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardTopologyLabelMapDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardTopologyLabelMapDataArgs $;

        public Builder() {
            $ = new DashboardTopologyLabelMapDataArgs();
        }

        public Builder(DashboardTopologyLabelMapDataArgs defaults) {
            $ = new DashboardTopologyLabelMapDataArgs(Objects.requireNonNull(defaults));
        }

        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public DashboardTopologyLabelMapDataArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("DashboardTopologyLabelMapDataArgs", "label");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("DashboardTopologyLabelMapDataArgs", "values");
            }
            return $;
        }
    }

}