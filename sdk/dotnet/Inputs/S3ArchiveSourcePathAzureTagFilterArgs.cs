// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class S3ArchiveSourcePathAzureTagFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("tags")]
        private InputList<Inputs.S3ArchiveSourcePathAzureTagFilterTagArgs>? _tags;
        public InputList<Inputs.S3ArchiveSourcePathAzureTagFilterTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.S3ArchiveSourcePathAzureTagFilterTagArgs>());
            set => _tags = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public S3ArchiveSourcePathAzureTagFilterArgs()
        {
        }
        public static new S3ArchiveSourcePathAzureTagFilterArgs Empty => new S3ArchiveSourcePathAzureTagFilterArgs();
    }
}
