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


public final class CseMatchListItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseMatchListItemArgs Empty = new CseMatchListItemArgs();

    /**
     * Match list description.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Match list description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Match list item expiration. (Format: YYYY-MM-DDTHH:mm:ss)
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return Match list item expiration. (Format: YYYY-MM-DDTHH:mm:ss)
     * 
     * The following attributes are exported:
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The internal ID of the match list.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The internal ID of the match list.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Match list item value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Match list item value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CseMatchListItemArgs() {}

    private CseMatchListItemArgs(CseMatchListItemArgs $) {
        this.description = $.description;
        this.expiration = $.expiration;
        this.id = $.id;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseMatchListItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseMatchListItemArgs $;

        public Builder() {
            $ = new CseMatchListItemArgs();
        }

        public Builder(CseMatchListItemArgs defaults) {
            $ = new CseMatchListItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Match list description.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Match list description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expiration Match list item expiration. (Format: YYYY-MM-DDTHH:mm:ss)
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration Match list item expiration. (Format: YYYY-MM-DDTHH:mm:ss)
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param id The internal ID of the match list.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The internal ID of the match list.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param value Match list item value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Match list item value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CseMatchListItemArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CseMatchListItemArgs", "description");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("CseMatchListItemArgs", "value");
            }
            return $;
        }
    }

}