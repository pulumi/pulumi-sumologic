// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudSyslogSourceDefaultDateFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudSyslogSourceDefaultDateFormatArgs Empty = new CloudSyslogSourceDefaultDateFormatArgs();

    @Import(name="format", required=true)
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }

    @Import(name="locator")
    private @Nullable Output<String> locator;

    public Optional<Output<String>> locator() {
        return Optional.ofNullable(this.locator);
    }

    private CloudSyslogSourceDefaultDateFormatArgs() {}

    private CloudSyslogSourceDefaultDateFormatArgs(CloudSyslogSourceDefaultDateFormatArgs $) {
        this.format = $.format;
        this.locator = $.locator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSyslogSourceDefaultDateFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSyslogSourceDefaultDateFormatArgs $;

        public Builder() {
            $ = new CloudSyslogSourceDefaultDateFormatArgs();
        }

        public Builder(CloudSyslogSourceDefaultDateFormatArgs defaults) {
            $ = new CloudSyslogSourceDefaultDateFormatArgs(Objects.requireNonNull(defaults));
        }

        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder locator(@Nullable Output<String> locator) {
            $.locator = locator;
            return this;
        }

        public Builder locator(String locator) {
            return locator(Output.of(locator));
        }

        public CloudSyslogSourceDefaultDateFormatArgs build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}