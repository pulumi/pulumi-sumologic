// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class GcpMetricsSourceAuthenticationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("authProviderX509CertUrl")]
        public Input<string>? AuthProviderX509CertUrl { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("authUri")]
        public Input<string>? AuthUri { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("clientEmail")]
        public Input<string>? ClientEmail { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("clientX509CertUrl")]
        public Input<string>? ClientX509CertUrl { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("privateKeyId")]
        public Input<string>? PrivateKeyId { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        [Input("sharedAccessPolicyKey")]
        public Input<string>? SharedAccessPolicyKey { get; set; }

        [Input("sharedAccessPolicyName")]
        public Input<string>? SharedAccessPolicyName { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// As per the service_account.json downloaded from GCP
        /// </summary>
        [Input("tokenUri")]
        public Input<string>? TokenUri { get; set; }

        /// <summary>
        /// Must be `service_account`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GcpMetricsSourceAuthenticationGetArgs()
        {
        }
        public static new GcpMetricsSourceAuthenticationGetArgs Empty => new GcpMetricsSourceAuthenticationGetArgs();
    }
}
