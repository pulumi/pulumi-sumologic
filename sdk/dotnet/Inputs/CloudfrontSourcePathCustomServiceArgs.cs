// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CloudfrontSourcePathCustomServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("prefixes")]
        private InputList<string>? _prefixes;
        public InputList<string> Prefixes
        {
            get => _prefixes ?? (_prefixes = new InputList<string>());
            set => _prefixes = value;
        }

        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public CloudfrontSourcePathCustomServiceArgs()
        {
        }
        public static new CloudfrontSourcePathCustomServiceArgs Empty => new CloudfrontSourcePathCustomServiceArgs();
    }
}
