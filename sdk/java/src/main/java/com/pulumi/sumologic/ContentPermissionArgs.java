// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.ContentPermissionPermissionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentPermissionArgs Empty = new ContentPermissionArgs();

    /**
     * The identifier of the content item for which you want to update
     * permissions.
     * 
     */
    @Import(name="contentId", required=true)
    private Output<String> contentId;

    /**
     * @return The identifier of the content item for which you want to update
     * permissions.
     * 
     */
    public Output<String> contentId() {
        return this.contentId;
    }

    /**
     * The notification message to send to the users.
     * 
     */
    @Import(name="notificationMessage")
    private @Nullable Output<String> notificationMessage;

    /**
     * @return The notification message to send to the users.
     * 
     */
    public Optional<Output<String>> notificationMessage() {
        return Optional.ofNullable(this.notificationMessage);
    }

    /**
     * Boolean value. Set it to &#34;true&#34; to notify the recipients by email.
     * 
     */
    @Import(name="notifyRecipient", required=true)
    private Output<Boolean> notifyRecipient;

    /**
     * @return Boolean value. Set it to &#34;true&#34; to notify the recipients by email.
     * 
     */
    public Output<Boolean> notifyRecipient() {
        return this.notifyRecipient;
    }

    /**
     * Permission block defining permission on the content. See
     * permission schema for details.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<ContentPermissionPermissionArgs>> permissions;

    /**
     * @return Permission block defining permission on the content. See
     * permission schema for details.
     * 
     */
    public Output<List<ContentPermissionPermissionArgs>> permissions() {
        return this.permissions;
    }

    private ContentPermissionArgs() {}

    private ContentPermissionArgs(ContentPermissionArgs $) {
        this.contentId = $.contentId;
        this.notificationMessage = $.notificationMessage;
        this.notifyRecipient = $.notifyRecipient;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentPermissionArgs $;

        public Builder() {
            $ = new ContentPermissionArgs();
        }

        public Builder(ContentPermissionArgs defaults) {
            $ = new ContentPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentId The identifier of the content item for which you want to update
         * permissions.
         * 
         * @return builder
         * 
         */
        public Builder contentId(Output<String> contentId) {
            $.contentId = contentId;
            return this;
        }

        /**
         * @param contentId The identifier of the content item for which you want to update
         * permissions.
         * 
         * @return builder
         * 
         */
        public Builder contentId(String contentId) {
            return contentId(Output.of(contentId));
        }

        /**
         * @param notificationMessage The notification message to send to the users.
         * 
         * @return builder
         * 
         */
        public Builder notificationMessage(@Nullable Output<String> notificationMessage) {
            $.notificationMessage = notificationMessage;
            return this;
        }

        /**
         * @param notificationMessage The notification message to send to the users.
         * 
         * @return builder
         * 
         */
        public Builder notificationMessage(String notificationMessage) {
            return notificationMessage(Output.of(notificationMessage));
        }

        /**
         * @param notifyRecipient Boolean value. Set it to &#34;true&#34; to notify the recipients by email.
         * 
         * @return builder
         * 
         */
        public Builder notifyRecipient(Output<Boolean> notifyRecipient) {
            $.notifyRecipient = notifyRecipient;
            return this;
        }

        /**
         * @param notifyRecipient Boolean value. Set it to &#34;true&#34; to notify the recipients by email.
         * 
         * @return builder
         * 
         */
        public Builder notifyRecipient(Boolean notifyRecipient) {
            return notifyRecipient(Output.of(notifyRecipient));
        }

        /**
         * @param permissions Permission block defining permission on the content. See
         * permission schema for details.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<ContentPermissionPermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Permission block defining permission on the content. See
         * permission schema for details.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<ContentPermissionPermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions Permission block defining permission on the content. See
         * permission schema for details.
         * 
         * @return builder
         * 
         */
        public Builder permissions(ContentPermissionPermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        public ContentPermissionArgs build() {
            $.contentId = Objects.requireNonNull($.contentId, "expected parameter 'contentId' to be non-null");
            $.notifyRecipient = Objects.requireNonNull($.notifyRecipient, "expected parameter 'notifyRecipient' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}