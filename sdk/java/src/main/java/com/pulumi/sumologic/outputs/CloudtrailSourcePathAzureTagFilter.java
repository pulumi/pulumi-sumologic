// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.CloudtrailSourcePathAzureTagFilterTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudtrailSourcePathAzureTagFilter {
    private @Nullable String namespace;
    private @Nullable List<CloudtrailSourcePathAzureTagFilterTag> tags;
    private String type;

    private CloudtrailSourcePathAzureTagFilter() {}
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public List<CloudtrailSourcePathAzureTagFilterTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudtrailSourcePathAzureTagFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String namespace;
        private @Nullable List<CloudtrailSourcePathAzureTagFilterTag> tags;
        private String type;
        public Builder() {}
        public Builder(CloudtrailSourcePathAzureTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<CloudtrailSourcePathAzureTagFilterTag> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(CloudtrailSourcePathAzureTagFilterTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("CloudtrailSourcePathAzureTagFilter", "type");
            }
            this.type = type;
            return this;
        }
        public CloudtrailSourcePathAzureTagFilter build() {
            final var _resultValue = new CloudtrailSourcePathAzureTagFilter();
            _resultValue.namespace = namespace;
            _resultValue.tags = tags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
