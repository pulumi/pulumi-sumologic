// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a [Sumologic Ingest Budget v2][1].This API is in private beta and is not available until given access. To participate in the beta program contact your Sumo Logic account representative.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const budget = new sumologic.IngestBudgetV2("budget", {
 *     action: "keepCollecting",
 *     auditThreshold: 85,
 *     capacityBytes: 30000000000,
 *     description: "For testing purposes",
 *     resetTime: "00:00",
 *     scope: "_sourceCategory=*prod*nginx*",
 *     timezone: "Etc/UTC",
 * });
 * ```
 *
 * ## Import
 *
 * Ingest budgets can be imported using the name, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/ingestBudgetV2:IngestBudgetV2 budget budgetName
 * ```
 *
 *  [1]https://help.sumologic.com/Beta/Metadata_Ingest_Budgets [2]https://en.wikipedia.org/wiki/Tz_database
 */
export class IngestBudgetV2 extends pulumi.CustomResource {
    /**
     * Get an existing IngestBudgetV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IngestBudgetV2State, opts?: pulumi.CustomResourceOptions): IngestBudgetV2 {
        return new IngestBudgetV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/ingestBudgetV2:IngestBudgetV2';

    /**
     * Returns true if the given object is an instance of IngestBudgetV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IngestBudgetV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IngestBudgetV2.__pulumiType;
    }

    /**
     * Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
     */
    public readonly auditThreshold!: pulumi.Output<number | undefined>;
    /**
     * Capacity of the ingest budget, in bytes.
     */
    public readonly capacityBytes!: pulumi.Output<number>;
    /**
     * The description of the collector.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Display name of the ingest budget. This must be unique across all of the ingest budgets
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
     */
    public readonly resetTime!: pulumi.Output<string>;
    /**
     * A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
     */
    public readonly scope!: pulumi.Output<string>;
    /**
     * The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
     */
    public readonly timezone!: pulumi.Output<string>;

    /**
     * Create a IngestBudgetV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IngestBudgetV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IngestBudgetV2Args | IngestBudgetV2State, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IngestBudgetV2State | undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["auditThreshold"] = state ? state.auditThreshold : undefined;
            inputs["capacityBytes"] = state ? state.capacityBytes : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resetTime"] = state ? state.resetTime : undefined;
            inputs["scope"] = state ? state.scope : undefined;
            inputs["timezone"] = state ? state.timezone : undefined;
        } else {
            const args = argsOrState as IngestBudgetV2Args | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.capacityBytes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'capacityBytes'");
            }
            if ((!args || args.resetTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resetTime'");
            }
            if ((!args || args.scope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scope'");
            }
            if ((!args || args.timezone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timezone'");
            }
            inputs["action"] = args ? args.action : undefined;
            inputs["auditThreshold"] = args ? args.auditThreshold : undefined;
            inputs["capacityBytes"] = args ? args.capacityBytes : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resetTime"] = args ? args.resetTime : undefined;
            inputs["scope"] = args ? args.scope : undefined;
            inputs["timezone"] = args ? args.timezone : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(IngestBudgetV2.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IngestBudgetV2 resources.
 */
export interface IngestBudgetV2State {
    /**
     * Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
     */
    readonly action?: pulumi.Input<string>;
    /**
     * The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
     */
    readonly auditThreshold?: pulumi.Input<number>;
    /**
     * Capacity of the ingest budget, in bytes.
     */
    readonly capacityBytes?: pulumi.Input<number>;
    /**
     * The description of the collector.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Display name of the ingest budget. This must be unique across all of the ingest budgets
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
     */
    readonly resetTime?: pulumi.Input<string>;
    /**
     * A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
     */
    readonly scope?: pulumi.Input<string>;
    /**
     * The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
     */
    readonly timezone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IngestBudgetV2 resource.
 */
export interface IngestBudgetV2Args {
    /**
     * Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
     */
    readonly action: pulumi.Input<string>;
    /**
     * The threshold as a percentage of when an ingest budget's capacity usage is logged in the Audit Index.
     */
    readonly auditThreshold?: pulumi.Input<number>;
    /**
     * Capacity of the ingest budget, in bytes.
     */
    readonly capacityBytes: pulumi.Input<number>;
    /**
     * The description of the collector.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Display name of the ingest budget. This must be unique across all of the ingest budgets
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
     */
    readonly resetTime: pulumi.Input<string>;
    /**
     * A scope is a constraint that will be used to identify the messages on which budget needs to be applied. A scope is consists of key and value separated by =. The field must be enabled in the fields table.
     */
    readonly scope: pulumi.Input<string>;
    /**
     * The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
     */
    readonly timezone: pulumi.Input<string>;
}