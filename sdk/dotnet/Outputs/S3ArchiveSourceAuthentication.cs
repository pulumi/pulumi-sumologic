// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class S3ArchiveSourceAuthentication
    {
        /// <summary>
        /// Your AWS access key if using type `S3BucketAuthentication`.
        /// </summary>
        public readonly string? AccessKey;
        public readonly string? AuthProviderX509CertUrl;
        public readonly string? AuthUri;
        public readonly string? ClientEmail;
        public readonly string? ClientId;
        public readonly string? ClientX509CertUrl;
        public readonly string? PrivateKey;
        public readonly string? PrivateKeyId;
        public readonly string? ProjectId;
        /// <summary>
        /// Your AWS Bucket region.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Your AWS role ARN if using type `AWSRoleBasedAuthentication`. This is not supported for AWS China regions.
        /// </summary>
        public readonly string? RoleArn;
        /// <summary>
        /// Your AWS secret key if using type `S3BucketAuthentication`.
        /// </summary>
        public readonly string? SecretKey;
        public readonly string? TokenUri;
        /// <summary>
        /// type of polling source. This has to be `S3BucketPathExpression` for `S3 source`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private S3ArchiveSourceAuthentication(
            string? accessKey,

            string? authProviderX509CertUrl,

            string? authUri,

            string? clientEmail,

            string? clientId,

            string? clientX509CertUrl,

            string? privateKey,

            string? privateKeyId,

            string? projectId,

            string? region,

            string? roleArn,

            string? secretKey,

            string? tokenUri,

            string type)
        {
            AccessKey = accessKey;
            AuthProviderX509CertUrl = authProviderX509CertUrl;
            AuthUri = authUri;
            ClientEmail = clientEmail;
            ClientId = clientId;
            ClientX509CertUrl = clientX509CertUrl;
            PrivateKey = privateKey;
            PrivateKeyId = privateKeyId;
            ProjectId = projectId;
            Region = region;
            RoleArn = roleArn;
            SecretKey = secretKey;
            TokenUri = tokenUri;
            Type = type;
        }
    }
}