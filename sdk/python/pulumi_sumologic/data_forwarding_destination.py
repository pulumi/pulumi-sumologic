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

__all__ = ['DataForwardingDestinationArgs', 'DataForwardingDestination']

@pulumi.input_type
class DataForwardingDestinationArgs:
    def __init__(__self__, *,
                 authentication: pulumi.Input['DataForwardingDestinationAuthenticationArgs'],
                 bucket_name: pulumi.Input[builtins.str],
                 destination_name: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 s3_region: Optional[pulumi.Input[builtins.str]] = None,
                 s3_server_side_encryption: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a DataForwardingDestination resource.
        :param pulumi.Input[builtins.str] bucket_name: The name of the Amazon S3 bucket.
        :param pulumi.Input[builtins.str] destination_name: Name of the S3 data forwarding destination.
        :param pulumi.Input[builtins.str] description: Description of the S3 data forwarding destination.
        :param pulumi.Input[builtins.bool] enabled: True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] s3_region: The region where the S3 bucket is located.
        :param pulumi.Input[builtins.bool] s3_server_side_encryption: Enable S3 server-side encryption.
        """
        pulumi.set(__self__, "authentication", authentication)
        pulumi.set(__self__, "bucket_name", bucket_name)
        pulumi.set(__self__, "destination_name", destination_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if s3_region is not None:
            pulumi.set(__self__, "s3_region", s3_region)
        if s3_server_side_encryption is not None:
            pulumi.set(__self__, "s3_server_side_encryption", s3_server_side_encryption)

    @property
    @pulumi.getter
    def authentication(self) -> pulumi.Input['DataForwardingDestinationAuthenticationArgs']:
        return pulumi.get(self, "authentication")

    @authentication.setter
    def authentication(self, value: pulumi.Input['DataForwardingDestinationAuthenticationArgs']):
        pulumi.set(self, "authentication", value)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the Amazon S3 bucket.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Input[builtins.str]:
        """
        Name of the S3 data forwarding destination.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "destination_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Description of the S3 data forwarding destination.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.

        The following attributes are exported:
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="s3Region")
    def s3_region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The region where the S3 bucket is located.
        """
        return pulumi.get(self, "s3_region")

    @s3_region.setter
    def s3_region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "s3_region", value)

    @property
    @pulumi.getter(name="s3ServerSideEncryption")
    def s3_server_side_encryption(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Enable S3 server-side encryption.
        """
        return pulumi.get(self, "s3_server_side_encryption")

    @s3_server_side_encryption.setter
    def s3_server_side_encryption(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "s3_server_side_encryption", value)


