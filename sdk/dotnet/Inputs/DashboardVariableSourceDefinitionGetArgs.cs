// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardVariableSourceDefinitionGetArgs : Pulumi.ResourceArgs
    {
        [Input("csvVariableSourceDefinition")]
        public Input<Inputs.DashboardVariableSourceDefinitionCsvVariableSourceDefinitionGetArgs>? CsvVariableSourceDefinition { get; set; }

        [Input("logQueryVariableSourceDefinition")]
        public Input<Inputs.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinitionGetArgs>? LogQueryVariableSourceDefinition { get; set; }

        [Input("metadataVariableSourceDefinition")]
        public Input<Inputs.DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionGetArgs>? MetadataVariableSourceDefinition { get; set; }

        public DashboardVariableSourceDefinitionGetArgs()
        {
        }
    }
}