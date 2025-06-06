// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class DashboardTopologyLabelMapDataArgs : global::Pulumi.ResourceArgs
    {
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public DashboardTopologyLabelMapDataArgs()
        {
        }
        public static new DashboardTopologyLabelMapDataArgs Empty => new DashboardTopologyLabelMapDataArgs();
    }
}
