// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Sumologic Log Search.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const personalFolder = sumologic.getPersonalFolder({});
 * const exampleLogSearch = new sumologic.LogSearch("exampleLogSearch", {
 *     description: "Demo search description",
 *     parentId: personalFolder.then(personalFolder => personalFolder.id),
 *     queryString: `        _sourceCategory=api
 *         | parse "parameter1=*," as parameter1
 *         | parse "parameter2=*," as parameter2
 *         | where parameter1 matches {{param1}}
 *         | where parameter2 matches {{param2}}
 *         | count by _sourceHost
 * `,
 *     parsingMode: "AutoParse",
 *     runByReceiptTime: true,
 *     timeRange: {
 *         beginBoundedTimeRange: {
 *             from: {
 *                 relativeTimeRange: {
 *                     relativeTime: "-30m",
 *                 },
 *             },
 *         },
 *     },
 *     queryParameters: [
 *         {
 *             name: "param1",
 *             description: "Description for param1",
 *             dataType: "STRING",
 *             value: "*",
 *         },
 *         {
 *             name: "param2",
 *             description: "Description for param2",
 *             dataType: "STRING",
 *             value: "*",
 *         },
 *     ],
 *     schedule: {
 *         cronExpression: "0 0 * * * ? *",
 *         muteErrorEmails: false,
 *         notification: {
 *             emailSearchNotification: {
 *                 includeCsvAttachment: false,
 *                 includeHistogram: false,
 *                 includeQuery: true,
 *                 includeResultSet: true,
 *                 subjectTemplate: "Search Alert: {{TriggerCondition}} found for {{SearchName}}",
 *                 toLists: ["will@acme.com"],
 *             },
 *         },
 *         parseableTimeRange: {
 *             beginBoundedTimeRange: {
 *                 from: {
 *                     relativeTimeRange: {
 *                         relativeTime: "-15m",
 *                     },
 *                 },
 *             },
 *         },
 *         scheduleType: "1Week",
 *         threshold: {
 *             count: 10,
 *             operator: "gt",
 *             thresholdType: "group",
 *         },
 *         timeZone: "America/Los_Angeles",
 *         parameters: [
 *             {
 *                 name: "param1",
 *                 value: "*",
 *             },
 *             {
 *                 name: "param2",
 *                 value: "*",
 *             },
 *         ],
 *     },
 * });
 * ```
 * ## Attributes reference
 *
 * In addition to all arguments above, the following attributes are exported:
 *
 * - `id` - The ID of the log search.
 *
 * ## Import
 *
 * A log search can be imported using it's identifier, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/logSearch:LogSearch example_search 0000000007FFD79D
 * ```
 */
export class LogSearch extends pulumi.CustomResource {
    /**
     * Get an existing LogSearch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogSearchState, opts?: pulumi.CustomResourceOptions): LogSearch {
        return new LogSearch(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/logSearch:LogSearch';

    /**
     * Returns true if the given object is an instance of LogSearch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogSearch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogSearch.__pulumiType;
    }

    /**
     * Description of the search.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the search.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The identifier of the folder to create the log search in.
     */
    public readonly parentId!: pulumi.Output<string>;
    /**
     * Define the parsing mode to scan the JSON format log messages. Possible values are:
     * `AutoParse` and  `Manual`. Default value is `Manual`.
     *
     * In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
     * the `Manual` mode, no fields are parsed out automatically. For more information see
     * [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
     */
    public readonly parsingMode!: pulumi.Output<string | undefined>;
    /**
     * Up to 10 `queryParameter` blocks can be added one for each parameter in the `queryString`. 
     * See query parameter schema.
     */
    public readonly queryParameters!: pulumi.Output<outputs.LogSearchQueryParameter[] | undefined>;
    /**
     * Log query to perform.
     */
    public readonly queryString!: pulumi.Output<string>;
    /**
     * This has the value `true` if the search is to be run by receipt time and
     * `false` if it is to be run by message time. Default value is `false`.
     */
    public readonly runByReceiptTime!: pulumi.Output<boolean | undefined>;
    /**
     * Schedule of the log search. See schedule schema
     */
    public readonly schedule!: pulumi.Output<outputs.LogSearchSchedule | undefined>;
    /**
     * Time range of the log search. See time range schema
     */
    public readonly timeRange!: pulumi.Output<outputs.LogSearchTimeRange>;

