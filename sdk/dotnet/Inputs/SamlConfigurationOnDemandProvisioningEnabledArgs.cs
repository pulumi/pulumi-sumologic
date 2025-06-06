// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class SamlConfigurationOnDemandProvisioningEnabledArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// First name attribute of the new user account. Defaults to "".
        /// </summary>
        [Input("firstNameAttribute")]
        public Input<string>? FirstNameAttribute { get; set; }

        /// <summary>
        /// Last name attribute of the new user account. Defaults to "".
        /// </summary>
        [Input("lastNameAttribute")]
        public Input<string>? LastNameAttribute { get; set; }

        [Input("onDemandProvisioningRoles", required: true)]
        private InputList<string>? _onDemandProvisioningRoles;

        /// <summary>
        /// List of Sumo Logic RBAC roles to be assigned when user accounts are provisioned.
        /// </summary>
        public InputList<string> OnDemandProvisioningRoles
        {
            get => _onDemandProvisioningRoles ?? (_onDemandProvisioningRoles = new InputList<string>());
            set => _onDemandProvisioningRoles = value;
        }

        public SamlConfigurationOnDemandProvisioningEnabledArgs()
        {
        }
        public static new SamlConfigurationOnDemandProvisioningEnabledArgs Empty => new SamlConfigurationOnDemandProvisioningEnabledArgs();
    }
}
