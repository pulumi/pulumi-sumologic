// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataForwardingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataForwardingRuleArgs Empty = new DataForwardingRuleArgs();

    /**
     * The data forwarding destination id.
     * 
     */
    @Import(name="destinationId", required=true)
    private Output<String> destinationId;

    /**
     * @return The data forwarding destination id.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
    }

    /**
     * True when the data forwarding rule is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True when the data forwarding rule is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specify the path prefix to a directory in the S3 bucket and how to format the file name.
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return Specify the path prefix to a directory in the S3 bucket and how to format the file name.
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * Format of the payload. Default format will be _csv_.
     * _text_ format should be used in conjunction with _raw_ payloadSchema and vice versa.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Format of the payload. Default format will be _csv_.
     * _text_ format should be used in conjunction with _raw_ payloadSchema and vice versa.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The _id_ of the Partition or Scheduled View the rule applies to.
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return The _id_ of the Partition or Scheduled View the rule applies to.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    /**
     * Schema for the payload. Default value of the payload schema is _allFields_ for scheduled view, and _builtInFields_ for partition.
     * _raw_ payloadSchema should be used in conjunction with _text_ format and vice versa.
     * 
     */
    @Import(name="payloadSchema")
    private @Nullable Output<String> payloadSchema;

    /**
     * @return Schema for the payload. Default value of the payload schema is _allFields_ for scheduled view, and _builtInFields_ for partition.
     * _raw_ payloadSchema should be used in conjunction with _text_ format and vice versa.
     * 
     */
    public Optional<Output<String>> payloadSchema() {
        return Optional.ofNullable(this.payloadSchema);
    }

    private DataForwardingRuleArgs() {}

    private DataForwardingRuleArgs(DataForwardingRuleArgs $) {
        this.destinationId = $.destinationId;
        this.enabled = $.enabled;
        this.fileFormat = $.fileFormat;
        this.format = $.format;
        this.indexId = $.indexId;
        this.payloadSchema = $.payloadSchema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataForwardingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataForwardingRuleArgs $;

        public Builder() {
            $ = new DataForwardingRuleArgs();
        }

        public Builder(DataForwardingRuleArgs defaults) {
            $ = new DataForwardingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationId The data forwarding destination id.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(Output<String> destinationId) {
            $.destinationId = destinationId;
            return this;
        }

        /**
         * @param destinationId The data forwarding destination id.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(String destinationId) {
            return destinationId(Output.of(destinationId));
        }

        /**
         * @param enabled True when the data forwarding rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True when the data forwarding rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fileFormat Specify the path prefix to a directory in the S3 bucket and how to format the file name.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat Specify the path prefix to a directory in the S3 bucket and how to format the file name.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param format Format of the payload. Default format will be _csv_.
         * _text_ format should be used in conjunction with _raw_ payloadSchema and vice versa.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format of the payload. Default format will be _csv_.
         * _text_ format should be used in conjunction with _raw_ payloadSchema and vice versa.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param indexId The _id_ of the Partition or Scheduled View the rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId The _id_ of the Partition or Scheduled View the rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        /**
         * @param payloadSchema Schema for the payload. Default value of the payload schema is _allFields_ for scheduled view, and _builtInFields_ for partition.
         * _raw_ payloadSchema should be used in conjunction with _text_ format and vice versa.
         * 
         * @return builder
         * 
         */
        public Builder payloadSchema(@Nullable Output<String> payloadSchema) {
            $.payloadSchema = payloadSchema;
            return this;
        }

        /**
         * @param payloadSchema Schema for the payload. Default value of the payload schema is _allFields_ for scheduled view, and _builtInFields_ for partition.
         * _raw_ payloadSchema should be used in conjunction with _text_ format and vice versa.
         * 
         * @return builder
         * 
         */
        public Builder payloadSchema(String payloadSchema) {
            return payloadSchema(Output.of(payloadSchema));
        }

        public DataForwardingRuleArgs build() {
            if ($.destinationId == null) {
                throw new MissingRequiredPropertyException("DataForwardingRuleArgs", "destinationId");
            }
            if ($.indexId == null) {
                throw new MissingRequiredPropertyException("DataForwardingRuleArgs", "indexId");
            }
            return $;
        }
    }

}