@pulumi.input_type
class _DataForwardingDestinationState:
    def __init__(__self__, *,
                 authentication: Optional[pulumi.Input['DataForwardingDestinationAuthenticationArgs']] = None,
                 bucket_name: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 s3_region: Optional[pulumi.Input[builtins.str]] = None,
                 s3_server_side_encryption: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering DataForwardingDestination resources.
        :param pulumi.Input[builtins.str] bucket_name: The name of the Amazon S3 bucket.
        :param pulumi.Input[builtins.str] description: Description of the S3 data forwarding destination.
        :param pulumi.Input[builtins.str] destination_name: Name of the S3 data forwarding destination.
        :param pulumi.Input[builtins.bool] enabled: True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] s3_region: The region where the S3 bucket is located.
        :param pulumi.Input[builtins.bool] s3_server_side_encryption: Enable S3 server-side encryption.
        """
        if authentication is not None:
            pulumi.set(__self__, "authentication", authentication)
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_name is not None:
            pulumi.set(__self__, "destination_name", destination_name)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if s3_region is not None:
            pulumi.set(__self__, "s3_region", s3_region)
        if s3_server_side_encryption is not None:
            pulumi.set(__self__, "s3_server_side_encryption", s3_server_side_encryption)

    @property
    @pulumi.getter
    def authentication(self) -> Optional[pulumi.Input['DataForwardingDestinationAuthenticationArgs']]:
        return pulumi.get(self, "authentication")

    @authentication.setter
    def authentication(self, value: Optional[pulumi.Input['DataForwardingDestinationAuthenticationArgs']]):
        pulumi.set(self, "authentication", value)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Amazon S3 bucket.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Description of the S3 data forwarding destination.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the S3 data forwarding destination.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "destination_name", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.

        The following attributes are exported:
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="s3Region")
    def s3_region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The region where the S3 bucket is located.
        """
        return pulumi.get(self, "s3_region")

    @s3_region.setter
    def s3_region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "s3_region", value)

    @property
    @pulumi.getter(name="s3ServerSideEncryption")
    def s3_server_side_encryption(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Enable S3 server-side encryption.
        """
        return pulumi.get(self, "s3_server_side_encryption")

    @s3_server_side_encryption.setter
    def s3_server_side_encryption(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "s3_server_side_encryption", value)


@pulumi.type_token("sumologic:index/dataForwardingDestination:DataForwardingDestination")
class DataForwardingDestination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication: Optional[pulumi.Input[Union['DataForwardingDestinationAuthenticationArgs', 'DataForwardingDestinationAuthenticationArgsDict']]] = None,
                 bucket_name: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 s3_region: Optional[pulumi.Input[builtins.str]] = None,
                 s3_server_side_encryption: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        Provider to manage [Sumologic Data Forwarding Destination](https://help.sumologic.com/docs/manage/data-forwarding/amazon-s3-bucket/#configure-an-s3-data-forwarding-destination)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        example_data_forwarding_destination = sumologic.DataForwardingDestination("example_data_forwarding_destination",
            destination_name="df-destination",
            description="some description",
            bucket_name="df-bucket",
            s3_region="us-east-1",
            authentication={
                "type": "RoleBased",
                "role_arn": "arn:aws:iam::your_arn",
            },
            s3_server_side_encryption=False,
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] bucket_name: The name of the Amazon S3 bucket.
        :param pulumi.Input[builtins.str] description: Description of the S3 data forwarding destination.
        :param pulumi.Input[builtins.str] destination_name: Name of the S3 data forwarding destination.
        :param pulumi.Input[builtins.bool] enabled: True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] s3_region: The region where the S3 bucket is located.
        :param pulumi.Input[builtins.bool] s3_server_side_encryption: Enable S3 server-side encryption.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataForwardingDestinationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provider to manage [Sumologic Data Forwarding Destination](https://help.sumologic.com/docs/manage/data-forwarding/amazon-s3-bucket/#configure-an-s3-data-forwarding-destination)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        example_data_forwarding_destination = sumologic.DataForwardingDestination("example_data_forwarding_destination",
            destination_name="df-destination",
            description="some description",
            bucket_name="df-bucket",
            s3_region="us-east-1",
            authentication={
                "type": "RoleBased",
                "role_arn": "arn:aws:iam::your_arn",
            },
            s3_server_side_encryption=False,
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param DataForwardingDestinationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataForwardingDestinationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication: Optional[pulumi.Input[Union['DataForwardingDestinationAuthenticationArgs', 'DataForwardingDestinationAuthenticationArgsDict']]] = None,
                 bucket_name: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 s3_region: Optional[pulumi.Input[builtins.str]] = None,
                 s3_server_side_encryption: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataForwardingDestinationArgs.__new__(DataForwardingDestinationArgs)

            if authentication is None and not opts.urn:
                raise TypeError("Missing required property 'authentication'")
            __props__.__dict__["authentication"] = authentication
            if bucket_name is None and not opts.urn:
                raise TypeError("Missing required property 'bucket_name'")
            __props__.__dict__["bucket_name"] = bucket_name
            __props__.__dict__["description"] = description
            if destination_name is None and not opts.urn:
                raise TypeError("Missing required property 'destination_name'")
            __props__.__dict__["destination_name"] = destination_name
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["s3_region"] = s3_region
            __props__.__dict__["s3_server_side_encryption"] = s3_server_side_encryption
        super(DataForwardingDestination, __self__).__init__(
            'sumologic:index/dataForwardingDestination:DataForwardingDestination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication: Optional[pulumi.Input[Union['DataForwardingDestinationAuthenticationArgs', 'DataForwardingDestinationAuthenticationArgsDict']]] = None,
            bucket_name: Optional[pulumi.Input[builtins.str]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            destination_name: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            s3_region: Optional[pulumi.Input[builtins.str]] = None,
            s3_server_side_encryption: Optional[pulumi.Input[builtins.bool]] = None) -> 'DataForwardingDestination':
        """
        Get an existing DataForwardingDestination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] bucket_name: The name of the Amazon S3 bucket.
        :param pulumi.Input[builtins.str] description: Description of the S3 data forwarding destination.
        :param pulumi.Input[builtins.str] destination_name: Name of the S3 data forwarding destination.
        :param pulumi.Input[builtins.bool] enabled: True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.str] s3_region: The region where the S3 bucket is located.
        :param pulumi.Input[builtins.bool] s3_server_side_encryption: Enable S3 server-side encryption.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataForwardingDestinationState.__new__(_DataForwardingDestinationState)

        __props__.__dict__["authentication"] = authentication
        __props__.__dict__["bucket_name"] = bucket_name
        __props__.__dict__["description"] = description
        __props__.__dict__["destination_name"] = destination_name
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["s3_region"] = s3_region
        __props__.__dict__["s3_server_side_encryption"] = s3_server_side_encryption
        return DataForwardingDestination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def authentication(self) -> pulumi.Output['outputs.DataForwardingDestinationAuthentication']:
        return pulumi.get(self, "authentication")

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Amazon S3 bucket.
        """
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Description of the S3 data forwarding destination.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the S3 data forwarding destination.
        """
        return pulumi.get(self, "destination_name")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        True when the data forwarding destination is enabled. Will be treated as _false_ if left blank.

        The following attributes are exported:
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="s3Region")
    def s3_region(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The region where the S3 bucket is located.
        """
        return pulumi.get(self, "s3_region")

    @property
    @pulumi.getter(name="s3ServerSideEncryption")
    def s3_server_side_encryption(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        Enable S3 server-side encryption.
        """
        return pulumi.get(self, "s3_server_side_encryption")

