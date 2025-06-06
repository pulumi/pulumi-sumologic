// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic
{
    public static class GetUser
    {
        /// <summary>
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
        ///     var @this = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Id = "1234567890",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using SumoLogic = Pulumi.SumoLogic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var that = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Email = "user@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// A user can be looked up by either `id` or `email`. One of those attributes needs to be specified.
        /// 
        /// If both `id` and `email` have been specified, `id` takes precedence.
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// - `id` - The internal ID of the user.
        /// - `email` - (Required) Email of the user.
        /// - `first_name` - (Required) First name of the user.
        /// - `last_name` - (Required) Last name of the user.
        /// - `is_active` - (Required) This has the value true if the user is active and false if they have been deactivated.
        /// - `role_ids` - (Required) List of roleIds associated with the user.
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("sumologic:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var @this = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Id = "1234567890",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using SumoLogic = Pulumi.SumoLogic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var that = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Email = "user@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// A user can be looked up by either `id` or `email`. One of those attributes needs to be specified.
        /// 
        /// If both `id` and `email` have been specified, `id` takes precedence.
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// - `id` - The internal ID of the user.
        /// - `email` - (Required) Email of the user.
        /// - `first_name` - (Required) First name of the user.
        /// - `last_name` - (Required) Last name of the user.
        /// - `is_active` - (Required) This has the value true if the user is active and false if they have been deactivated.
        /// - `role_ids` - (Required) List of roleIds associated with the user.
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("sumologic:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var @this = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Id = "1234567890",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using SumoLogic = Pulumi.SumoLogic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var that = SumoLogic.GetUser.Invoke(new()
        ///     {
        ///         Email = "user@example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// A user can be looked up by either `id` or `email`. One of those attributes needs to be specified.
        /// 
        /// If both `id` and `email` have been specified, `id` takes precedence.
        /// 
        /// ## Attributes reference
        /// 
        /// The following attributes are exported:
        /// 
        /// - `id` - The internal ID of the user.
        /// - `email` - (Required) Email of the user.
        /// - `first_name` - (Required) First name of the user.
        /// - `last_name` - (Required) Last name of the user.
        /// - `is_active` - (Required) This has the value true if the user is active and false if they have been deactivated.
        /// - `role_ids` - (Required) List of roleIds associated with the user.
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("sumologic:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        [Input("email")]
        public string? Email { get; set; }

        [Input("id")]
        public string? Id { get; set; }

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        public readonly string Email;
        public readonly string FirstName;
        public readonly string Id;
        public readonly bool IsActive;
        public readonly string LastName;
        public readonly ImmutableArray<string> RoleIds;

        [OutputConstructor]
        private GetUserResult(
            string email,

            string firstName,

            string id,

            bool isActive,

            string lastName,

            ImmutableArray<string> roleIds)
        {
            Email = email;
            FirstName = firstName;
            Id = id;
            IsActive = isActive;
            LastName = lastName;
            RoleIds = roleIds;
        }
    }
}
