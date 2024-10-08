// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseContextActionArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseContextActionState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Context Action.
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
 * import com.pulumi.sumologic.CseContextAction;
 * import com.pulumi.sumologic.CseContextActionArgs;
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
 *         var contextAction = new CseContextAction("contextAction", CseContextActionArgs.builder()
 *             .name("Context Action Name")
 *             .type("URL")
 *             .template("https://bar.com/?q={{value}}")
 *             .iocTypes("IP_ADDRESS")
 *             .entityTypes("_hostname")
 *             .recordFields("request_url")
 *             .allRecordFields(false)
 *             .enabled(true)
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
 * Context Action can be imported using the field id, e.g.:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import sumologic:index/cseContextAction:CseContextAction context_action id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseContextAction:CseContextAction")
public class CseContextAction extends com.pulumi.resources.CustomResource {
    /**
     * Use all record fields.
     * 
     */
    @Export(name="allRecordFields", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allRecordFields;

    /**
     * @return Use all record fields.
     * 
     */
    public Output<Optional<Boolean>> allRecordFields() {
        return Codegen.optional(this.allRecordFields);
    }
    /**
     * Whether the context action is enabled.
     * 
     * The following attributes are exported:
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the context action is enabled.
     * 
     * The following attributes are exported:
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Applicable to given entity types.
     * 
     */
    @Export(name="entityTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> entityTypes;

    /**
     * @return Applicable to given entity types.
     * 
     */
    public Output<Optional<List<String>>> entityTypes() {
        return Codegen.optional(this.entityTypes);
    }
    /**
     * IOC Data types. Valid values: &#34;ASN&#34;, &#34;DOMAIN&#34;, &#34;HASH&#34;, &#34;IP_ADDRESS&#34;, &#34;MAC_ADDRESS&#34;, &#34;PORT&#34;, &#34;RECORD_PROPERTY&#34;, &#34;URL&#34;.
     * 
     */
    @Export(name="iocTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> iocTypes;

    /**
     * @return IOC Data types. Valid values: &#34;ASN&#34;, &#34;DOMAIN&#34;, &#34;HASH&#34;, &#34;IP_ADDRESS&#34;, &#34;MAC_ADDRESS&#34;, &#34;PORT&#34;, &#34;RECORD_PROPERTY&#34;, &#34;URL&#34;.
     * 
     */
    public Output<List<String>> iocTypes() {
        return this.iocTypes;
    }
    /**
     * Context Action name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Context Action name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specific record fields.
     * 
     */
    @Export(name="recordFields", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> recordFields;

    /**
     * @return Specific record fields.
     * 
     */
    public Output<Optional<List<String>>> recordFields() {
        return Codegen.optional(this.recordFields);
    }
    /**
     * The URL/QUERY template.
     * 
     */
    @Export(name="template", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> template;

    /**
     * @return The URL/QUERY template.
     * 
     */
    public Output<Optional<String>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * Context Action type. Valid values: &#34;URL&#34;, &#34;QUERY&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Context Action type. Valid values: &#34;URL&#34;, &#34;QUERY&#34;.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseContextAction(java.lang.String name) {
        this(name, CseContextActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseContextAction(java.lang.String name, CseContextActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseContextAction(java.lang.String name, CseContextActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseContextAction:CseContextAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CseContextAction(java.lang.String name, Output<java.lang.String> id, @Nullable CseContextActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseContextAction:CseContextAction", name, state, makeResourceOptions(options, id), false);
    }

    private static CseContextActionArgs makeArgs(CseContextActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CseContextActionArgs.Empty : args;
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
    public static CseContextAction get(java.lang.String name, Output<java.lang.String> id, @Nullable CseContextActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseContextAction(name, id, state, options);
    }
}
