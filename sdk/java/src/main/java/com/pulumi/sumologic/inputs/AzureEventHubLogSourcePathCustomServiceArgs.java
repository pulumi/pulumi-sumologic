// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureEventHubLogSourcePathCustomServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureEventHubLogSourcePathCustomServiceArgs Empty = new AzureEventHubLogSourcePathCustomServiceArgs();

    @Import(name="prefixes")
    private @Nullable Output<List<String>> prefixes;

    public Optional<Output<List<String>>> prefixes() {
        return Optional.ofNullable(this.prefixes);
    }

    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private AzureEventHubLogSourcePathCustomServiceArgs() {}

    private AzureEventHubLogSourcePathCustomServiceArgs(AzureEventHubLogSourcePathCustomServiceArgs $) {
        this.prefixes = $.prefixes;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureEventHubLogSourcePathCustomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureEventHubLogSourcePathCustomServiceArgs $;

        public Builder() {
            $ = new AzureEventHubLogSourcePathCustomServiceArgs();
        }

        public Builder(AzureEventHubLogSourcePathCustomServiceArgs defaults) {
            $ = new AzureEventHubLogSourcePathCustomServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            $.prefixes = prefixes;
            return this;
        }

        public Builder prefixes(List<String> prefixes) {
            return prefixes(Output.of(prefixes));
        }

        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public AzureEventHubLogSourcePathCustomServiceArgs build() {
            return $;
        }
    }

}
