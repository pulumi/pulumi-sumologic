// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Outputs
{

    [OutputType]
    public sealed class DashboardVariableSourceDefinitionMetadataVariableSourceDefinition
    {
        public readonly string Filter;
        public readonly string Key;

        [OutputConstructor]
        private DashboardVariableSourceDefinitionMetadataVariableSourceDefinition(
            string filter,

            string key)
        {
            Filter = filter;
            Key = key;
        }
    }
}