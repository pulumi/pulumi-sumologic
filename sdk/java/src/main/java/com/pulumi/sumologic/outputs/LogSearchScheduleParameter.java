// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogSearchScheduleParameter {
    /**
     * @return Name of the search.
     * 
     */
    private String name;
    /**
     * @return The default value for the parameter. It should be compatible with the type set in the `data_type` field.
     * 
     */
    private String value;

    private LogSearchScheduleParameter() {}
    /**
     * @return Name of the search.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The default value for the parameter. It should be compatible with the type set in the `data_type` field.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSearchScheduleParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(LogSearchScheduleParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LogSearchScheduleParameter build() {
            final var o = new LogSearchScheduleParameter();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}