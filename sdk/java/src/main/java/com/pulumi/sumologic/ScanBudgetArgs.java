// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.sumologic.inputs.ScanBudgetScopeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScanBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScanBudgetArgs Empty = new ScanBudgetArgs();

    /**
     * Action to be taken if the budget is breached. Supported values are: `StopForeGroundScan` and `Warn`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action to be taken if the budget is breached. Supported values are: `StopForeGroundScan` and `Warn`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Grouping of the budget. Supported values are: `PerEntity` and `Sum`.
     * 
     */
    @Import(name="applicableOn", required=true)
    private Output<String> applicableOn;

    /**
     * @return Grouping of the budget. Supported values are: `PerEntity` and `Sum`.
     * 
     */
    public Output<String> applicableOn() {
        return this.applicableOn;
    }

    /**
     * Type of the budget. Supported values are: `ScanBudget`.
     * 
     */
    @Import(name="budgetType", required=true)
    private Output<String> budgetType;

    /**
     * @return Type of the budget. Supported values are: `ScanBudget`.
     * 
     */
    public Output<String> budgetType() {
        return this.budgetType;
    }

    /**
     * Capacity of the scan budget. Only whole numbers are supported.
     * 
     */
    @Import(name="capacity", required=true)
    private Output<Integer> capacity;

    /**
     * @return Capacity of the scan budget. Only whole numbers are supported.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }

    /**
     * Grouping Entity of the budget. Supported values are: `User`.
     * 
     */
    @Import(name="groupBy", required=true)
    private Output<String> groupBy;

    /**
     * @return Grouping Entity of the budget. Supported values are: `User`.
     * 
     */
    public Output<String> groupBy() {
        return this.groupBy;
    }

    /**
     * Display name of the scan budget. This must be unique across all the scan budgets.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Display name of the scan budget. This must be unique across all the scan budgets.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Scope of the budget.
     * 
     */
    @Import(name="scope", required=true)
    private Output<ScanBudgetScopeArgs> scope;

    /**
     * @return Scope of the budget.
     * 
     */
    public Output<ScanBudgetScopeArgs> scope() {
        return this.scope;
    }

    /**
     * Signifies the state of the budget. Supported values are: `active` and `inactive`.
     * 
     * The following attributes are exported:
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Signifies the state of the budget. Supported values are: `active` and `inactive`.
     * 
     * The following attributes are exported:
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * Unit of the capacity. Supported values are: `MB`, `GB` and `TB`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return Unit of the capacity. Supported values are: `MB`, `GB` and `TB`.
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * Window of the budget. Supported values are: `Query`, `Daily`, `Weekly` and `Monthly`.
     * 
     */
    @Import(name="window", required=true)
    private Output<String> window;

    /**
     * @return Window of the budget. Supported values are: `Query`, `Daily`, `Weekly` and `Monthly`.
     * 
     */
    public Output<String> window() {
        return this.window;
    }

    private ScanBudgetArgs() {}

    private ScanBudgetArgs(ScanBudgetArgs $) {
        this.action = $.action;
        this.applicableOn = $.applicableOn;
        this.budgetType = $.budgetType;
        this.capacity = $.capacity;
        this.groupBy = $.groupBy;
        this.name = $.name;
        this.scope = $.scope;
        this.status = $.status;
        this.unit = $.unit;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScanBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScanBudgetArgs $;

        public Builder() {
            $ = new ScanBudgetArgs();
        }

        public Builder(ScanBudgetArgs defaults) {
            $ = new ScanBudgetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to be taken if the budget is breached. Supported values are: `StopForeGroundScan` and `Warn`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to be taken if the budget is breached. Supported values are: `StopForeGroundScan` and `Warn`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param applicableOn Grouping of the budget. Supported values are: `PerEntity` and `Sum`.
         * 
         * @return builder
         * 
         */
        public Builder applicableOn(Output<String> applicableOn) {
            $.applicableOn = applicableOn;
            return this;
        }

        /**
         * @param applicableOn Grouping of the budget. Supported values are: `PerEntity` and `Sum`.
         * 
         * @return builder
         * 
         */
        public Builder applicableOn(String applicableOn) {
            return applicableOn(Output.of(applicableOn));
        }

        /**
         * @param budgetType Type of the budget. Supported values are: `ScanBudget`.
         * 
         * @return builder
         * 
         */
        public Builder budgetType(Output<String> budgetType) {
            $.budgetType = budgetType;
            return this;
        }

        /**
         * @param budgetType Type of the budget. Supported values are: `ScanBudget`.
         * 
         * @return builder
         * 
         */
        public Builder budgetType(String budgetType) {
            return budgetType(Output.of(budgetType));
        }

        /**
         * @param capacity Capacity of the scan budget. Only whole numbers are supported.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Capacity of the scan budget. Only whole numbers are supported.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param groupBy Grouping Entity of the budget. Supported values are: `User`.
         * 
         * @return builder
         * 
         */
        public Builder groupBy(Output<String> groupBy) {
            $.groupBy = groupBy;
            return this;
        }

        /**
         * @param groupBy Grouping Entity of the budget. Supported values are: `User`.
         * 
         * @return builder
         * 
         */
        public Builder groupBy(String groupBy) {
            return groupBy(Output.of(groupBy));
        }

        /**
         * @param name Display name of the scan budget. This must be unique across all the scan budgets.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Display name of the scan budget. This must be unique across all the scan budgets.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope Scope of the budget.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<ScanBudgetScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope of the budget.
         * 
         * @return builder
         * 
         */
        public Builder scope(ScanBudgetScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param status Signifies the state of the budget. Supported values are: `active` and `inactive`.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Signifies the state of the budget. Supported values are: `active` and `inactive`.
         * 
         * The following attributes are exported:
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param unit Unit of the capacity. Supported values are: `MB`, `GB` and `TB`.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit Unit of the capacity. Supported values are: `MB`, `GB` and `TB`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param window Window of the budget. Supported values are: `Query`, `Daily`, `Weekly` and `Monthly`.
         * 
         * @return builder
         * 
         */
        public Builder window(Output<String> window) {
            $.window = window;
            return this;
        }

        /**
         * @param window Window of the budget. Supported values are: `Query`, `Daily`, `Weekly` and `Monthly`.
         * 
         * @return builder
         * 
         */
        public Builder window(String window) {
            return window(Output.of(window));
        }

        public ScanBudgetArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "action");
            }
            if ($.applicableOn == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "applicableOn");
            }
            if ($.budgetType == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "budgetType");
            }
            if ($.capacity == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "capacity");
            }
            if ($.groupBy == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "groupBy");
            }
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "scope");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "status");
            }
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "unit");
            }
            if ($.window == null) {
                throw new MissingRequiredPropertyException("ScanBudgetArgs", "window");
            }
            return $;
        }
    }

}
