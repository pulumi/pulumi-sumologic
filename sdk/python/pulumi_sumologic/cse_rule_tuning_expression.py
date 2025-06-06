# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['CseRuleTuningExpressionArgs', 'CseRuleTuningExpression']

@pulumi.input_type
class CseRuleTuningExpressionArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[builtins.str],
                 enabled: pulumi.Input[builtins.bool],
                 exclude: pulumi.Input[builtins.bool],
                 expression: pulumi.Input[builtins.str],
                 is_global: pulumi.Input[builtins.bool],
                 rule_ids: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a CseRuleTuningExpression resource.
        :param pulumi.Input[builtins.str] description: The description of the rule tuning expression.
        :param pulumi.Input[builtins.bool] enabled: Enabled flag.
        :param pulumi.Input[builtins.bool] exclude: Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        :param pulumi.Input[builtins.str] expression: Expression to match.
        :param pulumi.Input[builtins.bool] is_global: Set to true if this tuning expression should be applied to all rules.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] rule_ids: List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
               
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] name: The name of the rule tuning expression.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "exclude", exclude)
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "is_global", is_global)
        pulumi.set(__self__, "rule_ids", rule_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[builtins.str]:
        """
        The description of the rule tuning expression.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[builtins.bool]:
        """
        Enabled flag.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def exclude(self) -> pulumi.Input[builtins.bool]:
        """
        Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        """
        return pulumi.get(self, "exclude")

    @exclude.setter
    def exclude(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "exclude", value)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[builtins.str]:
        """
        Expression to match.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter(name="isGlobal")
    def is_global(self) -> pulumi.Input[builtins.bool]:
        """
        Set to true if this tuning expression should be applied to all rules.
        """
        return pulumi.get(self, "is_global")

    @is_global.setter
    def is_global(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "is_global", value)

    @property
    @pulumi.getter(name="ruleIds")
    def rule_ids(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        """
        List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)


        The following attributes are exported:
        """
        return pulumi.get(self, "rule_ids")

    @rule_ids.setter
    def rule_ids(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "rule_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the rule tuning expression.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CseRuleTuningExpressionState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 exclude: Optional[pulumi.Input[builtins.bool]] = None,
                 expression: Optional[pulumi.Input[builtins.str]] = None,
                 is_global: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering CseRuleTuningExpression resources.
        :param pulumi.Input[builtins.str] description: The description of the rule tuning expression.
        :param pulumi.Input[builtins.bool] enabled: Enabled flag.
        :param pulumi.Input[builtins.bool] exclude: Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        :param pulumi.Input[builtins.str] expression: Expression to match.
        :param pulumi.Input[builtins.bool] is_global: Set to true if this tuning expression should be applied to all rules.
        :param pulumi.Input[builtins.str] name: The name of the rule tuning expression.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] rule_ids: List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
               
               
               The following attributes are exported:
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if exclude is not None:
            pulumi.set(__self__, "exclude", exclude)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if is_global is not None:
            pulumi.set(__self__, "is_global", is_global)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rule_ids is not None:
            pulumi.set(__self__, "rule_ids", rule_ids)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the rule tuning expression.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Enabled flag.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def exclude(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        """
        return pulumi.get(self, "exclude")

    @exclude.setter
    def exclude(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "exclude", value)

    @property
    @pulumi.getter
    def expression(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Expression to match.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter(name="isGlobal")
    def is_global(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Set to true if this tuning expression should be applied to all rules.
        """
        return pulumi.get(self, "is_global")

    @is_global.setter
    def is_global(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "is_global", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the rule tuning expression.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ruleIds")
    def rule_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)


        The following attributes are exported:
        """
        return pulumi.get(self, "rule_ids")

    @rule_ids.setter
    def rule_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "rule_ids", value)


@pulumi.type_token("sumologic:index/cseRuleTuningExpression:CseRuleTuningExpression")
class CseRuleTuningExpression(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 exclude: Optional[pulumi.Input[builtins.bool]] = None,
                 expression: Optional[pulumi.Input[builtins.str]] = None,
                 is_global: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a CSE Rule Tuning Expression.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        rule_tuning_expression = sumologic.CseRuleTuningExpression("rule_tuning_expression",
            name="New Rule Tuning Name",
            description="New Rule Tuning Description",
            expression="accountId = 1234",
            enabled=True,
            exclude=True,
            is_global=False,
            rule_ids=["LEGACY-S00084"])
        ```

        ## Import

        Rule tuning expression can be imported using the field id, e.g.:

        hcl

        ```sh
        $ pulumi import sumologic:index/cseRuleTuningExpression:CseRuleTuningExpression rule_tuning_expression id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the rule tuning expression.
        :param pulumi.Input[builtins.bool] enabled: Enabled flag.
        :param pulumi.Input[builtins.bool] exclude: Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        :param pulumi.Input[builtins.str] expression: Expression to match.
        :param pulumi.Input[builtins.bool] is_global: Set to true if this tuning expression should be applied to all rules.
        :param pulumi.Input[builtins.str] name: The name of the rule tuning expression.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] rule_ids: List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
               
               
               The following attributes are exported:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CseRuleTuningExpressionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CSE Rule Tuning Expression.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        rule_tuning_expression = sumologic.CseRuleTuningExpression("rule_tuning_expression",
            name="New Rule Tuning Name",
            description="New Rule Tuning Description",
            expression="accountId = 1234",
            enabled=True,
            exclude=True,
            is_global=False,
            rule_ids=["LEGACY-S00084"])
        ```

        ## Import

        Rule tuning expression can be imported using the field id, e.g.:

        hcl

        ```sh
        $ pulumi import sumologic:index/cseRuleTuningExpression:CseRuleTuningExpression rule_tuning_expression id
        ```

        :param str resource_name: The name of the resource.
        :param CseRuleTuningExpressionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CseRuleTuningExpressionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 exclude: Optional[pulumi.Input[builtins.bool]] = None,
                 expression: Optional[pulumi.Input[builtins.str]] = None,
                 is_global: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CseRuleTuningExpressionArgs.__new__(CseRuleTuningExpressionArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if exclude is None and not opts.urn:
                raise TypeError("Missing required property 'exclude'")
            __props__.__dict__["exclude"] = exclude
            if expression is None and not opts.urn:
                raise TypeError("Missing required property 'expression'")
            __props__.__dict__["expression"] = expression
            if is_global is None and not opts.urn:
                raise TypeError("Missing required property 'is_global'")
            __props__.__dict__["is_global"] = is_global
            __props__.__dict__["name"] = name
            if rule_ids is None and not opts.urn:
                raise TypeError("Missing required property 'rule_ids'")
            __props__.__dict__["rule_ids"] = rule_ids
        super(CseRuleTuningExpression, __self__).__init__(
            'sumologic:index/cseRuleTuningExpression:CseRuleTuningExpression',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            exclude: Optional[pulumi.Input[builtins.bool]] = None,
            expression: Optional[pulumi.Input[builtins.str]] = None,
            is_global: Optional[pulumi.Input[builtins.bool]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None) -> 'CseRuleTuningExpression':
        """
        Get an existing CseRuleTuningExpression resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the rule tuning expression.
        :param pulumi.Input[builtins.bool] enabled: Enabled flag.
        :param pulumi.Input[builtins.bool] exclude: Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        :param pulumi.Input[builtins.str] expression: Expression to match.
        :param pulumi.Input[builtins.bool] is_global: Set to true if this tuning expression should be applied to all rules.
        :param pulumi.Input[builtins.str] name: The name of the rule tuning expression.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] rule_ids: List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)
               
               
               The following attributes are exported:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CseRuleTuningExpressionState.__new__(_CseRuleTuningExpressionState)

        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["exclude"] = exclude
        __props__.__dict__["expression"] = expression
        __props__.__dict__["is_global"] = is_global
        __props__.__dict__["name"] = name
        __props__.__dict__["rule_ids"] = rule_ids
        return CseRuleTuningExpression(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[builtins.str]:
        """
        The description of the rule tuning expression.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[builtins.bool]:
        """
        Enabled flag.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def exclude(self) -> pulumi.Output[builtins.bool]:
        """
        Set to true to exclude records that match the expression. If set to false, only records that do match the expression will be included.
        """
        return pulumi.get(self, "exclude")

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Output[builtins.str]:
        """
        Expression to match.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter(name="isGlobal")
    def is_global(self) -> pulumi.Output[builtins.bool]:
        """
        Set to true if this tuning expression should be applied to all rules.
        """
        return pulumi.get(self, "is_global")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the rule tuning expression.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ruleIds")
    def rule_ids(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        List of rule IDs, for the tuning expression to be applied. ( Empty if is_global set to true)


        The following attributes are exported:
        """
        return pulumi.get(self, "rule_ids")

