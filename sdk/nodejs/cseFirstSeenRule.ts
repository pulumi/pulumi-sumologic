// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Sumo Logic CSE [First Seen Rule](https://help.sumologic.com/docs/cse/rules/write-first-seen-rule/).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const firstSeenRule = new sumologic.CseFirstSeenRule("firstSeenRule", {
 *     baselineType: "PER_ENTITY",
 *     baselineWindowSize: "35000",
 *     descriptionExpression: "First User Login - {{ user_username }}",
 *     enabled: true,
 *     entitySelectors: [
 *         {
 *             entityType: "_username",
 *             expression: "user_username",
 *         },
 *         {
 *             entityType: "_hostname",
 *             expression: "dstDevice_hostname",
 *         },
 *     ],
 *     filterExpression: "objectType=\"Network\"",
 *     groupByFields: ["user_username"],
 *     isPrototype: false,
 *     nameExpression: "First User Login - {{ user_username }}",
 *     retentionWindowSize: "86400000",
 *     severity: 1,
 *     valueFields: ["dstDevice_hostname"],
 * });
 * ```
 *
 * ## Import
 *
 * First Seen Rules can be imported using the field id, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/cseFirstSeenRule:CseFirstSeenRule first_seen_rule id
 * ```
 */
export class CseFirstSeenRule extends pulumi.CustomResource {
    /**
     * Get an existing CseFirstSeenRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseFirstSeenRuleState, opts?: pulumi.CustomResourceOptions): CseFirstSeenRule {
        return new CseFirstSeenRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseFirstSeenRule:CseFirstSeenRule';

    /**
     * Returns true if the given object is an instance of CseFirstSeenRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseFirstSeenRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseFirstSeenRule.__pulumiType;
    }

    /**
     * The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     */
    public readonly baselineType!: pulumi.Output<string>;
    /**
     * The baseline window size in milliseconds
     */
    public readonly baselineWindowSize!: pulumi.Output<string>;
    /**
     * The description of the generated Signals
     */
    public readonly descriptionExpression!: pulumi.Output<string>;
    /**
     * Whether the rule should generate Signals
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The entities to generate Signals on
     */
    public readonly entitySelectors!: pulumi.Output<outputs.CseFirstSeenRuleEntitySelector[]>;
    /**
     * The expression for which records to match on
     */
    public readonly filterExpression!: pulumi.Output<string>;
    /**
     * A list of fields to group records by
     */
    public readonly groupByFields!: pulumi.Output<string[] | undefined>;
    /**
     * Whether the generated Signals should be prototype Signals
     */
    public readonly isPrototype!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Rule
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the generated Signals
     */
    public readonly nameExpression!: pulumi.Output<string>;
    /**
     * The retention window size in milliseconds
     */
    public readonly retentionWindowSize!: pulumi.Output<string>;
    /**
     * The severity of the generated Signals
     */
    public readonly severity!: pulumi.Output<number>;
    /**
     * The summary of the generated Signals
     */
    public readonly summaryExpression!: pulumi.Output<string | undefined>;
    /**
     * The tags of the generated Signals
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The value fields
     */
    public readonly valueFields!: pulumi.Output<string[]>;

