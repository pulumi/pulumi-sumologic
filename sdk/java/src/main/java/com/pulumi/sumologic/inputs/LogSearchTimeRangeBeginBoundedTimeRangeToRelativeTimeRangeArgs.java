// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs Empty = new LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs();

    @Import(name="relativeTime", required=true)
    private Output<String> relativeTime;

    public Output<String> relativeTime() {
        return this.relativeTime;
    }

    private LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs() {}

    private LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs(LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs $) {
        this.relativeTime = $.relativeTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs $;

        public Builder() {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs();
        }

        public Builder(LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs defaults) {
            $ = new LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder relativeTime(Output<String> relativeTime) {
            $.relativeTime = relativeTime;
            return this;
        }

        public Builder relativeTime(String relativeTime) {
            return relativeTime(Output.of(relativeTime));
        }

        public LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs build() {
            if ($.relativeTime == null) {
                throw new MissingRequiredPropertyException("LogSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeArgs", "relativeTime");
            }
            return $;
        }
    }

}