// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelArgs : Pulumi.ResourceArgs
    {
        [Input("sumoSearchPanel")]
        public Input<Inputs.DashboardPanelSumoSearchPanelArgs>? SumoSearchPanel { get; set; }

        [Input("textPanel")]
        public Input<Inputs.DashboardPanelTextPanelArgs>? TextPanel { get; set; }

        public DashboardPanelArgs()
        {
        }
    }
}