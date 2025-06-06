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
from . import outputs
from ._inputs import *

__all__ = ['SourceTemplateArgs', 'SourceTemplate']

@pulumi.input_type
class SourceTemplateArgs:
    def __init__(__self__, *,
                 input_json: pulumi.Input[builtins.str],
                 schema_ref: pulumi.Input['SourceTemplateSchemaRefArgs'],
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]] = None):
        """
        The set of arguments for constructing a SourceTemplate resource.
        :param pulumi.Input[builtins.str] input_json: inputJson of source template
        :param pulumi.Input['SourceTemplateSchemaRefArgs'] schema_ref: schema reference for source template.
        :param pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]] selectors: Agent selector conditions
        """
        pulumi.set(__self__, "input_json", input_json)
        pulumi.set(__self__, "schema_ref", schema_ref)
        if selectors is not None:
            pulumi.set(__self__, "selectors", selectors)

    @property
    @pulumi.getter(name="inputJson")
    def input_json(self) -> pulumi.Input[builtins.str]:
        """
        inputJson of source template
        """
        return pulumi.get(self, "input_json")

    @input_json.setter
    def input_json(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "input_json", value)

    @property
    @pulumi.getter(name="schemaRef")
    def schema_ref(self) -> pulumi.Input['SourceTemplateSchemaRefArgs']:
        """
        schema reference for source template.
        """
        return pulumi.get(self, "schema_ref")

    @schema_ref.setter
    def schema_ref(self, value: pulumi.Input['SourceTemplateSchemaRefArgs']):
        pulumi.set(self, "schema_ref", value)

    @property
    @pulumi.getter
    def selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]]:
        """
        Agent selector conditions
        """
        return pulumi.get(self, "selectors")

    @selectors.setter
    def selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]]):
        pulumi.set(self, "selectors", value)


