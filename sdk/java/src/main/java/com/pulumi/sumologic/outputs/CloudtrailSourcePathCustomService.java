// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudtrailSourcePathCustomService {
    private @Nullable List<String> prefixes;
    private @Nullable String serviceName;

    private CloudtrailSourcePathCustomService() {}
    public List<String> prefixes() {
        return this.prefixes == null ? List.of() : this.prefixes;
    }
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudtrailSourcePathCustomService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> prefixes;
        private @Nullable String serviceName;
        public Builder() {}
        public Builder(CloudtrailSourcePathCustomService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefixes = defaults.prefixes;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder prefixes(@Nullable List<String> prefixes) {

            this.prefixes = prefixes;
            return this;
        }
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }
        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {

            this.serviceName = serviceName;
            return this;
        }
        public CloudtrailSourcePathCustomService build() {
            final var _resultValue = new CloudtrailSourcePathCustomService();
            _resultValue.prefixes = prefixes;
            _resultValue.serviceName = serviceName;
            return _resultValue;
        }
    }
}