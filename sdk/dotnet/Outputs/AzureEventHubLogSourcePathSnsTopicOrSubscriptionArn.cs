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
    public sealed class AzureEventHubLogSourcePathSnsTopicOrSubscriptionArn
    {
        public readonly string? Arn;
        public readonly bool? IsSuccess;

        [OutputConstructor]
        private AzureEventHubLogSourcePathSnsTopicOrSubscriptionArn(
            string? arn,

            bool? isSuccess)
        {
            Arn = arn;
            IsSuccess = isSuccess;
        }
    }
}
