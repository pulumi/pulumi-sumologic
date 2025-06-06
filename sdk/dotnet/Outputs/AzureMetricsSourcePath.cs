// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class AzureMetricsSourcePath
    {
        public readonly ImmutableArray<Outputs.AzureMetricsSourcePathAzureTagFilter> AzureTagFilters;
        public readonly string? BucketName;
        public readonly string? ConsumerGroup;
        public readonly ImmutableArray<Outputs.AzureMetricsSourcePathCustomService> CustomServices;
        public readonly string? Environment;
        public readonly string? EventHubName;
        public readonly ImmutableArray<string> LimitToNamespaces;
        public readonly ImmutableArray<string> LimitToRegions;
        public readonly ImmutableArray<string> LimitToServices;
        public readonly string? Namespace;
        public readonly string? PathExpression;
        public readonly string? Region;
        public readonly ImmutableArray<Outputs.AzureMetricsSourcePathSnsTopicOrSubscriptionArn> SnsTopicOrSubscriptionArns;
        public readonly ImmutableArray<Outputs.AzureMetricsSourcePathTagFilter> TagFilters;
        public readonly string Type;
        public readonly bool? UseVersionedApi;

        [OutputConstructor]
        private AzureMetricsSourcePath(
            ImmutableArray<Outputs.AzureMetricsSourcePathAzureTagFilter> azureTagFilters,

            string? bucketName,

            string? consumerGroup,

            ImmutableArray<Outputs.AzureMetricsSourcePathCustomService> customServices,

            string? environment,

            string? eventHubName,

            ImmutableArray<string> limitToNamespaces,

            ImmutableArray<string> limitToRegions,

            ImmutableArray<string> limitToServices,

            string? @namespace,

            string? pathExpression,

            string? region,

            ImmutableArray<Outputs.AzureMetricsSourcePathSnsTopicOrSubscriptionArn> snsTopicOrSubscriptionArns,

            ImmutableArray<Outputs.AzureMetricsSourcePathTagFilter> tagFilters,

            string type,

            bool? useVersionedApi)
        {
            AzureTagFilters = azureTagFilters;
            BucketName = bucketName;
            ConsumerGroup = consumerGroup;
            CustomServices = customServices;
            Environment = environment;
            EventHubName = eventHubName;
            LimitToNamespaces = limitToNamespaces;
            LimitToRegions = limitToRegions;
            LimitToServices = limitToServices;
            Namespace = @namespace;
            PathExpression = pathExpression;
            Region = region;
            SnsTopicOrSubscriptionArns = snsTopicOrSubscriptionArns;
            TagFilters = tagFilters;
            Type = type;
            UseVersionedApi = useVersionedApi;
        }
    }
}
