// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    private String email;
    private String firstName;
    private String id;
    private Boolean isActive;
    private String lastName;
    private List<String> roleIds;

    private GetUserResult() {}
    public String email() {
        return this.email;
    }
    public String firstName() {
        return this.firstName;
    }
    public String id() {
        return this.id;
    }
    public Boolean isActive() {
        return this.isActive;
    }
    public String lastName() {
        return this.lastName;
    }
    public List<String> roleIds() {
        return this.roleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String firstName;
        private String id;
        private Boolean isActive;
        private String lastName;
        private List<String> roleIds;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.lastName = defaults.lastName;
    	      this.roleIds = defaults.roleIds;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            if (firstName == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "firstName");
            }
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(Boolean isActive) {
            if (isActive == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "isActive");
            }
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            if (lastName == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "lastName");
            }
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder roleIds(List<String> roleIds) {
            if (roleIds == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "roleIds");
            }
            this.roleIds = roleIds;
            return this;
        }
        public Builder roleIds(String... roleIds) {
            return roleIds(List.of(roleIds));
        }
        public GetUserResult build() {
            final var _resultValue = new GetUserResult();
            _resultValue.email = email;
            _resultValue.firstName = firstName;
            _resultValue.id = id;
            _resultValue.isActive = isActive;
            _resultValue.lastName = lastName;
            _resultValue.roleIds = roleIds;
            return _resultValue;
        }
    }
}