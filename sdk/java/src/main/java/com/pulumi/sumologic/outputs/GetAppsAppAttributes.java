// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsAppAttributes {
    private @Nullable List<String> categories;
    private @Nullable List<String> collections;
    private @Nullable List<String> useCases;

    private GetAppsAppAttributes() {}
    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    public List<String> collections() {
        return this.collections == null ? List.of() : this.collections;
    }
    public List<String> useCases() {
        return this.useCases == null ? List.of() : this.useCases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsAppAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> categories;
        private @Nullable List<String> collections;
        private @Nullable List<String> useCases;
        public Builder() {}
        public Builder(GetAppsAppAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.collections = defaults.collections;
    	      this.useCases = defaults.useCases;
        }

        @CustomType.Setter
        public Builder categories(@Nullable List<String> categories) {

            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        @CustomType.Setter
        public Builder collections(@Nullable List<String> collections) {

            this.collections = collections;
            return this;
        }
        public Builder collections(String... collections) {
            return collections(List.of(collections));
        }
        @CustomType.Setter
        public Builder useCases(@Nullable List<String> useCases) {

            this.useCases = useCases;
            return this;
        }
        public Builder useCases(String... useCases) {
            return useCases(List.of(useCases));
        }
        public GetAppsAppAttributes build() {
            final var _resultValue = new GetAppsAppAttributes();
            _resultValue.categories = categories;
            _resultValue.collections = collections;
            _resultValue.useCases = useCases;
            return _resultValue;
        }
    }
}
