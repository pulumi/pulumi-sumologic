// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.OtCollectorArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.OtCollectorState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.sumologic.OtCollector;
 * import com.pulumi.sumologic.OtCollectorArgs;
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
 *         var exampleOtCollector = new OtCollector("exampleOtCollector", OtCollectorArgs.builder()
 *             .description("Testing OT collector using terraform")
 *             .timeZone("UTC")
 *             .category("apache")
 *             .isRemotelyManaged(true)
 *             .ephemeral(false)
 *             .name("test OT Collector")
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
 * OT Collectors can be imported using the collector id, e.g.:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import sumologic:index/otCollector:OtCollector test 00005AF3107A4007
 * ```
 * 
 * [1]: https://help.sumologic.com/docs/send-data/opentelemetry-collector
 * 
 * [2]: https://help.sumologic.com/03Send-Data/Installed-Collectors/05Reference-Information-for-Collector-Installation/11Set-a-Collector-as-Ephemeral
 * 
 * [3]: https://help.sumologic.com/Manage/Fields
 * 
 * [4]: https://en.wikipedia.org/wiki/Tz_database
 * 
 */
@ResourceType(type="sumologic:index/otCollector:OtCollector")
public class OtCollector extends com.pulumi.resources.CustomResource {
    @Export(name="alive", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> alive;

    public Output<Boolean> alive() {
        return this.alive;
    }
    /**
     * The default source category for any source attached to this collector. Can be overridden in the configuration of said sources.
     * 
     */
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> category;

    /**
     * @return The default source category for any source attached to this collector. Can be overridden in the configuration of said sources.
     * 
     */
    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
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
     * Description of the OT Collector.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the OT Collector.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * When true, the collector will be deleted after 12 hours of inactivity. For more information, see [Setting a Collector as Ephemeral](https://help.sumologic.com/03Send-Data/Installed-Collectors/05Reference-Information-for-Collector-Installation/11Set-a-Collector-as-Ephemeral).
     * 
     */
    @Export(name="ephemeral", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ephemeral;

    /**
     * @return When true, the collector will be deleted after 12 hours of inactivity. For more information, see [Setting a Collector as Ephemeral](https://help.sumologic.com/03Send-Data/Installed-Collectors/05Reference-Information-for-Collector-Installation/11Set-a-Collector-as-Ephemeral).
     * 
     */
    public Output<Optional<Boolean>> ephemeral() {
        return Codegen.optional(this.ephemeral);
    }
    /**
     * Management Status of the OT Collector based on if it is remotely or locally managed.
     * 
     */
    @Export(name="isRemotelyManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isRemotelyManaged;

    /**
     * @return Management Status of the OT Collector based on if it is remotely or locally managed.
     * 
     */
    public Output<Optional<Boolean>> isRemotelyManaged() {
        return Codegen.optional(this.isRemotelyManaged);
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
     * Name of the OT Collector.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the OT Collector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Map containing [key/value pairs][3].
     * 
     * The following attributes are exported:
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map containing [key/value pairs][3].
     * 
     * The following attributes are exported:
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeZone;

    /**
     * @return The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention.
     * 
     */
    public Output<Optional<String>> timeZone() {
        return Codegen.optional(this.timeZone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OtCollector(java.lang.String name) {
        this(name, OtCollectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OtCollector(java.lang.String name, @Nullable OtCollectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OtCollector(java.lang.String name, @Nullable OtCollectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/otCollector:OtCollector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OtCollector(java.lang.String name, Output<java.lang.String> id, @Nullable OtCollectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/otCollector:OtCollector", name, state, makeResourceOptions(options, id), false);
    }

    private static OtCollectorArgs makeArgs(@Nullable OtCollectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OtCollectorArgs.Empty : args;
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
    public static OtCollector get(java.lang.String name, Output<java.lang.String> id, @Nullable OtCollectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OtCollector(name, id, state, options);
    }
}
