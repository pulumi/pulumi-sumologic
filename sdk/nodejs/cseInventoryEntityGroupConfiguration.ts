// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const inventoryEntityGroupConfiguration = new sumologic.CseInventoryEntityGroupConfiguration("inventory_entity_group_configuration", {
 *     criticality: "HIGH",
 *     description: "Inventory entity group description",
 *     inventoryType: "username",
 *     inventorySource: "Active Directory",
 *     inventoryKey: "groups",
 *     inventoryValue: "http_servers",
 *     name: "Inventory entity group configuration",
 *     suppressed: false,
 *     tags: ["tag"],
 * });
 * ```
 *
 * ## Import
 *
 * Inventory Entity Group Configuration can be imported using the field id, e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/cseInventoryEntityGroupConfiguration:CseInventoryEntityGroupConfiguration inventory_entity_group_configuration id
 * ```
 */
export class CseInventoryEntityGroupConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing CseInventoryEntityGroupConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseInventoryEntityGroupConfigurationState, opts?: pulumi.CustomResourceOptions): CseInventoryEntityGroupConfiguration {
        return new CseInventoryEntityGroupConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseInventoryEntityGroupConfiguration:CseInventoryEntityGroupConfiguration';

    /**
     * Returns true if the given object is an instance of CseInventoryEntityGroupConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseInventoryEntityGroupConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseInventoryEntityGroupConfiguration.__pulumiType;
    }

    /**
     * The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
     */
    public readonly criticality!: pulumi.Output<string | undefined>;
    /**
     * The entity group configuration description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * If dynamic tags are enabled for configuration.
     */
    public readonly dynamicTags!: pulumi.Output<boolean | undefined>;
    /**
     * (Deprecated) The entity group configuration inventory group. The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue`  instead.
     *
     * @deprecated The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue` instead.
     */
    public readonly group!: pulumi.Output<string | undefined>;
    /**
     * The inventory key to apply configuration Examples: "groups", "normalizedHostname", "normalizedComputerName".
     */
    public readonly inventoryKey!: pulumi.Output<string | undefined>;
    /**
     * The inventory source Examples: "Active Directory", "Okta".
     */
    public readonly inventorySource!: pulumi.Output<string>;
    /**
     * The inventory type Examples: "computer", "username".
     */
    public readonly inventoryType!: pulumi.Output<string>;
    /**
     * The inventory value to match.
     */
    public readonly inventoryValue!: pulumi.Output<string | undefined>;
    /**
     * The entity group configuration name.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly suppressed!: pulumi.Output<boolean | undefined>;
    /**
     * The tag schema to be used for dynamic tags.
     */
    public readonly tagSchema!: pulumi.Output<string | undefined>;
    /**
     * The entity group configuration tags list.
     *
     * The following attributes are exported:
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a CseInventoryEntityGroupConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CseInventoryEntityGroupConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseInventoryEntityGroupConfigurationArgs | CseInventoryEntityGroupConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseInventoryEntityGroupConfigurationState | undefined;
            resourceInputs["criticality"] = state ? state.criticality : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dynamicTags"] = state ? state.dynamicTags : undefined;
            resourceInputs["group"] = state ? state.group : undefined;
            resourceInputs["inventoryKey"] = state ? state.inventoryKey : undefined;
            resourceInputs["inventorySource"] = state ? state.inventorySource : undefined;
            resourceInputs["inventoryType"] = state ? state.inventoryType : undefined;
            resourceInputs["inventoryValue"] = state ? state.inventoryValue : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["suppressed"] = state ? state.suppressed : undefined;
            resourceInputs["tagSchema"] = state ? state.tagSchema : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as CseInventoryEntityGroupConfigurationArgs | undefined;
            if ((!args || args.inventorySource === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inventorySource'");
            }
            if ((!args || args.inventoryType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inventoryType'");
            }
            resourceInputs["criticality"] = args ? args.criticality : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dynamicTags"] = args ? args.dynamicTags : undefined;
            resourceInputs["group"] = args ? args.group : undefined;
            resourceInputs["inventoryKey"] = args ? args.inventoryKey : undefined;
            resourceInputs["inventorySource"] = args ? args.inventorySource : undefined;
            resourceInputs["inventoryType"] = args ? args.inventoryType : undefined;
            resourceInputs["inventoryValue"] = args ? args.inventoryValue : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["suppressed"] = args ? args.suppressed : undefined;
            resourceInputs["tagSchema"] = args ? args.tagSchema : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CseInventoryEntityGroupConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseInventoryEntityGroupConfiguration resources.
 */
export interface CseInventoryEntityGroupConfigurationState {
    /**
     * The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
     */
    criticality?: pulumi.Input<string>;
    /**
     * The entity group configuration description.
     */
    description?: pulumi.Input<string>;
    /**
     * If dynamic tags are enabled for configuration.
     */
    dynamicTags?: pulumi.Input<boolean>;
    /**
     * (Deprecated) The entity group configuration inventory group. The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue`  instead.
     *
     * @deprecated The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue` instead.
     */
    group?: pulumi.Input<string>;
    /**
     * The inventory key to apply configuration Examples: "groups", "normalizedHostname", "normalizedComputerName".
     */
    inventoryKey?: pulumi.Input<string>;
    /**
     * The inventory source Examples: "Active Directory", "Okta".
     */
    inventorySource?: pulumi.Input<string>;
    /**
     * The inventory type Examples: "computer", "username".
     */
    inventoryType?: pulumi.Input<string>;
    /**
     * The inventory value to match.
     */
    inventoryValue?: pulumi.Input<string>;
    /**
     * The entity group configuration name.
     */
    name?: pulumi.Input<string>;
    suppressed?: pulumi.Input<boolean>;
    /**
     * The tag schema to be used for dynamic tags.
     */
    tagSchema?: pulumi.Input<string>;
    /**
     * The entity group configuration tags list.
     *
     * The following attributes are exported:
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a CseInventoryEntityGroupConfiguration resource.
 */
export interface CseInventoryEntityGroupConfigurationArgs {
    /**
     * The entity group configuration criticality Examples: "HIGH", "CRITICALITY".
     */
    criticality?: pulumi.Input<string>;
    /**
     * The entity group configuration description.
     */
    description?: pulumi.Input<string>;
    /**
     * If dynamic tags are enabled for configuration.
     */
    dynamicTags?: pulumi.Input<boolean>;
    /**
     * (Deprecated) The entity group configuration inventory group. The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue`  instead.
     *
     * @deprecated The field `group` is deprecated and will be removed in a future release of the provider -- please make usage of `inventoryKey`, `inventoryValue` instead.
     */
    group?: pulumi.Input<string>;
    /**
     * The inventory key to apply configuration Examples: "groups", "normalizedHostname", "normalizedComputerName".
     */
    inventoryKey?: pulumi.Input<string>;
    /**
     * The inventory source Examples: "Active Directory", "Okta".
     */
    inventorySource: pulumi.Input<string>;
    /**
     * The inventory type Examples: "computer", "username".
     */
    inventoryType: pulumi.Input<string>;
    /**
     * The inventory value to match.
     */
    inventoryValue?: pulumi.Input<string>;
    /**
     * The entity group configuration name.
     */
    name?: pulumi.Input<string>;
    suppressed?: pulumi.Input<boolean>;
    /**
     * The tag schema to be used for dynamic tags.
     */
    tagSchema?: pulumi.Input<string>;
    /**
     * The entity group configuration tags list.
     *
     * The following attributes are exported:
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
