// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.AwsXraySourceAuthenticationArgs;
import com.pulumi.sumologic.inputs.AwsXraySourceDefaultDateFormatArgs;
import com.pulumi.sumologic.inputs.AwsXraySourceFilterArgs;
import com.pulumi.sumologic.inputs.AwsXraySourcePathArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsXraySourceState extends com.pulumi.resources.ResourceArgs {

    public static final AwsXraySourceState Empty = new AwsXraySourceState();

    /**
     * Authentication details for making `xray:Get*` calls.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<AwsXraySourceAuthenticationArgs> authentication;

    /**
     * @return Authentication details for making `xray:Get*` calls.
     * 
     */
    public Optional<Output<AwsXraySourceAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    @Import(name="automaticDateParsing")
    private @Nullable Output<Boolean> automaticDateParsing;

    public Optional<Output<Boolean>> automaticDateParsing() {
        return Optional.ofNullable(this.automaticDateParsing);
    }

    @Import(name="category")
    private @Nullable Output<String> category;

    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    @Import(name="collectorId")
    private @Nullable Output<Integer> collectorId;

    public Optional<Output<Integer>> collectorId() {
        return Optional.ofNullable(this.collectorId);
    }

    /**
     * The content-type of the collected data. This has to be `AwsXRay` for AWS XRay source.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content-type of the collected data. This has to be `AwsXRay` for AWS XRay source.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="cutoffRelativeTime")
    private @Nullable Output<String> cutoffRelativeTime;

    public Optional<Output<String>> cutoffRelativeTime() {
        return Optional.ofNullable(this.cutoffRelativeTime);
    }

    @Import(name="cutoffTimestamp")
    private @Nullable Output<Integer> cutoffTimestamp;

    public Optional<Output<Integer>> cutoffTimestamp() {
        return Optional.ofNullable(this.cutoffTimestamp);
    }

    @Import(name="defaultDateFormats")
    private @Nullable Output<List<AwsXraySourceDefaultDateFormatArgs>> defaultDateFormats;

    public Optional<Output<List<AwsXraySourceDefaultDateFormatArgs>>> defaultDateFormats() {
        return Optional.ofNullable(this.defaultDateFormats);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="fields")
    private @Nullable Output<Map<String,String>> fields;

    public Optional<Output<Map<String,String>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    @Import(name="filters")
    private @Nullable Output<List<AwsXraySourceFilterArgs>> filters;

    public Optional<Output<List<AwsXraySourceFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="forceTimezone")
    private @Nullable Output<Boolean> forceTimezone;

    public Optional<Output<Boolean>> forceTimezone() {
        return Optional.ofNullable(this.forceTimezone);
    }

    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    @Import(name="manualPrefixRegexp")
    private @Nullable Output<String> manualPrefixRegexp;

    public Optional<Output<String>> manualPrefixRegexp() {
        return Optional.ofNullable(this.manualPrefixRegexp);
    }

    @Import(name="multilineProcessingEnabled")
    private @Nullable Output<Boolean> multilineProcessingEnabled;

    public Optional<Output<Boolean>> multilineProcessingEnabled() {
        return Optional.ofNullable(this.multilineProcessingEnabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The location to scan for new data.
     * 
     */
    @Import(name="path")
    private @Nullable Output<AwsXraySourcePathArgs> path;

    /**
     * @return The location to scan for new data.
     * 
     */
    public Optional<Output<AwsXraySourcePathArgs>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected, and collection happens at a default interval of 1 minute.
     * 
     */
    @Import(name="scanInterval")
    private @Nullable Output<Integer> scanInterval;

    /**
     * @return Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected, and collection happens at a default interval of 1 minute.
     * 
     */
    public Optional<Output<Integer>> scanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }

    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    @Import(name="useAutolineMatching")
    private @Nullable Output<Boolean> useAutolineMatching;

    public Optional<Output<Boolean>> useAutolineMatching() {
        return Optional.ofNullable(this.useAutolineMatching);
    }

    private AwsXraySourceState() {}

    private AwsXraySourceState(AwsXraySourceState $) {
        this.authentication = $.authentication;
        this.automaticDateParsing = $.automaticDateParsing;
        this.category = $.category;
        this.collectorId = $.collectorId;
        this.contentType = $.contentType;
        this.cutoffRelativeTime = $.cutoffRelativeTime;
        this.cutoffTimestamp = $.cutoffTimestamp;
        this.defaultDateFormats = $.defaultDateFormats;
        this.description = $.description;
        this.fields = $.fields;
        this.filters = $.filters;
        this.forceTimezone = $.forceTimezone;
        this.hostName = $.hostName;
        this.manualPrefixRegexp = $.manualPrefixRegexp;
        this.multilineProcessingEnabled = $.multilineProcessingEnabled;
        this.name = $.name;
        this.path = $.path;
        this.paused = $.paused;
        this.scanInterval = $.scanInterval;
        this.timezone = $.timezone;
        this.url = $.url;
        this.useAutolineMatching = $.useAutolineMatching;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsXraySourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsXraySourceState $;

        public Builder() {
            $ = new AwsXraySourceState();
        }

        public Builder(AwsXraySourceState defaults) {
            $ = new AwsXraySourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Authentication details for making `xray:Get*` calls.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<AwsXraySourceAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Authentication details for making `xray:Get*` calls.
         * 
         * @return builder
         * 
         */
        public Builder authentication(AwsXraySourceAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        public Builder automaticDateParsing(@Nullable Output<Boolean> automaticDateParsing) {
            $.automaticDateParsing = automaticDateParsing;
            return this;
        }

        public Builder automaticDateParsing(Boolean automaticDateParsing) {
            return automaticDateParsing(Output.of(automaticDateParsing));
        }

        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        public Builder collectorId(@Nullable Output<Integer> collectorId) {
            $.collectorId = collectorId;
            return this;
        }

        public Builder collectorId(Integer collectorId) {
            return collectorId(Output.of(collectorId));
        }

        /**
         * @param contentType The content-type of the collected data. This has to be `AwsXRay` for AWS XRay source.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content-type of the collected data. This has to be `AwsXRay` for AWS XRay source.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder cutoffRelativeTime(@Nullable Output<String> cutoffRelativeTime) {
            $.cutoffRelativeTime = cutoffRelativeTime;
            return this;
        }

        public Builder cutoffRelativeTime(String cutoffRelativeTime) {
            return cutoffRelativeTime(Output.of(cutoffRelativeTime));
        }

        public Builder cutoffTimestamp(@Nullable Output<Integer> cutoffTimestamp) {
            $.cutoffTimestamp = cutoffTimestamp;
            return this;
        }

        public Builder cutoffTimestamp(Integer cutoffTimestamp) {
            return cutoffTimestamp(Output.of(cutoffTimestamp));
        }

        public Builder defaultDateFormats(@Nullable Output<List<AwsXraySourceDefaultDateFormatArgs>> defaultDateFormats) {
            $.defaultDateFormats = defaultDateFormats;
            return this;
        }

        public Builder defaultDateFormats(List<AwsXraySourceDefaultDateFormatArgs> defaultDateFormats) {
            return defaultDateFormats(Output.of(defaultDateFormats));
        }

        public Builder defaultDateFormats(AwsXraySourceDefaultDateFormatArgs... defaultDateFormats) {
            return defaultDateFormats(List.of(defaultDateFormats));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder fields(@Nullable Output<Map<String,String>> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(Map<String,String> fields) {
            return fields(Output.of(fields));
        }

        public Builder filters(@Nullable Output<List<AwsXraySourceFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<AwsXraySourceFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(AwsXraySourceFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder forceTimezone(@Nullable Output<Boolean> forceTimezone) {
            $.forceTimezone = forceTimezone;
            return this;
        }

        public Builder forceTimezone(Boolean forceTimezone) {
            return forceTimezone(Output.of(forceTimezone));
        }

        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        public Builder manualPrefixRegexp(@Nullable Output<String> manualPrefixRegexp) {
            $.manualPrefixRegexp = manualPrefixRegexp;
            return this;
        }

        public Builder manualPrefixRegexp(String manualPrefixRegexp) {
            return manualPrefixRegexp(Output.of(manualPrefixRegexp));
        }

        public Builder multilineProcessingEnabled(@Nullable Output<Boolean> multilineProcessingEnabled) {
            $.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        public Builder multilineProcessingEnabled(Boolean multilineProcessingEnabled) {
            return multilineProcessingEnabled(Output.of(multilineProcessingEnabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The location to scan for new data.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<AwsXraySourcePathArgs> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The location to scan for new data.
         * 
         * @return builder
         * 
         */
        public Builder path(AwsXraySourcePathArgs path) {
            return path(Output.of(path));
        }

        /**
         * @param paused When set to true, the scanner is paused. To disable, set to false.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused When set to true, the scanner is paused. To disable, set to false.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param scanInterval Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected, and collection happens at a default interval of 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(@Nullable Output<Integer> scanInterval) {
            $.scanInterval = scanInterval;
            return this;
        }

        /**
         * @param scanInterval Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected, and collection happens at a default interval of 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(Integer scanInterval) {
            return scanInterval(Output.of(scanInterval));
        }

        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder useAutolineMatching(@Nullable Output<Boolean> useAutolineMatching) {
            $.useAutolineMatching = useAutolineMatching;
            return this;
        }

        public Builder useAutolineMatching(Boolean useAutolineMatching) {
            return useAutolineMatching(Output.of(useAutolineMatching));
        }

        public AwsXraySourceState build() {
            return $;
        }
    }

}