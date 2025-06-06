// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a [Sumo Logic Google Cloud Platform Source](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Google-Cloud-Platform-Source).
 *
 * ***Note:*** Google no longer requires a pub/sub domain to be [verified](https://cloud.google.com/pubsub/docs/push). You no longer have to set up domain verification with your GCP Source endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const collector = new sumologic.Collector("collector", {
 *     name: "my-collector",
 *     description: "Just testing this",
 * });
 * const gcpSource = new sumologic.GcpSource("gcp_source", {
 *     name: "GCP Source",
 *     description: "My description",
 *     category: "gcp",
 *     collectorId: collector.id,
 * });
 * ```
 *
 * ## Import
 *
 * Sumo Logic Google Cloud Platform sources can be imported using the collector and source IDs (`collector/source`), e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/gcpSource:GcpSource test 100000001/100000001
 * ```
 *
 * Sumo Logic Google Cloud Platform sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/gcpSource:GcpSource test my-test-collector/my-test-source
 * ```
 *
 * [1]: https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources
 *
 * [2]: https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Google-Cloud-Platform-Source
 *
 * [3]: https://cloud.google.com/pubsub/docs/push
 */
export class GcpSource extends pulumi.CustomResource {
    /**
     * Get an existing GcpSource resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GcpSourceState, opts?: pulumi.CustomResourceOptions): GcpSource {
        return new GcpSource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/gcpSource:GcpSource';

    /**
     * Returns true if the given object is an instance of GcpSource.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GcpSource {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GcpSource.__pulumiType;
    }

    public readonly authentication!: pulumi.Output<outputs.GcpSourceAuthentication | undefined>;
    public readonly automaticDateParsing!: pulumi.Output<boolean | undefined>;
    public readonly category!: pulumi.Output<string | undefined>;
    public readonly collectorId!: pulumi.Output<number>;
    public readonly contentType!: pulumi.Output<string | undefined>;
    public readonly cutoffRelativeTime!: pulumi.Output<string | undefined>;
    public readonly cutoffTimestamp!: pulumi.Output<number | undefined>;
    public readonly defaultDateFormats!: pulumi.Output<outputs.GcpSourceDefaultDateFormat[] | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly fields!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly filters!: pulumi.Output<outputs.GcpSourceFilter[] | undefined>;
    public readonly forceTimezone!: pulumi.Output<boolean | undefined>;
    public readonly hashAlgorithm!: pulumi.Output<string | undefined>;
    public readonly hostName!: pulumi.Output<string | undefined>;
    public readonly manualPrefixRegexp!: pulumi.Output<string | undefined>;
    public readonly messagePerRequest!: pulumi.Output<boolean | undefined>;
    public readonly multilineProcessingEnabled!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly path!: pulumi.Output<outputs.GcpSourcePath | undefined>;
    public readonly timezone!: pulumi.Output<string | undefined>;
    /**
     * The HTTP endpoint to use for sending data to this source.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    public readonly useAutolineMatching!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GcpSource resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GcpSourceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GcpSourceArgs | GcpSourceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GcpSourceState | undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["automaticDateParsing"] = state ? state.automaticDateParsing : undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["collectorId"] = state ? state.collectorId : undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["cutoffRelativeTime"] = state ? state.cutoffRelativeTime : undefined;
            resourceInputs["cutoffTimestamp"] = state ? state.cutoffTimestamp : undefined;
            resourceInputs["defaultDateFormats"] = state ? state.defaultDateFormats : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fields"] = state ? state.fields : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["forceTimezone"] = state ? state.forceTimezone : undefined;
            resourceInputs["hashAlgorithm"] = state ? state.hashAlgorithm : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["manualPrefixRegexp"] = state ? state.manualPrefixRegexp : undefined;
            resourceInputs["messagePerRequest"] = state ? state.messagePerRequest : undefined;
            resourceInputs["multilineProcessingEnabled"] = state ? state.multilineProcessingEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["timezone"] = state ? state.timezone : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["useAutolineMatching"] = state ? state.useAutolineMatching : undefined;
        } else {
            const args = argsOrState as GcpSourceArgs | undefined;
            if ((!args || args.collectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collectorId'");
            }
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["automaticDateParsing"] = args ? args.automaticDateParsing : undefined;
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["collectorId"] = args ? args.collectorId : undefined;
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["cutoffRelativeTime"] = args ? args.cutoffRelativeTime : undefined;
            resourceInputs["cutoffTimestamp"] = args ? args.cutoffTimestamp : undefined;
            resourceInputs["defaultDateFormats"] = args ? args.defaultDateFormats : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fields"] = args ? args.fields : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["forceTimezone"] = args ? args.forceTimezone : undefined;
            resourceInputs["hashAlgorithm"] = args ? args.hashAlgorithm : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["manualPrefixRegexp"] = args ? args.manualPrefixRegexp : undefined;
            resourceInputs["messagePerRequest"] = args ? args.messagePerRequest : undefined;
            resourceInputs["multilineProcessingEnabled"] = args ? args.multilineProcessingEnabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["timezone"] = args ? args.timezone : undefined;
            resourceInputs["useAutolineMatching"] = args ? args.useAutolineMatching : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GcpSource.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GcpSource resources.
 */
export interface GcpSourceState {
    authentication?: pulumi.Input<inputs.GcpSourceAuthentication>;
    automaticDateParsing?: pulumi.Input<boolean>;
    category?: pulumi.Input<string>;
    collectorId?: pulumi.Input<number>;
    contentType?: pulumi.Input<string>;
    cutoffRelativeTime?: pulumi.Input<string>;
    cutoffTimestamp?: pulumi.Input<number>;
    defaultDateFormats?: pulumi.Input<pulumi.Input<inputs.GcpSourceDefaultDateFormat>[]>;
    description?: pulumi.Input<string>;
    fields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    filters?: pulumi.Input<pulumi.Input<inputs.GcpSourceFilter>[]>;
    forceTimezone?: pulumi.Input<boolean>;
    hashAlgorithm?: pulumi.Input<string>;
    hostName?: pulumi.Input<string>;
    manualPrefixRegexp?: pulumi.Input<string>;
    messagePerRequest?: pulumi.Input<boolean>;
    multilineProcessingEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    path?: pulumi.Input<inputs.GcpSourcePath>;
    timezone?: pulumi.Input<string>;
    /**
     * The HTTP endpoint to use for sending data to this source.
     */
    url?: pulumi.Input<string>;
    useAutolineMatching?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GcpSource resource.
 */
export interface GcpSourceArgs {
    authentication?: pulumi.Input<inputs.GcpSourceAuthentication>;
    automaticDateParsing?: pulumi.Input<boolean>;
    category?: pulumi.Input<string>;
    collectorId: pulumi.Input<number>;
    contentType?: pulumi.Input<string>;
    cutoffRelativeTime?: pulumi.Input<string>;
    cutoffTimestamp?: pulumi.Input<number>;
    defaultDateFormats?: pulumi.Input<pulumi.Input<inputs.GcpSourceDefaultDateFormat>[]>;
    description?: pulumi.Input<string>;
    fields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    filters?: pulumi.Input<pulumi.Input<inputs.GcpSourceFilter>[]>;
    forceTimezone?: pulumi.Input<boolean>;
    hashAlgorithm?: pulumi.Input<string>;
    hostName?: pulumi.Input<string>;
    manualPrefixRegexp?: pulumi.Input<string>;
    messagePerRequest?: pulumi.Input<boolean>;
    multilineProcessingEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    path?: pulumi.Input<inputs.GcpSourcePath>;
    timezone?: pulumi.Input<string>;
    useAutolineMatching?: pulumi.Input<boolean>;
}
