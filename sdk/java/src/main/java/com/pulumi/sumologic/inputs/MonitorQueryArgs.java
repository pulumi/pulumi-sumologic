// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MonitorQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorQueryArgs Empty = new MonitorQueryArgs();

    @Import(name="query", required=true)
    private Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    @Import(name="rowId", required=true)
    private Output<String> rowId;

    public Output<String> rowId() {
        return this.rowId;
    }

    private MonitorQueryArgs() {}

    private MonitorQueryArgs(MonitorQueryArgs $) {
        this.query = $.query;
        this.rowId = $.rowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorQueryArgs $;

        public Builder() {
            $ = new MonitorQueryArgs();
        }

        public Builder(MonitorQueryArgs defaults) {
            $ = new MonitorQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public Builder rowId(Output<String> rowId) {
            $.rowId = rowId;
            return this;
        }

        public Builder rowId(String rowId) {
            return rowId(Output.of(rowId));
        }

        public MonitorQueryArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("MonitorQueryArgs", "query");
            }
            if ($.rowId == null) {
                throw new MissingRequiredPropertyException("MonitorQueryArgs", "rowId");
            }
            return $;
        }
    }

}