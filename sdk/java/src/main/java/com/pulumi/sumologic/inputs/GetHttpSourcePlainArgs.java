// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpSourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpSourcePlainArgs Empty = new GetHttpSourcePlainArgs();

    @Import(name="collectorId")
    private @Nullable Integer collectorId;

    public Optional<Integer> collectorId() {
        return Optional.ofNullable(this.collectorId);
    }

    @Import(name="id")
    private @Nullable Integer id;

    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetHttpSourcePlainArgs() {}

    private GetHttpSourcePlainArgs(GetHttpSourcePlainArgs $) {
        this.collectorId = $.collectorId;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpSourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpSourcePlainArgs $;

        public Builder() {
            $ = new GetHttpSourcePlainArgs();
        }

        public Builder(GetHttpSourcePlainArgs defaults) {
            $ = new GetHttpSourcePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder collectorId(@Nullable Integer collectorId) {
            $.collectorId = collectorId;
            return this;
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetHttpSourcePlainArgs build() {
            return $;
        }
    }

}