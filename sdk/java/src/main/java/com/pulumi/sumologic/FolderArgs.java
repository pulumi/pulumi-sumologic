// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderArgs Empty = new FolderArgs();

    /**
     * The description of the folder.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the folder.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The name of the folder. This is required, and has to be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the folder. This is required, and has to be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the folder in which you want to create the new folder.
     * 
     */
    @Import(name="parentId", required=true)
    private Output<String> parentId;

    /**
     * @return The ID of the folder in which you want to create the new folder.
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
    }

    private FolderArgs() {}

    private FolderArgs(FolderArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.parentId = $.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderArgs $;

        public Builder() {
            $ = new FolderArgs();
        }

        public Builder(FolderArgs defaults) {
            $ = new FolderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the folder.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the folder.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the folder. This is required, and has to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the folder. This is required, and has to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentId The ID of the folder in which you want to create the new folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The ID of the folder in which you want to create the new folder.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        public FolderArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.parentId = Objects.requireNonNull($.parentId, "expected parameter 'parentId' to be non-null");
            return $;
        }
    }

}