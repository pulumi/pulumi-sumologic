// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.GetAppsAppAttributes;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsApp {
    private List<String> accountTypes;
    private String appType;
    private @Nullable GetAppsAppAttributes attributes;
    private String author;
    private Boolean beta;
    private String description;
    private String family;
    private String icon;
    private Boolean installable;
    private Integer installs;
    private String latestVersion;
    private String name;
    private Boolean showOnMarketplace;
    private String uuid;

    private GetAppsApp() {}
    public List<String> accountTypes() {
        return this.accountTypes;
    }
    public String appType() {
        return this.appType;
    }
    public Optional<GetAppsAppAttributes> attributes() {
        return Optional.ofNullable(this.attributes);
    }
    public String author() {
        return this.author;
    }
    public Boolean beta() {
        return this.beta;
    }
    public String description() {
        return this.description;
    }
    public String family() {
        return this.family;
    }
    public String icon() {
        return this.icon;
    }
    public Boolean installable() {
        return this.installable;
    }
    public Integer installs() {
        return this.installs;
    }
    public String latestVersion() {
        return this.latestVersion;
    }
    public String name() {
        return this.name;
    }
    public Boolean showOnMarketplace() {
        return this.showOnMarketplace;
    }
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> accountTypes;
        private String appType;
        private @Nullable GetAppsAppAttributes attributes;
        private String author;
        private Boolean beta;
        private String description;
        private String family;
        private String icon;
        private Boolean installable;
        private Integer installs;
        private String latestVersion;
        private String name;
        private Boolean showOnMarketplace;
        private String uuid;
        public Builder() {}
        public Builder(GetAppsApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountTypes = defaults.accountTypes;
    	      this.appType = defaults.appType;
    	      this.attributes = defaults.attributes;
    	      this.author = defaults.author;
    	      this.beta = defaults.beta;
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.icon = defaults.icon;
    	      this.installable = defaults.installable;
    	      this.installs = defaults.installs;
    	      this.latestVersion = defaults.latestVersion;
    	      this.name = defaults.name;
    	      this.showOnMarketplace = defaults.showOnMarketplace;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accountTypes(List<String> accountTypes) {
            if (accountTypes == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "accountTypes");
            }
            this.accountTypes = accountTypes;
            return this;
        }
        public Builder accountTypes(String... accountTypes) {
            return accountTypes(List.of(accountTypes));
        }
        @CustomType.Setter
        public Builder appType(String appType) {
            if (appType == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "appType");
            }
            this.appType = appType;
            return this;
        }
        @CustomType.Setter
        public Builder attributes(@Nullable GetAppsAppAttributes attributes) {

            this.attributes = attributes;
            return this;
        }
        @CustomType.Setter
        public Builder author(String author) {
            if (author == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "author");
            }
            this.author = author;
            return this;
        }
        @CustomType.Setter
        public Builder beta(Boolean beta) {
            if (beta == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "beta");
            }
            this.beta = beta;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder icon(String icon) {
            if (icon == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "icon");
            }
            this.icon = icon;
            return this;
        }
        @CustomType.Setter
        public Builder installable(Boolean installable) {
            if (installable == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "installable");
            }
            this.installable = installable;
            return this;
        }
        @CustomType.Setter
        public Builder installs(Integer installs) {
            if (installs == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "installs");
            }
            this.installs = installs;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersion(String latestVersion) {
            if (latestVersion == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "latestVersion");
            }
            this.latestVersion = latestVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder showOnMarketplace(Boolean showOnMarketplace) {
            if (showOnMarketplace == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "showOnMarketplace");
            }
            this.showOnMarketplace = showOnMarketplace;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetAppsApp", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetAppsApp build() {
            final var _resultValue = new GetAppsApp();
            _resultValue.accountTypes = accountTypes;
            _resultValue.appType = appType;
            _resultValue.attributes = attributes;
            _resultValue.author = author;
            _resultValue.beta = beta;
            _resultValue.description = description;
            _resultValue.family = family;
            _resultValue.icon = icon;
            _resultValue.installable = installable;
            _resultValue.installs = installs;
            _resultValue.latestVersion = latestVersion;
            _resultValue.name = name;
            _resultValue.showOnMarketplace = showOnMarketplace;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
