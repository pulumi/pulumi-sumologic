// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.RoleV2SelectedViewArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleV2Args extends com.pulumi.resources.ResourceArgs {

    public static final RoleV2Args Empty = new RoleV2Args();

    /**
     * A search filter which would be applied on partitions which belong to Audit Data product area. Help Doc : (https://help.sumologic.com/docs/manage/security/audit-index/).
     * 
     */
    @Import(name="auditDataFilter")
    private @Nullable Output<String> auditDataFilter;

    /**
     * @return A search filter which would be applied on partitions which belong to Audit Data product area. Help Doc : (https://help.sumologic.com/docs/manage/security/audit-index/).
     * 
     */
    public Optional<Output<String>> auditDataFilter() {
        return Optional.ofNullable(this.auditDataFilter);
    }

    /**
     * List of [capabilities](https://help.sumologic.com/docs/manage/users-roles/roles/role-capabilities/) associated with this role.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<String>> capabilities;

    /**
     * @return List of [capabilities](https://help.sumologic.com/docs/manage/users-roles/roles/role-capabilities/) associated with this role.
     * 
     */
    public Optional<Output<List<String>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * Description of the role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A search filter which would be applied on partitions which belong to Log Analytics product area.
     * 
     */
    @Import(name="logAnalyticsFilter")
    private @Nullable Output<String> logAnalyticsFilter;

    /**
     * @return A search filter which would be applied on partitions which belong to Log Analytics product area.
     * 
     */
    public Optional<Output<String>> logAnalyticsFilter() {
        return Optional.ofNullable(this.logAnalyticsFilter);
    }

    /**
     * Name of the role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A search filter which would be applied on partitions which belong to Security Data product area.
     * 
     */
    @Import(name="securityDataFilter")
    private @Nullable Output<String> securityDataFilter;

    /**
     * @return A search filter which would be applied on partitions which belong to Security Data product area.
     * 
     */
    public Optional<Output<String>> securityDataFilter() {
        return Optional.ofNullable(this.securityDataFilter);
    }

    /**
     * List of views with specific view level filters in accordance to the selectionType chosen.
     * 
     */
    @Import(name="selectedViews")
    private @Nullable Output<List<RoleV2SelectedViewArgs>> selectedViews;

    /**
     * @return List of views with specific view level filters in accordance to the selectionType chosen.
     * 
     */
    public Optional<Output<List<RoleV2SelectedViewArgs>>> selectedViews() {
        return Optional.ofNullable(this.selectedViews);
    }

    /**
     * Describes the Permission Construct for the list of views in &#34;selectedViews&#34; parameter.
     * 
     */
    @Import(name="selectionType")
    private @Nullable Output<String> selectionType;

    /**
     * @return Describes the Permission Construct for the list of views in &#34;selectedViews&#34; parameter.
     * 
     */
    public Optional<Output<String>> selectionType() {
        return Optional.ofNullable(this.selectionType);
    }

    private RoleV2Args() {}

    private RoleV2Args(RoleV2Args $) {
        this.auditDataFilter = $.auditDataFilter;
        this.capabilities = $.capabilities;
        this.description = $.description;
        this.logAnalyticsFilter = $.logAnalyticsFilter;
        this.name = $.name;
        this.securityDataFilter = $.securityDataFilter;
        this.selectedViews = $.selectedViews;
        this.selectionType = $.selectionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleV2Args $;

        public Builder() {
            $ = new RoleV2Args();
        }

        public Builder(RoleV2Args defaults) {
            $ = new RoleV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditDataFilter A search filter which would be applied on partitions which belong to Audit Data product area. Help Doc : (https://help.sumologic.com/docs/manage/security/audit-index/).
         * 
         * @return builder
         * 
         */
        public Builder auditDataFilter(@Nullable Output<String> auditDataFilter) {
            $.auditDataFilter = auditDataFilter;
            return this;
        }

        /**
         * @param auditDataFilter A search filter which would be applied on partitions which belong to Audit Data product area. Help Doc : (https://help.sumologic.com/docs/manage/security/audit-index/).
         * 
         * @return builder
         * 
         */
        public Builder auditDataFilter(String auditDataFilter) {
            return auditDataFilter(Output.of(auditDataFilter));
        }

        /**
         * @param capabilities List of [capabilities](https://help.sumologic.com/docs/manage/users-roles/roles/role-capabilities/) associated with this role.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable Output<List<String>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities List of [capabilities](https://help.sumologic.com/docs/manage/users-roles/roles/role-capabilities/) associated with this role.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<String> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities List of [capabilities](https://help.sumologic.com/docs/manage/users-roles/roles/role-capabilities/) associated with this role.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param description Description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param logAnalyticsFilter A search filter which would be applied on partitions which belong to Log Analytics product area.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsFilter(@Nullable Output<String> logAnalyticsFilter) {
            $.logAnalyticsFilter = logAnalyticsFilter;
            return this;
        }

        /**
         * @param logAnalyticsFilter A search filter which would be applied on partitions which belong to Log Analytics product area.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsFilter(String logAnalyticsFilter) {
            return logAnalyticsFilter(Output.of(logAnalyticsFilter));
        }

        /**
         * @param name Name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param securityDataFilter A search filter which would be applied on partitions which belong to Security Data product area.
         * 
         * @return builder
         * 
         */
        public Builder securityDataFilter(@Nullable Output<String> securityDataFilter) {
            $.securityDataFilter = securityDataFilter;
            return this;
        }

        /**
         * @param securityDataFilter A search filter which would be applied on partitions which belong to Security Data product area.
         * 
         * @return builder
         * 
         */
        public Builder securityDataFilter(String securityDataFilter) {
            return securityDataFilter(Output.of(securityDataFilter));
        }

        /**
         * @param selectedViews List of views with specific view level filters in accordance to the selectionType chosen.
         * 
         * @return builder
         * 
         */
        public Builder selectedViews(@Nullable Output<List<RoleV2SelectedViewArgs>> selectedViews) {
            $.selectedViews = selectedViews;
            return this;
        }

        /**
         * @param selectedViews List of views with specific view level filters in accordance to the selectionType chosen.
         * 
         * @return builder
         * 
         */
        public Builder selectedViews(List<RoleV2SelectedViewArgs> selectedViews) {
            return selectedViews(Output.of(selectedViews));
        }

        /**
         * @param selectedViews List of views with specific view level filters in accordance to the selectionType chosen.
         * 
         * @return builder
         * 
         */
        public Builder selectedViews(RoleV2SelectedViewArgs... selectedViews) {
            return selectedViews(List.of(selectedViews));
        }

        /**
         * @param selectionType Describes the Permission Construct for the list of views in &#34;selectedViews&#34; parameter.
         * 
         * @return builder
         * 
         */
        public Builder selectionType(@Nullable Output<String> selectionType) {
            $.selectionType = selectionType;
            return this;
        }

        /**
         * @param selectionType Describes the Permission Construct for the list of views in &#34;selectedViews&#34; parameter.
         * 
         * @return builder
         * 
         */
        public Builder selectionType(String selectionType) {
            return selectionType(Output.of(selectionType));
        }

        public RoleV2Args build() {
            return $;
        }
    }

}