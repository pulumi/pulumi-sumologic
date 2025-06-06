// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.outputs.CloudwatchSourcePathAzureTagFilter;
import com.pulumi.sumologic.outputs.CloudwatchSourcePathCustomService;
import com.pulumi.sumologic.outputs.CloudwatchSourcePathSnsTopicOrSubscriptionArn;
import com.pulumi.sumologic.outputs.CloudwatchSourcePathTagFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudwatchSourcePath {
    private @Nullable List<CloudwatchSourcePathAzureTagFilter> azureTagFilters;
    private @Nullable String bucketName;
    private @Nullable String consumerGroup;
    private @Nullable List<CloudwatchSourcePathCustomService> customServices;
    private @Nullable String environment;
    private @Nullable String eventHubName;
    /**
     * @return List of namespaces. By default all namespaces are selected. Details can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#aws%C2%A0tag-filtering-namespace-support). You can also  specify custom namespace.
     * 
     */
    private @Nullable List<String> limitToNamespaces;
    /**
     * @return List of Amazon regions.
     * 
     */
    private @Nullable List<String> limitToRegions;
    private @Nullable List<String> limitToServices;
    /**
     * @return Namespace for which you want to define the tag filters. Use  value as `All` to apply the tag filter for all namespaces.
     * 
     */
    private @Nullable String namespace;
    private @Nullable String pathExpression;
    /**
     * @return Your AWS Bucket region.
     * 
     */
    private @Nullable String region;
    private @Nullable List<CloudwatchSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
    /**
     * @return Tag filters allow you to filter the CloudWatch metrics you collect by the AWS tags you have assigned to your AWS resources. You can define tag filters for each supported namespace. If you do not define any tag filters, all metrics will be collected for the regions and namespaces you configured for the source above. More info on tag filters can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#about-aws-tag-filtering)
     * 
     */
    private @Nullable List<CloudwatchSourcePathTagFilter> tagFilters;
    /**
     * @return type of polling source. This has to be `CloudWatchPath` for CloudWatch source.
     * 
     */
    private String type;
    private @Nullable Boolean useVersionedApi;

    private CloudwatchSourcePath() {}
    public List<CloudwatchSourcePathAzureTagFilter> azureTagFilters() {
        return this.azureTagFilters == null ? List.of() : this.azureTagFilters;
    }
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    public Optional<String> consumerGroup() {
        return Optional.ofNullable(this.consumerGroup);
    }
    public List<CloudwatchSourcePathCustomService> customServices() {
        return this.customServices == null ? List.of() : this.customServices;
    }
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    public Optional<String> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * @return List of namespaces. By default all namespaces are selected. Details can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#aws%C2%A0tag-filtering-namespace-support). You can also  specify custom namespace.
     * 
     */
    public List<String> limitToNamespaces() {
        return this.limitToNamespaces == null ? List.of() : this.limitToNamespaces;
    }
    /**
     * @return List of Amazon regions.
     * 
     */
    public List<String> limitToRegions() {
        return this.limitToRegions == null ? List.of() : this.limitToRegions;
    }
    public List<String> limitToServices() {
        return this.limitToServices == null ? List.of() : this.limitToServices;
    }
    /**
     * @return Namespace for which you want to define the tag filters. Use  value as `All` to apply the tag filter for all namespaces.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Optional<String> pathExpression() {
        return Optional.ofNullable(this.pathExpression);
    }
    /**
     * @return Your AWS Bucket region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public List<CloudwatchSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns() {
        return this.snsTopicOrSubscriptionArns == null ? List.of() : this.snsTopicOrSubscriptionArns;
    }
    /**
     * @return Tag filters allow you to filter the CloudWatch metrics you collect by the AWS tags you have assigned to your AWS resources. You can define tag filters for each supported namespace. If you do not define any tag filters, all metrics will be collected for the regions and namespaces you configured for the source above. More info on tag filters can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#about-aws-tag-filtering)
     * 
     */
    public List<CloudwatchSourcePathTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }
    /**
     * @return type of polling source. This has to be `CloudWatchPath` for CloudWatch source.
     * 
     */
    public String type() {
        return this.type;
    }
    public Optional<Boolean> useVersionedApi() {
        return Optional.ofNullable(this.useVersionedApi);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudwatchSourcePath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CloudwatchSourcePathAzureTagFilter> azureTagFilters;
        private @Nullable String bucketName;
        private @Nullable String consumerGroup;
        private @Nullable List<CloudwatchSourcePathCustomService> customServices;
        private @Nullable String environment;
        private @Nullable String eventHubName;
        private @Nullable List<String> limitToNamespaces;
        private @Nullable List<String> limitToRegions;
        private @Nullable List<String> limitToServices;
        private @Nullable String namespace;
        private @Nullable String pathExpression;
        private @Nullable String region;
        private @Nullable List<CloudwatchSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
        private @Nullable List<CloudwatchSourcePathTagFilter> tagFilters;
        private String type;
        private @Nullable Boolean useVersionedApi;
        public Builder() {}
        public Builder(CloudwatchSourcePath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureTagFilters = defaults.azureTagFilters;
    	      this.bucketName = defaults.bucketName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.customServices = defaults.customServices;
    	      this.environment = defaults.environment;
    	      this.eventHubName = defaults.eventHubName;
    	      this.limitToNamespaces = defaults.limitToNamespaces;
    	      this.limitToRegions = defaults.limitToRegions;
    	      this.limitToServices = defaults.limitToServices;
    	      this.namespace = defaults.namespace;
    	      this.pathExpression = defaults.pathExpression;
    	      this.region = defaults.region;
    	      this.snsTopicOrSubscriptionArns = defaults.snsTopicOrSubscriptionArns;
    	      this.tagFilters = defaults.tagFilters;
    	      this.type = defaults.type;
    	      this.useVersionedApi = defaults.useVersionedApi;
        }

        @CustomType.Setter
        public Builder azureTagFilters(@Nullable List<CloudwatchSourcePathAzureTagFilter> azureTagFilters) {

            this.azureTagFilters = azureTagFilters;
            return this;
        }
        public Builder azureTagFilters(CloudwatchSourcePathAzureTagFilter... azureTagFilters) {
            return azureTagFilters(List.of(azureTagFilters));
        }
        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {

            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder consumerGroup(@Nullable String consumerGroup) {

            this.consumerGroup = consumerGroup;
            return this;
        }
        @CustomType.Setter
        public Builder customServices(@Nullable List<CloudwatchSourcePathCustomService> customServices) {

            this.customServices = customServices;
            return this;
        }
        public Builder customServices(CloudwatchSourcePathCustomService... customServices) {
            return customServices(List.of(customServices));
        }
        @CustomType.Setter
        public Builder environment(@Nullable String environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder eventHubName(@Nullable String eventHubName) {

            this.eventHubName = eventHubName;
            return this;
        }
        @CustomType.Setter
        public Builder limitToNamespaces(@Nullable List<String> limitToNamespaces) {

            this.limitToNamespaces = limitToNamespaces;
            return this;
        }
        public Builder limitToNamespaces(String... limitToNamespaces) {
            return limitToNamespaces(List.of(limitToNamespaces));
        }
        @CustomType.Setter
        public Builder limitToRegions(@Nullable List<String> limitToRegions) {

            this.limitToRegions = limitToRegions;
            return this;
        }
        public Builder limitToRegions(String... limitToRegions) {
            return limitToRegions(List.of(limitToRegions));
        }
        @CustomType.Setter
        public Builder limitToServices(@Nullable List<String> limitToServices) {

            this.limitToServices = limitToServices;
            return this;
        }
        public Builder limitToServices(String... limitToServices) {
            return limitToServices(List.of(limitToServices));
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder pathExpression(@Nullable String pathExpression) {

            this.pathExpression = pathExpression;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder snsTopicOrSubscriptionArns(@Nullable List<CloudwatchSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns) {

            this.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            return this;
        }
        public Builder snsTopicOrSubscriptionArns(CloudwatchSourcePathSnsTopicOrSubscriptionArn... snsTopicOrSubscriptionArns) {
            return snsTopicOrSubscriptionArns(List.of(snsTopicOrSubscriptionArns));
        }
        @CustomType.Setter
        public Builder tagFilters(@Nullable List<CloudwatchSourcePathTagFilter> tagFilters) {

            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(CloudwatchSourcePathTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("CloudwatchSourcePath", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder useVersionedApi(@Nullable Boolean useVersionedApi) {

            this.useVersionedApi = useVersionedApi;
            return this;
        }
        public CloudwatchSourcePath build() {
            final var _resultValue = new CloudwatchSourcePath();
            _resultValue.azureTagFilters = azureTagFilters;
            _resultValue.bucketName = bucketName;
            _resultValue.consumerGroup = consumerGroup;
            _resultValue.customServices = customServices;
            _resultValue.environment = environment;
            _resultValue.eventHubName = eventHubName;
            _resultValue.limitToNamespaces = limitToNamespaces;
            _resultValue.limitToRegions = limitToRegions;
            _resultValue.limitToServices = limitToServices;
            _resultValue.namespace = namespace;
            _resultValue.pathExpression = pathExpression;
            _resultValue.region = region;
            _resultValue.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            _resultValue.tagFilters = tagFilters;
            _resultValue.type = type;
            _resultValue.useVersionedApi = useVersionedApi;
            return _resultValue;
        }
    }
}
