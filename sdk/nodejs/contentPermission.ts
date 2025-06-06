// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a way to configure permissions on a content to share it with a user, a role, or the entire
 * org. You can read more [here](https://help.sumologic.com/Manage/Content_Sharing/Share-Content).
 *
 * There are three permission levels `View`, `Edit` and `Manage`. You can read more about different
 * levels [here](https://help.sumologic.com/Manage/Content_Sharing/Share-Content#available-permission-levels).
 *
 * > When you add a new permission to a content, all the lower level permissions are added by default.
 * For example, giving a user "Manage" permission on a content, implicitly gives them "Edit" and "View"
 * permissions on the content. Due to this behavior, when you add a higher level permission, you must
 * also add all the lower level permissions. For example, when you give a user "Edit" permission via
 * the resource, you must give them "View" permission otherwise state and configuration will be out
 * of sync.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const personalFolder = sumologic.getPersonalFolder({});
 * const permissionTestContent = new sumologic.Content("permission_test_content", {
 *     parentId: personalFolder.then(personalFolder => personalFolder.id),
 *     config: JSON.stringify({
 *         type: "FolderSyncDefinition",
 *         name: "test_permission_resource_folder",
 *         description: "",
 *         children: [],
 *     }),
 * });
 * const role = sumologic.getRole({
 *     name: "test_role",
 * });
 * const user = sumologic.getUser({
 *     email: "user@example.com",
 * });
 * // Grant user `user@example.com` "Manage" permission and role `test_role`
 * // "View" permission on the folder `test_permission_resource_folder`.
 * const contentPermissionTest = new sumologic.ContentPermission("content_permission_test", {
 *     contentId: permissionTestContent.id,
 *     notifyRecipient: true,
 *     notificationMessage: "You now have the permission to access this content",
 *     permissions: [
 *         {
 *             permissionName: "View",
 *             sourceType: "role",
 *             sourceId: role.then(role => role.id),
 *         },
 *         {
 *             permissionName: "View",
 *             sourceType: "user",
 *             sourceId: user.then(user => user.id),
 *         },
 *         {
 *             permissionName: "Edit",
 *             sourceType: "user",
 *             sourceId: user.then(user => user.id),
 *         },
 *         {
 *             permissionName: "Manage",
 *             sourceType: "user",
 *             sourceId: user.then(user => user.id),
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Permisions on a content item can be imported using the content identifier, e.g.:
 *
 * hcl
 *
 * // import permissions for content item with identifier = 0000000008E0183E
 *
 * ```sh
 * $ pulumi import sumologic:index/contentPermission:ContentPermission dashboard_permission_import 0000000008E0183E
 * ```
 */
export class ContentPermission extends pulumi.CustomResource {
    /**
     * Get an existing ContentPermission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ContentPermissionState, opts?: pulumi.CustomResourceOptions): ContentPermission {
        return new ContentPermission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/contentPermission:ContentPermission';

    /**
     * Returns true if the given object is an instance of ContentPermission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ContentPermission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ContentPermission.__pulumiType;
    }

    /**
     * The identifier of the content item for which you want to update
     * permissions.
     */
    public readonly contentId!: pulumi.Output<string>;
    /**
     * The notification message to send to the users.
     */
    public readonly notificationMessage!: pulumi.Output<string | undefined>;
    /**
     * Boolean value. Set it to "true" to notify the recipients by email.
     */
    public readonly notifyRecipient!: pulumi.Output<boolean>;
    /**
     * Permission block defining permission on the content. See
     * permission schema for details.
     */
    public readonly permissions!: pulumi.Output<outputs.ContentPermissionPermission[]>;

    /**
     * Create a ContentPermission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ContentPermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ContentPermissionArgs | ContentPermissionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ContentPermissionState | undefined;
            resourceInputs["contentId"] = state ? state.contentId : undefined;
            resourceInputs["notificationMessage"] = state ? state.notificationMessage : undefined;
            resourceInputs["notifyRecipient"] = state ? state.notifyRecipient : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
        } else {
            const args = argsOrState as ContentPermissionArgs | undefined;
            if ((!args || args.contentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contentId'");
            }
            if ((!args || args.notifyRecipient === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notifyRecipient'");
            }
            if ((!args || args.permissions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permissions'");
            }
            resourceInputs["contentId"] = args ? args.contentId : undefined;
            resourceInputs["notificationMessage"] = args ? args.notificationMessage : undefined;
            resourceInputs["notifyRecipient"] = args ? args.notifyRecipient : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ContentPermission.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ContentPermission resources.
 */
export interface ContentPermissionState {
    /**
     * The identifier of the content item for which you want to update
     * permissions.
     */
    contentId?: pulumi.Input<string>;
    /**
     * The notification message to send to the users.
     */
    notificationMessage?: pulumi.Input<string>;
    /**
     * Boolean value. Set it to "true" to notify the recipients by email.
     */
    notifyRecipient?: pulumi.Input<boolean>;
    /**
     * Permission block defining permission on the content. See
     * permission schema for details.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.ContentPermissionPermission>[]>;
}

/**
 * The set of arguments for constructing a ContentPermission resource.
 */
export interface ContentPermissionArgs {
    /**
     * The identifier of the content item for which you want to update
     * permissions.
     */
    contentId: pulumi.Input<string>;
    /**
     * The notification message to send to the users.
     */
    notificationMessage?: pulumi.Input<string>;
    /**
     * Boolean value. Set it to "true" to notify the recipients by email.
     */
    notifyRecipient: pulumi.Input<boolean>;
    /**
     * Permission block defining permission on the content. See
     * permission schema for details.
     */
    permissions: pulumi.Input<pulumi.Input<inputs.ContentPermissionPermission>[]>;
}
