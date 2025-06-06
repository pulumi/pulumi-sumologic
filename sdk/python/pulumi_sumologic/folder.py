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

__all__ = ['FolderArgs', 'Folder']

@pulumi.input_type
class FolderArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[builtins.str],
                 parent_id: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Folder resource.
        :param pulumi.Input[builtins.str] description: The description of the folder.
        :param pulumi.Input[builtins.str] parent_id: The ID of the folder in which you want to create the new folder.
        :param pulumi.Input[builtins.str] name: The name of the folder. This is required, and has to be unique.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "parent_id", parent_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[builtins.str]:
        """
        The description of the folder.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Input[builtins.str]:
        """
        The ID of the folder in which you want to create the new folder.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the folder. This is required, and has to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FolderState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Folder resources.
        :param pulumi.Input[builtins.str] description: The description of the folder.
        :param pulumi.Input[builtins.str] name: The name of the folder. This is required, and has to be unique.
        :param pulumi.Input[builtins.str] parent_id: The ID of the folder in which you want to create the new folder.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the folder.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the folder. This is required, and has to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the folder in which you want to create the new folder.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "parent_id", value)


@pulumi.type_token("sumologic:index/folder:Folder")
class Folder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides the ability to create, read, delete, update, and manage of folders.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        folder = sumologic.Folder("folder",
            name="test-folder",
            description="A test folder",
            parent_id="<personal folder id>")
        ```

        ## Import

        ### Timeouts

        `sumologic_folder` provides the following [Timeouts](/docs/configuration/resources.html#timeouts) configuration options:

        - `delete` - (Default `1 minute`) Used for waiting for the deletion job to be successful

        Additional data provided in state

        - `created_at` - (Computed) When the folder was created.

        - `created_by` - (Computed) Who created the folder.

        - `modified_at` - (Computed) When was the folder last modified.

        - `modified_by` - (Computed) The ID of the user who modified the folder last.

        - `item_type` - (Computed) What the type of the content item is (will obviously be "Folder").

        - `permissions` - (Computed) List of permissions the user has on the content item.

        - `children` - (Computed) A list of all the content items in the created folder (can be folders or other content items).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the folder.
        :param pulumi.Input[builtins.str] name: The name of the folder. This is required, and has to be unique.
        :param pulumi.Input[builtins.str] parent_id: The ID of the folder in which you want to create the new folder.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FolderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides the ability to create, read, delete, update, and manage of folders.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        folder = sumologic.Folder("folder",
            name="test-folder",
            description="A test folder",
            parent_id="<personal folder id>")
        ```

        ## Import

        ### Timeouts

        `sumologic_folder` provides the following [Timeouts](/docs/configuration/resources.html#timeouts) configuration options:

        - `delete` - (Default `1 minute`) Used for waiting for the deletion job to be successful

        Additional data provided in state

        - `created_at` - (Computed) When the folder was created.

        - `created_by` - (Computed) Who created the folder.

        - `modified_at` - (Computed) When was the folder last modified.

        - `modified_by` - (Computed) The ID of the user who modified the folder last.

        - `item_type` - (Computed) What the type of the content item is (will obviously be "Folder").

        - `permissions` - (Computed) List of permissions the user has on the content item.

        - `children` - (Computed) A list of all the content items in the created folder (can be folders or other content items).

        :param str resource_name: The name of the resource.
        :param FolderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FolderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FolderArgs.__new__(FolderArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if parent_id is None and not opts.urn:
                raise TypeError("Missing required property 'parent_id'")
            __props__.__dict__["parent_id"] = parent_id
        super(Folder, __self__).__init__(
            'sumologic:index/folder:Folder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            parent_id: Optional[pulumi.Input[builtins.str]] = None) -> 'Folder':
        """
        Get an existing Folder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: The description of the folder.
        :param pulumi.Input[builtins.str] name: The name of the folder. This is required, and has to be unique.
        :param pulumi.Input[builtins.str] parent_id: The ID of the folder in which you want to create the new folder.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FolderState.__new__(_FolderState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["parent_id"] = parent_id
        return Folder(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[builtins.str]:
        """
        The description of the folder.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the folder. This is required, and has to be unique.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the folder in which you want to create the new folder.
        """
        return pulumi.get(self, "parent_id")

