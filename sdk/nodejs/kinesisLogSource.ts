// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a [Sumologic Kinesis Log source](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS_Kinesis_Firehose_for_Logs_Source). This source is used to ingest log via Kinesis Firehose from AWS.
 *
 * __IMPORTANT:__ The AWS credentials are stored in plain-text in the state. This is a potential security issue.
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
 * const kinesisLogAccessKey = new sumologic.KinesisLogSource("kinesis_log_access_key", {
 *     name: "Kinesis Log",
 *     description: "Description for Kinesis Log Source",
 *     category: "prod/kinesis/log",
 *     contentType: "KinesisLog",
 *     collectorId: collector.id,
 *     authentication: {
 *         type: "S3BucketAuthentication",
 *         accessKey: "someKey",
 *         secretKey: "******",
 *     },
 *     path: {
 *         type: "KinesisLogPath",
 *         bucketName: "testBucket",
 *         pathExpression: "http-endpoint-failed/*",
 *         scanInterval: 30000,
 *     },
 * });
 * const kinesisLogRoleArn = new sumologic.KinesisLogSource("kinesis_log_role_arn", {
 *     name: "Kinesis Log",
 *     description: "Description for Kinesis Log Source",
 *     category: "prod/kinesis/log",
 *     contentType: "KinesisLog",
 *     collectorId: collector.id,
 *     authentication: {
 *         type: "AWSRoleBasedAuthentication",
 *         roleArn: "arn:aws:iam::604066827510:role/cw-role-SumoRole-4AOLS73TGKYI",
 *     },
 *     path: {
 *         type: "KinesisLogPath",
 *         bucketName: "testBucket",
 *         pathExpression: "http-endpoint-failed/*",
 *         scanInterval: 30000,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Kinesis Log sources can be imported using the collector and source IDs (`collector/source`), e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/kinesisLogSource:KinesisLogSource test 123/456
 * ```
 *
 * HTTP sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.:
 *
 * hcl
 *
 * ```sh
 * $ pulumi import sumologic:index/kinesisLogSource:KinesisLogSource test my-test-collector/my-test-source
 * ```
 *
 * [1]: https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources
 *
 * [2]: https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS_Kinesis_Firehose_for_Logs_Source
 */
export class KinesisLogSource extends pulumi.CustomResource {
    /**
     * Get an existing KinesisLogSource resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KinesisLogSourceState, opts?: pulumi.CustomResourceOptions): KinesisLogSource {
        return new KinesisLogSource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/kinesisLogSource:KinesisLogSource';

    /**
     * Returns true if the given object is an instance of KinesisLogSource.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KinesisLogSource {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KinesisLogSource.__pulumiType;
    }

    /**
     * Authentication details for connecting to the S3 bucket.
     */
    public readonly authentication!: pulumi.Output<outputs.KinesisLogSourceAuthentication | undefined>;
    public readonly automaticDateParsing!: pulumi.Output<boolean | undefined>;
    public readonly category!: pulumi.Output<string | undefined>;
    public readonly collectorId!: pulumi.Output<number>;
    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     */
    public readonly contentType!: pulumi.Output<string>;
    public readonly cutoffRelativeTime!: pulumi.Output<string | undefined>;
    public readonly cutoffTimestamp!: pulumi.Output<number | undefined>;
    public readonly defaultDateFormats!: pulumi.Output<outputs.KinesisLogSourceDefaultDateFormat[] | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly fields!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly filters!: pulumi.Output<outputs.KinesisLogSourceFilter[] | undefined>;
    public readonly forceTimezone!: pulumi.Output<boolean | undefined>;
    public readonly hostName!: pulumi.Output<string | undefined>;
    public readonly manualPrefixRegexp!: pulumi.Output<string | undefined>;
    public readonly messagePerRequest!: pulumi.Output<boolean | undefined>;
    public readonly multilineProcessingEnabled!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * The location of S3 bucket for failed Kinesis log data.
     */
    public readonly path!: pulumi.Output<outputs.KinesisLogSourcePath | undefined>;
    public readonly timezone!: pulumi.Output<string | undefined>;
    /**
     * The HTTP endpoint to be used while creating Kinesis Firehose on AWS.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    public readonly useAutolineMatching!: pulumi.Output<boolean | undefined>;

    /**
     * Create a KinesisLogSource resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KinesisLogSourceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KinesisLogSourceArgs | KinesisLogSourceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KinesisLogSourceState | undefined;
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
            const args = argsOrState as KinesisLogSourceArgs | undefined;
            if ((!args || args.collectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collectorId'");
            }
            if ((!args || args.contentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contentType'");
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
        const aliasOpts = { aliases: [{ type: "sumologic:index/kineisLogSource:KineisLogSource" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(KinesisLogSource.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KinesisLogSource resources.
 */
export interface KinesisLogSourceState {
    /**
     * Authentication details for connecting to the S3 bucket.
     */
    authentication?: pulumi.Input<inputs.KinesisLogSourceAuthentication>;
    automaticDateParsing?: pulumi.Input<boolean>;
    category?: pulumi.Input<string>;
    collectorId?: pulumi.Input<number>;
    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     */
    contentType?: pulumi.Input<string>;
    cutoffRelativeTime?: pulumi.Input<string>;
    cutoffTimestamp?: pulumi.Input<number>;
    defaultDateFormats?: pulumi.Input<pulumi.Input<inputs.KinesisLogSourceDefaultDateFormat>[]>;
    description?: pulumi.Input<string>;
    fields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    filters?: pulumi.Input<pulumi.Input<inputs.KinesisLogSourceFilter>[]>;
    forceTimezone?: pulumi.Input<boolean>;
    hostName?: pulumi.Input<string>;
    manualPrefixRegexp?: pulumi.Input<string>;
    messagePerRequest?: pulumi.Input<boolean>;
    multilineProcessingEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    /**
     * The location of S3 bucket for failed Kinesis log data.
     */
    path?: pulumi.Input<inputs.KinesisLogSourcePath>;
    timezone?: pulumi.Input<string>;
    /**
     * The HTTP endpoint to be used while creating Kinesis Firehose on AWS.
     */
    url?: pulumi.Input<string>;
    useAutolineMatching?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a KinesisLogSource resource.
 */
export interface KinesisLogSourceArgs {
    /**
     * Authentication details for connecting to the S3 bucket.
     */
    authentication?: pulumi.Input<inputs.KinesisLogSourceAuthentication>;
    automaticDateParsing?: pulumi.Input<boolean>;
    category?: pulumi.Input<string>;
    collectorId: pulumi.Input<number>;
    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     */
    contentType: pulumi.Input<string>;
    cutoffRelativeTime?: pulumi.Input<string>;
    cutoffTimestamp?: pulumi.Input<number>;
    defaultDateFormats?: pulumi.Input<pulumi.Input<inputs.KinesisLogSourceDefaultDateFormat>[]>;
    description?: pulumi.Input<string>;
    fields?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    filters?: pulumi.Input<pulumi.Input<inputs.KinesisLogSourceFilter>[]>;
    forceTimezone?: pulumi.Input<boolean>;
    hostName?: pulumi.Input<string>;
    manualPrefixRegexp?: pulumi.Input<string>;
    messagePerRequest?: pulumi.Input<boolean>;
    multilineProcessingEnabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    /**
     * The location of S3 bucket for failed Kinesis log data.
     */
    path?: pulumi.Input<inputs.KinesisLogSourcePath>;
    timezone?: pulumi.Input<string>;
    useAutolineMatching?: pulumi.Input<boolean>;
}