    /**
     * Create a LogSearch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogSearchArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogSearchArgs | LogSearchState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogSearchState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parentId"] = state ? state.parentId : undefined;
            resourceInputs["parsingMode"] = state ? state.parsingMode : undefined;
            resourceInputs["queryParameters"] = state ? state.queryParameters : undefined;
            resourceInputs["queryString"] = state ? state.queryString : undefined;
            resourceInputs["runByReceiptTime"] = state ? state.runByReceiptTime : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["timeRange"] = state ? state.timeRange : undefined;
        } else {
            const args = argsOrState as LogSearchArgs | undefined;
            if ((!args || args.parentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parentId'");
            }
            if ((!args || args.queryString === undefined) && !opts.urn) {
                throw new Error("Missing required property 'queryString'");
            }
            if ((!args || args.timeRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeRange'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parentId"] = args ? args.parentId : undefined;
            resourceInputs["parsingMode"] = args ? args.parsingMode : undefined;
            resourceInputs["queryParameters"] = args ? args.queryParameters : undefined;
            resourceInputs["queryString"] = args ? args.queryString : undefined;
            resourceInputs["runByReceiptTime"] = args ? args.runByReceiptTime : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["timeRange"] = args ? args.timeRange : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogSearch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogSearch resources.
 */
export interface LogSearchState {
    /**
     * Description of the search.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the search.
     */
    name?: pulumi.Input<string>;
    /**
     * The identifier of the folder to create the log search in.
     */
    parentId?: pulumi.Input<string>;
    /**
     * Define the parsing mode to scan the JSON format log messages. Possible values are:
     * `AutoParse` and  `Manual`. Default value is `Manual`.
     *
     * In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
     * the `Manual` mode, no fields are parsed out automatically. For more information see
     * [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
     */
    parsingMode?: pulumi.Input<string>;
    /**
     * Up to 10 `queryParameter` blocks can be added one for each parameter in the `queryString`. 
     * See query parameter schema.
     */
    queryParameters?: pulumi.Input<pulumi.Input<inputs.LogSearchQueryParameter>[]>;
    /**
     * Log query to perform.
     */
    queryString?: pulumi.Input<string>;
    /**
     * This has the value `true` if the search is to be run by receipt time and
     * `false` if it is to be run by message time. Default value is `false`.
     */
    runByReceiptTime?: pulumi.Input<boolean>;
    /**
     * Schedule of the log search. See schedule schema
     */
    schedule?: pulumi.Input<inputs.LogSearchSchedule>;
    /**
     * Time range of the log search. See time range schema
     */
    timeRange?: pulumi.Input<inputs.LogSearchTimeRange>;
}

/**
 * The set of arguments for constructing a LogSearch resource.
 */
export interface LogSearchArgs {
    /**
     * Description of the search.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the search.
     */
    name?: pulumi.Input<string>;
    /**
     * The identifier of the folder to create the log search in.
     */
    parentId: pulumi.Input<string>;
    /**
     * Define the parsing mode to scan the JSON format log messages. Possible values are:
     * `AutoParse` and  `Manual`. Default value is `Manual`.
     *
     * In `AutoParse` mode, the system automatically figures out fields to parse based on the search query. While in
     * the `Manual` mode, no fields are parsed out automatically. For more information see
     * [Dynamic Parsing](https://help.sumologic.com/?cid=0011).
     */
    parsingMode?: pulumi.Input<string>;
    /**
     * Up to 10 `queryParameter` blocks can be added one for each parameter in the `queryString`. 
     * See query parameter schema.
     */
    queryParameters?: pulumi.Input<pulumi.Input<inputs.LogSearchQueryParameter>[]>;
    /**
     * Log query to perform.
     */
    queryString: pulumi.Input<string>;
    /**
     * This has the value `true` if the search is to be run by receipt time and
     * `false` if it is to be run by message time. Default value is `false`.
     */
    runByReceiptTime?: pulumi.Input<boolean>;
    /**
     * Schedule of the log search. See schedule schema
     */
    schedule?: pulumi.Input<inputs.LogSearchSchedule>;
    /**
     * Time range of the log search. See time range schema
     */
    timeRange: pulumi.Input<inputs.LogSearchTimeRange>;
}