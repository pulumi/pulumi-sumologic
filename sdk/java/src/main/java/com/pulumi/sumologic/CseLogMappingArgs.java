// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.CseLogMappingFieldArgs;
import com.pulumi.sumologic.inputs.CseLogMappingStructuredInputArgs;
import com.pulumi.sumologic.inputs.CseLogMappingUnstructuredFieldsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseLogMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseLogMappingArgs Empty = new CseLogMappingArgs();

    /**
     * Enabled flag.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enabled flag.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * List of fields for the new log mapping. See field_schema for details.
     * 
     */
    @Import(name="fields", required=true)
    private Output<List<CseLogMappingFieldArgs>> fields;

    /**
     * @return List of fields for the new log mapping. See field_schema for details.
     * 
     */
    public Output<List<CseLogMappingFieldArgs>> fields() {
        return this.fields;
    }

    /**
     * The name of the log mapping.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the log mapping.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The id of the parent log mapping.
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    /**
     * @return The id of the parent log mapping.
     * 
     */
    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    /**
     * Product GUID.
     * 
     */
    @Import(name="productGuid", required=true)
    private Output<String> productGuid;

    /**
     * @return Product GUID.
     * 
     */
    public Output<String> productGuid() {
        return this.productGuid;
    }

    /**
     * The record type to be created. (possible values: Audit, AuditChange, AuditFile, AuditResourceAccess, Authentication, AuthenticationPrivilegeEscalation, Canary, Email, Endpoint, EndpointModuleLoad, EndpointProcess, Network, NetworkDHCP, NetworkDNS, NetworkFlow, NetworkHTTP, NetworkProxy, Notification, NotificationVulnerability)
     * 
     */
    @Import(name="recordType", required=true)
    private Output<String> recordType;

    /**
     * @return The record type to be created. (possible values: Audit, AuditChange, AuditFile, AuditResourceAccess, Authentication, AuthenticationPrivilegeEscalation, Canary, Email, Endpoint, EndpointModuleLoad, EndpointProcess, Network, NetworkDHCP, NetworkDNS, NetworkFlow, NetworkHTTP, NetworkProxy, Notification, NotificationVulnerability)
     * 
     */
    public Output<String> recordType() {
        return this.recordType;
    }

    /**
     * Set to true to relate entities.
     * 
     */
    @Import(name="relatesEntities")
    private @Nullable Output<Boolean> relatesEntities;

    /**
     * @return Set to true to relate entities.
     * 
     */
    public Optional<Output<Boolean>> relatesEntities() {
        return Optional.ofNullable(this.relatesEntities);
    }

    /**
     * List of skipped values.
     * 
     */
    @Import(name="skippedValues")
    private @Nullable Output<List<String>> skippedValues;

    /**
     * @return List of skipped values.
     * 
     */
    public Optional<Output<List<String>>> skippedValues() {
        return Optional.ofNullable(this.skippedValues);
    }

    /**
     * List of structured inputs for the new log mapping. See structured_input_schema for details.
     * 
     */
    @Import(name="structuredInputs")
    private @Nullable Output<List<CseLogMappingStructuredInputArgs>> structuredInputs;

    /**
     * @return List of structured inputs for the new log mapping. See structured_input_schema for details.
     * 
     */
    public Optional<Output<List<CseLogMappingStructuredInputArgs>>> structuredInputs() {
        return Optional.ofNullable(this.structuredInputs);
    }

    /**
     * Unstructured fields for the new log mapping. See unstructured_field_schema for details.
     * 
     */
    @Import(name="unstructuredFields")
    private @Nullable Output<CseLogMappingUnstructuredFieldsArgs> unstructuredFields;

    /**
     * @return Unstructured fields for the new log mapping. See unstructured_field_schema for details.
     * 
     */
    public Optional<Output<CseLogMappingUnstructuredFieldsArgs>> unstructuredFields() {
        return Optional.ofNullable(this.unstructuredFields);
    }

    private CseLogMappingArgs() {}

    private CseLogMappingArgs(CseLogMappingArgs $) {
        this.enabled = $.enabled;
        this.fields = $.fields;
        this.name = $.name;
        this.parentId = $.parentId;
        this.productGuid = $.productGuid;
        this.recordType = $.recordType;
        this.relatesEntities = $.relatesEntities;
        this.skippedValues = $.skippedValues;
        this.structuredInputs = $.structuredInputs;
        this.unstructuredFields = $.unstructuredFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseLogMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseLogMappingArgs $;

        public Builder() {
            $ = new CseLogMappingArgs();
        }

        public Builder(CseLogMappingArgs defaults) {
            $ = new CseLogMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enabled flag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enabled flag.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fields List of fields for the new log mapping. See field_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder fields(Output<List<CseLogMappingFieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields List of fields for the new log mapping. See field_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<CseLogMappingFieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields List of fields for the new log mapping. See field_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder fields(CseLogMappingFieldArgs... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param name The name of the log mapping.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the log mapping.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentId The id of the parent log mapping.
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The id of the parent log mapping.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param productGuid Product GUID.
         * 
         * @return builder
         * 
         */
        public Builder productGuid(Output<String> productGuid) {
            $.productGuid = productGuid;
            return this;
        }

        /**
         * @param productGuid Product GUID.
         * 
         * @return builder
         * 
         */
        public Builder productGuid(String productGuid) {
            return productGuid(Output.of(productGuid));
        }

        /**
         * @param recordType The record type to be created. (possible values: Audit, AuditChange, AuditFile, AuditResourceAccess, Authentication, AuthenticationPrivilegeEscalation, Canary, Email, Endpoint, EndpointModuleLoad, EndpointProcess, Network, NetworkDHCP, NetworkDNS, NetworkFlow, NetworkHTTP, NetworkProxy, Notification, NotificationVulnerability)
         * 
         * @return builder
         * 
         */
        public Builder recordType(Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The record type to be created. (possible values: Audit, AuditChange, AuditFile, AuditResourceAccess, Authentication, AuthenticationPrivilegeEscalation, Canary, Email, Endpoint, EndpointModuleLoad, EndpointProcess, Network, NetworkDHCP, NetworkDNS, NetworkFlow, NetworkHTTP, NetworkProxy, Notification, NotificationVulnerability)
         * 
         * @return builder
         * 
         */
        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        /**
         * @param relatesEntities Set to true to relate entities.
         * 
         * @return builder
         * 
         */
        public Builder relatesEntities(@Nullable Output<Boolean> relatesEntities) {
            $.relatesEntities = relatesEntities;
            return this;
        }

        /**
         * @param relatesEntities Set to true to relate entities.
         * 
         * @return builder
         * 
         */
        public Builder relatesEntities(Boolean relatesEntities) {
            return relatesEntities(Output.of(relatesEntities));
        }

        /**
         * @param skippedValues List of skipped values.
         * 
         * @return builder
         * 
         */
        public Builder skippedValues(@Nullable Output<List<String>> skippedValues) {
            $.skippedValues = skippedValues;
            return this;
        }

        /**
         * @param skippedValues List of skipped values.
         * 
         * @return builder
         * 
         */
        public Builder skippedValues(List<String> skippedValues) {
            return skippedValues(Output.of(skippedValues));
        }

        /**
         * @param skippedValues List of skipped values.
         * 
         * @return builder
         * 
         */
        public Builder skippedValues(String... skippedValues) {
            return skippedValues(List.of(skippedValues));
        }

        /**
         * @param structuredInputs List of structured inputs for the new log mapping. See structured_input_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder structuredInputs(@Nullable Output<List<CseLogMappingStructuredInputArgs>> structuredInputs) {
            $.structuredInputs = structuredInputs;
            return this;
        }

        /**
         * @param structuredInputs List of structured inputs for the new log mapping. See structured_input_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder structuredInputs(List<CseLogMappingStructuredInputArgs> structuredInputs) {
            return structuredInputs(Output.of(structuredInputs));
        }

        /**
         * @param structuredInputs List of structured inputs for the new log mapping. See structured_input_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder structuredInputs(CseLogMappingStructuredInputArgs... structuredInputs) {
            return structuredInputs(List.of(structuredInputs));
        }

        /**
         * @param unstructuredFields Unstructured fields for the new log mapping. See unstructured_field_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder unstructuredFields(@Nullable Output<CseLogMappingUnstructuredFieldsArgs> unstructuredFields) {
            $.unstructuredFields = unstructuredFields;
            return this;
        }

        /**
         * @param unstructuredFields Unstructured fields for the new log mapping. See unstructured_field_schema for details.
         * 
         * @return builder
         * 
         */
        public Builder unstructuredFields(CseLogMappingUnstructuredFieldsArgs unstructuredFields) {
            return unstructuredFields(Output.of(unstructuredFields));
        }

        public CseLogMappingArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("CseLogMappingArgs", "enabled");
            }
            if ($.fields == null) {
                throw new MissingRequiredPropertyException("CseLogMappingArgs", "fields");
            }
            if ($.productGuid == null) {
                throw new MissingRequiredPropertyException("CseLogMappingArgs", "productGuid");
            }
            if ($.recordType == null) {
                throw new MissingRequiredPropertyException("CseLogMappingArgs", "recordType");
            }
            return $;
        }
    }

}