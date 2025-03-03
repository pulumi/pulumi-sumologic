// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureEventHubLogSourceFilter {
    private String filterType;
    private @Nullable String mask;
    private String name;
    private String regexp;

    private AzureEventHubLogSourceFilter() {}
    public String filterType() {
        return this.filterType;
    }
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }
    public String name() {
        return this.name;
    }
    public String regexp() {
        return this.regexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureEventHubLogSourceFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filterType;
        private @Nullable String mask;
        private String name;
        private String regexp;
        public Builder() {}
        public Builder(AzureEventHubLogSourceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.mask = defaults.mask;
    	      this.name = defaults.name;
    	      this.regexp = defaults.regexp;
        }

        @CustomType.Setter
        public Builder filterType(String filterType) {
            if (filterType == null) {
              throw new MissingRequiredPropertyException("AzureEventHubLogSourceFilter", "filterType");
            }
            this.filterType = filterType;
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {

            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AzureEventHubLogSourceFilter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder regexp(String regexp) {
            if (regexp == null) {
              throw new MissingRequiredPropertyException("AzureEventHubLogSourceFilter", "regexp");
            }
            this.regexp = regexp;
            return this;
        }
        public AzureEventHubLogSourceFilter build() {
            final var _resultValue = new AzureEventHubLogSourceFilter();
            _resultValue.filterType = filterType;
            _resultValue.mask = mask;
            _resultValue.name = name;
            _resultValue.regexp = regexp;
            return _resultValue;
        }
    }
}
