// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides an easy way to retrieve the Personal Folder.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const personalFolder = sumologic.getPersonalFolder({});
 * ```
 *
 * ## Attributes reference
 *
 * The following attributes are exported:
 *
 * - `id` - The ID of the Personal Folder.
 * - `name` - The name of the Personal Folder.
 * - `description` - The description of the Personal Folder.
 */
export function getPersonalFolder(args?: GetPersonalFolderArgs, opts?: pulumi.InvokeOptions): Promise<GetPersonalFolderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("sumologic:index/getPersonalFolder:getPersonalFolder", {
        "description": args.description,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPersonalFolder.
 */
export interface GetPersonalFolderArgs {
    description?: string;
    id?: string;
    name?: string;
}

/**
 * A collection of values returned by getPersonalFolder.
 */
export interface GetPersonalFolderResult {
    readonly description: string;
    readonly id: string;
    readonly name: string;
}
/**
 * Provides an easy way to retrieve the Personal Folder.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const personalFolder = sumologic.getPersonalFolder({});
 * ```
 *
 * ## Attributes reference
 *
 * The following attributes are exported:
 *
 * - `id` - The ID of the Personal Folder.
 * - `name` - The name of the Personal Folder.
 * - `description` - The description of the Personal Folder.
 */
export function getPersonalFolderOutput(args?: GetPersonalFolderOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPersonalFolderResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("sumologic:index/getPersonalFolder:getPersonalFolder", {
        "description": args.description,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPersonalFolder.
 */
export interface GetPersonalFolderOutputArgs {
    description?: pulumi.Input<string>;
    id?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}
