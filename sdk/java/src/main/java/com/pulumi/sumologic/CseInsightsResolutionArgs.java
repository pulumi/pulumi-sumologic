// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseInsightsResolutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseInsightsResolutionArgs Empty = new CseInsightsResolutionArgs();

    /**
     * The description of the insights resolution.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the insights resolution.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the insights resolution.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the insights resolution.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    private CseInsightsResolutionArgs() {}

    private CseInsightsResolutionArgs(CseInsightsResolutionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseInsightsResolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseInsightsResolutionArgs $;

        public Builder() {
            $ = new CseInsightsResolutionArgs();
        }

        public Builder(CseInsightsResolutionArgs defaults) {
            $ = new CseInsightsResolutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the insights resolution.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the insights resolution.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the insights resolution.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the insights resolution.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public CseInsightsResolutionArgs build() {
            return $;
        }
    }

}