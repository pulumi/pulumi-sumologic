// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CloudtrailSourcePathArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        [Input("consumerGroup")]
        public Input<string>? ConsumerGroup { get; set; }

        [Input("customServices")]
        private InputList<Inputs.CloudtrailSourcePathCustomServiceArgs>? _customServices;
        public InputList<Inputs.CloudtrailSourcePathCustomServiceArgs> CustomServices
        {
            get => _customServices ?? (_customServices = new InputList<Inputs.CloudtrailSourcePathCustomServiceArgs>());
            set => _customServices = value;
        }

        [Input("eventHubName")]
        public Input<string>? EventHubName { get; set; }

        [Input("limitToNamespaces")]
        private InputList<string>? _limitToNamespaces;
        public InputList<string> LimitToNamespaces
        {
            get => _limitToNamespaces ?? (_limitToNamespaces = new InputList<string>());
            set => _limitToNamespaces = value;
        }

        [Input("limitToRegions")]
        private InputList<string>? _limitToRegions;
        public InputList<string> LimitToRegions
        {
            get => _limitToRegions ?? (_limitToRegions = new InputList<string>());
            set => _limitToRegions = value;
        }

        [Input("limitToServices")]
        private InputList<string>? _limitToServices;
        public InputList<string> LimitToServices
        {
            get => _limitToServices ?? (_limitToServices = new InputList<string>());
            set => _limitToServices = value;
        }

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The path to the data.
        /// </summary>
        [Input("pathExpression")]
        public Input<string>? PathExpression { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("snsTopicOrSubscriptionArns")]
        private InputList<Inputs.CloudtrailSourcePathSnsTopicOrSubscriptionArnArgs>? _snsTopicOrSubscriptionArns;

        /// <summary>
        /// This is a computed field for SNS topic/subscription ARN.
        /// </summary>
        public InputList<Inputs.CloudtrailSourcePathSnsTopicOrSubscriptionArnArgs> SnsTopicOrSubscriptionArns
        {
            get => _snsTopicOrSubscriptionArns ?? (_snsTopicOrSubscriptionArns = new InputList<Inputs.CloudtrailSourcePathSnsTopicOrSubscriptionArnArgs>());
            set => _snsTopicOrSubscriptionArns = value;
        }

        [Input("tagFilters")]
        private InputList<Inputs.CloudtrailSourcePathTagFilterArgs>? _tagFilters;
        public InputList<Inputs.CloudtrailSourcePathTagFilterArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.CloudtrailSourcePathTagFilterArgs>());
            set => _tagFilters = value;
        }

        /// <summary>
        /// type of polling source. This has to be `S3BucketPathExpression` for `CloudTrail` source.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("useVersionedApi")]
        public Input<bool>? UseVersionedApi { get; set; }

        public CloudtrailSourcePathArgs()
        {
        }
        public static new CloudtrailSourcePathArgs Empty => new CloudtrailSourcePathArgs();
    }
}