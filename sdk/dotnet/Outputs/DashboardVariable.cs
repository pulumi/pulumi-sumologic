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
    public sealed class DashboardVariable
    {
        public readonly bool? AllowMultiSelect;
        public readonly string? DefaultValue;
        public readonly string? DisplayName;
        public readonly bool? HideFromUi;
        public readonly string? Id;
        public readonly bool? IncludeAllOption;
        public readonly string Name;
        public readonly Outputs.DashboardVariableSourceDefinition SourceDefinition;

        [OutputConstructor]
        private DashboardVariable(
            bool? allowMultiSelect,

            string? defaultValue,

            string? displayName,

            bool? hideFromUi,

            string? id,

            bool? includeAllOption,

            string name,

            Outputs.DashboardVariableSourceDefinition sourceDefinition)
        {
            AllowMultiSelect = allowMultiSelect;
            DefaultValue = defaultValue;
            DisplayName = displayName;
            HideFromUi = hideFromUi;
            Id = id;
            IncludeAllOption = includeAllOption;
            Name = name;
            SourceDefinition = sourceDefinition;
        }
    }
}