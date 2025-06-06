// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class LogSearchScheduleParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the search.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Default value of scheduled search parameter.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public LogSearchScheduleParameterArgs()
        {
        }
        public static new LogSearchScheduleParameterArgs Empty => new LogSearchScheduleParameterArgs();
    }
}
