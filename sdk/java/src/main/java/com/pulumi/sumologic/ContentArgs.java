// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentArgs Empty = new ContentArgs();

    /**
     * JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
     * 
     */
    @Import(name="config", required=true)
    private Output<String> config;

    /**
     * @return JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
     * 
     */
    public Output<String> config() {
        return this.config;
    }

    /**
     * The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
     * 
     */
    @Import(name="parentId", required=true)
    private Output<String> parentId;

    /**
     * @return The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
    }

    private ContentArgs() {}

    private ContentArgs(ContentArgs $) {
        this.config = $.config;
        this.parentId = $.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentArgs $;

        public Builder() {
            $ = new ContentArgs();
        }

        public Builder(ContentArgs defaults) {
            $ = new ContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
         * 
         * @return builder
         * 
         */
        public Builder config(Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config JSON block for the content to import. NOTE: Updating the name will create a new object and leave a untracked content item (delete the existing content item and create a new content item if you want to update the name).
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param parentId The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
         * 
         * @return builder
         * 
         */
        public Builder parentId(Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The identifier of the folder to import into. Identifiers from the Library in the Sumo user interface are provided in decimal format which is incompatible with this provider. The identifier needs to be in hexadecimal format.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        public ContentArgs build() {
            if ($.config == null) {
                throw new MissingRequiredPropertyException("ContentArgs", "config");
            }
            if ($.parentId == null) {
                throw new MissingRequiredPropertyException("ContentArgs", "parentId");
            }
            return $;
        }
    }

}