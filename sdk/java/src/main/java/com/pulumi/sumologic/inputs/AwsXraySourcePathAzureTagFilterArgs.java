// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.AwsXraySourcePathAzureTagFilterTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsXraySourcePathAzureTagFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsXraySourcePathAzureTagFilterArgs Empty = new AwsXraySourcePathAzureTagFilterArgs();

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="tags")
    private @Nullable Output<List<AwsXraySourcePathAzureTagFilterTagArgs>> tags;

    public Optional<Output<List<AwsXraySourcePathAzureTagFilterTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AwsXraySourcePathAzureTagFilterArgs() {}

    private AwsXraySourcePathAzureTagFilterArgs(AwsXraySourcePathAzureTagFilterArgs $) {
        this.namespace = $.namespace;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsXraySourcePathAzureTagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsXraySourcePathAzureTagFilterArgs $;

        public Builder() {
            $ = new AwsXraySourcePathAzureTagFilterArgs();
        }

        public Builder(AwsXraySourcePathAzureTagFilterArgs defaults) {
            $ = new AwsXraySourcePathAzureTagFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder tags(@Nullable Output<List<AwsXraySourcePathAzureTagFilterTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AwsXraySourcePathAzureTagFilterTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AwsXraySourcePathAzureTagFilterTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AwsXraySourcePathAzureTagFilterArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AwsXraySourcePathAzureTagFilterArgs", "type");
            }
            return $;
        }
    }

}
