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
    public sealed class CloudtrailSourcePathAzureTagFilterTag
    {
        public readonly string Name;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private CloudtrailSourcePathAzureTagFilterTag(
            string name,

            ImmutableArray<string> values)
        {
            Name = name;
            Values = values;
        }
    }
}
