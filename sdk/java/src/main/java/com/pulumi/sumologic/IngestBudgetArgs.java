// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IngestBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngestBudgetArgs Empty = new IngestBudgetArgs();

    /**
     * Action to take when ingest budget&#39;s capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Action to take when ingest budget&#39;s capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Capacity of the ingest budget, in bytes.
     * 
     */
    @Import(name="capacityBytes", required=true)
    private Output<Integer> capacityBytes;

    /**
     * @return Capacity of the ingest budget, in bytes.
     * 
     */
    public Output<Integer> capacityBytes() {
        return this.capacityBytes;
    }

    /**
     * Description of the ingest budget.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the ingest budget.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Custom field value that is used to assign Collectors to the ingest budget.
     * 
     */
    @Import(name="fieldValue", required=true)
    private Output<String> fieldValue;

    /**
     * @return Custom field value that is used to assign Collectors to the ingest budget.
     * 
     */
    public Output<String> fieldValue() {
        return this.fieldValue;
    }

    /**
     * Display name of the ingest budget. This must be unique across all of the ingest budgets
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Display name of the ingest budget. This must be unique across all of the ingest budgets
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
     * 
     */
    @Import(name="resetTime")
    private @Nullable Output<String> resetTime;

    /**
     * @return Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
     * 
     */
    public Optional<Output<String>> resetTime() {
        return Optional.ofNullable(this.resetTime);
    }

    /**
     * The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private IngestBudgetArgs() {}

    private IngestBudgetArgs(IngestBudgetArgs $) {
        this.action = $.action;
        this.capacityBytes = $.capacityBytes;
        this.description = $.description;
        this.fieldValue = $.fieldValue;
        this.name = $.name;
        this.resetTime = $.resetTime;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngestBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngestBudgetArgs $;

        public Builder() {
            $ = new IngestBudgetArgs();
        }

        public Builder(IngestBudgetArgs defaults) {
            $ = new IngestBudgetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to take when ingest budget&#39;s capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to take when ingest budget&#39;s capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param capacityBytes Capacity of the ingest budget, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder capacityBytes(Output<Integer> capacityBytes) {
            $.capacityBytes = capacityBytes;
            return this;
        }

        /**
         * @param capacityBytes Capacity of the ingest budget, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder capacityBytes(Integer capacityBytes) {
            return capacityBytes(Output.of(capacityBytes));
        }

        /**
         * @param description Description of the ingest budget.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the ingest budget.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fieldValue Custom field value that is used to assign Collectors to the ingest budget.
         * 
         * @return builder
         * 
         */
        public Builder fieldValue(Output<String> fieldValue) {
            $.fieldValue = fieldValue;
            return this;
        }

        /**
         * @param fieldValue Custom field value that is used to assign Collectors to the ingest budget.
         * 
         * @return builder
         * 
         */
        public Builder fieldValue(String fieldValue) {
            return fieldValue(Output.of(fieldValue));
        }

        /**
         * @param name Display name of the ingest budget. This must be unique across all of the ingest budgets
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Display name of the ingest budget. This must be unique across all of the ingest budgets
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resetTime Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
         * 
         * @return builder
         * 
         */
        public Builder resetTime(@Nullable Output<String> resetTime) {
            $.resetTime = resetTime;
            return this;
        }

        /**
         * @param resetTime Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
         * 
         * @return builder
         * 
         */
        public Builder resetTime(String resetTime) {
            return resetTime(Output.of(resetTime));
        }

        /**
         * @param timezone The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public IngestBudgetArgs build() {
            $.capacityBytes = Objects.requireNonNull($.capacityBytes, "expected parameter 'capacityBytes' to be non-null");
            $.fieldValue = Objects.requireNonNull($.fieldValue, "expected parameter 'fieldValue' to be non-null");
            return $;
        }
    }

}