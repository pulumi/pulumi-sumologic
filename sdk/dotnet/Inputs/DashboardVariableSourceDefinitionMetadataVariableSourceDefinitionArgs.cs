// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionArgs : global::Pulumi.ResourceArgs
    {
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionArgs()
        {
        }
        public static new DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionArgs Empty => new DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionArgs();
    }
}
