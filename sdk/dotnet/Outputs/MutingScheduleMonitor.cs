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
    public sealed class MutingScheduleMonitor
    {
        /// <summary>
        /// True if the schedule applies to all monitors
        /// </summary>
        public readonly bool? All;
        /// <summary>
        /// List of monitor Ids in hex. Must be empty if `all` is true.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private MutingScheduleMonitor(
            bool? all,

            ImmutableArray<string> ids)
        {
            All = all;
            Ids = ids;
        }
    }
}
