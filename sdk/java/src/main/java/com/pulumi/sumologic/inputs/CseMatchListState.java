// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.CseMatchListItemArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CseMatchListState extends com.pulumi.resources.ResourceArgs {

    public static final CseMatchListState Empty = new CseMatchListState();

    @Import(name="created")
    private @Nullable Output<String> created;

    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The default time to live for match list items added through the UI. Specified in seconds.
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    /**
     * @return The default time to live for match list items added through the UI. Specified in seconds.
     * 
     */
    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * Match list description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Match list description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="items")
    private @Nullable Output<List<CseMatchListItemArgs>> items;

    public Optional<Output<List<CseMatchListItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    @Import(name="lastUpdatedBy")
    private @Nullable Output<String> lastUpdatedBy;

    public Optional<Output<String>> lastUpdatedBy() {
        return Optional.ofNullable(this.lastUpdatedBy);
    }

    /**
     * Match list name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Match list name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Target column. (possible values: Hostname, FileHash, Url, SrcIp, DstIp, Domain, Username, Ip, Asn, Isp, Org, SrcAsn, SrcIsp, SrcOrg, DstAsn, DstIsp, DstOrg or any custom column.)
     * 
     */
    @Import(name="targetColumn")
    private @Nullable Output<String> targetColumn;

    /**
     * @return Target column. (possible values: Hostname, FileHash, Url, SrcIp, DstIp, Domain, Username, Ip, Asn, Isp, Org, SrcAsn, SrcIsp, SrcOrg, DstAsn, DstIsp, DstOrg or any custom column.)
     * 
     */
    public Optional<Output<String>> targetColumn() {
        return Optional.ofNullable(this.targetColumn);
    }

    private CseMatchListState() {}

    private CseMatchListState(CseMatchListState $) {
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.defaultTtl = $.defaultTtl;
        this.description = $.description;
        this.items = $.items;
        this.lastUpdated = $.lastUpdated;
        this.lastUpdatedBy = $.lastUpdatedBy;
        this.name = $.name;
        this.targetColumn = $.targetColumn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseMatchListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseMatchListState $;

        public Builder() {
            $ = new CseMatchListState();
        }

        public Builder(CseMatchListState defaults) {
            $ = new CseMatchListState(Objects.requireNonNull(defaults));
        }

        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        public Builder created(String created) {
            return created(Output.of(created));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param defaultTtl The default time to live for match list items added through the UI. Specified in seconds.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl The default time to live for match list items added through the UI. Specified in seconds.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param description Match list description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
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

        public Builder items(@Nullable Output<List<CseMatchListItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<CseMatchListItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(CseMatchListItemArgs... items) {
            return items(List.of(items));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        public Builder lastUpdatedBy(@Nullable Output<String> lastUpdatedBy) {
            $.lastUpdatedBy = lastUpdatedBy;
            return this;
        }

        public Builder lastUpdatedBy(String lastUpdatedBy) {
            return lastUpdatedBy(Output.of(lastUpdatedBy));
        }

        /**
         * @param name Match list name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Match list name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param targetColumn Target column. (possible values: Hostname, FileHash, Url, SrcIp, DstIp, Domain, Username, Ip, Asn, Isp, Org, SrcAsn, SrcIsp, SrcOrg, DstAsn, DstIsp, DstOrg or any custom column.)
         * 
         * @return builder
         * 
         */
        public Builder targetColumn(@Nullable Output<String> targetColumn) {
            $.targetColumn = targetColumn;
            return this;
        }

        /**
         * @param targetColumn Target column. (possible values: Hostname, FileHash, Url, SrcIp, DstIp, Domain, Username, Ip, Asn, Isp, Org, SrcAsn, SrcIsp, SrcOrg, DstAsn, DstIsp, DstOrg or any custom column.)
         * 
         * @return builder
         * 
         */
        public Builder targetColumn(String targetColumn) {
            return targetColumn(Output.of(targetColumn));
        }

        public CseMatchListState build() {
            return $;
        }
    }

}
