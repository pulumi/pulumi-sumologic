// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPanelServiceMapPanel {
    private @Nullable String application;
    private @Nullable String environment;
    private @Nullable String id;
    private @Nullable Boolean keepVisualSettingsConsistentWithParent;
    private String key;
    private @Nullable String service;
    private @Nullable Boolean showRemoteServices;
    /**
     * @return Title of the dashboard.
     * 
     */
    private @Nullable String title;
    private @Nullable String visualSettings;

    private DashboardPanelServiceMapPanel() {}
    public Optional<String> application() {
        return Optional.ofNullable(this.application);
    }
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Boolean> keepVisualSettingsConsistentWithParent() {
        return Optional.ofNullable(this.keepVisualSettingsConsistentWithParent);
    }
    public String key() {
        return this.key;
    }
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    public Optional<Boolean> showRemoteServices() {
        return Optional.ofNullable(this.showRemoteServices);
    }
    /**
     * @return Title of the dashboard.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> visualSettings() {
        return Optional.ofNullable(this.visualSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPanelServiceMapPanel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String application;
        private @Nullable String environment;
        private @Nullable String id;
        private @Nullable Boolean keepVisualSettingsConsistentWithParent;
        private String key;
        private @Nullable String service;
        private @Nullable Boolean showRemoteServices;
        private @Nullable String title;
        private @Nullable String visualSettings;
        public Builder() {}
        public Builder(DashboardPanelServiceMapPanel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.environment = defaults.environment;
    	      this.id = defaults.id;
    	      this.keepVisualSettingsConsistentWithParent = defaults.keepVisualSettingsConsistentWithParent;
    	      this.key = defaults.key;
    	      this.service = defaults.service;
    	      this.showRemoteServices = defaults.showRemoteServices;
    	      this.title = defaults.title;
    	      this.visualSettings = defaults.visualSettings;
        }

        @CustomType.Setter
        public Builder application(@Nullable String application) {

            this.application = application;
            return this;
        }
        @CustomType.Setter
        public Builder environment(@Nullable String environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keepVisualSettingsConsistentWithParent(@Nullable Boolean keepVisualSettingsConsistentWithParent) {

            this.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("DashboardPanelServiceMapPanel", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable String service) {

            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder showRemoteServices(@Nullable Boolean showRemoteServices) {

            this.showRemoteServices = showRemoteServices;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder visualSettings(@Nullable String visualSettings) {

            this.visualSettings = visualSettings;
            return this;
        }
        public DashboardPanelServiceMapPanel build() {
            final var _resultValue = new DashboardPanelServiceMapPanel();
            _resultValue.application = application;
            _resultValue.environment = environment;
            _resultValue.id = id;
            _resultValue.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            _resultValue.key = key;
            _resultValue.service = service;
            _resultValue.showRemoteServices = showRemoteServices;
            _resultValue.title = title;
            _resultValue.visualSettings = visualSettings;
            return _resultValue;
        }
    }
}
