// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHttpSourceResult {
    private String category;
    private @Nullable Integer collectorId;
    private String description;
    private Integer id;
    private Boolean multiline;
    private @Nullable String name;
    private String timezone;
    private String url;

    private GetHttpSourceResult() {}
    public String category() {
        return this.category;
    }
    public Optional<Integer> collectorId() {
        return Optional.ofNullable(this.collectorId);
    }
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    public Boolean multiline() {
        return this.multiline;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String timezone() {
        return this.timezone;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpSourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private @Nullable Integer collectorId;
        private String description;
        private Integer id;
        private Boolean multiline;
        private @Nullable String name;
        private String timezone;
        private String url;
        public Builder() {}
        public Builder(GetHttpSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.collectorId = defaults.collectorId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.multiline = defaults.multiline;
    	      this.name = defaults.name;
    	      this.timezone = defaults.timezone;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder collectorId(@Nullable Integer collectorId) {

            this.collectorId = collectorId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder multiline(Boolean multiline) {
            if (multiline == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "multiline");
            }
            this.multiline = multiline;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(String timezone) {
            if (timezone == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "timezone");
            }
            this.timezone = timezone;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetHttpSourceResult", "url");
            }
            this.url = url;
            return this;
        }
        public GetHttpSourceResult build() {
            final var _resultValue = new GetHttpSourceResult();
            _resultValue.category = category;
            _resultValue.collectorId = collectorId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.multiline = multiline;
            _resultValue.name = name;
            _resultValue.timezone = timezone;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}