    /**
     * Create a CseFirstSeenRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CseFirstSeenRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseFirstSeenRuleArgs | CseFirstSeenRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseFirstSeenRuleState | undefined;
            resourceInputs["baselineType"] = state ? state.baselineType : undefined;
            resourceInputs["baselineWindowSize"] = state ? state.baselineWindowSize : undefined;
            resourceInputs["descriptionExpression"] = state ? state.descriptionExpression : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entitySelectors"] = state ? state.entitySelectors : undefined;
            resourceInputs["filterExpression"] = state ? state.filterExpression : undefined;
            resourceInputs["groupByFields"] = state ? state.groupByFields : undefined;
            resourceInputs["isPrototype"] = state ? state.isPrototype : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nameExpression"] = state ? state.nameExpression : undefined;
            resourceInputs["retentionWindowSize"] = state ? state.retentionWindowSize : undefined;
            resourceInputs["severity"] = state ? state.severity : undefined;
            resourceInputs["summaryExpression"] = state ? state.summaryExpression : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["valueFields"] = state ? state.valueFields : undefined;
        } else {
            const args = argsOrState as CseFirstSeenRuleArgs | undefined;
            if ((!args || args.baselineType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'baselineType'");
            }
            if ((!args || args.baselineWindowSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'baselineWindowSize'");
            }
            if ((!args || args.descriptionExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'descriptionExpression'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.entitySelectors === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entitySelectors'");
            }
            if ((!args || args.filterExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filterExpression'");
            }
            if ((!args || args.nameExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nameExpression'");
            }
            if ((!args || args.retentionWindowSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retentionWindowSize'");
            }
            if ((!args || args.severity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'severity'");
            }
            if ((!args || args.valueFields === undefined) && !opts.urn) {
                throw new Error("Missing required property 'valueFields'");
            }
            resourceInputs["baselineType"] = args ? args.baselineType : undefined;
            resourceInputs["baselineWindowSize"] = args ? args.baselineWindowSize : undefined;
            resourceInputs["descriptionExpression"] = args ? args.descriptionExpression : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["entitySelectors"] = args ? args.entitySelectors : undefined;
            resourceInputs["filterExpression"] = args ? args.filterExpression : undefined;
            resourceInputs["groupByFields"] = args ? args.groupByFields : undefined;
            resourceInputs["isPrototype"] = args ? args.isPrototype : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nameExpression"] = args ? args.nameExpression : undefined;
            resourceInputs["retentionWindowSize"] = args ? args.retentionWindowSize : undefined;
            resourceInputs["severity"] = args ? args.severity : undefined;
            resourceInputs["summaryExpression"] = args ? args.summaryExpression : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["valueFields"] = args ? args.valueFields : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CseFirstSeenRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseFirstSeenRule resources.
 */
export interface CseFirstSeenRuleState {
    /**
     * The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     */
    baselineType?: pulumi.Input<string>;
    /**
     * The baseline window size in milliseconds
     */
    baselineWindowSize?: pulumi.Input<string>;
    /**
     * The description of the generated Signals
     */
    descriptionExpression?: pulumi.Input<string>;
    /**
     * Whether the rule should generate Signals
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The entities to generate Signals on
     */
    entitySelectors?: pulumi.Input<pulumi.Input<inputs.CseFirstSeenRuleEntitySelector>[]>;
    /**
     * The expression for which records to match on
     */
    filterExpression?: pulumi.Input<string>;
    /**
     * A list of fields to group records by
     */
    groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the generated Signals should be prototype Signals
     */
    isPrototype?: pulumi.Input<boolean>;
    /**
     * The name of the Rule
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the generated Signals
     */
    nameExpression?: pulumi.Input<string>;
    /**
     * The retention window size in milliseconds
     */
    retentionWindowSize?: pulumi.Input<string>;
    /**
     * The severity of the generated Signals
     */
    severity?: pulumi.Input<number>;
    /**
     * The summary of the generated Signals
     */
    summaryExpression?: pulumi.Input<string>;
    /**
     * The tags of the generated Signals
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The value fields
     */
    valueFields?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a CseFirstSeenRule resource.
 */
export interface CseFirstSeenRuleArgs {
    /**
     * The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     */
    baselineType: pulumi.Input<string>;
    /**
     * The baseline window size in milliseconds
     */
    baselineWindowSize: pulumi.Input<string>;
    /**
     * The description of the generated Signals
     */
    descriptionExpression: pulumi.Input<string>;
    /**
     * Whether the rule should generate Signals
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The entities to generate Signals on
     */
    entitySelectors: pulumi.Input<pulumi.Input<inputs.CseFirstSeenRuleEntitySelector>[]>;
    /**
     * The expression for which records to match on
     */
    filterExpression: pulumi.Input<string>;
    /**
     * A list of fields to group records by
     */
    groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the generated Signals should be prototype Signals
     */
    isPrototype?: pulumi.Input<boolean>;
    /**
     * The name of the Rule
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the generated Signals
     */
    nameExpression: pulumi.Input<string>;
    /**
     * The retention window size in milliseconds
     */
    retentionWindowSize: pulumi.Input<string>;
    /**
     * The severity of the generated Signals
     */
    severity: pulumi.Input<number>;
    /**
     * The summary of the generated Signals
     */
    summaryExpression?: pulumi.Input<string>;
    /**
     * The tags of the generated Signals
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The value fields
     */
    valueFields: pulumi.Input<pulumi.Input<string>[]>;
}