// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CseEntityNormalizationConfigurationDomainMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseEntityNormalizationConfigurationDomainMappingArgs Empty = new CseEntityNormalizationConfigurationDomainMappingArgs();

    /**
     * The normalized domain.
     * 
     */
    @Import(name="normalizedDomain", required=true)
    private Output<String> normalizedDomain;

    /**
     * @return The normalized domain.
     * 
     */
    public Output<String> normalizedDomain() {
        return this.normalizedDomain;
    }

    /**
     * The raw domain to be normalized.
     * 
     */
    @Import(name="rawDomain", required=true)
    private Output<String> rawDomain;

    /**
     * @return The raw domain to be normalized.
     * 
     */
    public Output<String> rawDomain() {
        return this.rawDomain;
    }

    private CseEntityNormalizationConfigurationDomainMappingArgs() {}

    private CseEntityNormalizationConfigurationDomainMappingArgs(CseEntityNormalizationConfigurationDomainMappingArgs $) {
        this.normalizedDomain = $.normalizedDomain;
        this.rawDomain = $.rawDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseEntityNormalizationConfigurationDomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseEntityNormalizationConfigurationDomainMappingArgs $;

        public Builder() {
            $ = new CseEntityNormalizationConfigurationDomainMappingArgs();
        }

        public Builder(CseEntityNormalizationConfigurationDomainMappingArgs defaults) {
            $ = new CseEntityNormalizationConfigurationDomainMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param normalizedDomain The normalized domain.
         * 
         * @return builder
         * 
         */
        public Builder normalizedDomain(Output<String> normalizedDomain) {
            $.normalizedDomain = normalizedDomain;
            return this;
        }

        /**
         * @param normalizedDomain The normalized domain.
         * 
         * @return builder
         * 
         */
        public Builder normalizedDomain(String normalizedDomain) {
            return normalizedDomain(Output.of(normalizedDomain));
        }

        /**
         * @param rawDomain The raw domain to be normalized.
         * 
         * @return builder
         * 
         */
        public Builder rawDomain(Output<String> rawDomain) {
            $.rawDomain = rawDomain;
            return this;
        }

        /**
         * @param rawDomain The raw domain to be normalized.
         * 
         * @return builder
         * 
         */
        public Builder rawDomain(String rawDomain) {
            return rawDomain(Output.of(rawDomain));
        }

        public CseEntityNormalizationConfigurationDomainMappingArgs build() {
            if ($.normalizedDomain == null) {
                throw new MissingRequiredPropertyException("CseEntityNormalizationConfigurationDomainMappingArgs", "normalizedDomain");
            }
            if ($.rawDomain == null) {
                throw new MissingRequiredPropertyException("CseEntityNormalizationConfigurationDomainMappingArgs", "rawDomain");
            }
            return $;
        }
    }

}