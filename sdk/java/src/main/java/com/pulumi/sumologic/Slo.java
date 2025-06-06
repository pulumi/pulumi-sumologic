// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.SloArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.SloState;
import com.pulumi.sumologic.outputs.SloCompliance;
import com.pulumi.sumologic.outputs.SloIndicator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides the ability to create, read, delete, and update SLOs.
 * 
 * ## Example SLO
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.Slo;
 * import com.pulumi.sumologic.SloArgs;
 * import com.pulumi.sumologic.inputs.SloComplianceArgs;
 * import com.pulumi.sumologic.inputs.SloIndicatorArgs;
 * import com.pulumi.sumologic.inputs.SloIndicatorWindowBasedEvaluationArgs;
 * import com.pulumi.sumologic.inputs.SloIndicatorRequestBasedEvaluationArgs;
 * import com.pulumi.sumologic.inputs.SloIndicatorMonitorBasedEvaluationArgs;
 * import com.pulumi.sumologic.inputs.SloIndicatorMonitorBasedEvaluationMonitorTriggersArgs;
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
 *         var sloTfWindowMetricRatio = new Slo("sloTfWindowMetricRatio", SloArgs.builder()
 *             .name("login error rate")
 *             .description("per minute login error rate over rolling 7 days")
 *             .parentId("0000000000000001")
 *             .signalType("Error")
 *             .service("auth")
 *             .application("login")
 *             .tags(Map.ofEntries(
 *                 Map.entry("team", "metrics"),
 *                 Map.entry("application", "sumologic")
 *             ))
 *             .compliances(SloComplianceArgs.builder()
 *                 .complianceType("Rolling")
 *                 .size("7d")
 *                 .target(95.0)
 *                 .timezone("Asia/Kolkata")
 *                 .build())
 *             .indicator(SloIndicatorArgs.builder()
 *                 .windowBasedEvaluation(SloIndicatorWindowBasedEvaluationArgs.builder()
 *                     .op("LessThan")
 *                     .queryType("Metrics")
 *                     .size("1m")
 *                     .threshold(99.0)
 *                     .queries(                    
 *                         SloIndicatorWindowBasedEvaluationQueryArgs.builder()
 *                             .queryGroupType("Unsuccessful")
 *                             .queryGroups(SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs.builder()
 *                                 .rowId("A")
 *                                 .query("service=auth api=login metric=HTTP_5XX_Count")
 *                                 .useRowCount(false)
 *                                 .build())
 *                             .build(),
 *                         SloIndicatorWindowBasedEvaluationQueryArgs.builder()
 *                             .queryGroupType("Total")
 *                             .queryGroups(SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs.builder()
 *                                 .rowId("A")
 *                                 .query("service=auth api=login metric=TotalRequests")
 *                                 .useRowCount(false)
 *                                 .build())
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var sloTfWindowBased = new Slo("sloTfWindowBased", SloArgs.builder()
 *             .name("slo-tf-window-based")
 *             .description("example SLO created with terraform")
 *             .parentId("0000000000000001")
 *             .signalType("Latency")
 *             .service("auth")
 *             .application("login")
 *             .tags(Map.ofEntries(
 *                 Map.entry("team", "metrics"),
 *                 Map.entry("application", "sumologic")
 *             ))
 *             .compliances(SloComplianceArgs.builder()
 *                 .complianceType("Rolling")
 *                 .size("7d")
 *                 .target(99.0)
 *                 .timezone("Asia/Kolkata")
 *                 .build())
 *             .indicator(SloIndicatorArgs.builder()
 *                 .windowBasedEvaluation(SloIndicatorWindowBasedEvaluationArgs.builder()
 *                     .op("LessThan")
 *                     .queryType("Metrics")
 *                     .aggregation("Avg")
 *                     .size("1m")
 *                     .threshold(200.0)
 *                     .queries(SloIndicatorWindowBasedEvaluationQueryArgs.builder()
 *                         .queryGroupType("Threshold")
 *                         .queryGroups(SloIndicatorWindowBasedEvaluationQueryQueryGroupArgs.builder()
 *                             .rowId("A")
 *                             .query("metric=request_time_p90  service=auth api=login")
 *                             .useRowCount(false)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var sloTfRequestBased = new Slo("sloTfRequestBased", SloArgs.builder()
 *             .name("slo-tf-request-based")
 *             .description("example SLO created with terraform for request based SLI")
 *             .parentId(tfSloFolder.id())
 *             .signalType("Latency")
 *             .service("auth")
 *             .application("login")
 *             .tags(Map.ofEntries(
 *                 Map.entry("team", "metrics"),
 *                 Map.entry("application", "sumologic")
 *             ))
 *             .compliances(SloComplianceArgs.builder()
 *                 .complianceType("Rolling")
 *                 .size("7d")
 *                 .target(99.0)
 *                 .timezone("Asia/Kolkata")
 *                 .build())
 *             .indicator(SloIndicatorArgs.builder()
 *                 .requestBasedEvaluation(SloIndicatorRequestBasedEvaluationArgs.builder()
 *                     .op("LessThanOrEqual")
 *                     .queryType("Logs")
 *                     .threshold(1.0)
 *                     .queries(SloIndicatorRequestBasedEvaluationQueryArgs.builder()
 *                         .queryGroupType("Threshold")
 *                         .queryGroups(SloIndicatorRequestBasedEvaluationQueryQueryGroupArgs.builder()
 *                             .rowId("A")
 *                             .query("""
 *           cluster=sedemostaging namespace=warp004*
 *               | parse "Coffee preparation request time: * ms" as latency nodrop
 *               |  if(isBlank(latency), "false", "true") as hasLatency
 *               | where hasLatency = "true"
 *               |  if(isBlank(latency), 0.0, latency) as latency
 *               | latency/ 1000 as latency_sec
 *                             """)
 *                             .useRowCount(false)
 *                             .field("latency_sec")
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var sloTfMonitorBased = new Slo("sloTfMonitorBased", SloArgs.builder()
 *             .name("slo-tf-monitor-based")
 *             .description("example of monitor based SLO created with terraform")
 *             .parentId("0000000000000001")
 *             .signalType("Error")
 *             .service("auth")
 *             .application("login")
 *             .tags(Map.ofEntries(
 *                 Map.entry("team", "metrics"),
 *                 Map.entry("application", "sumologic")
 *             ))
 *             .compliances(SloComplianceArgs.builder()
 *                 .complianceType("Rolling")
 *                 .size("7d")
 *                 .target(99.0)
 *                 .timezone("Asia/Kolkata")
 *                 .build())
 *             .indicator(SloIndicatorArgs.builder()
 *                 .monitorBasedEvaluation(SloIndicatorMonitorBasedEvaluationArgs.builder()
 *                     .monitorTriggers(SloIndicatorMonitorBasedEvaluationMonitorTriggersArgs.builder()
 *                         .monitorId("0000000000BCB3A4")
 *                         .triggerTypes("Critical")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="sumologic:index/slo:Slo")
public class Slo extends com.pulumi.resources.CustomResource {
    /**
     * Name of the application.
     * 
     */
    @Export(name="application", refs={String.class}, tree="[0]")
    private Output<String> application;

    /**
     * @return Name of the application.
     * 
     */
    public Output<String> application() {
        return this.application;
    }
    /**
     * The compliance settings for the SLO.
     * 
     */
    @Export(name="compliances", refs={List.class,SloCompliance.class}, tree="[0,1]")
    private Output<List<SloCompliance>> compliances;

    /**
     * @return The compliance settings for the SLO.
     * 
     */
    public Output<List<SloCompliance>> compliances() {
        return this.compliances;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * The description of the SLO.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the SLO.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The service level indicator on which SLO is to be defined. more details on the difference
     * b/w them can be found on
     * the [slo help page](https://help.sumologic.com/Beta/SLO_Reliability_Management/Access_and_Create_SLOs)
     * - window_based_evaluation - Evaluate SLI using successful/total windows.
     * - request_based_evaluation - Evaluate SLI based on occurrence of successful
     *   events / total events over entire compliance period.
     * - monitor_based_evaluation - SLIs for Monitor-based SLOs are calculated at a granularity of 1 minute. A minute is treated as unsuccessful if the Monitor threshold is violated at any point of time within that minute.
     * 
     */
    @Export(name="indicator", refs={SloIndicator.class}, tree="[0]")
    private Output<SloIndicator> indicator;

    /**
     * @return The service level indicator on which SLO is to be defined. more details on the difference
     * b/w them can be found on
     * the [slo help page](https://help.sumologic.com/Beta/SLO_Reliability_Management/Access_and_Create_SLOs)
     * - window_based_evaluation - Evaluate SLI using successful/total windows.
     * - request_based_evaluation - Evaluate SLI based on occurrence of successful
     *   events / total events over entire compliance period.
     * - monitor_based_evaluation - SLIs for Monitor-based SLOs are calculated at a granularity of 1 minute. A minute is treated as unsuccessful if the Monitor threshold is violated at any point of time within that minute.
     * 
     */
    public Output<SloIndicator> indicator() {
        return this.indicator;
    }
    @Export(name="isLocked", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isLocked;

    public Output<Optional<Boolean>> isLocked() {
        return Codegen.optional(this.isLocked);
    }
    @Export(name="isMutable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isMutable;

    public Output<Boolean> isMutable() {
        return this.isMutable;
    }
    @Export(name="isSystem", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isSystem;

    public Output<Boolean> isSystem() {
        return this.isSystem;
    }
    @Export(name="modifiedAt", refs={String.class}, tree="[0]")
    private Output<String> modifiedAt;

    public Output<String> modifiedAt() {
        return this.modifiedAt;
    }
    @Export(name="modifiedBy", refs={String.class}, tree="[0]")
    private Output<String> modifiedBy;

    public Output<String> modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * The name of the SLO. The name must be alphanumeric.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the SLO. The name must be alphanumeric.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the SLO Folder that contains this SLO. Defaults to the root folder.
     * 
     */
    @Export(name="parentId", refs={String.class}, tree="[0]")
    private Output<String> parentId;

    /**
     * @return The ID of the SLO Folder that contains this SLO. Defaults to the root folder.
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
    }
    @Export(name="postRequestMap", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> postRequestMap;

    public Output<Optional<Map<String,String>>> postRequestMap() {
        return Codegen.optional(this.postRequestMap);
    }
    /**
     * Name of the service.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return Name of the service.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The type of SLO. Valid values are `Latency`, `Error`, `Throughput`, `Availability`
     * , `Other`. Defaults to `Latency`.
     * 
     */
    @Export(name="signalType", refs={String.class}, tree="[0]")
    private Output<String> signalType;

    /**
     * @return The type of SLO. Valid values are `Latency`, `Error`, `Throughput`, `Availability`
     * , `Other`. Defaults to `Latency`.
     * 
     */
    public Output<String> signalType() {
        return this.signalType;
    }
    /**
     * A map defining tag keys and tag values for the SLO.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map defining tag keys and tag values for the SLO.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slo(java.lang.String name) {
        this(name, SloArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slo(java.lang.String name, SloArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slo(java.lang.String name, SloArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/slo:Slo", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Slo(java.lang.String name, Output<java.lang.String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/slo:Slo", name, state, makeResourceOptions(options, id), false);
    }

    private static SloArgs makeArgs(SloArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SloArgs.Empty : args;
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
    public static Slo get(java.lang.String name, Output<java.lang.String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slo(name, id, state, options);
    }
}
