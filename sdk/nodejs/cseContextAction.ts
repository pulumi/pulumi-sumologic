// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Sumologic CSE Context Action.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const contextAction = new sumologic.CseContextAction("context_action", {
 *     name: "Context Action Name",
 *     type: "URL",
 *     template: "https://bar.com/?q={{value}}",
 *     iocTypes: ["IP_ADDRESS"],
 *     entityTypes: ["_hostname"],
 *     recordFields: ["request_url"],
 *     allRecordFields: false,
 *     enabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * Context Action can be imported using the field id, e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/cseContextAction:CseContextAction context_action id
 * ```
 */
export class CseContextAction extends pulumi.CustomResource {
    /**
     * Get an existing CseContextAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseContextActionState, opts?: pulumi.CustomResourceOptions): CseContextAction {
        return new CseContextAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseContextAction:CseContextAction';

    /**
     * Returns true if the given object is an instance of CseContextAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseContextAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseContextAction.__pulumiType;
    }

    /**
     * Use all record fields.
     */
    public readonly allRecordFields!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the context action is enabled.
     *
     * The following attributes are exported:
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Applicable to given entity types.
     */
    public readonly entityTypes!: pulumi.Output<string[] | undefined>;
    /**
     * IOC Data types. Valid values: "ASN", "DOMAIN", "HASH", "IP_ADDRESS", "MAC_ADDRESS", "PORT", "RECORD_PROPERTY", "URL".
     */
    public readonly iocTypes!: pulumi.Output<string[]>;
    /**
     * Context Action name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specific record fields.
     */
    public readonly recordFields!: pulumi.Output<string[] | undefined>;
    /**
     * The URL/QUERY template.
     */
    public readonly template!: pulumi.Output<string | undefined>;
    /**
     * Context Action type. Valid values: "URL", "QUERY".
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a CseContextAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CseContextActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseContextActionArgs | CseContextActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseContextActionState | undefined;
            resourceInputs["allRecordFields"] = state ? state.allRecordFields : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entityTypes"] = state ? state.entityTypes : undefined;
            resourceInputs["iocTypes"] = state ? state.iocTypes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["recordFields"] = state ? state.recordFields : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as CseContextActionArgs | undefined;
            if ((!args || args.iocTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iocTypes'");
            }
            resourceInputs["allRecordFields"] = args ? args.allRecordFields : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["entityTypes"] = args ? args.entityTypes : undefined;
            resourceInputs["iocTypes"] = args ? args.iocTypes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["recordFields"] = args ? args.recordFields : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CseContextAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseContextAction resources.
 */
export interface CseContextActionState {
    /**
     * Use all record fields.
     */
    allRecordFields?: pulumi.Input<boolean>;
    /**
     * Whether the context action is enabled.
     *
     * The following attributes are exported:
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Applicable to given entity types.
     */
    entityTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * IOC Data types. Valid values: "ASN", "DOMAIN", "HASH", "IP_ADDRESS", "MAC_ADDRESS", "PORT", "RECORD_PROPERTY", "URL".
     */
    iocTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Context Action name.
     */
    name?: pulumi.Input<string>;
    /**
     * Specific record fields.
     */
    recordFields?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URL/QUERY template.
     */
    template?: pulumi.Input<string>;
    /**
     * Context Action type. Valid values: "URL", "QUERY".
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CseContextAction resource.
 */
export interface CseContextActionArgs {
    /**
     * Use all record fields.
     */
    allRecordFields?: pulumi.Input<boolean>;
    /**
     * Whether the context action is enabled.
     *
     * The following attributes are exported:
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Applicable to given entity types.
     */
    entityTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * IOC Data types. Valid values: "ASN", "DOMAIN", "HASH", "IP_ADDRESS", "MAC_ADDRESS", "PORT", "RECORD_PROPERTY", "URL".
     */
    iocTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Context Action name.
     */
    name?: pulumi.Input<string>;
    /**
     * Specific record fields.
     */
    recordFields?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URL/QUERY template.
     */
    template?: pulumi.Input<string>;
    /**
     * Context Action type. Valid values: "URL", "QUERY".
     */
    type?: pulumi.Input<string>;
}
