// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a [Sumologic Scheduled View](https://help.sumologic.com/Manage/Scheduled-Views).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const failedConnections = new sumologic.ScheduledView("failed_connections", {
 *     indexName: "failed_connections",
 *     query: `_view=connections connectionStats
 * | parse "connectionStats.CS *" as body
 * | json field=body "exitCode", "isHttp2"
 * | lookup org_name from shared/partners on partner_id=partnerid
 * | timeslice 10m
 * `,
 *     retentionPeriod: 365,
 *     startTime: "2019-09-01T00:00:00Z",
 * });
 * ```
 * ## Argument reference
 *
 * The following arguments are supported:
 *
 * > For attributes that force a new resource, if the value is updated, it will destroy the resource and recreate it which may incur significant costs. We advise customers to set the `lifecycle` attribute `preventDestroy` to `true` to avoid accidentally destroying and recreating expensive resources.
 *
 * - `indexName` - (Required, Forces new resource) Name of the index (scheduled view).
 * - `query` - (Required, Forces new resource) Log query defining the scheduled view.
 * - `startTime` - (Required, Forces new resource) Start timestamp in UTC in RFC3339 format.
 * - `retentionPeriod` - (Optional) The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
 * - `dataForwardingId` - (Optional) An optional ID of a data forwarding configuration to be used by the scheduled view.
 * - `parsingMode` - (Optional, Forces new resource) Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
 * - `reduceRetentionPeriodImmediately` - (Optional) This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
 *
 * The following attributes are exported:
 *
 * - `id` - The internal ID of the scheduled view.
 *
 * ## Import
 *
 * Scheduled Views can can be imported using the id. The list of scheduled views and their ids can be obtained using the Sumologic [scheduled views api][2]. hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/scheduledView:ScheduledView failed_connections 1234567890
 * ```
 *
 *  [1]https://help.sumologic.com/Manage/Scheduled-Views [2]https://api.sumologic.com/docs/#operation/listScheduledViews
 */
export class ScheduledView extends pulumi.CustomResource {
    /**
     * Get an existing ScheduledView resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduledViewState, opts?: pulumi.CustomResourceOptions): ScheduledView {
        return new ScheduledView(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/scheduledView:ScheduledView';

    /**
     * Returns true if the given object is an instance of ScheduledView.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScheduledView {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScheduledView.__pulumiType;
    }

    public readonly dataForwardingId!: pulumi.Output<string | undefined>;
    public readonly indexName!: pulumi.Output<string>;
    public readonly parsingMode!: pulumi.Output<string | undefined>;
    public readonly query!: pulumi.Output<string>;
    public readonly reduceRetentionPeriodImmediately!: pulumi.Output<boolean | undefined>;
    public readonly retentionPeriod!: pulumi.Output<number | undefined>;
    public readonly startTime!: pulumi.Output<string>;

    /**
     * Create a ScheduledView resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduledViewArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduledViewArgs | ScheduledViewState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduledViewState | undefined;
            inputs["dataForwardingId"] = state ? state.dataForwardingId : undefined;
            inputs["indexName"] = state ? state.indexName : undefined;
            inputs["parsingMode"] = state ? state.parsingMode : undefined;
            inputs["query"] = state ? state.query : undefined;
            inputs["reduceRetentionPeriodImmediately"] = state ? state.reduceRetentionPeriodImmediately : undefined;
            inputs["retentionPeriod"] = state ? state.retentionPeriod : undefined;
            inputs["startTime"] = state ? state.startTime : undefined;
        } else {
            const args = argsOrState as ScheduledViewArgs | undefined;
            if ((!args || args.indexName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexName'");
            }
            if ((!args || args.query === undefined) && !opts.urn) {
                throw new Error("Missing required property 'query'");
            }
            if ((!args || args.startTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'startTime'");
            }
            inputs["dataForwardingId"] = args ? args.dataForwardingId : undefined;
            inputs["indexName"] = args ? args.indexName : undefined;
            inputs["parsingMode"] = args ? args.parsingMode : undefined;
            inputs["query"] = args ? args.query : undefined;
            inputs["reduceRetentionPeriodImmediately"] = args ? args.reduceRetentionPeriodImmediately : undefined;
            inputs["retentionPeriod"] = args ? args.retentionPeriod : undefined;
            inputs["startTime"] = args ? args.startTime : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ScheduledView.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScheduledView resources.
 */
export interface ScheduledViewState {
    readonly dataForwardingId?: pulumi.Input<string>;
    readonly indexName?: pulumi.Input<string>;
    readonly parsingMode?: pulumi.Input<string>;
    readonly query?: pulumi.Input<string>;
    readonly reduceRetentionPeriodImmediately?: pulumi.Input<boolean>;
    readonly retentionPeriod?: pulumi.Input<number>;
    readonly startTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ScheduledView resource.
 */
export interface ScheduledViewArgs {
    readonly dataForwardingId?: pulumi.Input<string>;
    readonly indexName: pulumi.Input<string>;
    readonly parsingMode?: pulumi.Input<string>;
    readonly query: pulumi.Input<string>;
    readonly reduceRetentionPeriodImmediately?: pulumi.Input<boolean>;
    readonly retentionPeriod?: pulumi.Input<number>;
    readonly startTime: pulumi.Input<string>;
}