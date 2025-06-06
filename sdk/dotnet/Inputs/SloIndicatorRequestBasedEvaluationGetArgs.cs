// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class SloIndicatorRequestBasedEvaluationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comparison function with threshold. Valid values are `LessThan`, `LessThanOrEqual`, `GreaterThan`
        /// , `GreaterThanOrEqual`.
        /// </summary>
        [Input("op")]
        public Input<string>? Op { get; set; }

        [Input("queries", required: true)]
        private InputList<Inputs.SloIndicatorRequestBasedEvaluationQueryGetArgs>? _queries;

        /// <summary>
        /// The queries to use.
        /// </summary>
        public InputList<Inputs.SloIndicatorRequestBasedEvaluationQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.SloIndicatorRequestBasedEvaluationQueryGetArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The type of query to use. Valid values are `Metrics` or `Logs`.
        /// </summary>
        [Input("queryType", required: true)]
        public Input<string> QueryType { get; set; } = null!;

        /// <summary>
        /// Compared against threshold query's raw data points to determine success criteria.
        /// </summary>
        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        public SloIndicatorRequestBasedEvaluationGetArgs()
        {
        }
        public static new SloIndicatorRequestBasedEvaluationGetArgs Empty => new SloIndicatorRequestBasedEvaluationGetArgs();
    }
}
