// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Sumologic CSE Automation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const insightAutomation = new sumologic.CseAutomation("insightAutomation", {
 *     cseResourceType: "INSIGHT",
 *     executionTypes: [
 *         "NEW_INSIGHT",
 *         "INSIGHT_CLOSED",
 *     ],
 *     playbookId: "638079aedb99cafada1e80a0",
 * });
 * const entityAutomation = new sumologic.CseAutomation("entityAutomation", {
 *     cseResourceSubTypes: ["_ip"],
 *     cseResourceType: "ENTITY",
 *     executionTypes: ["ON_DEMAND"],
 *     playbookId: "638079aedb99cafada1e80a0",
 * });
 * ```
 *
 * ## Import
 *
 * Automation can be imported using the field id, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/cseAutomation:CseAutomation automation id
 * ```
 */
export class CseAutomation extends pulumi.CustomResource {
    /**
     * Get an existing CseAutomation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseAutomationState, opts?: pulumi.CustomResourceOptions): CseAutomation {
        return new CseAutomation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseAutomation:CseAutomation';

    /**
     * Returns true if the given object is an instance of CseAutomation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseAutomation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseAutomation.__pulumiType;
    }

    /**
     * CSE Resource sub-type when cseResourceType is specified as "ENTITY". Examples: "_ip", "_mac".
     */
    public readonly cseResourceSubTypes!: pulumi.Output<string[] | undefined>;
    /**
     * CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
     */
    public readonly cseResourceType!: pulumi.Output<string>;
    /**
     * Automation description.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
     */
    public readonly executionTypes!: pulumi.Output<string[]>;
    /**
     * Automation name.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    public readonly playbookId!: pulumi.Output<string>;

    /**
     * Create a CseAutomation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CseAutomationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseAutomationArgs | CseAutomationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseAutomationState | undefined;
            resourceInputs["cseResourceSubTypes"] = state ? state.cseResourceSubTypes : undefined;
            resourceInputs["cseResourceType"] = state ? state.cseResourceType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["executionTypes"] = state ? state.executionTypes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["playbookId"] = state ? state.playbookId : undefined;
        } else {
            const args = argsOrState as CseAutomationArgs | undefined;
            if ((!args || args.cseResourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cseResourceType'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.executionTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'executionTypes'");
            }
            if ((!args || args.playbookId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'playbookId'");
            }
            resourceInputs["cseResourceSubTypes"] = args ? args.cseResourceSubTypes : undefined;
            resourceInputs["cseResourceType"] = args ? args.cseResourceType : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["executionTypes"] = args ? args.executionTypes : undefined;
            resourceInputs["playbookId"] = args ? args.playbookId : undefined;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CseAutomation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseAutomation resources.
 */
export interface CseAutomationState {
    /**
     * CSE Resource sub-type when cseResourceType is specified as "ENTITY". Examples: "_ip", "_mac".
     */
    cseResourceSubTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
     */
    cseResourceType?: pulumi.Input<string>;
    /**
     * Automation description.
     */
    description?: pulumi.Input<string>;
    enabled?: pulumi.Input<boolean>;
    /**
     * Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
     */
    executionTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Automation name.
     */
    name?: pulumi.Input<string>;
    playbookId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CseAutomation resource.
 */
export interface CseAutomationArgs {
    /**
     * CSE Resource sub-type when cseResourceType is specified as "ENTITY". Examples: "_ip", "_mac".
     */
    cseResourceSubTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * CSE Resource type for automation. Valid values: "INSIGHT", "ENTITY".
     */
    cseResourceType: pulumi.Input<string>;
    enabled: pulumi.Input<boolean>;
    /**
     * Automation execution type. Valid values: "NEW_INSIGHT", "INSIGHT_CLOSED", "ON_DEMAND".
     */
    executionTypes: pulumi.Input<pulumi.Input<string>[]>;
    playbookId: pulumi.Input<string>;
}