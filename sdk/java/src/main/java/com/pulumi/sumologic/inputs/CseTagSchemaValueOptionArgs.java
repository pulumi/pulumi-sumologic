// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseTagSchemaValueOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseTagSchemaValueOptionArgs Empty = new CseTagSchemaValueOptionArgs();

    /**
     * Value option label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Value option label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Value option link.
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="link")
    private @Nullable Output<String> link;

    /**
     * @return Value option link.
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<String>> link() {
        return Optional.ofNullable(this.link);
    }

    /**
     * Value option value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value option value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CseTagSchemaValueOptionArgs() {}

    private CseTagSchemaValueOptionArgs(CseTagSchemaValueOptionArgs $) {
        this.label = $.label;
        this.link = $.link;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseTagSchemaValueOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseTagSchemaValueOptionArgs $;

        public Builder() {
            $ = new CseTagSchemaValueOptionArgs();
        }

        public Builder(CseTagSchemaValueOptionArgs defaults) {
            $ = new CseTagSchemaValueOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label Value option label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Value option label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param link Value option link.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder link(@Nullable Output<String> link) {
            $.link = link;
            return this;
        }

        /**
         * @param link Value option link.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder link(String link) {
            return link(Output.of(link));
        }

        /**
         * @param value Value option value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value option value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CseTagSchemaValueOptionArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("CseTagSchemaValueOptionArgs", "value");
            }
            return $;
        }
    }

}
