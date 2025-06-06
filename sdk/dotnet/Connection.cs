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
    /// Provides the ability to create, read, delete, update connections.
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
    ///     var connection = new SumoLogic.Connection("connection", new()
    ///     {
    ///         Type = "WebhookConnection",
    ///         Name = "test-connection",
    ///         Description = "My description",
    ///         Url = "https://connection-endpoint.com",
    ///         Headers = 
    ///         {
    ///             { "X-Header", "my-header" },
    ///         },
    ///         CustomHeaders = 
    ///         {
    ///             { "X-custom", "my-custom-header" },
    ///         },
    ///         DefaultPayload = @"{
    ///   ""client"" : ""Sumo Logic"",
    ///   ""eventType"" : ""{{Name}}"",
    ///   ""description"" : ""{{Description}}"",
    ///   ""search_url"" : ""{{QueryUrl}}"",
    ///   ""num_records"" : ""{{NumRawResults}}"",
    ///   ""search_results"" : ""{{AggregateResultsJson}}""
    /// }
    /// ",
    ///         ResolutionPayload = @"{
    ///   ""client"" : ""Sumo Logic"",
    ///   ""eventType"" : ""{{Name}}"",
    ///   ""description"" : ""{{Description}}"",
    ///   ""search_url"" : ""{{QueryUrl}}""
    /// }
    /// ",
    ///         WebhookType = "Webhook",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Connections can be imported using the connection id, e.g.:
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import sumologic:index/connection:Connection test 1234567890
    /// ```
    /// </summary>
    [SumoLogicResourceType("sumologic:index/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The subtype of the connection. Valid values are `Incident` and `Event`. NOTE: This is only used for the `ServiceNow` webhook type.
        /// </summary>
        [Output("connectionSubtype")]
        public Output<string?> ConnectionSubtype { get; private set; } = null!;

        /// <summary>
        /// Map of custom webhook headers
        /// </summary>
        [Output("customHeaders")]
        public Output<ImmutableDictionary<string, string>?> CustomHeaders { get; private set; } = null!;

        /// <summary>
        /// Default payload of the webhook.
        /// </summary>
        [Output("defaultPayload")]
        public Output<string> DefaultPayload { get; private set; } = null!;

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Map of access authorization headers.
        /// </summary>
        [Output("headers")]
        public Output<ImmutableDictionary<string, string>?> Headers { get; private set; } = null!;

        /// <summary>
        /// Name of connection. Name should be a valid alphanumeric value.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Resolution payload of the webhook.
        /// </summary>
        [Output("resolutionPayload")]
        public Output<string> ResolutionPayload { get; private set; } = null!;

        /// <summary>
        /// Type of connection. Only `WebhookConnection` is implemented right now.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// URL for the webhook connection.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Type of webhook. Valid values are `AWSLambda`, `Azure`, `Datadog`, `HipChat`, `Jira`, `PagerDuty`, `Slack`, `Webhook`, `NewRelic`, `MicrosoftTeams`, `ServiceNow`, and `SumoCloudSOAR`. Default: `Webhook`
        /// 
        /// Additional data provided in state
        /// </summary>
        [Output("webhookType")]
        public Output<string?> WebhookType { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("sumologic:index/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("sumologic:index/connection:Connection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "headers",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The subtype of the connection. Valid values are `Incident` and `Event`. NOTE: This is only used for the `ServiceNow` webhook type.
        /// </summary>
        [Input("connectionSubtype")]
        public Input<string>? ConnectionSubtype { get; set; }

        [Input("customHeaders")]
        private InputMap<string>? _customHeaders;

        /// <summary>
        /// Map of custom webhook headers
        /// </summary>
        public InputMap<string> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputMap<string>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Default payload of the webhook.
        /// </summary>
        [Input("defaultPayload", required: true)]
        public Input<string> DefaultPayload { get; set; } = null!;

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;

        /// <summary>
        /// Map of access authorization headers.
        /// </summary>
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _headers = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Name of connection. Name should be a valid alphanumeric value.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resolution payload of the webhook.
        /// </summary>
        [Input("resolutionPayload")]
        public Input<string>? ResolutionPayload { get; set; }

        /// <summary>
        /// Type of connection. Only `WebhookConnection` is implemented right now.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// URL for the webhook connection.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Type of webhook. Valid values are `AWSLambda`, `Azure`, `Datadog`, `HipChat`, `Jira`, `PagerDuty`, `Slack`, `Webhook`, `NewRelic`, `MicrosoftTeams`, `ServiceNow`, and `SumoCloudSOAR`. Default: `Webhook`
        /// 
        /// Additional data provided in state
        /// </summary>
        [Input("webhookType")]
        public Input<string>? WebhookType { get; set; }

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The subtype of the connection. Valid values are `Incident` and `Event`. NOTE: This is only used for the `ServiceNow` webhook type.
        /// </summary>
        [Input("connectionSubtype")]
        public Input<string>? ConnectionSubtype { get; set; }

        [Input("customHeaders")]
        private InputMap<string>? _customHeaders;

        /// <summary>
        /// Map of custom webhook headers
        /// </summary>
        public InputMap<string> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputMap<string>());
            set => _customHeaders = value;
        }

        /// <summary>
        /// Default payload of the webhook.
        /// </summary>
        [Input("defaultPayload")]
        public Input<string>? DefaultPayload { get; set; }

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;

        /// <summary>
        /// Map of access authorization headers.
        /// </summary>
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _headers = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Name of connection. Name should be a valid alphanumeric value.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resolution payload of the webhook.
        /// </summary>
        [Input("resolutionPayload")]
        public Input<string>? ResolutionPayload { get; set; }

        /// <summary>
        /// Type of connection. Only `WebhookConnection` is implemented right now.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// URL for the webhook connection.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Type of webhook. Valid values are `AWSLambda`, `Azure`, `Datadog`, `HipChat`, `Jira`, `PagerDuty`, `Slack`, `Webhook`, `NewRelic`, `MicrosoftTeams`, `ServiceNow`, and `SumoCloudSOAR`. Default: `Webhook`
        /// 
        /// Additional data provided in state
        /// </summary>
        [Input("webhookType")]
        public Input<string>? WebhookType { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
