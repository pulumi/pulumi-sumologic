// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElbSourceAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElbSourceAuthenticationArgs Empty = new ElbSourceAuthenticationArgs();

    /**
     * Your AWS access key if using type `S3BucketAuthentication`.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Your AWS access key if using type `S3BucketAuthentication`.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    @Import(name="authProviderX509CertUrl")
    private @Nullable Output<String> authProviderX509CertUrl;

    public Optional<Output<String>> authProviderX509CertUrl() {
        return Optional.ofNullable(this.authProviderX509CertUrl);
    }

    @Import(name="authUri")
    private @Nullable Output<String> authUri;

    public Optional<Output<String>> authUri() {
        return Optional.ofNullable(this.authUri);
    }

    @Import(name="clientEmail")
    private @Nullable Output<String> clientEmail;

    public Optional<Output<String>> clientEmail() {
        return Optional.ofNullable(this.clientEmail);
    }

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="clientX509CertUrl")
    private @Nullable Output<String> clientX509CertUrl;

    public Optional<Output<String>> clientX509CertUrl() {
        return Optional.ofNullable(this.clientX509CertUrl);
    }

    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="privateKeyId")
    private @Nullable Output<String> privateKeyId;

    public Optional<Output<String>> privateKeyId() {
        return Optional.ofNullable(this.privateKeyId);
    }

    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Your AWS Bucket region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Your AWS Bucket region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Your AWS role ARN if using type `AWSRoleBasedAuthentication`.This is not supported for AWS China regions.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Your AWS role ARN if using type `AWSRoleBasedAuthentication`.This is not supported for AWS China regions.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Your AWS secret key if using type `S3BucketAuthentication`.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return Your AWS secret key if using type `S3BucketAuthentication`.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    @Import(name="sharedAccessPolicyKey")
    private @Nullable Output<String> sharedAccessPolicyKey;

    public Optional<Output<String>> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    @Import(name="sharedAccessPolicyName")
    private @Nullable Output<String> sharedAccessPolicyName;

    public Optional<Output<String>> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }

    @Import(name="tokenUri")
    private @Nullable Output<String> tokenUri;

    public Optional<Output<String>> tokenUri() {
        return Optional.ofNullable(this.tokenUri);
    }

    /**
     * Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ElbSourceAuthenticationArgs() {}

    private ElbSourceAuthenticationArgs(ElbSourceAuthenticationArgs $) {
        this.accessKey = $.accessKey;
        this.authProviderX509CertUrl = $.authProviderX509CertUrl;
        this.authUri = $.authUri;
        this.clientEmail = $.clientEmail;
        this.clientId = $.clientId;
        this.clientX509CertUrl = $.clientX509CertUrl;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
        this.projectId = $.projectId;
        this.region = $.region;
        this.roleArn = $.roleArn;
        this.secretKey = $.secretKey;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.tokenUri = $.tokenUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElbSourceAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElbSourceAuthenticationArgs $;

        public Builder() {
            $ = new ElbSourceAuthenticationArgs();
        }

        public Builder(ElbSourceAuthenticationArgs defaults) {
            $ = new ElbSourceAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Your AWS access key if using type `S3BucketAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Your AWS access key if using type `S3BucketAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        public Builder authProviderX509CertUrl(@Nullable Output<String> authProviderX509CertUrl) {
            $.authProviderX509CertUrl = authProviderX509CertUrl;
            return this;
        }

        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            return authProviderX509CertUrl(Output.of(authProviderX509CertUrl));
        }

        public Builder authUri(@Nullable Output<String> authUri) {
            $.authUri = authUri;
            return this;
        }

        public Builder authUri(String authUri) {
            return authUri(Output.of(authUri));
        }

        public Builder clientEmail(@Nullable Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientX509CertUrl(@Nullable Output<String> clientX509CertUrl) {
            $.clientX509CertUrl = clientX509CertUrl;
            return this;
        }

        public Builder clientX509CertUrl(String clientX509CertUrl) {
            return clientX509CertUrl(Output.of(clientX509CertUrl));
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder privateKeyId(@Nullable Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region Your AWS Bucket region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Your AWS Bucket region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param roleArn Your AWS role ARN if using type `AWSRoleBasedAuthentication`.This is not supported for AWS China regions.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Your AWS role ARN if using type `AWSRoleBasedAuthentication`.This is not supported for AWS China regions.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param secretKey Your AWS secret key if using type `S3BucketAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Your AWS secret key if using type `S3BucketAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public Builder sharedAccessPolicyKey(@Nullable Output<String> sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder sharedAccessPolicyKey(String sharedAccessPolicyKey) {
            return sharedAccessPolicyKey(Output.of(sharedAccessPolicyKey));
        }

        public Builder sharedAccessPolicyName(@Nullable Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        public Builder tokenUri(@Nullable Output<String> tokenUri) {
            $.tokenUri = tokenUri;
            return this;
        }

        public Builder tokenUri(String tokenUri) {
            return tokenUri(Output.of(tokenUri));
        }

        /**
         * @param type Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Must be either `S3BucketAuthentication` or `AWSRoleBasedAuthentication`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ElbSourceAuthenticationArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ElbSourceAuthenticationArgs", "type");
            }
            return $;
        }
    }

}