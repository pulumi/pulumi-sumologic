// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseFirstSeenRuleArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseFirstSeenRuleState;
import com.pulumi.sumologic.outputs.CseFirstSeenRuleEntitySelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sumo Logic CSE [First Seen Rule](https://help.sumologic.com/docs/cse/rules/write-first-seen-rule/).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseFirstSeenRule;
 * import com.pulumi.sumologic.CseFirstSeenRuleArgs;
 * import com.pulumi.sumologic.inputs.CseFirstSeenRuleEntitySelectorArgs;
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
 *         var firstSeenRule = new CseFirstSeenRule(&#34;firstSeenRule&#34;, CseFirstSeenRuleArgs.builder()        
 *             .baselineType(&#34;PER_ENTITY&#34;)
 *             .baselineWindowSize(&#34;35000&#34;)
 *             .descriptionExpression(&#34;First User Login - {{ user_username }}&#34;)
 *             .enabled(true)
 *             .entitySelectors(            
 *                 CseFirstSeenRuleEntitySelectorArgs.builder()
 *                     .entityType(&#34;_username&#34;)
 *                     .expression(&#34;user_username&#34;)
 *                     .build(),
 *                 CseFirstSeenRuleEntitySelectorArgs.builder()
 *                     .entityType(&#34;_hostname&#34;)
 *                     .expression(&#34;dstDevice_hostname&#34;)
 *                     .build())
 *             .filterExpression(&#34;objectType=\&#34;Network\&#34;&#34;)
 *             .groupByFields(&#34;user_username&#34;)
 *             .isPrototype(false)
 *             .nameExpression(&#34;First User Login - {{ user_username }}&#34;)
 *             .retentionWindowSize(&#34;86400000&#34;)
 *             .severity(1)
 *             .valueFields(&#34;dstDevice_hostname&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * First Seen Rules can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseFirstSeenRule:CseFirstSeenRule first_seen_rule id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseFirstSeenRule:CseFirstSeenRule")
public class CseFirstSeenRule extends com.pulumi.resources.CustomResource {
    /**
     * The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     * 
     */
    @Export(name="baselineType", type=String.class, parameters={})
    private Output<String> baselineType;

    /**
     * @return The baseline type. Current acceptable values are GLOBAL or PER_ENTITY
     * 
     */
    public Output<String> baselineType() {
        return this.baselineType;
    }
    /**
     * The baseline window size in milliseconds
     * 
     */
    @Export(name="baselineWindowSize", type=String.class, parameters={})
    private Output<String> baselineWindowSize;

    /**
     * @return The baseline window size in milliseconds
     * 
     */
    public Output<String> baselineWindowSize() {
        return this.baselineWindowSize;
    }
    /**
     * The description of the generated Signals
     * 
     */
    @Export(name="descriptionExpression", type=String.class, parameters={})
    private Output<String> descriptionExpression;

    /**
     * @return The description of the generated Signals
     * 
     */
    public Output<String> descriptionExpression() {
        return this.descriptionExpression;
    }
    /**
     * Whether the rule should generate Signals
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether the rule should generate Signals
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The entities to generate Signals on
     * 
     */
    @Export(name="entitySelectors", type=List.class, parameters={CseFirstSeenRuleEntitySelector.class})
    private Output<List<CseFirstSeenRuleEntitySelector>> entitySelectors;

    /**
     * @return The entities to generate Signals on
     * 
     */
    public Output<List<CseFirstSeenRuleEntitySelector>> entitySelectors() {
        return this.entitySelectors;
    }
    /**
     * The expression for which records to match on
     * 
     */
    @Export(name="filterExpression", type=String.class, parameters={})
    private Output<String> filterExpression;

    /**
     * @return The expression for which records to match on
     * 
     */
    public Output<String> filterExpression() {
        return this.filterExpression;
    }
    /**
     * A list of fields to group records by
     * 
     */
    @Export(name="groupByFields", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupByFields;

    /**
     * @return A list of fields to group records by
     * 
     */
    public Output<Optional<List<String>>> groupByFields() {
        return Codegen.optional(this.groupByFields);
    }
    /**
     * Whether the generated Signals should be prototype Signals
     * 
     */
    @Export(name="isPrototype", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isPrototype;

    /**
     * @return Whether the generated Signals should be prototype Signals
     * 
     */
    public Output<Optional<Boolean>> isPrototype() {
        return Codegen.optional(this.isPrototype);
    }
    /**
     * The name of the Rule
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the generated Signals
     * 
     */
    @Export(name="nameExpression", type=String.class, parameters={})
    private Output<String> nameExpression;

    /**
     * @return The name of the generated Signals
     * 
     */
    public Output<String> nameExpression() {
        return this.nameExpression;
    }
    /**
     * The retention window size in milliseconds
     * 
     */
    @Export(name="retentionWindowSize", type=String.class, parameters={})
    private Output<String> retentionWindowSize;

    /**
     * @return The retention window size in milliseconds
     * 
     */
    public Output<String> retentionWindowSize() {
        return this.retentionWindowSize;
    }
    /**
     * The severity of the generated Signals
     * 
     */
    @Export(name="severity", type=Integer.class, parameters={})
    private Output<Integer> severity;

    /**
     * @return The severity of the generated Signals
     * 
     */
    public Output<Integer> severity() {
        return this.severity;
    }
    /**
     * The summary of the generated Signals
     * 
     */
    @Export(name="summaryExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> summaryExpression;

    /**
     * @return The summary of the generated Signals
     * 
     */
    public Output<Optional<String>> summaryExpression() {
        return Codegen.optional(this.summaryExpression);
    }
    /**
     * The tags of the generated Signals
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags of the generated Signals
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The value fields
     * 
     */
    @Export(name="valueFields", type=List.class, parameters={String.class})
    private Output<List<String>> valueFields;

    /**
     * @return The value fields
     * 
     */
    public Output<List<String>> valueFields() {
        return this.valueFields;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseFirstSeenRule(String name) {
        this(name, CseFirstSeenRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseFirstSeenRule(String name, CseFirstSeenRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseFirstSeenRule(String name, CseFirstSeenRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseFirstSeenRule:CseFirstSeenRule", name, args == null ? CseFirstSeenRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseFirstSeenRule(String name, Output<String> id, @Nullable CseFirstSeenRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseFirstSeenRule:CseFirstSeenRule", name, state, makeResourceOptions(options, id));
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
    public static CseFirstSeenRule get(String name, Output<String> id, @Nullable CseFirstSeenRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseFirstSeenRule(name, id, state, options);
    }
}