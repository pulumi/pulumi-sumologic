// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardPanelServiceMapPanelArgs : global::Pulumi.ResourceArgs
    {
        [Input("application")]
        public Input<string>? Application { get; set; }

        [Input("environment")]
        public Input<string>? Environment { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("keepVisualSettingsConsistentWithParent")]
        public Input<bool>? KeepVisualSettingsConsistentWithParent { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("service")]
        public Input<string>? Service { get; set; }

        [Input("showRemoteServices")]
        public Input<bool>? ShowRemoteServices { get; set; }

        /// <summary>
        /// Title of the dashboard.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        [Input("visualSettings")]
        public Input<string>? VisualSettings { get; set; }

        public DashboardPanelServiceMapPanelArgs()
        {
        }
        public static new DashboardPanelServiceMapPanelArgs Empty => new DashboardPanelServiceMapPanelArgs();
    }
}