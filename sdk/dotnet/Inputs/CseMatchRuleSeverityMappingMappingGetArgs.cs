// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CseMatchRuleSeverityMappingMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The record value to map from
        /// </summary>
        [Input("from", required: true)]
        public Input<string> From { get; set; } = null!;

        /// <summary>
        /// The severity value to map to
        /// </summary>
        [Input("to", required: true)]
        public Input<int> To { get; set; } = null!;

        /// <summary>
        /// Must be set to "eq" currently
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CseMatchRuleSeverityMappingMappingGetArgs()
        {
        }
        public static new CseMatchRuleSeverityMappingMappingGetArgs Empty => new CseMatchRuleSeverityMappingMappingGetArgs();
    }
}
