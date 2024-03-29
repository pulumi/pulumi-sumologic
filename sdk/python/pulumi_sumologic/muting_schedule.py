# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MutingScheduleArgs', 'MutingSchedule']

@pulumi.input_type
class MutingScheduleArgs:
    def __init__(__self__, *,
                 schedule: pulumi.Input['MutingScheduleScheduleArgs'],
                 content_type: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_mutable: Optional[pulumi.Input[bool]] = None,
                 is_system: Optional[pulumi.Input[bool]] = None,
                 modified_at: Optional[pulumi.Input[str]] = None,
                 modified_by: Optional[pulumi.Input[str]] = None,
                 monitor: Optional[pulumi.Input['MutingScheduleMonitorArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a MutingSchedule resource.
        :param pulumi.Input['MutingScheduleScheduleArgs'] schedule: The schedule information. see `schedule_type`.
        :param pulumi.Input[str] content_type: The type of the content object. Valid value:
        :param pulumi.Input[str] description: The description of the muting schedule.
        :param pulumi.Input['MutingScheduleMonitorArgs'] monitor: The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        :param pulumi.Input[str] name: The name of the muting schedule. The name must be alphanumeric.
        :param pulumi.Input[str] type: The type of object model. Valid value:
        """
        pulumi.set(__self__, "schedule", schedule)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_mutable is not None:
            pulumi.set(__self__, "is_mutable", is_mutable)
        if is_system is not None:
            pulumi.set(__self__, "is_system", is_system)
        if modified_at is not None:
            pulumi.set(__self__, "modified_at", modified_at)
        if modified_by is not None:
            pulumi.set(__self__, "modified_by", modified_by)
        if monitor is not None:
            pulumi.set(__self__, "monitor", monitor)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input['MutingScheduleScheduleArgs']:
        """
        The schedule information. see `schedule_type`.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input['MutingScheduleScheduleArgs']):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the content object. Valid value:
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the muting schedule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="isMutable")
    def is_mutable(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_mutable")

    @is_mutable.setter
    def is_mutable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_mutable", value)

    @property
    @pulumi.getter(name="isSystem")
    def is_system(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_system")

    @is_system.setter
    def is_system(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_system", value)

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "modified_at")

    @modified_at.setter
    def modified_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_at", value)

    @property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "modified_by")

    @modified_by.setter
    def modified_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_by", value)

    @property
    @pulumi.getter
    def monitor(self) -> Optional[pulumi.Input['MutingScheduleMonitorArgs']]:
        """
        The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        """
        return pulumi.get(self, "monitor")

    @monitor.setter
    def monitor(self, value: Optional[pulumi.Input['MutingScheduleMonitorArgs']]):
        pulumi.set(self, "monitor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the muting schedule. The name must be alphanumeric.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of object model. Valid value:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _MutingScheduleState:
    def __init__(__self__, *,
                 content_type: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_mutable: Optional[pulumi.Input[bool]] = None,
                 is_system: Optional[pulumi.Input[bool]] = None,
                 modified_at: Optional[pulumi.Input[str]] = None,
                 modified_by: Optional[pulumi.Input[str]] = None,
                 monitor: Optional[pulumi.Input['MutingScheduleMonitorArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input['MutingScheduleScheduleArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MutingSchedule resources.
        :param pulumi.Input[str] content_type: The type of the content object. Valid value:
        :param pulumi.Input[str] description: The description of the muting schedule.
        :param pulumi.Input['MutingScheduleMonitorArgs'] monitor: The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        :param pulumi.Input[str] name: The name of the muting schedule. The name must be alphanumeric.
        :param pulumi.Input['MutingScheduleScheduleArgs'] schedule: The schedule information. see `schedule_type`.
        :param pulumi.Input[str] type: The type of object model. Valid value:
        """
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_mutable is not None:
            pulumi.set(__self__, "is_mutable", is_mutable)
        if is_system is not None:
            pulumi.set(__self__, "is_system", is_system)
        if modified_at is not None:
            pulumi.set(__self__, "modified_at", modified_at)
        if modified_by is not None:
            pulumi.set(__self__, "modified_by", modified_by)
        if monitor is not None:
            pulumi.set(__self__, "monitor", monitor)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the content object. Valid value:
        """
        return pulumi.get(self, "content_type")

    @content_type.setter
    def content_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_type", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the muting schedule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="isMutable")
    def is_mutable(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_mutable")

    @is_mutable.setter
    def is_mutable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_mutable", value)

    @property
    @pulumi.getter(name="isSystem")
    def is_system(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_system")

    @is_system.setter
    def is_system(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_system", value)

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "modified_at")

    @modified_at.setter
    def modified_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_at", value)

    @property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "modified_by")

    @modified_by.setter
    def modified_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_by", value)

    @property
    @pulumi.getter
    def monitor(self) -> Optional[pulumi.Input['MutingScheduleMonitorArgs']]:
        """
        The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        """
        return pulumi.get(self, "monitor")

    @monitor.setter
    def monitor(self, value: Optional[pulumi.Input['MutingScheduleMonitorArgs']]):
        pulumi.set(self, "monitor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the muting schedule. The name must be alphanumeric.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['MutingScheduleScheduleArgs']]:
        """
        The schedule information. see `schedule_type`.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['MutingScheduleScheduleArgs']]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of object model. Valid value:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class MutingSchedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_mutable: Optional[pulumi.Input[bool]] = None,
                 is_system: Optional[pulumi.Input[bool]] = None,
                 modified_at: Optional[pulumi.Input[str]] = None,
                 modified_by: Optional[pulumi.Input[str]] = None,
                 monitor: Optional[pulumi.Input[pulumi.InputType['MutingScheduleMonitorArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[pulumi.InputType['MutingScheduleScheduleArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides the ability to create, read, delete, and update [MutingSchedule](https://help.sumologic.com/docs/alerts/monitors/muting-schedules/).

        ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For All monitor

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                all=True,
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=60,
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For Specifc Monitor/Folder ids

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                ids=["0000000000200B92"],
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=60,
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For All monitor

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                all=True,
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=30,
                rrule="FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For Specifc Monitor/Folder ids

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                ids=["0000000000200B92"],
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=30,
                rrule="FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content_type: The type of the content object. Valid value:
        :param pulumi.Input[str] description: The description of the muting schedule.
        :param pulumi.Input[pulumi.InputType['MutingScheduleMonitorArgs']] monitor: The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        :param pulumi.Input[str] name: The name of the muting schedule. The name must be alphanumeric.
        :param pulumi.Input[pulumi.InputType['MutingScheduleScheduleArgs']] schedule: The schedule information. see `schedule_type`.
        :param pulumi.Input[str] type: The type of object model. Valid value:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MutingScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides the ability to create, read, delete, and update [MutingSchedule](https://help.sumologic.com/docs/alerts/monitors/muting-schedules/).

        ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For All monitor

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                all=True,
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=60,
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example One-time Muting Schedule From 12:00 AM To 1:00 AM On 2023-08-05 For Specifc Monitor/Folder ids

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                ids=["0000000000200B92"],
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=60,
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For All monitor

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                all=True,
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=30,
                rrule="FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        ## Example Daily Muting Schedule From 9:00 AM to 9:30 and 10:00 AM to 10:30 AM Since 2023-08-05 For Specifc Monitor/Folder ids

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        muting_schedule = sumologic.MutingSchedule("mutingSchedule",
            content_type="MutingSchedule",
            description="This is an example for one time Muting schedule for all monitor",
            monitor=sumologic.MutingScheduleMonitorArgs(
                ids=["0000000000200B92"],
            ),
            schedule=sumologic.MutingScheduleScheduleArgs(
                duration=30,
                rrule="FREQ=DAILY;INTERVAL=1;BYHOUR=9,10",
                start_date="2023-08-05",
                start_time="00:00",
                timezone="America/Los_Angeles",
            ),
            type="MutingSchedulesLibraryMutingSchedule")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param MutingScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MutingScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content_type: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_mutable: Optional[pulumi.Input[bool]] = None,
                 is_system: Optional[pulumi.Input[bool]] = None,
                 modified_at: Optional[pulumi.Input[str]] = None,
                 modified_by: Optional[pulumi.Input[str]] = None,
                 monitor: Optional[pulumi.Input[pulumi.InputType['MutingScheduleMonitorArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[pulumi.InputType['MutingScheduleScheduleArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MutingScheduleArgs.__new__(MutingScheduleArgs)

            __props__.__dict__["content_type"] = content_type
            __props__.__dict__["created_at"] = created_at
            __props__.__dict__["created_by"] = created_by
            __props__.__dict__["description"] = description
            __props__.__dict__["is_mutable"] = is_mutable
            __props__.__dict__["is_system"] = is_system
            __props__.__dict__["modified_at"] = modified_at
            __props__.__dict__["modified_by"] = modified_by
            __props__.__dict__["monitor"] = monitor
            __props__.__dict__["name"] = name
            __props__.__dict__["parent_id"] = parent_id
            if schedule is None and not opts.urn:
                raise TypeError("Missing required property 'schedule'")
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["type"] = type
            __props__.__dict__["version"] = version
        super(MutingSchedule, __self__).__init__(
            'sumologic:index/mutingSchedule:MutingSchedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content_type: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            created_by: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            is_mutable: Optional[pulumi.Input[bool]] = None,
            is_system: Optional[pulumi.Input[bool]] = None,
            modified_at: Optional[pulumi.Input[str]] = None,
            modified_by: Optional[pulumi.Input[str]] = None,
            monitor: Optional[pulumi.Input[pulumi.InputType['MutingScheduleMonitorArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent_id: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[pulumi.InputType['MutingScheduleScheduleArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'MutingSchedule':
        """
        Get an existing MutingSchedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content_type: The type of the content object. Valid value:
        :param pulumi.Input[str] description: The description of the muting schedule.
        :param pulumi.Input[pulumi.InputType['MutingScheduleMonitorArgs']] monitor: The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        :param pulumi.Input[str] name: The name of the muting schedule. The name must be alphanumeric.
        :param pulumi.Input[pulumi.InputType['MutingScheduleScheduleArgs']] schedule: The schedule information. see `schedule_type`.
        :param pulumi.Input[str] type: The type of object model. Valid value:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MutingScheduleState.__new__(_MutingScheduleState)

        __props__.__dict__["content_type"] = content_type
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["description"] = description
        __props__.__dict__["is_mutable"] = is_mutable
        __props__.__dict__["is_system"] = is_system
        __props__.__dict__["modified_at"] = modified_at
        __props__.__dict__["modified_by"] = modified_by
        __props__.__dict__["monitor"] = monitor
        __props__.__dict__["name"] = name
        __props__.__dict__["parent_id"] = parent_id
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        return MutingSchedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the content object. Valid value:
        """
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the muting schedule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="isMutable")
    def is_mutable(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "is_mutable")

    @property
    @pulumi.getter(name="isSystem")
    def is_system(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "is_system")

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "modified_at")

    @property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> pulumi.Output[str]:
        return pulumi.get(self, "modified_by")

    @property
    @pulumi.getter
    def monitor(self) -> pulumi.Output[Optional['outputs.MutingScheduleMonitor']]:
        """
        The monitors which need to put in the muting schedule. see `monitor_scope_type`:
        """
        return pulumi.get(self, "monitor")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the muting schedule. The name must be alphanumeric.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output['outputs.MutingScheduleSchedule']:
        """
        The schedule information. see `schedule_type`.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of object model. Valid value:
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        return pulumi.get(self, "version")

