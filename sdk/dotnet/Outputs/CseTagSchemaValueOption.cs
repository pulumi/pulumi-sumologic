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
    public sealed class CseTagSchemaValueOption
    {
        /// <summary>
        /// Value option label.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// Value option link.
        /// 
        /// 
        /// 
        /// The following attributes are exported:
        /// </summary>
        public readonly string? Link;
        /// <summary>
        /// Value option value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private CseTagSchemaValueOption(
            string? label,

            string? link,

            string value)
        {
            Label = label;
            Link = link;
            Value = value;
        }
    }
}
