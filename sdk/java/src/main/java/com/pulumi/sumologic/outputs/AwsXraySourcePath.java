// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.AwsXraySourcePathCustomService;
import com.pulumi.sumologic.outputs.AwsXraySourcePathSnsTopicOrSubscriptionArn;
import com.pulumi.sumologic.outputs.AwsXraySourcePathTagFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsXraySourcePath {
    private @Nullable String bucketName;
    private @Nullable List<AwsXraySourcePathCustomService> customServices;
    private @Nullable List<String> limitToNamespaces;
    /**
     * @return List of Amazon regions.
     * 
     */
    private @Nullable List<String> limitToRegions;
    private @Nullable List<String> limitToServices;
    private @Nullable String pathExpression;
    private @Nullable List<AwsXraySourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
    private @Nullable List<AwsXraySourcePathTagFilter> tagFilters;
    /**
     * @return type of polling source. This has to be `AwsXRayPath` for AWS XRay source.
     * 
     */
    private String type;
    private @Nullable Boolean useVersionedApi;

    private AwsXraySourcePath() {}
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    public List<AwsXraySourcePathCustomService> customServices() {
        return this.customServices == null ? List.of() : this.customServices;
    }
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
    public Optional<String> pathExpression() {
        return Optional.ofNullable(this.pathExpression);
    }
    public List<AwsXraySourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns() {
        return this.snsTopicOrSubscriptionArns == null ? List.of() : this.snsTopicOrSubscriptionArns;
    }
    public List<AwsXraySourcePathTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }
    /**
     * @return type of polling source. This has to be `AwsXRayPath` for AWS XRay source.
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

    public static Builder builder(AwsXraySourcePath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable List<AwsXraySourcePathCustomService> customServices;
        private @Nullable List<String> limitToNamespaces;
        private @Nullable List<String> limitToRegions;
        private @Nullable List<String> limitToServices;
        private @Nullable String pathExpression;
        private @Nullable List<AwsXraySourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns;
        private @Nullable List<AwsXraySourcePathTagFilter> tagFilters;
        private String type;
        private @Nullable Boolean useVersionedApi;
        public Builder() {}
        public Builder(AwsXraySourcePath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.customServices = defaults.customServices;
    	      this.limitToNamespaces = defaults.limitToNamespaces;
    	      this.limitToRegions = defaults.limitToRegions;
    	      this.limitToServices = defaults.limitToServices;
    	      this.pathExpression = defaults.pathExpression;
    	      this.snsTopicOrSubscriptionArns = defaults.snsTopicOrSubscriptionArns;
    	      this.tagFilters = defaults.tagFilters;
    	      this.type = defaults.type;
    	      this.useVersionedApi = defaults.useVersionedApi;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder customServices(@Nullable List<AwsXraySourcePathCustomService> customServices) {
            this.customServices = customServices;
            return this;
        }
        public Builder customServices(AwsXraySourcePathCustomService... customServices) {
            return customServices(List.of(customServices));
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
        public Builder pathExpression(@Nullable String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }
        @CustomType.Setter
        public Builder snsTopicOrSubscriptionArns(@Nullable List<AwsXraySourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns) {
            this.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            return this;
        }
        public Builder snsTopicOrSubscriptionArns(AwsXraySourcePathSnsTopicOrSubscriptionArn... snsTopicOrSubscriptionArns) {
            return snsTopicOrSubscriptionArns(List.of(snsTopicOrSubscriptionArns));
        }
        @CustomType.Setter
        public Builder tagFilters(@Nullable List<AwsXraySourcePathTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(AwsXraySourcePathTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder useVersionedApi(@Nullable Boolean useVersionedApi) {
            this.useVersionedApi = useVersionedApi;
            return this;
        }
        public AwsXraySourcePath build() {
            final var o = new AwsXraySourcePath();
            o.bucketName = bucketName;
            o.customServices = customServices;
            o.limitToNamespaces = limitToNamespaces;
            o.limitToRegions = limitToRegions;
            o.limitToServices = limitToServices;
            o.pathExpression = pathExpression;
            o.snsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            o.tagFilters = tagFilters;
            o.type = type;
            o.useVersionedApi = useVersionedApi;
            return o;
        }
    }
}