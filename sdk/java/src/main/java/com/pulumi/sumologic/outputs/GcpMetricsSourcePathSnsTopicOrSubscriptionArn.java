// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GcpMetricsSourcePathSnsTopicOrSubscriptionArn {
    private @Nullable String arn;
    private @Nullable Boolean isSuccess;

    private GcpMetricsSourcePathSnsTopicOrSubscriptionArn() {}
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Boolean> isSuccess() {
        return Optional.ofNullable(this.isSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpMetricsSourcePathSnsTopicOrSubscriptionArn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean isSuccess;
        public Builder() {}
        public Builder(GcpMetricsSourcePathSnsTopicOrSubscriptionArn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.isSuccess = defaults.isSuccess;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {

            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder isSuccess(@Nullable Boolean isSuccess) {

            this.isSuccess = isSuccess;
            return this;
        }
        public GcpMetricsSourcePathSnsTopicOrSubscriptionArn build() {
            final var _resultValue = new GcpMetricsSourcePathSnsTopicOrSubscriptionArn();
            _resultValue.arn = arn;
            _resultValue.isSuccess = isSuccess;
            return _resultValue;
        }
    }
}