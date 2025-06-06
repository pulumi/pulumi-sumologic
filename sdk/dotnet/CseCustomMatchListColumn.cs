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
    /// Provides a Sumologic CSE Custom Match List Column.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SumoLogic = Pulumi.SumoLogic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var customMatchListColumn = new SumoLogic.CseCustomMatchListColumn("custom_match_list_column", new()
    ///     {
    ///         Name = "Custom Match List Column name",
    ///         Fields = new[]
    ///         {
    ///             "srcDevice_ip",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom Match List Column can be imported using the field id, e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn custom_match_list_column id
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn")]
    public partial class CseCustomMatchListColumn : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Custom Match List Column fields. 
        /// 
        /// The following attributes are exported:
        /// </summary>
        [Output("fields")]
        public Output<ImmutableArray<string>> Fields { get; private set; } = null!;

        /// <summary>
        /// Custom Match List Column name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a CseCustomMatchListColumn resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CseCustomMatchListColumn(string name, CseCustomMatchListColumnArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn", name, args ?? new CseCustomMatchListColumnArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CseCustomMatchListColumn(string name, Input<string> id, CseCustomMatchListColumnState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CseCustomMatchListColumn resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CseCustomMatchListColumn Get(string name, Input<string> id, CseCustomMatchListColumnState? state = null, CustomResourceOptions? options = null)
        {
            return new CseCustomMatchListColumn(name, id, state, options);
        }
    }

    public sealed class CseCustomMatchListColumnArgs : global::Pulumi.ResourceArgs
    {
        [Input("fields", required: true)]
        private InputList<string>? _fields;

        /// <summary>
        /// Custom Match List Column fields. 
        /// 
        /// The following attributes are exported:
        /// </summary>
        public InputList<string> Fields
        {
            get => _fields ?? (_fields = new InputList<string>());
            set => _fields = value;
        }

        /// <summary>
        /// Custom Match List Column name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CseCustomMatchListColumnArgs()
        {
        }
        public static new CseCustomMatchListColumnArgs Empty => new CseCustomMatchListColumnArgs();
    }

    public sealed class CseCustomMatchListColumnState : global::Pulumi.ResourceArgs
    {
        [Input("fields")]
        private InputList<string>? _fields;

        /// <summary>
        /// Custom Match List Column fields. 
        /// 
        /// The following attributes are exported:
        /// </summary>
        public InputList<string> Fields
        {
            get => _fields ?? (_fields = new InputList<string>());
            set => _fields = value;
        }

        /// <summary>
        /// Custom Match List Column name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CseCustomMatchListColumnState()
        {
        }
        public static new CseCustomMatchListColumnState Empty => new CseCustomMatchListColumnState();
    }
}
