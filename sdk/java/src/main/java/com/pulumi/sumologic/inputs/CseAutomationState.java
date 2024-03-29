// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseAutomationState extends com.pulumi.resources.ResourceArgs {

    public static final CseAutomationState Empty = new CseAutomationState();

    /**
     * CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="cseResourceSubTypes")
    private @Nullable Output<List<String>> cseResourceSubTypes;

    /**
     * @return CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<List<String>>> cseResourceSubTypes() {
        return Optional.ofNullable(this.cseResourceSubTypes);
    }

    /**
     * CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
     * 
     */
    @Import(name="cseResourceType")
    private @Nullable Output<String> cseResourceType;

    /**
     * @return CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
     * 
     */
    public Optional<Output<String>> cseResourceType() {
        return Optional.ofNullable(this.cseResourceType);
    }

    /**
     * Automation description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Automation description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
     * 
     */
    @Import(name="executionTypes")
    private @Nullable Output<List<String>> executionTypes;

    /**
     * @return Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
     * 
     */
    public Optional<Output<List<String>>> executionTypes() {
        return Optional.ofNullable(this.executionTypes);
    }

    /**
     * Automation name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Automation name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="playbookId")
    private @Nullable Output<String> playbookId;

    public Optional<Output<String>> playbookId() {
        return Optional.ofNullable(this.playbookId);
    }

    private CseAutomationState() {}

    private CseAutomationState(CseAutomationState $) {
        this.cseResourceSubTypes = $.cseResourceSubTypes;
        this.cseResourceType = $.cseResourceType;
        this.description = $.description;
        this.enabled = $.enabled;
        this.executionTypes = $.executionTypes;
        this.name = $.name;
        this.playbookId = $.playbookId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseAutomationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseAutomationState $;

        public Builder() {
            $ = new CseAutomationState();
        }

        public Builder(CseAutomationState defaults) {
            $ = new CseAutomationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cseResourceSubTypes CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder cseResourceSubTypes(@Nullable Output<List<String>> cseResourceSubTypes) {
            $.cseResourceSubTypes = cseResourceSubTypes;
            return this;
        }

        /**
         * @param cseResourceSubTypes CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder cseResourceSubTypes(List<String> cseResourceSubTypes) {
            return cseResourceSubTypes(Output.of(cseResourceSubTypes));
        }

        /**
         * @param cseResourceSubTypes CSE Resource sub-type when cse_resource_type is specified as &#34;ENTITY&#34;. Examples: &#34;_ip&#34;, &#34;_mac&#34;.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder cseResourceSubTypes(String... cseResourceSubTypes) {
            return cseResourceSubTypes(List.of(cseResourceSubTypes));
        }

        /**
         * @param cseResourceType CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cseResourceType(@Nullable Output<String> cseResourceType) {
            $.cseResourceType = cseResourceType;
            return this;
        }

        /**
         * @param cseResourceType CSE Resource type for automation. Valid values: &#34;INSIGHT&#34;, &#34;ENTITY&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cseResourceType(String cseResourceType) {
            return cseResourceType(Output.of(cseResourceType));
        }

        /**
         * @param description Automation description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Automation description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param executionTypes Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
         * 
         * @return builder
         * 
         */
        public Builder executionTypes(@Nullable Output<List<String>> executionTypes) {
            $.executionTypes = executionTypes;
            return this;
        }

        /**
         * @param executionTypes Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
         * 
         * @return builder
         * 
         */
        public Builder executionTypes(List<String> executionTypes) {
            return executionTypes(Output.of(executionTypes));
        }

        /**
         * @param executionTypes Automation execution type. Valid values: &#34;NEW_INSIGHT&#34;, &#34;INSIGHT_CLOSED&#34;, &#34;ON_DEMAND&#34;.
         * 
         * @return builder
         * 
         */
        public Builder executionTypes(String... executionTypes) {
            return executionTypes(List.of(executionTypes));
        }

        /**
         * @param name Automation name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Automation name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder playbookId(@Nullable Output<String> playbookId) {
            $.playbookId = playbookId;
            return this;
        }

        public Builder playbookId(String playbookId) {
            return playbookId(Output.of(playbookId));
        }

        public CseAutomationState build() {
            return $;
        }
    }

}
