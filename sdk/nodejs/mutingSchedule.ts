// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides the ability to create, read, delete, and update [MutingSchedule](https://help.sumologic.com/docs/alerts/monitors/muting-schedules/).
 *
 * ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For All monitor
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const mutingSchedule = new sumologic.MutingSchedule("mutingSchedule", {
 *     contentType: "MutingSchedule",
 *     description: "This is an example for one time Muting schedule for all monitor",
 *     monitor: {
 *         all: true,
 *     },
 *     schedule: {
 *         duration: 60,
 *         startDate: "2023-08-05",
 *         startTime: "00:00",
 *         timezone: "America/Los_Angeles",
 *     },
 *     type: "MutingSchedulesLibraryMutingSchedule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For Specifc Monitor/Folder ids
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const mutingSchedule = new sumologic.MutingSchedule("mutingSchedule", {
 *     contentType: "MutingSchedule",
 *     description: "This is an example for one time Muting schedule for all monitor",
 *     monitor: {
 *         ids: ["0000000000200B92"],
 *     },
 *     schedule: {
 *         duration: 60,
 *         startDate: "2023-08-05",
 *         startTime: "00:00",
 *         timezone: "America/Los_Angeles",
 *     },
 *     type: "MutingSchedulesLibraryMutingSchedule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For All monitor
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const mutingSchedule = new sumologic.MutingSchedule("mutingSchedule", {
 *     contentType: "MutingSchedule",
 *     description: "This is an example for one time Muting schedule for all monitor",
 *     monitor: {
 *         all: true,
 *     },
 *     schedule: {
 *         duration: 30,
 *         rrule: "FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
 *         startDate: "2023-08-05",
 *         startTime: "00:00",
 *         timezone: "America/Los_Angeles",
 *     },
 *     type: "MutingSchedulesLibraryMutingSchedule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For Specifc Monitor/Folder ids
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const mutingSchedule = new sumologic.MutingSchedule("mutingSchedule", {
 *     contentType: "MutingSchedule",
 *     description: "This is an example for one time Muting schedule for all monitor",
 *     monitor: {
 *         ids: ["0000000000200B92"],
 *     },
 *     schedule: {
 *         duration: 30,
 *         rrule: "FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
 *         startDate: "2023-08-05",
 *         startTime: "00:00",
 *         timezone: "America/Los_Angeles",
 *     },
 *     type: "MutingSchedulesLibraryMutingSchedule",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class MutingSchedule extends pulumi.CustomResource {
    /**
     * Get an existing MutingSchedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MutingScheduleState, opts?: pulumi.CustomResourceOptions): MutingSchedule {
        return new MutingSchedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/mutingSchedule:MutingSchedule';

    /**
     * Returns true if the given object is an instance of MutingSchedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MutingSchedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MutingSchedule.__pulumiType;
    }

    /**
     * The type of the content object. Valid value:
     */
    public readonly contentType!: pulumi.Output<string | undefined>;
    public readonly createdAt!: pulumi.Output<string>;
    public readonly createdBy!: pulumi.Output<string>;
    /**
     * The description of the muting schedule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly isMutable!: pulumi.Output<boolean>;
    public readonly isSystem!: pulumi.Output<boolean>;
    public readonly modifiedAt!: pulumi.Output<string>;
    public readonly modifiedBy!: pulumi.Output<string>;
    /**
     * The monitors which need to put in the muting schedule. see `monitorScopeType`:
     */
    public readonly monitor!: pulumi.Output<outputs.MutingScheduleMonitor | undefined>;
    /**
     * The name of the muting schedule. The name must be alphanumeric.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly parentId!: pulumi.Output<string>;
    /**
     * The schedule information. see `scheduleType`.
     */
    public readonly schedule!: pulumi.Output<outputs.MutingScheduleSchedule>;
    /**
     * The type of object model. Valid value:
     */
    public readonly type!: pulumi.Output<string | undefined>;
    public readonly version!: pulumi.Output<number>;

    /**
     * Create a MutingSchedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MutingScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MutingScheduleArgs | MutingScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MutingScheduleState | undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["isMutable"] = state ? state.isMutable : undefined;
            resourceInputs["isSystem"] = state ? state.isSystem : undefined;
            resourceInputs["modifiedAt"] = state ? state.modifiedAt : undefined;
            resourceInputs["modifiedBy"] = state ? state.modifiedBy : undefined;
            resourceInputs["monitor"] = state ? state.monitor : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parentId"] = state ? state.parentId : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as MutingScheduleArgs | undefined;
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["createdAt"] = args ? args.createdAt : undefined;
            resourceInputs["createdBy"] = args ? args.createdBy : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["isMutable"] = args ? args.isMutable : undefined;
            resourceInputs["isSystem"] = args ? args.isSystem : undefined;
            resourceInputs["modifiedAt"] = args ? args.modifiedAt : undefined;
            resourceInputs["modifiedBy"] = args ? args.modifiedBy : undefined;
            resourceInputs["monitor"] = args ? args.monitor : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parentId"] = args ? args.parentId : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MutingSchedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MutingSchedule resources.
 */
export interface MutingScheduleState {
    /**
     * The type of the content object. Valid value:
     */
    contentType?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    createdBy?: pulumi.Input<string>;
    /**
     * The description of the muting schedule.
     */
    description?: pulumi.Input<string>;
    isMutable?: pulumi.Input<boolean>;
    isSystem?: pulumi.Input<boolean>;
    modifiedAt?: pulumi.Input<string>;
    modifiedBy?: pulumi.Input<string>;
    /**
     * The monitors which need to put in the muting schedule. see `monitorScopeType`:
     */
    monitor?: pulumi.Input<inputs.MutingScheduleMonitor>;
    /**
     * The name of the muting schedule. The name must be alphanumeric.
     */
    name?: pulumi.Input<string>;
    parentId?: pulumi.Input<string>;
    /**
     * The schedule information. see `scheduleType`.
     */
    schedule?: pulumi.Input<inputs.MutingScheduleSchedule>;
    /**
     * The type of object model. Valid value:
     */
    type?: pulumi.Input<string>;
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MutingSchedule resource.
 */
export interface MutingScheduleArgs {
    /**
     * The type of the content object. Valid value:
     */
    contentType?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    createdBy?: pulumi.Input<string>;
    /**
     * The description of the muting schedule.
     */
    description?: pulumi.Input<string>;
    isMutable?: pulumi.Input<boolean>;
    isSystem?: pulumi.Input<boolean>;
    modifiedAt?: pulumi.Input<string>;
    modifiedBy?: pulumi.Input<string>;
    /**
     * The monitors which need to put in the muting schedule. see `monitorScopeType`:
     */
    monitor?: pulumi.Input<inputs.MutingScheduleMonitor>;
    /**
     * The name of the muting schedule. The name must be alphanumeric.
     */
    name?: pulumi.Input<string>;
    parentId?: pulumi.Input<string>;
    /**
     * The schedule information. see `scheduleType`.
     */
    schedule: pulumi.Input<inputs.MutingScheduleSchedule>;
    /**
     * The type of object model. Valid value:
     */
    type?: pulumi.Input<string>;
    version?: pulumi.Input<number>;
}
