// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardVariableGetArgs : Pulumi.ResourceArgs
    {
        [Input("allowMultiSelect")]
        public Input<bool>? AllowMultiSelect { get; set; }

        [Input("defaultValue")]
        public Input<string>? DefaultValue { get; set; }

        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("hideFromUi")]
        public Input<bool>? HideFromUi { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("includeAllOption")]
        public Input<bool>? IncludeAllOption { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("sourceDefinition", required: true)]
        public Input<Inputs.DashboardVariableSourceDefinitionGetArgs> SourceDefinition { get; set; } = null!;

        public DashboardVariableGetArgs()
        {
        }
    }
}