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
    public sealed class CloudwatchSourcePath
    {
        public readonly string? BucketName;
        public readonly ImmutableArray<string> LimitToNamespaces;
        public readonly ImmutableArray<string> LimitToRegions;
        public readonly string? PathExpression;
        public readonly ImmutableArray<Outputs.CloudwatchSourcePathTagFilter> TagFilters;
        public readonly string Type;

        [OutputConstructor]
        private CloudwatchSourcePath(
            string? bucketName,

            ImmutableArray<string> limitToNamespaces,

            ImmutableArray<string> limitToRegions,

            string? pathExpression,

            ImmutableArray<Outputs.CloudwatchSourcePathTagFilter> tagFilters,

            string type)
        {
            BucketName = bucketName;
            LimitToNamespaces = limitToNamespaces;
            LimitToRegions = limitToRegions;
            PathExpression = pathExpression;
            TagFilters = tagFilters;
            Type = type;
        }
    }
}