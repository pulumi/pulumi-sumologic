// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class ElbSourcePathGetArgs : Pulumi.ResourceArgs
    {
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

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

        [Input("pathExpression")]
        public Input<string>? PathExpression { get; set; }

        [Input("tagFilters")]
        private InputList<Inputs.ElbSourcePathTagFilterGetArgs>? _tagFilters;
        public InputList<Inputs.ElbSourcePathTagFilterGetArgs> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<Inputs.ElbSourcePathTagFilterGetArgs>());
            set => _tagFilters = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ElbSourcePathGetArgs()
        {
        }
    }
}