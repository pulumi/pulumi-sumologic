// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class CseMatchRuleSeverityMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The severity to use in the "constant" case or to fall back to if the field used by "fieldValue"/"fieldValueMapping" is not populated.
        /// </summary>
        [Input("default")]
        public Input<int>? Default { get; set; }

        /// <summary>
        /// The field to use in the "fieldValue"/"fieldValueMapping" cases.
        /// </summary>
        [Input("field")]
        public Input<string>? Field { get; set; }

        [Input("mappings")]
        private InputList<Inputs.CseMatchRuleSeverityMappingMappingGetArgs>? _mappings;

        /// <summary>
        /// The map of record values to severities to use in the "fieldValueMapping" case
        /// </summary>
        public InputList<Inputs.CseMatchRuleSeverityMappingMappingGetArgs> Mappings
        {
            get => _mappings ?? (_mappings = new InputList<Inputs.CseMatchRuleSeverityMappingMappingGetArgs>());
            set => _mappings = value;
        }

        /// <summary>
        /// Whether to set a constant severity ("constant"), set the severity based on the direct value of a record field ("fieldValue"), or map a record field value to a severity ("fieldValueMapping").
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CseMatchRuleSeverityMappingGetArgs()
        {
        }
        public static new CseMatchRuleSeverityMappingGetArgs Empty => new CseMatchRuleSeverityMappingGetArgs();
    }
}