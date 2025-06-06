// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CseLogMappingFieldLookupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Lookup key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Lookup value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public CseLogMappingFieldLookupGetArgs()
        {
        }
        public static new CseLogMappingFieldLookupGetArgs Empty => new CseLogMappingFieldLookupGetArgs();
    }
}
