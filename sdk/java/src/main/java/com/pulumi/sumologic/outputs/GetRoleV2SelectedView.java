// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRoleV2SelectedView {
    private String viewFilter;
    private String viewName;

    private GetRoleV2SelectedView() {}
    public String viewFilter() {
        return this.viewFilter;
    }
    public String viewName() {
        return this.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleV2SelectedView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String viewFilter;
        private String viewName;
        public Builder() {}
        public Builder(GetRoleV2SelectedView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewFilter = defaults.viewFilter;
    	      this.viewName = defaults.viewName;
        }

        @CustomType.Setter
        public Builder viewFilter(String viewFilter) {
            if (viewFilter == null) {
              throw new MissingRequiredPropertyException("GetRoleV2SelectedView", "viewFilter");
            }
            this.viewFilter = viewFilter;
            return this;
        }
        @CustomType.Setter
        public Builder viewName(String viewName) {
            if (viewName == null) {
              throw new MissingRequiredPropertyException("GetRoleV2SelectedView", "viewName");
            }
            this.viewName = viewName;
            return this;
        }
        public GetRoleV2SelectedView build() {
            final var _resultValue = new GetRoleV2SelectedView();
            _resultValue.viewFilter = viewFilter;
            _resultValue.viewName = viewName;
            return _resultValue;
        }
    }
}