// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Sumologic CSE Insights Resolution. When an insight gets closed, a resolution indicates why it got closed.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const insightsResolution = new sumologic.CseInsightsResolution("insights_resolution", {
 *     name: "New Name",
 *     description: "New description",
 *     parent: "No Action",
 * });
 * ```
 *
 * ## Import
 *
 * Insights Resolution can be imported using the field id, e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/cseInsightsResolution:CseInsightsResolution insights_resolution id
 * ```
 */
export class CseInsightsResolution extends pulumi.CustomResource {
    /**
     * Get an existing CseInsightsResolution resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseInsightsResolutionState, opts?: pulumi.CustomResourceOptions): CseInsightsResolution {
        return new CseInsightsResolution(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseInsightsResolution:CseInsightsResolution';

    /**
     * Returns true if the given object is an instance of CseInsightsResolution.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseInsightsResolution {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseInsightsResolution.__pulumiType;
    }

    /**
     * The description of the insights resolution.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the insights resolution.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the built-in parent insights resolution. Supported values: "Resolved", "False Positive", "No Action", "Duplicate"
     *
     *
     * The following attributes are exported:
     */
    public readonly parent!: pulumi.Output<string | undefined>;

    /**
     * Create a CseInsightsResolution resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CseInsightsResolutionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseInsightsResolutionArgs | CseInsightsResolutionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseInsightsResolutionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
        } else {
            const args = argsOrState as CseInsightsResolutionArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CseInsightsResolution.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseInsightsResolution resources.
 */
export interface CseInsightsResolutionState {
    /**
     * The description of the insights resolution.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the insights resolution.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the built-in parent insights resolution. Supported values: "Resolved", "False Positive", "No Action", "Duplicate"
     *
     *
     * The following attributes are exported:
     */
    parent?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CseInsightsResolution resource.
 */
export interface CseInsightsResolutionArgs {
    /**
     * The description of the insights resolution.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the insights resolution.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the built-in parent insights resolution. Supported values: "Resolved", "False Positive", "No Action", "Duplicate"
     *
     *
     * The following attributes are exported:
     */
    parent?: pulumi.Input<string>;
}
