// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.LogSearchScheduleNotificationArgs;
import com.pulumi.sumologic.inputs.LogSearchScheduleParameterArgs;
import com.pulumi.sumologic.inputs.LogSearchScheduleParseableTimeRangeArgs;
import com.pulumi.sumologic.inputs.LogSearchScheduleThresholdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogSearchScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchScheduleArgs Empty = new LogSearchScheduleArgs();

    @Import(name="cronExpression")
    private @Nullable Output<String> cronExpression;

    public Optional<Output<String>> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }

    @Import(name="muteErrorEmails")
    private @Nullable Output<Boolean> muteErrorEmails;

    public Optional<Output<Boolean>> muteErrorEmails() {
        return Optional.ofNullable(this.muteErrorEmails);
    }

    @Import(name="notification", required=true)
    private Output<LogSearchScheduleNotificationArgs> notification;

    public Output<LogSearchScheduleNotificationArgs> notification() {
        return this.notification;
    }

    @Import(name="parameters")
    private @Nullable Output<List<LogSearchScheduleParameterArgs>> parameters;

    public Optional<Output<List<LogSearchScheduleParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="parseableTimeRange", required=true)
    private Output<LogSearchScheduleParseableTimeRangeArgs> parseableTimeRange;

    public Output<LogSearchScheduleParseableTimeRangeArgs> parseableTimeRange() {
        return this.parseableTimeRange;
    }

    @Import(name="scheduleType", required=true)
    private Output<String> scheduleType;

    public Output<String> scheduleType() {
        return this.scheduleType;
    }

    @Import(name="threshold")
    private @Nullable Output<LogSearchScheduleThresholdArgs> threshold;

    public Optional<Output<LogSearchScheduleThresholdArgs>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone;
    }

    private LogSearchScheduleArgs() {}

    private LogSearchScheduleArgs(LogSearchScheduleArgs $) {
        this.cronExpression = $.cronExpression;
        this.muteErrorEmails = $.muteErrorEmails;
        this.notification = $.notification;
        this.parameters = $.parameters;
        this.parseableTimeRange = $.parseableTimeRange;
        this.scheduleType = $.scheduleType;
        this.threshold = $.threshold;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchScheduleArgs $;

        public Builder() {
            $ = new LogSearchScheduleArgs();
        }

        public Builder(LogSearchScheduleArgs defaults) {
            $ = new LogSearchScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder cronExpression(@Nullable Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        public Builder muteErrorEmails(@Nullable Output<Boolean> muteErrorEmails) {
            $.muteErrorEmails = muteErrorEmails;
            return this;
        }

        public Builder muteErrorEmails(Boolean muteErrorEmails) {
            return muteErrorEmails(Output.of(muteErrorEmails));
        }

        public Builder notification(Output<LogSearchScheduleNotificationArgs> notification) {
            $.notification = notification;
            return this;
        }

        public Builder notification(LogSearchScheduleNotificationArgs notification) {
            return notification(Output.of(notification));
        }

        public Builder parameters(@Nullable Output<List<LogSearchScheduleParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<LogSearchScheduleParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(LogSearchScheduleParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder parseableTimeRange(Output<LogSearchScheduleParseableTimeRangeArgs> parseableTimeRange) {
            $.parseableTimeRange = parseableTimeRange;
            return this;
        }

        public Builder parseableTimeRange(LogSearchScheduleParseableTimeRangeArgs parseableTimeRange) {
            return parseableTimeRange(Output.of(parseableTimeRange));
        }

        public Builder scheduleType(Output<String> scheduleType) {
            $.scheduleType = scheduleType;
            return this;
        }

        public Builder scheduleType(String scheduleType) {
            return scheduleType(Output.of(scheduleType));
        }

        public Builder threshold(@Nullable Output<LogSearchScheduleThresholdArgs> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(LogSearchScheduleThresholdArgs threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public LogSearchScheduleArgs build() {
            if ($.notification == null) {
                throw new MissingRequiredPropertyException("LogSearchScheduleArgs", "notification");
            }
            if ($.parseableTimeRange == null) {
                throw new MissingRequiredPropertyException("LogSearchScheduleArgs", "parseableTimeRange");
            }
            if ($.scheduleType == null) {
                throw new MissingRequiredPropertyException("LogSearchScheduleArgs", "scheduleType");
            }
            if ($.timeZone == null) {
                throw new MissingRequiredPropertyException("LogSearchScheduleArgs", "timeZone");
            }
            return $;
        }
    }

}