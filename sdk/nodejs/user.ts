// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a [Sumologic User](https://help.sumologic.com/Manage/Users-and-Roles/Manage-Users).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const exampleRole = new sumologic.Role("exampleRole", {description: "Testing resource sumologic_role"});
 * const exampleUser1 = new sumologic.User("exampleUser1", {
 *     firstName: "Jon",
 *     lastName: "Doe",
 *     email: "jon.doe@gmail.com",
 *     isActive: true,
 *     roleIds: [exampleRole.id],
 *     transferTo: "",
 * });
 * const exampleUser2 = new sumologic.User("exampleUser2", {
 *     firstName: "Jane",
 *     lastName: "Smith",
 *     email: "jane.smith@gmail.com",
 *     roleIds: [exampleRole.id],
 *     transferTo: exampleUser1.id,
 * });
 * ```
 * ## Argument reference
 *
 * The following arguments are supported:
 *
 * - `firstName` - (Required) First name of the user.
 * - `lastName` - (Required) Last name of the user.
 * - `email` - (Required) Last name of the user.
 * - `isActive` - (Required) This has the value true if the user is active and false if they have been deactivated..
 * - `roleIds` - (Required) List of roleIds associated with the user.
 * - `transferTo` - (Required) UserId of user to transfer this user's content to on deletion, can be empty. Must be applied prior to deletion to take effect.
 *
 * The following attributes are exported:
 *
 * - `id` - The internal ID of the user.
 *
 * ## Import
 *
 * Users can be imported using the user id, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/user:User user 1234567890
 * ```
 *
 *  [1]https://help.sumologic.com/Manage/Users-and-Roles/Manage-Users
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    public readonly email!: pulumi.Output<string>;
    public readonly firstName!: pulumi.Output<string>;
    public readonly isActive!: pulumi.Output<boolean>;
    public readonly lastName!: pulumi.Output<string>;
    public readonly roleIds!: pulumi.Output<string[]>;
    public readonly transferTo!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            inputs["email"] = state ? state.email : undefined;
            inputs["firstName"] = state ? state.firstName : undefined;
            inputs["isActive"] = state ? state.isActive : undefined;
            inputs["lastName"] = state ? state.lastName : undefined;
            inputs["roleIds"] = state ? state.roleIds : undefined;
            inputs["transferTo"] = state ? state.transferTo : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.firstName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firstName'");
            }
            if ((!args || args.isActive === undefined) && !opts.urn) {
                throw new Error("Missing required property 'isActive'");
            }
            if ((!args || args.lastName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lastName'");
            }
            if ((!args || args.roleIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleIds'");
            }
            if ((!args || args.transferTo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transferTo'");
            }
            inputs["email"] = args ? args.email : undefined;
            inputs["firstName"] = args ? args.firstName : undefined;
            inputs["isActive"] = args ? args.isActive : undefined;
            inputs["lastName"] = args ? args.lastName : undefined;
            inputs["roleIds"] = args ? args.roleIds : undefined;
            inputs["transferTo"] = args ? args.transferTo : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(User.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    readonly email?: pulumi.Input<string>;
    readonly firstName?: pulumi.Input<string>;
    readonly isActive?: pulumi.Input<boolean>;
    readonly lastName?: pulumi.Input<string>;
    readonly roleIds?: pulumi.Input<pulumi.Input<string>[]>;
    readonly transferTo?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    readonly email: pulumi.Input<string>;
    readonly firstName: pulumi.Input<string>;
    readonly isActive: pulumi.Input<boolean>;
    readonly lastName: pulumi.Input<string>;
    readonly roleIds: pulumi.Input<pulumi.Input<string>[]>;
    readonly transferTo: pulumi.Input<string>;
}