// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KineisLogSourceAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final KineisLogSourceAuthenticationArgs Empty = new KineisLogSourceAuthenticationArgs();

    /**
     * Your AWS access key if using type `S3BucketAuthentication`
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Your AWS access key if using type `S3BucketAuthentication`
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * Your AWS role ARN if using type `AWSRoleBasedAuthentication`
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Your AWS role ARN if using type `AWSRoleBasedAuthentication`
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Your AWS secret key if using type `S3BucketAuthentication`
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Your AWS secret key if using type `S3BucketAuthentication`
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication` or `NoAuthentication`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication` or `NoAuthentication`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private KineisLogSourceAuthenticationArgs() {}

    private KineisLogSourceAuthenticationArgs(KineisLogSourceAuthenticationArgs $) {
        this.accessKey = $.accessKey;
        this.roleArn = $.roleArn;
        this.secretKey = $.secretKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KineisLogSourceAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KineisLogSourceAuthenticationArgs $;

        public Builder() {
            $ = new KineisLogSourceAuthenticationArgs();
        }

        public Builder(KineisLogSourceAuthenticationArgs defaults) {
            $ = new KineisLogSourceAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Your AWS access key if using type `S3BucketAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Your AWS access key if using type `S3BucketAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param roleArn Your AWS role ARN if using type `AWSRoleBasedAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Your AWS role ARN if using type `AWSRoleBasedAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param secretKey Your AWS secret key if using type `S3BucketAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Your AWS secret key if using type `S3BucketAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param type Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication` or `NoAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication` or `NoAuthentication`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public KineisLogSourceAuthenticationArgs build() {
            return $;
        }
    }

}