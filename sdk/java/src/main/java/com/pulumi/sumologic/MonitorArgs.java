// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.MonitorNotificationArgs;
import com.pulumi.sumologic.inputs.MonitorObjPermissionArgs;
import com.pulumi.sumologic.inputs.MonitorQueryArgs;
import com.pulumi.sumologic.inputs.MonitorTriggerArgs;
import com.pulumi.sumologic.inputs.MonitorTriggerConditionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorArgs Empty = new MonitorArgs();

    /**
     * The display name when creating alerts. Monitor name will be used if `alert_name` is not provided. All template variables can be used in `alert_name` except `{{AlertName}}`, `{{AlertResponseURL}}` and `{{ResultsJson}}`.
     * 
     */
    @Import(name="alertName")
    private @Nullable Output<String> alertName;

    /**
     * @return The display name when creating alerts. Monitor name will be used if `alert_name` is not provided. All template variables can be used in `alert_name` except `{{AlertName}}`, `{{AlertResponseURL}}` and `{{ResultsJson}}`.
     * 
     */
    public Optional<Output<String>> alertName() {
        return Optional.ofNullable(this.alertName);
    }

    /**
     * The type of the content object. Valid value:
     * - `Monitor`
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The type of the content object. Valid value:
     * - `Monitor`
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The description of the monitor.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the monitor.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="evaluationDelay")
    private @Nullable Output<String> evaluationDelay;

    public Optional<Output<String>> evaluationDelay() {
        return Optional.ofNullable(this.evaluationDelay);
    }

    /**
     * Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
     * 
     */
    @Import(name="groupNotifications")
    private @Nullable Output<Boolean> groupNotifications;

    /**
     * @return Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> groupNotifications() {
        return Optional.ofNullable(this.groupNotifications);
    }

    /**
     * Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
     * 
     */
    @Import(name="isDisabled")
    private @Nullable Output<Boolean> isDisabled;

    /**
     * @return Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
     * 
     */
    public Optional<Output<Boolean>> isDisabled() {
        return Optional.ofNullable(this.isDisabled);
    }

    @Import(name="isLocked")
    private @Nullable Output<Boolean> isLocked;

    public Optional<Output<Boolean>> isLocked() {
        return Optional.ofNullable(this.isLocked);
    }

    @Import(name="isMutable")
    private @Nullable Output<Boolean> isMutable;

    public Optional<Output<Boolean>> isMutable() {
        return Optional.ofNullable(this.isMutable);
    }

    @Import(name="isSystem")
    private @Nullable Output<Boolean> isSystem;

    public Optional<Output<Boolean>> isSystem() {
        return Optional.ofNullable(this.isSystem);
    }

    @Import(name="modifiedAt")
    private @Nullable Output<String> modifiedAt;

    public Optional<Output<String>> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }

    @Import(name="modifiedBy")
    private @Nullable Output<String> modifiedBy;

    public Optional<Output<String>> modifiedBy() {
        return Optional.ofNullable(this.modifiedBy);
    }

    /**
     * The type of monitor. Valid values:
     * - `Logs`: A logs query monitor.
     * - `Metrics`: A metrics query monitor.
     * - `Slo`: A SLO based monitor  (beta).
     * 
     */
    @Import(name="monitorType", required=true)
    private Output<String> monitorType;

    /**
     * @return The type of monitor. Valid values:
     * - `Logs`: A logs query monitor.
     * - `Metrics`: A metrics query monitor.
     * - `Slo`: A SLO based monitor  (beta).
     * 
     */
    public Output<String> monitorType() {
        return this.monitorType;
    }

    /**
     * The name of the monitor. The name must be alphanumeric.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the monitor. The name must be alphanumeric.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The set of fields to be used to group alerts and notifications for a monitor. The value of this field will be considered only when &#39;groupNotifications&#39; is true.
     * 
     */
    @Import(name="notificationGroupFields")
    private @Nullable Output<List<String>> notificationGroupFields;

    /**
     * @return The set of fields to be used to group alerts and notifications for a monitor. The value of this field will be considered only when &#39;groupNotifications&#39; is true.
     * 
     */
    public Optional<Output<List<String>>> notificationGroupFields() {
        return Optional.ofNullable(this.notificationGroupFields);
    }

    /**
     * The notifications the monitor will send when the respective trigger condition is met.
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<MonitorNotificationArgs>> notifications;

    /**
     * @return The notifications the monitor will send when the respective trigger condition is met.
     * 
     */
    public Optional<Output<List<MonitorNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * `obj_permission` construct represents a Permission Statement associated with this Monitor. A set of `obj_permission` constructs can be specified under a Monitor. An `obj_permission` construct can be used to control permissions Explicitly associated with a Monitor. But, it cannot be used to control permissions Inherited from a Parent / Ancestor. Default FGP would be still set to the Monitor upon creation (e.g. the creating user would have full permission), even if no `obj_permission` construct is specified at a Monitor and the FGP feature is enabled at the account.
     * 
     */
    @Import(name="objPermissions")
    private @Nullable Output<List<MonitorObjPermissionArgs>> objPermissions;

    /**
     * @return `obj_permission` construct represents a Permission Statement associated with this Monitor. A set of `obj_permission` constructs can be specified under a Monitor. An `obj_permission` construct can be used to control permissions Explicitly associated with a Monitor. But, it cannot be used to control permissions Inherited from a Parent / Ancestor. Default FGP would be still set to the Monitor upon creation (e.g. the creating user would have full permission), even if no `obj_permission` construct is specified at a Monitor and the FGP feature is enabled at the account.
     * 
     */
    public Optional<Output<List<MonitorObjPermissionArgs>>> objPermissions() {
        return Optional.ofNullable(this.objPermissions);
    }

    /**
     * The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    /**
     * @return The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
     * 
     */
    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    /**
     * Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
     * 
     */
    @Import(name="playbook")
    private @Nullable Output<String> playbook;

    /**
     * @return Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
     * 
     */
    public Optional<Output<String>> playbook() {
        return Optional.ofNullable(this.playbook);
    }

    @Import(name="postRequestMap")
    private @Nullable Output<Map<String,String>> postRequestMap;

    public Optional<Output<Map<String,String>>> postRequestMap() {
        return Optional.ofNullable(this.postRequestMap);
    }

    /**
     * All queries from the monitor.
     * 
     */
    @Import(name="queries")
    private @Nullable Output<List<MonitorQueryArgs>> queries;

    /**
     * @return All queries from the monitor.
     * 
     */
    public Optional<Output<List<MonitorQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * Identifier of the SLO definition for the monitor. This is only applicable &amp; required for Slo `monitor_type`.
     * 
     */
    @Import(name="sloId")
    private @Nullable Output<String> sloId;

    /**
     * @return Identifier of the SLO definition for the monitor. This is only applicable &amp; required for Slo `monitor_type`.
     * 
     */
    public Optional<Output<String>> sloId() {
        return Optional.ofNullable(this.sloId);
    }

    /**
     * The current status for this monitor. Values are:
     * - `Critical`
     * - `Warning`
     * - `MissingData`
     * - `Normal`
     * - `Disabled`
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<String>> statuses;

    /**
     * @return The current status for this monitor. Values are:
     * - `Critical`
     * - `Warning`
     * - `MissingData`
     * - `Normal`
     * - `Disabled`
     * 
     */
    public Optional<Output<List<String>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * Defines the conditions of when to send notifications. NOTE: `trigger_conditions` supplants the `triggers` argument.
     * 
     */
    @Import(name="triggerConditions")
    private @Nullable Output<MonitorTriggerConditionsArgs> triggerConditions;

    /**
     * @return Defines the conditions of when to send notifications. NOTE: `trigger_conditions` supplants the `triggers` argument.
     * 
     */
    public Optional<Output<MonitorTriggerConditionsArgs>> triggerConditions() {
        return Optional.ofNullable(this.triggerConditions);
    }

    /**
     * Defines the conditions of when to send notifications.
     * 
     * @deprecated
     * The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
     * 
     */
    @Deprecated /* The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead. */
    @Import(name="triggers")
    private @Nullable Output<List<MonitorTriggerArgs>> triggers;

    /**
     * @return Defines the conditions of when to send notifications.
     * 
     * @deprecated
     * The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
     * 
     */
    @Deprecated /* The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead. */
    public Optional<Output<List<MonitorTriggerArgs>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    /**
     * The type of object model. Valid value:
     * - `MonitorsLibraryMonitor`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of object model. Valid value:
     * - `MonitorsLibraryMonitor`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private MonitorArgs() {}

    private MonitorArgs(MonitorArgs $) {
        this.alertName = $.alertName;
        this.contentType = $.contentType;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.description = $.description;
        this.evaluationDelay = $.evaluationDelay;
        this.groupNotifications = $.groupNotifications;
        this.isDisabled = $.isDisabled;
        this.isLocked = $.isLocked;
        this.isMutable = $.isMutable;
        this.isSystem = $.isSystem;
        this.modifiedAt = $.modifiedAt;
        this.modifiedBy = $.modifiedBy;
        this.monitorType = $.monitorType;
        this.name = $.name;
        this.notificationGroupFields = $.notificationGroupFields;
        this.notifications = $.notifications;
        this.objPermissions = $.objPermissions;
        this.parentId = $.parentId;
        this.playbook = $.playbook;
        this.postRequestMap = $.postRequestMap;
        this.queries = $.queries;
        this.sloId = $.sloId;
        this.statuses = $.statuses;
        this.triggerConditions = $.triggerConditions;
        this.triggers = $.triggers;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorArgs $;

        public Builder() {
            $ = new MonitorArgs();
        }

        public Builder(MonitorArgs defaults) {
            $ = new MonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertName The display name when creating alerts. Monitor name will be used if `alert_name` is not provided. All template variables can be used in `alert_name` except `{{AlertName}}`, `{{AlertResponseURL}}` and `{{ResultsJson}}`.
         * 
         * @return builder
         * 
         */
        public Builder alertName(@Nullable Output<String> alertName) {
            $.alertName = alertName;
            return this;
        }

        /**
         * @param alertName The display name when creating alerts. Monitor name will be used if `alert_name` is not provided. All template variables can be used in `alert_name` except `{{AlertName}}`, `{{AlertResponseURL}}` and `{{ResultsJson}}`.
         * 
         * @return builder
         * 
         */
        public Builder alertName(String alertName) {
            return alertName(Output.of(alertName));
        }

        /**
         * @param contentType The type of the content object. Valid value:
         * - `Monitor`
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The type of the content object. Valid value:
         * - `Monitor`
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param description The description of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder evaluationDelay(@Nullable Output<String> evaluationDelay) {
            $.evaluationDelay = evaluationDelay;
            return this;
        }

        public Builder evaluationDelay(String evaluationDelay) {
            return evaluationDelay(Output.of(evaluationDelay));
        }

        /**
         * @param groupNotifications Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder groupNotifications(@Nullable Output<Boolean> groupNotifications) {
            $.groupNotifications = groupNotifications;
            return this;
        }

        /**
         * @param groupNotifications Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder groupNotifications(Boolean groupNotifications) {
            return groupNotifications(Output.of(groupNotifications));
        }

        /**
         * @param isDisabled Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
         * 
         * @return builder
         * 
         */
        public Builder isDisabled(@Nullable Output<Boolean> isDisabled) {
            $.isDisabled = isDisabled;
            return this;
        }

        /**
         * @param isDisabled Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
         * 
         * @return builder
         * 
         */
        public Builder isDisabled(Boolean isDisabled) {
            return isDisabled(Output.of(isDisabled));
        }

        public Builder isLocked(@Nullable Output<Boolean> isLocked) {
            $.isLocked = isLocked;
            return this;
        }

        public Builder isLocked(Boolean isLocked) {
            return isLocked(Output.of(isLocked));
        }

        public Builder isMutable(@Nullable Output<Boolean> isMutable) {
            $.isMutable = isMutable;
            return this;
        }

        public Builder isMutable(Boolean isMutable) {
            return isMutable(Output.of(isMutable));
        }

        public Builder isSystem(@Nullable Output<Boolean> isSystem) {
            $.isSystem = isSystem;
            return this;
        }

        public Builder isSystem(Boolean isSystem) {
            return isSystem(Output.of(isSystem));
        }

        public Builder modifiedAt(@Nullable Output<String> modifiedAt) {
            $.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(String modifiedAt) {
            return modifiedAt(Output.of(modifiedAt));
        }

        public Builder modifiedBy(@Nullable Output<String> modifiedBy) {
            $.modifiedBy = modifiedBy;
            return this;
        }

        public Builder modifiedBy(String modifiedBy) {
            return modifiedBy(Output.of(modifiedBy));
        }

        /**
         * @param monitorType The type of monitor. Valid values:
         * - `Logs`: A logs query monitor.
         * - `Metrics`: A metrics query monitor.
         * - `Slo`: A SLO based monitor  (beta).
         * 
         * @return builder
         * 
         */
        public Builder monitorType(Output<String> monitorType) {
            $.monitorType = monitorType;
            return this;
        }

        /**
         * @param monitorType The type of monitor. Valid values:
         * - `Logs`: A logs query monitor.
         * - `Metrics`: A metrics query monitor.
         * - `Slo`: A SLO based monitor  (beta).
         * 
         * @return builder
         * 
         */
        public Builder monitorType(String monitorType) {
            return monitorType(Output.of(monitorType));
        }

        /**
         * @param name The name of the monitor. The name must be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the monitor. The name must be alphanumeric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationGroupFields The set of fields to be used to group alerts and notifications for a monitor. The value of this field will be considered only when &#39;groupNotifications&#39; is true.
         * 
         * @return builder
         * 
         */
        public Builder notificationGroupFields(@Nullable Output<List<String>> notificationGroupFields) {
            $.notificationGroupFields = notificationGroupFields;
            return this;
        }

        /**
         * @param notificationGroupFields The set of fields to be used to group alerts and notifications for a monitor. The value of this field will be considered only when &#39;groupNotifications&#39; is true.
         * 
         * @return builder
         * 
         */
        public Builder notificationGroupFields(List<String> notificationGroupFields) {
            return notificationGroupFields(Output.of(notificationGroupFields));
        }

        /**
         * @param notificationGroupFields The set of fields to be used to group alerts and notifications for a monitor. The value of this field will be considered only when &#39;groupNotifications&#39; is true.
         * 
         * @return builder
         * 
         */
        public Builder notificationGroupFields(String... notificationGroupFields) {
            return notificationGroupFields(List.of(notificationGroupFields));
        }

        /**
         * @param notifications The notifications the monitor will send when the respective trigger condition is met.
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<MonitorNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications The notifications the monitor will send when the respective trigger condition is met.
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<MonitorNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications The notifications the monitor will send when the respective trigger condition is met.
         * 
         * @return builder
         * 
         */
        public Builder notifications(MonitorNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param objPermissions `obj_permission` construct represents a Permission Statement associated with this Monitor. A set of `obj_permission` constructs can be specified under a Monitor. An `obj_permission` construct can be used to control permissions Explicitly associated with a Monitor. But, it cannot be used to control permissions Inherited from a Parent / Ancestor. Default FGP would be still set to the Monitor upon creation (e.g. the creating user would have full permission), even if no `obj_permission` construct is specified at a Monitor and the FGP feature is enabled at the account.
         * 
         * @return builder
         * 
         */
        public Builder objPermissions(@Nullable Output<List<MonitorObjPermissionArgs>> objPermissions) {
            $.objPermissions = objPermissions;
            return this;
        }

        /**
         * @param objPermissions `obj_permission` construct represents a Permission Statement associated with this Monitor. A set of `obj_permission` constructs can be specified under a Monitor. An `obj_permission` construct can be used to control permissions Explicitly associated with a Monitor. But, it cannot be used to control permissions Inherited from a Parent / Ancestor. Default FGP would be still set to the Monitor upon creation (e.g. the creating user would have full permission), even if no `obj_permission` construct is specified at a Monitor and the FGP feature is enabled at the account.
         * 
         * @return builder
         * 
         */
        public Builder objPermissions(List<MonitorObjPermissionArgs> objPermissions) {
            return objPermissions(Output.of(objPermissions));
        }

        /**
         * @param objPermissions `obj_permission` construct represents a Permission Statement associated with this Monitor. A set of `obj_permission` constructs can be specified under a Monitor. An `obj_permission` construct can be used to control permissions Explicitly associated with a Monitor. But, it cannot be used to control permissions Inherited from a Parent / Ancestor. Default FGP would be still set to the Monitor upon creation (e.g. the creating user would have full permission), even if no `obj_permission` construct is specified at a Monitor and the FGP feature is enabled at the account.
         * 
         * @return builder
         * 
         */
        public Builder objPermissions(MonitorObjPermissionArgs... objPermissions) {
            return objPermissions(List.of(objPermissions));
        }

        /**
         * @param parentId The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param playbook Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
         * 
         * @return builder
         * 
         */
        public Builder playbook(@Nullable Output<String> playbook) {
            $.playbook = playbook;
            return this;
        }

        /**
         * @param playbook Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
         * 
         * @return builder
         * 
         */
        public Builder playbook(String playbook) {
            return playbook(Output.of(playbook));
        }

        public Builder postRequestMap(@Nullable Output<Map<String,String>> postRequestMap) {
            $.postRequestMap = postRequestMap;
            return this;
        }

        public Builder postRequestMap(Map<String,String> postRequestMap) {
            return postRequestMap(Output.of(postRequestMap));
        }

        /**
         * @param queries All queries from the monitor.
         * 
         * @return builder
         * 
         */
        public Builder queries(@Nullable Output<List<MonitorQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        /**
         * @param queries All queries from the monitor.
         * 
         * @return builder
         * 
         */
        public Builder queries(List<MonitorQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        /**
         * @param queries All queries from the monitor.
         * 
         * @return builder
         * 
         */
        public Builder queries(MonitorQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param sloId Identifier of the SLO definition for the monitor. This is only applicable &amp; required for Slo `monitor_type`.
         * 
         * @return builder
         * 
         */
        public Builder sloId(@Nullable Output<String> sloId) {
            $.sloId = sloId;
            return this;
        }

        /**
         * @param sloId Identifier of the SLO definition for the monitor. This is only applicable &amp; required for Slo `monitor_type`.
         * 
         * @return builder
         * 
         */
        public Builder sloId(String sloId) {
            return sloId(Output.of(sloId));
        }

        /**
         * @param statuses The current status for this monitor. Values are:
         * - `Critical`
         * - `Warning`
         * - `MissingData`
         * - `Normal`
         * - `Disabled`
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<String>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses The current status for this monitor. Values are:
         * - `Critical`
         * - `Warning`
         * - `MissingData`
         * - `Normal`
         * - `Disabled`
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<String> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses The current status for this monitor. Values are:
         * - `Critical`
         * - `Warning`
         * - `MissingData`
         * - `Normal`
         * - `Disabled`
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param triggerConditions Defines the conditions of when to send notifications. NOTE: `trigger_conditions` supplants the `triggers` argument.
         * 
         * @return builder
         * 
         */
        public Builder triggerConditions(@Nullable Output<MonitorTriggerConditionsArgs> triggerConditions) {
            $.triggerConditions = triggerConditions;
            return this;
        }

        /**
         * @param triggerConditions Defines the conditions of when to send notifications. NOTE: `trigger_conditions` supplants the `triggers` argument.
         * 
         * @return builder
         * 
         */
        public Builder triggerConditions(MonitorTriggerConditionsArgs triggerConditions) {
            return triggerConditions(Output.of(triggerConditions));
        }

        /**
         * @param triggers Defines the conditions of when to send notifications.
         * 
         * @return builder
         * 
         * @deprecated
         * The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
         * 
         */
        @Deprecated /* The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead. */
        public Builder triggers(@Nullable Output<List<MonitorTriggerArgs>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Defines the conditions of when to send notifications.
         * 
         * @return builder
         * 
         * @deprecated
         * The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
         * 
         */
        @Deprecated /* The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead. */
        public Builder triggers(List<MonitorTriggerArgs> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers Defines the conditions of when to send notifications.
         * 
         * @return builder
         * 
         * @deprecated
         * The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
         * 
         */
        @Deprecated /* The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead. */
        public Builder triggers(MonitorTriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }

        /**
         * @param type The type of object model. Valid value:
         * - `MonitorsLibraryMonitor`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of object model. Valid value:
         * - `MonitorsLibraryMonitor`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public MonitorArgs build() {
            $.monitorType = Objects.requireNonNull($.monitorType, "expected parameter 'monitorType' to be non-null");
            return $;
        }
    }

}