// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudwatchSourceFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudwatchSourceFilterArgs Empty = new CloudwatchSourceFilterArgs();

    @Import(name="filterType", required=true)
    private Output<String> filterType;

    public Output<String> filterType() {
        return this.filterType;
    }

    @Import(name="mask")
    private @Nullable Output<String> mask;

    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="regexp", required=true)
    private Output<String> regexp;

    public Output<String> regexp() {
        return this.regexp;
    }

    private CloudwatchSourceFilterArgs() {}

    private CloudwatchSourceFilterArgs(CloudwatchSourceFilterArgs $) {
        this.filterType = $.filterType;
        this.mask = $.mask;
        this.name = $.name;
        this.regexp = $.regexp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwatchSourceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwatchSourceFilterArgs $;

        public Builder() {
            $ = new CloudwatchSourceFilterArgs();
        }

        public Builder(CloudwatchSourceFilterArgs defaults) {
            $ = new CloudwatchSourceFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder regexp(Output<String> regexp) {
            $.regexp = regexp;
            return this;
        }

        public Builder regexp(String regexp) {
            return regexp(Output.of(regexp));
        }

        public CloudwatchSourceFilterArgs build() {
            if ($.filterType == null) {
                throw new MissingRequiredPropertyException("CloudwatchSourceFilterArgs", "filterType");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("CloudwatchSourceFilterArgs", "name");
            }
            if ($.regexp == null) {
                throw new MissingRequiredPropertyException("CloudwatchSourceFilterArgs", "regexp");
            }
            return $;
        }
    }

}