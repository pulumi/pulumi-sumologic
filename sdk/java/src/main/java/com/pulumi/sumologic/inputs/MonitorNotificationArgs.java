// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.MonitorNotificationNotificationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MonitorNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorNotificationArgs Empty = new MonitorNotificationArgs();

    @Import(name="notification", required=true)
    private Output<MonitorNotificationNotificationArgs> notification;

    public Output<MonitorNotificationNotificationArgs> notification() {
        return this.notification;
    }

    @Import(name="runForTriggerTypes", required=true)
    private Output<List<String>> runForTriggerTypes;

    public Output<List<String>> runForTriggerTypes() {
        return this.runForTriggerTypes;
    }

    private MonitorNotificationArgs() {}

    private MonitorNotificationArgs(MonitorNotificationArgs $) {
        this.notification = $.notification;
        this.runForTriggerTypes = $.runForTriggerTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorNotificationArgs $;

        public Builder() {
            $ = new MonitorNotificationArgs();
        }

        public Builder(MonitorNotificationArgs defaults) {
            $ = new MonitorNotificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder notification(Output<MonitorNotificationNotificationArgs> notification) {
            $.notification = notification;
            return this;
        }

        public Builder notification(MonitorNotificationNotificationArgs notification) {
            return notification(Output.of(notification));
        }

        public Builder runForTriggerTypes(Output<List<String>> runForTriggerTypes) {
            $.runForTriggerTypes = runForTriggerTypes;
            return this;
        }

        public Builder runForTriggerTypes(List<String> runForTriggerTypes) {
            return runForTriggerTypes(Output.of(runForTriggerTypes));
        }

        public Builder runForTriggerTypes(String... runForTriggerTypes) {
            return runForTriggerTypes(List.of(runForTriggerTypes));
        }

        public MonitorNotificationArgs build() {
            if ($.notification == null) {
                throw new MissingRequiredPropertyException("MonitorNotificationArgs", "notification");
            }
            if ($.runForTriggerTypes == null) {
                throw new MissingRequiredPropertyException("MonitorNotificationArgs", "runForTriggerTypes");
            }
            return $;
        }
    }

}