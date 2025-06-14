// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic
{
    /// <summary>
    /// The provider type for the sumologic package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [SumoLogicResourceType("pulumi:providers:sumologic")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        [Output("accessId")]
        public Output<string?> AccessId { get; private set; } = null!;

        [Output("accessKey")]
        public Output<string?> AccessKey { get; private set; } = null!;

        [Output("baseUrl")]
        public Output<string?> BaseUrl { get; private set; } = null!;

        [Output("environment")]
        public Output<string?> Environment { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("sumologic", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }

        /// <summary>
        /// This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        /// </summary>
        public global::Pulumi.Output<ProviderTerraformConfigResult> TerraformConfig()
            => global::Pulumi.Deployment.Instance.Call<ProviderTerraformConfigResult>("pulumi:providers:sumologic/terraformConfig", CallArgs.Empty, this);
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessId")]
        public Input<string>? AccessId { get; set; }

        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        [Input("adminMode", json: true)]
        public Input<bool>? AdminMode { get; set; }

        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        [Input("environment")]
        public Input<string>? Environment { get; set; }

        public ProviderArgs()
        {
            BaseUrl = Utilities.GetEnv("SUMOLOGIC_BASE_URL");
            Environment = Utilities.GetEnv("SUMOLOGIC_ENVIRONMENT");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }

    /// <summary>
    /// The results of the <see cref="Provider.TerraformConfig"/> method.
    /// </summary>
    [OutputType]
    public sealed class ProviderTerraformConfigResult
    {
        public readonly ImmutableDictionary<string, object> Result;

        [OutputConstructor]
        private ProviderTerraformConfigResult(ImmutableDictionary<string, object> result)
        {
            Result = result;
        }
    }
}
