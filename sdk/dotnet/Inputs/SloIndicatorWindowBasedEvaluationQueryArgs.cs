// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class SloIndicatorWindowBasedEvaluationQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of query. Valid values are `Successful`, `Unsuccessful`, `Total`
        /// , `Threshold`.
        /// </summary>
        [Input("queryGroupType", required: true)]
        public Input<string> QueryGroupType { get; set; } = null!;

        [Input("queryGroups", required: true)]
        private InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs>? _queryGroups;

        /// <summary>
        /// List of queries to use.
        /// </summary>
        public InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs> QueryGroups
        {
            get => _queryGroups ?? (_queryGroups = new InputList<Inputs.SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs>());
            set => _queryGroups = value;
        }

        public SloIndicatorWindowBasedEvaluationQueryArgs()
        {
        }
        public static new SloIndicatorWindowBasedEvaluationQueryArgs Empty => new SloIndicatorWindowBasedEvaluationQueryArgs();
    }
}
