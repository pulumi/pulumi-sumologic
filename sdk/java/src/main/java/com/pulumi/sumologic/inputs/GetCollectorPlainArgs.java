// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCollectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCollectorPlainArgs Empty = new GetCollectorPlainArgs();

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

    private GetCollectorPlainArgs() {}

    private GetCollectorPlainArgs(GetCollectorPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCollectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCollectorPlainArgs $;

        public Builder() {
            $ = new GetCollectorPlainArgs();
        }

        public Builder(GetCollectorPlainArgs defaults) {
            $ = new GetCollectorPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetCollectorPlainArgs build() {
            return $;
        }
    }

}