@pulumi.input_type
class _SourceTemplateState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[builtins.str]] = None,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 created_by: Optional[pulumi.Input[builtins.str]] = None,
                 input_json: Optional[pulumi.Input[builtins.str]] = None,
                 modified_at: Optional[pulumi.Input[builtins.str]] = None,
                 modified_by: Optional[pulumi.Input[builtins.str]] = None,
                 schema_ref: Optional[pulumi.Input['SourceTemplateSchemaRefArgs']] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]] = None,
                 total_collector_linked: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering SourceTemplate resources.
        :param pulumi.Input[builtins.str] input_json: inputJson of source template
        :param pulumi.Input['SourceTemplateSchemaRefArgs'] schema_ref: schema reference for source template.
        :param pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]] selectors: Agent selector conditions
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if input_json is not None:
            pulumi.set(__self__, "input_json", input_json)
        if modified_at is not None:
            pulumi.set(__self__, "modified_at", modified_at)
        if modified_by is not None:
            pulumi.set(__self__, "modified_by", modified_by)
        if schema_ref is not None:
            pulumi.set(__self__, "schema_ref", schema_ref)
        if selectors is not None:
            pulumi.set(__self__, "selectors", selectors)
        if total_collector_linked is not None:
            pulumi.set(__self__, "total_collector_linked", total_collector_linked)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter(name="inputJson")
    def input_json(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        inputJson of source template
        """
        return pulumi.get(self, "input_json")

    @input_json.setter
    def input_json(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "input_json", value)

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "modified_at")

    @modified_at.setter
    def modified_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "modified_at", value)

    @property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "modified_by")

    @modified_by.setter
    def modified_by(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "modified_by", value)

    @property
    @pulumi.getter(name="schemaRef")
    def schema_ref(self) -> Optional[pulumi.Input['SourceTemplateSchemaRefArgs']]:
        """
        schema reference for source template.
        """
        return pulumi.get(self, "schema_ref")

    @schema_ref.setter
    def schema_ref(self, value: Optional[pulumi.Input['SourceTemplateSchemaRefArgs']]):
        pulumi.set(self, "schema_ref", value)

    @property
    @pulumi.getter
    def selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]]:
        """
        Agent selector conditions
        """
        return pulumi.get(self, "selectors")

    @selectors.setter
    def selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SourceTemplateSelectorArgs']]]]):
        pulumi.set(self, "selectors", value)

    @property
    @pulumi.getter(name="totalCollectorLinked")
    def total_collector_linked(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "total_collector_linked")

    @total_collector_linked.setter
    def total_collector_linked(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "total_collector_linked", value)


@pulumi.type_token("sumologic:index/sourceTemplate:SourceTemplate")
class SourceTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 input_json: Optional[pulumi.Input[builtins.str]] = None,
                 schema_ref: Optional[pulumi.Input[Union['SourceTemplateSchemaRefArgs', 'SourceTemplateSchemaRefArgsDict']]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SourceTemplateSelectorArgs', 'SourceTemplateSelectorArgsDict']]]]] = None,
                 __props__=None):
        """
        Create a SourceTemplate resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] input_json: inputJson of source template
        :param pulumi.Input[Union['SourceTemplateSchemaRefArgs', 'SourceTemplateSchemaRefArgsDict']] schema_ref: schema reference for source template.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SourceTemplateSelectorArgs', 'SourceTemplateSelectorArgsDict']]]] selectors: Agent selector conditions
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SourceTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SourceTemplate resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SourceTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SourceTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 input_json: Optional[pulumi.Input[builtins.str]] = None,
                 schema_ref: Optional[pulumi.Input[Union['SourceTemplateSchemaRefArgs', 'SourceTemplateSchemaRefArgsDict']]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SourceTemplateSelectorArgs', 'SourceTemplateSelectorArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SourceTemplateArgs.__new__(SourceTemplateArgs)

            if input_json is None and not opts.urn:
                raise TypeError("Missing required property 'input_json'")
            __props__.__dict__["input_json"] = input_json
            if schema_ref is None and not opts.urn:
                raise TypeError("Missing required property 'schema_ref'")
            __props__.__dict__["schema_ref"] = schema_ref
            __props__.__dict__["selectors"] = selectors
            __props__.__dict__["config"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["modified_at"] = None
            __props__.__dict__["modified_by"] = None
            __props__.__dict__["total_collector_linked"] = None
        super(SourceTemplate, __self__).__init__(
            'sumologic:index/sourceTemplate:SourceTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[builtins.str]] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            created_by: Optional[pulumi.Input[builtins.str]] = None,
            input_json: Optional[pulumi.Input[builtins.str]] = None,
            modified_at: Optional[pulumi.Input[builtins.str]] = None,
            modified_by: Optional[pulumi.Input[builtins.str]] = None,
            schema_ref: Optional[pulumi.Input[Union['SourceTemplateSchemaRefArgs', 'SourceTemplateSchemaRefArgsDict']]] = None,
            selectors: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SourceTemplateSelectorArgs', 'SourceTemplateSelectorArgsDict']]]]] = None,
            total_collector_linked: Optional[pulumi.Input[builtins.int]] = None) -> 'SourceTemplate':
        """
        Get an existing SourceTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] input_json: inputJson of source template
        :param pulumi.Input[Union['SourceTemplateSchemaRefArgs', 'SourceTemplateSchemaRefArgsDict']] schema_ref: schema reference for source template.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SourceTemplateSelectorArgs', 'SourceTemplateSelectorArgsDict']]]] selectors: Agent selector conditions
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SourceTemplateState.__new__(_SourceTemplateState)

        __props__.__dict__["config"] = config
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["input_json"] = input_json
        __props__.__dict__["modified_at"] = modified_at
        __props__.__dict__["modified_by"] = modified_by
        __props__.__dict__["schema_ref"] = schema_ref
        __props__.__dict__["selectors"] = selectors
        __props__.__dict__["total_collector_linked"] = total_collector_linked
        return SourceTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="inputJson")
    def input_json(self) -> pulumi.Output[builtins.str]:
        """
        inputJson of source template
        """
        return pulumi.get(self, "input_json")

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "modified_at")

    @property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "modified_by")

    @property
    @pulumi.getter(name="schemaRef")
    def schema_ref(self) -> pulumi.Output['outputs.SourceTemplateSchemaRef']:
        """
        schema reference for source template.
        """
        return pulumi.get(self, "schema_ref")

    @property
    @pulumi.getter
    def selectors(self) -> pulumi.Output[Optional[Sequence['outputs.SourceTemplateSelector']]]:
        """
        Agent selector conditions
        """
        return pulumi.get(self, "selectors")

    @property
    @pulumi.getter(name="totalCollectorLinked")
    def total_collector_linked(self) -> pulumi.Output[builtins.int]:
        return pulumi.get(self, "total_collector_linked")

