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
public final class RoleV2SelectedView {
    private @Nullable String viewFilter;
    private String viewName;

    private RoleV2SelectedView() {}
    public Optional<String> viewFilter() {
        return Optional.ofNullable(this.viewFilter);
    }
    public String viewName() {
        return this.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleV2SelectedView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String viewFilter;
        private String viewName;
        public Builder() {}
        public Builder(RoleV2SelectedView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewFilter = defaults.viewFilter;
    	      this.viewName = defaults.viewName;
        }

        @CustomType.Setter
        public Builder viewFilter(@Nullable String viewFilter) {

            this.viewFilter = viewFilter;
            return this;
        }
        @CustomType.Setter
        public Builder viewName(String viewName) {
            if (viewName == null) {
              throw new MissingRequiredPropertyException("RoleV2SelectedView", "viewName");
            }
            this.viewName = viewName;
            return this;
        }
        public RoleV2SelectedView build() {
            final var _resultValue = new RoleV2SelectedView();
            _resultValue.viewFilter = viewFilter;
            _resultValue.viewName = viewName;
            return _resultValue;
        }
    }
}