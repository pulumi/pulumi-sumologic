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

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 access_id: Optional[pulumi.Input[builtins.str]] = None,
                 access_key: Optional[pulumi.Input[builtins.str]] = None,
                 admin_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 base_url: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        if access_id is not None:
            pulumi.set(__self__, "access_id", access_id)
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if admin_mode is not None:
            pulumi.set(__self__, "admin_mode", admin_mode)
        if base_url is None:
            base_url = _utilities.get_env('SUMOLOGIC_BASE_URL')
        if base_url is not None:
            pulumi.set(__self__, "base_url", base_url)
        if environment is None:
            environment = _utilities.get_env('SUMOLOGIC_ENVIRONMENT')
        if environment is not None:
            pulumi.set(__self__, "environment", environment)

    @property
    @pulumi.getter(name="accessId")
    def access_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "access_id")

    @access_id.setter
    def access_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_id", value)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter(name="adminMode")
    def admin_mode(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "admin_mode")

    @admin_mode.setter
    def admin_mode(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "admin_mode", value)

    @property
    @pulumi.getter(name="baseUrl")
    def base_url(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "base_url")

    @base_url.setter
    def base_url(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "base_url", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "environment", value)


@pulumi.type_token("pulumi:providers:sumologic")
class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_id: Optional[pulumi.Input[builtins.str]] = None,
                 access_key: Optional[pulumi.Input[builtins.str]] = None,
                 admin_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 base_url: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        The provider type for the sumologic package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the sumologic package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_id: Optional[pulumi.Input[builtins.str]] = None,
                 access_key: Optional[pulumi.Input[builtins.str]] = None,
                 admin_mode: Optional[pulumi.Input[builtins.bool]] = None,
                 base_url: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["access_id"] = access_id
            __props__.__dict__["access_key"] = access_key
            __props__.__dict__["admin_mode"] = pulumi.Output.from_input(admin_mode).apply(pulumi.runtime.to_json) if admin_mode is not None else None
            if base_url is None:
                base_url = _utilities.get_env('SUMOLOGIC_BASE_URL')
            __props__.__dict__["base_url"] = base_url
            if environment is None:
                environment = _utilities.get_env('SUMOLOGIC_ENVIRONMENT')
            __props__.__dict__["environment"] = environment
        super(Provider, __self__).__init__(
            'sumologic',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="accessId")
    def access_id(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "access_id")

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="baseUrl")
    def base_url(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "base_url")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "environment")

    @pulumi.output_type
    class TerraformConfigResult:
        def __init__(__self__, result=None):
            if result and not isinstance(result, dict):
                raise TypeError("Expected argument 'result' to be a dict")
            pulumi.set(__self__, "result", result)

        @property
        @pulumi.getter
        def result(self) -> Mapping[str, Any]:
            return pulumi.get(self, "result")

    def terraform_config(__self__) -> pulumi.Output['Provider.TerraformConfigResult']:
        """
        This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        """
        __args__ = dict()
        __args__['__self__'] = __self__
        return pulumi.runtime.call('pulumi:providers:sumologic/terraformConfig', __args__, res=__self__, typ=Provider.TerraformConfigResult)

