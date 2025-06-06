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
    public sealed class KinesisMetricsSourcePath
    {
        /// <summary>
        /// Tag filters allow you to filter the CloudWatch metrics you collect by the AWS tags you have assigned to your AWS resources. You can define tag filters for each supported namespace. If you do not define any tag filters, all metrics will be collected for the regions and namespaces you configured for the source above. More info on tag filters can be found [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-CloudWatch-Source-for-Metrics#about-aws-tag-filtering)
        /// </summary>
        public readonly ImmutableArray<Outputs.KinesisMetricsSourcePathTagFilter> TagFilters;
        /// <summary>
        /// Must be `KinesisMetricPath`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private KinesisMetricsSourcePath(
            ImmutableArray<Outputs.KinesisMetricsSourcePathTagFilter> tagFilters,

            string type)
        {
            TagFilters = tagFilters;
            Type = type;
        }
    }
}
