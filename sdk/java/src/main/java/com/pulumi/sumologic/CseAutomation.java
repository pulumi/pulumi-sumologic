// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseAutomationArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseAutomationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Automation.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseAutomation;
 * import com.pulumi.sumologic.CseAutomationArgs;
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
 *         var insightAutomation = new CseAutomation(&#34;insightAutomation&#34;, CseAutomationArgs.builder()        
 *             .cseResourceType(&#34;INSIGHT&#34;)
 *             .executionTypes(            
 *                 &#34;NEW_INSIGHT&#34;,
 *                 &#34;INSIGHT_CLOSED&#34;)
 *             .playbookId(&#34;638079aedb99cafada1e80a0&#34;)
 *             .build());
 * 
 *         var entityAutomation = new CseAutomation(&#34;entityAutomation&#34;, CseAutomationArgs.builder()        
 *             .cseResourceSubTypes(&#34;_ip&#34;)
 *             .cseResourceType(&#34;ENTITY&#34;)
 *             .executionTypes(&#34;ON_DEMAND&#34;)
 *             .playbookId(&#34;638079aedb99cafada1e80a0&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseAutomation:CseAutomation automation id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseAutomation:CseAutomation")
public class CseAutomation extends com.pulumi.resources.CustomResource {
    /**
     * CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
     * 
     */
    @Export(name="cseResourceSubTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cseResourceSubTypes;

    /**
     * @return CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
     * 
     */
    public Output<Optional<List<String>>> cseResourceSubTypes() {
        return Codegen.optional(this.cseResourceSubTypes);
    }
    /**
     * CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
     * 
     */
    @Export(name="cseResourceType", type=String.class, parameters={})
    private Output<String> cseResourceType;

    /**
     * @return CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
     * 
     */
    public Output<String> cseResourceType() {
        return this.cseResourceType;
    }
    /**
     * Automation description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Automation description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
     * 
     */
    @Export(name="executionTypes", type=List.class, parameters={String.class})
    private Output<List<String>> executionTypes;

    /**
     * @return Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
     * 
     */
    public Output<List<String>> executionTypes() {
        return this.executionTypes;
    }
    /**
     * Automation name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Automation name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="playbookId", type=String.class, parameters={})
    private Output<String> playbookId;

    public Output<String> playbookId() {
        return this.playbookId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseAutomation(String name) {
        this(name, CseAutomationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseAutomation(String name, CseAutomationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseAutomation(String name, CseAutomationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseAutomation:CseAutomation", name, args == null ? CseAutomationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseAutomation(String name, Output<String> id, @Nullable CseAutomationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseAutomation:CseAutomation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static CseAutomation get(String name, Output<String> id, @Nullable CseAutomationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseAutomation(name, id, state, options);
    }
}