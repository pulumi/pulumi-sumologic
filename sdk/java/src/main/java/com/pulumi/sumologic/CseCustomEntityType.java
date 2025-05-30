// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseCustomEntityTypeArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseCustomEntityTypeState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Custom Entity Type.
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
 * import com.pulumi.sumologic.CseCustomEntityType;
 * import com.pulumi.sumologic.CseCustomEntityTypeArgs;
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
 *         var customEntityType = new CseCustomEntityType("customEntityType", CseCustomEntityTypeArgs.builder()
 *             .name("New Custom Entity Type")
 *             .identifier("identifier")
 *             .fields(            
 *                 "file_hash_md5",
 *                 "file_hash_sha1")
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
 * Custom entity type can be imported using the field id, e.g.:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import sumologic:index/cseCustomEntityType:CseCustomEntityType custom_entity_type id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseCustomEntityType:CseCustomEntityType")
public class CseCustomEntityType extends com.pulumi.resources.CustomResource {
    /**
     * Record schema fields. Examples: &#34;file_hash_md5&#34;, &#34;file_hash_sha1&#34;.&#34;.
     * 
     * The following attributes are exported:
     * 
     */
    @Export(name="fields", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> fields;

    /**
     * @return Record schema fields. Examples: &#34;file_hash_md5&#34;, &#34;file_hash_sha1&#34;.&#34;.
     * 
     * The following attributes are exported:
     * 
     */
    public Output<List<String>> fields() {
        return this.fields;
    }
    /**
     * Machine friendly and unique identifier. Example: &#34;filehash&#34;.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Machine friendly and unique identifier. Example: &#34;filehash&#34;.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Human friend and unique name. Example: &#34;File Hash&#34;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human friend and unique name. Example: &#34;File Hash&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseCustomEntityType(java.lang.String name) {
        this(name, CseCustomEntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseCustomEntityType(java.lang.String name, CseCustomEntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseCustomEntityType(java.lang.String name, CseCustomEntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseCustomEntityType:CseCustomEntityType", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CseCustomEntityType(java.lang.String name, Output<java.lang.String> id, @Nullable CseCustomEntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseCustomEntityType:CseCustomEntityType", name, state, makeResourceOptions(options, id), false);
    }

    private static CseCustomEntityTypeArgs makeArgs(CseCustomEntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CseCustomEntityTypeArgs.Empty : args;
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
    public static CseCustomEntityType get(java.lang.String name, Output<java.lang.String> id, @Nullable CseCustomEntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseCustomEntityType(name, id, state, options);
    }
}
