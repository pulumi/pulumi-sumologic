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

__all__ = ['TokenArgs', 'Token']

@pulumi.input_type
class TokenArgs:
    def __init__(__self__, *,
                 status: pulumi.Input[builtins.str],
                 type: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a Token resource.
        :param pulumi.Input[builtins.str] status: Status of the token. Valid values:
               - `Active`
               - `Inactive`
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] type: Type of the token. Valid value:
               - `CollectorRegistration`.
        :param pulumi.Input[builtins.str] description: The description of the token.
        :param pulumi.Input[builtins.str] name: Display name of the token. This must be unique across all of the tokens.
        """
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[builtins.str]:
        """
        Status of the token. Valid values:
        - `Active`
        - `Inactive`

        The following attributes are exported:
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[builtins.str]:
        """
        Type of the token. Valid value:
        - `CollectorRegistration`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the token.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Display name of the token. This must be unique across all of the tokens.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _TokenState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 encoded_token_and_url: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering Token resources.
        :param pulumi.Input[builtins.str] description: The description of the token.
        :param pulumi.Input[builtins.str] encoded_token_and_url: The encoded token for collector registration.
        :param pulumi.Input[builtins.str] name: Display name of the token. This must be unique across all of the tokens.
        :param pulumi.Input[builtins.str] status: Status of the token. Valid values:
               - `Active`
               - `Inactive`
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] type: Type of the token. Valid value:
               - `CollectorRegistration`.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encoded_token_and_url is not None:
            pulumi.set(__self__, "encoded_token_and_url", encoded_token_and_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the token.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="encodedTokenAndUrl")
    def encoded_token_and_url(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The encoded token for collector registration.
        """
        return pulumi.get(self, "encoded_token_and_url")

    @encoded_token_and_url.setter
    def encoded_token_and_url(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "encoded_token_and_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Display name of the token. This must be unique across all of the tokens.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Status of the token. Valid values:
        - `Active`
        - `Inactive`

        The following attributes are exported:
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Type of the token. Valid value:
        - `CollectorRegistration`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sumologic:index/token:Token")
class Token(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Provides a [Sumologic Token](https://help.sumologic.com/Manage/Security/Installation_Tokens).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        example_token = sumologic.Token("example_token",
            name="testToken",
            description="Testing resource sumologic_token",
            status="Active",
            type="CollectorRegistration")
        ```

        ## Import

        Tokens can be imported using the name, e.g.:

        hcl

        ```sh
        $ pulumi import sumologic:index/token:Token test id
        ```

        [1]: https://help.sumologic.com/Manage/Security/Installation_Tokens

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the token.
        :param pulumi.Input[builtins.str] name: Display name of the token. This must be unique across all of the tokens.
        :param pulumi.Input[builtins.str] status: Status of the token. Valid values:
               - `Active`
               - `Inactive`
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] type: Type of the token. Valid value:
               - `CollectorRegistration`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [Sumologic Token](https://help.sumologic.com/Manage/Security/Installation_Tokens).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        example_token = sumologic.Token("example_token",
            name="testToken",
            description="Testing resource sumologic_token",
            status="Active",
            type="CollectorRegistration")
        ```

        ## Import

        Tokens can be imported using the name, e.g.:

        hcl

        ```sh
        $ pulumi import sumologic:index/token:Token test id
        ```

        [1]: https://help.sumologic.com/Manage/Security/Installation_Tokens

        :param str resource_name: The name of the resource.
        :param TokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TokenArgs.__new__(TokenArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["version"] = version
            __props__.__dict__["encoded_token_and_url"] = None
        super(Token, __self__).__init__(
            'sumologic:index/token:Token',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            encoded_token_and_url: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None,
            version: Optional[pulumi.Input[builtins.int]] = None) -> 'Token':
        """
        Get an existing Token resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the token.
        :param pulumi.Input[builtins.str] encoded_token_and_url: The encoded token for collector registration.
        :param pulumi.Input[builtins.str] name: Display name of the token. This must be unique across all of the tokens.
        :param pulumi.Input[builtins.str] status: Status of the token. Valid values:
               - `Active`
               - `Inactive`
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] type: Type of the token. Valid value:
               - `CollectorRegistration`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TokenState.__new__(_TokenState)

        __props__.__dict__["description"] = description
        __props__.__dict__["encoded_token_and_url"] = encoded_token_and_url
        __props__.__dict__["name"] = name
        __props__.__dict__["status"] = status
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        return Token(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the token.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="encodedTokenAndUrl")
    def encoded_token_and_url(self) -> pulumi.Output[builtins.str]:
        """
        The encoded token for collector registration.
        """
        return pulumi.get(self, "encoded_token_and_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Display name of the token. This must be unique across all of the tokens.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        Status of the token. Valid values:
        - `Active`
        - `Inactive`

        The following attributes are exported:
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        Type of the token. Valid value:
        - `CollectorRegistration`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[builtins.int]:
        return pulumi.get(self, "version")

