// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.S3AuditSourceArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.S3AuditSourceState;
import com.pulumi.sumologic.outputs.S3AuditSourceAuthentication;
import com.pulumi.sumologic.outputs.S3AuditSourceDefaultDateFormat;
import com.pulumi.sumologic.outputs.S3AuditSourceFilter;
import com.pulumi.sumologic.outputs.S3AuditSourcePath;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [AWS S3 Audit Source][2].
 * 
 * __IMPORTANT:__ The AWS credentials are stored in plain-text in the state. This is a potential security issue.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.Collector;
 * import com.pulumi.sumologic.CollectorArgs;
 * import com.pulumi.sumologic.S3AuditSource;
 * import com.pulumi.sumologic.S3AuditSourceArgs;
 * import com.pulumi.sumologic.inputs.S3AuditSourceAuthenticationArgs;
 * import com.pulumi.sumologic.inputs.S3AuditSourcePathArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var collector = new Collector("collector", CollectorArgs.builder()
 *             .name("my-collector")
 *             .description("Just testing this")
 *             .build());
 * 
 *         var s3Audit = new S3AuditSource("s3Audit", S3AuditSourceArgs.builder()
 *             .name("Amazon S3 Audit")
 *             .description("My description")
 *             .category("aws/s3audit")
 *             .contentType("AwsS3AuditBucket")
 *             .scanInterval(300000)
 *             .paused(false)
 *             .collectorId(collector.id())
 *             .authentication(S3AuditSourceAuthenticationArgs.builder()
 *                 .type("S3BucketAuthentication")
 *                 .accessKey("someKey")
 *                 .secretKey("******")
 *                 .build())
 *             .path(S3AuditSourcePathArgs.builder()
 *                 .type("S3BucketPathExpression")
 *                 .bucketName("Bucket1")
 *                 .pathExpression("*")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * S3 Audit sources can be imported using the collector and source IDs (`collector/source`), e.g.:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import sumologic:index/s3AuditSource:S3AuditSource test 123/456
 * ```
 * 
 * S3 Audit sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import sumologic:index/s3AuditSource:S3AuditSource test my-test-collector/my-test-source
 * ```
 * 
 * [1]: https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources
 * 
 * [2]: https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/Amazon-S3-Audit-Source
 * 
 */
@ResourceType(type="sumologic:index/s3AuditSource:S3AuditSource")
public class S3AuditSource extends com.pulumi.resources.CustomResource {
    /**
     * Authentication details for connecting to the S3 bucket.
     * 
     */
    @Export(name="authentication", refs={S3AuditSourceAuthentication.class}, tree="[0]")
    private Output<S3AuditSourceAuthentication> authentication;

    /**
     * @return Authentication details for connecting to the S3 bucket.
     * 
     */
    public Output<S3AuditSourceAuthentication> authentication() {
        return this.authentication;
    }
    @Export(name="automaticDateParsing", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> automaticDateParsing;

    public Output<Optional<Boolean>> automaticDateParsing() {
        return Codegen.optional(this.automaticDateParsing);
    }
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> category;

    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    @Export(name="collectorId", refs={Integer.class}, tree="[0]")
    private Output<Integer> collectorId;

    public Output<Integer> collectorId() {
        return this.collectorId;
    }
    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    @Export(name="cutoffRelativeTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cutoffRelativeTime;

    public Output<Optional<String>> cutoffRelativeTime() {
        return Codegen.optional(this.cutoffRelativeTime);
    }
    @Export(name="cutoffTimestamp", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> cutoffTimestamp;

    public Output<Optional<Integer>> cutoffTimestamp() {
        return Codegen.optional(this.cutoffTimestamp);
    }
    @Export(name="defaultDateFormats", refs={List.class,S3AuditSourceDefaultDateFormat.class}, tree="[0,1]")
    private Output</* @Nullable */ List<S3AuditSourceDefaultDateFormat>> defaultDateFormats;

    public Output<Optional<List<S3AuditSourceDefaultDateFormat>>> defaultDateFormats() {
        return Codegen.optional(this.defaultDateFormats);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="fields", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> fields;

    public Output<Optional<Map<String,String>>> fields() {
        return Codegen.optional(this.fields);
    }
    @Export(name="filters", refs={List.class,S3AuditSourceFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<S3AuditSourceFilter>> filters;

    public Output<Optional<List<S3AuditSourceFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    @Export(name="forceTimezone", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceTimezone;

    public Output<Optional<Boolean>> forceTimezone() {
        return Codegen.optional(this.forceTimezone);
    }
    @Export(name="hashAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hashAlgorithm;

    public Output<Optional<String>> hashAlgorithm() {
        return Codegen.optional(this.hashAlgorithm);
    }
    @Export(name="hostName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostName;

    public Output<Optional<String>> hostName() {
        return Codegen.optional(this.hostName);
    }
    @Export(name="manualPrefixRegexp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> manualPrefixRegexp;

    public Output<Optional<String>> manualPrefixRegexp() {
        return Codegen.optional(this.manualPrefixRegexp);
    }
    @Export(name="multilineProcessingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multilineProcessingEnabled;

    public Output<Optional<Boolean>> multilineProcessingEnabled() {
        return Codegen.optional(this.multilineProcessingEnabled);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The location to scan for new data.
     * 
     */
    @Export(name="path", refs={S3AuditSourcePath.class}, tree="[0]")
    private Output<S3AuditSourcePath> path;

    /**
     * @return The location to scan for new data.
     * 
     */
    public Output<S3AuditSourcePath> path() {
        return this.path;
    }
    /**
     * When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> paused;

    /**
     * @return When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    @Export(name="scanInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> scanInterval;

    /**
     * @return Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    public Output<Optional<Integer>> scanInterval() {
        return Codegen.optional(this.scanInterval);
    }
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }
    /**
     * The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    @Export(name="useAutolineMatching", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useAutolineMatching;

    public Output<Optional<Boolean>> useAutolineMatching() {
        return Codegen.optional(this.useAutolineMatching);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public S3AuditSource(java.lang.String name) {
        this(name, S3AuditSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public S3AuditSource(java.lang.String name, S3AuditSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public S3AuditSource(java.lang.String name, S3AuditSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/s3AuditSource:S3AuditSource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private S3AuditSource(java.lang.String name, Output<java.lang.String> id, @Nullable S3AuditSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/s3AuditSource:S3AuditSource", name, state, makeResourceOptions(options, id), false);
    }

    private static S3AuditSourceArgs makeArgs(S3AuditSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? S3AuditSourceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static S3AuditSource get(java.lang.String name, Output<java.lang.String> id, @Nullable S3AuditSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new S3AuditSource(name, id, state, options);
    }
}
