// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseChainRuleArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseChainRuleState;
import com.pulumi.sumologic.outputs.CseChainRuleEntitySelector;
import com.pulumi.sumologic.outputs.CseChainRuleExpressionsAndLimit;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sumo Logic CSE [Chain Rule](https://help.sumologic.com/Cloud_SIEM_Enterprise/CSE_Rules/07_Write_a_Chain_Rule).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseChainRule;
 * import com.pulumi.sumologic.CseChainRuleArgs;
 * import com.pulumi.sumologic.inputs.CseChainRuleEntitySelectorArgs;
 * import com.pulumi.sumologic.inputs.CseChainRuleExpressionsAndLimitArgs;
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
 *         var chainRule = new CseChainRule(&#34;chainRule&#34;, CseChainRuleArgs.builder()        
 *             .description(&#34;Signal description&#34;)
 *             .enabled(true)
 *             .entitySelectors(CseChainRuleEntitySelectorArgs.builder()
 *                 .entityType(&#34;_username&#34;)
 *                 .expression(&#34;user_username&#34;)
 *                 .build())
 *             .expressionsAndLimits(            
 *                 CseChainRuleExpressionsAndLimitArgs.builder()
 *                     .expression(&#34;success = false&#34;)
 *                     .limit(5)
 *                     .build(),
 *                 CseChainRuleExpressionsAndLimitArgs.builder()
 *                     .expression(&#34;success = true&#34;)
 *                     .limit(1)
 *                     .build())
 *             .groupByFields()
 *             .isPrototype(false)
 *             .ordered(true)
 *             .severity(5)
 *             .summaryExpression(&#34;Signal summary&#34;)
 *             .tags(&#34;_mitreAttackTactic:TA0009&#34;)
 *             .windowSize(&#34;T30M&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Chain Rules can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseChainRule:CseChainRule chain_rule id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseChainRule:CseChainRule")
public class CseChainRule extends com.pulumi.resources.CustomResource {
    /**
     * The description of the generated Signals
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the generated Signals
     * 
     */
    public Output<String> description() {
        return this.description;
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
    @Export(name="entitySelectors", type=List.class, parameters={CseChainRuleEntitySelector.class})
    private Output<List<CseChainRuleEntitySelector>> entitySelectors;

    /**
     * @return The entities to generate Signals on
     * 
     */
    public Output<List<CseChainRuleEntitySelector>> entitySelectors() {
        return this.entitySelectors;
    }
    /**
     * The list of expressions and associated limits to make up the conditions of the chain rule
     * 
     */
    @Export(name="expressionsAndLimits", type=List.class, parameters={CseChainRuleExpressionsAndLimit.class})
    private Output<List<CseChainRuleExpressionsAndLimit>> expressionsAndLimits;

    /**
     * @return The list of expressions and associated limits to make up the conditions of the chain rule
     * 
     */
    public Output<List<CseChainRuleExpressionsAndLimit>> expressionsAndLimits() {
        return this.expressionsAndLimits;
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
     * The name of the Rule and the generated SignalS
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Rule and the generated SignalS
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
     * 
     */
    @Export(name="ordered", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ordered;

    /**
     * @return Whether the records matching the expressions must be in the same chronological order as the expressions are listed in the rule
     * 
     */
    public Output<Optional<Boolean>> ordered() {
        return Codegen.optional(this.ordered);
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
     * How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
     * 
     */
    @Export(name="windowSize", type=String.class, parameters={})
    private Output<String> windowSize;

    /**
     * @return How long of a window to aggregate records for. Current acceptable values are T05M, T10M, T30M, T60M, T24H, T12H, or T05D.
     * 
     */
    public Output<String> windowSize() {
        return this.windowSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseChainRule(String name) {
        this(name, CseChainRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseChainRule(String name, CseChainRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseChainRule(String name, CseChainRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseChainRule:CseChainRule", name, args == null ? CseChainRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseChainRule(String name, Output<String> id, @Nullable CseChainRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseChainRule:CseChainRule", name, state, makeResourceOptions(options, id));
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
    public static CseChainRule get(String name, Output<String> id, @Nullable CseChainRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseChainRule(name, id, state, options);
    }
}