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

__all__ = ['ScheduledViewArgs', 'ScheduledView']

@pulumi.input_type
class ScheduledViewArgs:
    def __init__(__self__, *,
                 index_name: pulumi.Input[builtins.str],
                 query: pulumi.Input[builtins.str],
                 start_time: pulumi.Input[builtins.str],
                 data_forwarding_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_id: Optional[pulumi.Input[builtins.str]] = None,
                 parsing_mode: Optional[pulumi.Input[builtins.str]] = None,
                 reduce_retention_period_immediately: Optional[pulumi.Input[builtins.bool]] = None,
                 retention_period: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a ScheduledView resource.
        :param pulumi.Input[builtins.str] index_name: Name of the index (scheduled view).
        :param pulumi.Input[builtins.str] query: Log query defining the scheduled view.
        :param pulumi.Input[builtins.str] start_time: Start timestamp in UTC in RFC3339 format.
        :param pulumi.Input[builtins.str] data_forwarding_id: An optional ID of a data forwarding configuration to be used by the scheduled view.
        :param pulumi.Input[builtins.str] index_id: The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        :param pulumi.Input[builtins.str] parsing_mode: Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        :param pulumi.Input[builtins.bool] reduce_retention_period_immediately: This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.int] retention_period: The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        """
        pulumi.set(__self__, "index_name", index_name)
        pulumi.set(__self__, "query", query)
        pulumi.set(__self__, "start_time", start_time)
        if data_forwarding_id is not None:
            pulumi.set(__self__, "data_forwarding_id", data_forwarding_id)
        if index_id is not None:
            pulumi.set(__self__, "index_id", index_id)
        if parsing_mode is not None:
            pulumi.set(__self__, "parsing_mode", parsing_mode)
        if reduce_retention_period_immediately is not None:
            pulumi.set(__self__, "reduce_retention_period_immediately", reduce_retention_period_immediately)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Input[builtins.str]:
        """
        Name of the index (scheduled view).
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter
    def query(self) -> pulumi.Input[builtins.str]:
        """
        Log query defining the scheduled view.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Input[builtins.str]:
        """
        Start timestamp in UTC in RFC3339 format.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="dataForwardingId")
    def data_forwarding_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        An optional ID of a data forwarding configuration to be used by the scheduled view.
        """
        return pulumi.get(self, "data_forwarding_id")

    @data_forwarding_id.setter
    def data_forwarding_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "data_forwarding_id", value)

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        """
        return pulumi.get(self, "index_id")

    @index_id.setter
    def index_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "index_id", value)

    @property
    @pulumi.getter(name="parsingMode")
    def parsing_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        """
        return pulumi.get(self, "parsing_mode")

    @parsing_mode.setter
    def parsing_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "parsing_mode", value)

    @property
    @pulumi.getter(name="reduceRetentionPeriodImmediately")
    def reduce_retention_period_immediately(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.

        The following attributes are exported:
        """
        return pulumi.get(self, "reduce_retention_period_immediately")

    @reduce_retention_period_immediately.setter
    def reduce_retention_period_immediately(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "reduce_retention_period_immediately", value)

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "retention_period", value)


@pulumi.input_type
class _ScheduledViewState:
    def __init__(__self__, *,
                 data_forwarding_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_name: Optional[pulumi.Input[builtins.str]] = None,
                 parsing_mode: Optional[pulumi.Input[builtins.str]] = None,
                 query: Optional[pulumi.Input[builtins.str]] = None,
                 reduce_retention_period_immediately: Optional[pulumi.Input[builtins.bool]] = None,
                 retention_period: Optional[pulumi.Input[builtins.int]] = None,
                 start_time: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ScheduledView resources.
        :param pulumi.Input[builtins.str] data_forwarding_id: An optional ID of a data forwarding configuration to be used by the scheduled view.
        :param pulumi.Input[builtins.str] index_id: The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        :param pulumi.Input[builtins.str] index_name: Name of the index (scheduled view).
        :param pulumi.Input[builtins.str] parsing_mode: Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        :param pulumi.Input[builtins.str] query: Log query defining the scheduled view.
        :param pulumi.Input[builtins.bool] reduce_retention_period_immediately: This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.int] retention_period: The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        :param pulumi.Input[builtins.str] start_time: Start timestamp in UTC in RFC3339 format.
        """
        if data_forwarding_id is not None:
            pulumi.set(__self__, "data_forwarding_id", data_forwarding_id)
        if index_id is not None:
            pulumi.set(__self__, "index_id", index_id)
        if index_name is not None:
            pulumi.set(__self__, "index_name", index_name)
        if parsing_mode is not None:
            pulumi.set(__self__, "parsing_mode", parsing_mode)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if reduce_retention_period_immediately is not None:
            pulumi.set(__self__, "reduce_retention_period_immediately", reduce_retention_period_immediately)
        if retention_period is not None:
            pulumi.set(__self__, "retention_period", retention_period)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter(name="dataForwardingId")
    def data_forwarding_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        An optional ID of a data forwarding configuration to be used by the scheduled view.
        """
        return pulumi.get(self, "data_forwarding_id")

    @data_forwarding_id.setter
    def data_forwarding_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "data_forwarding_id", value)

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        """
        return pulumi.get(self, "index_id")

    @index_id.setter
    def index_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "index_id", value)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the index (scheduled view).
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter(name="parsingMode")
    def parsing_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        """
        return pulumi.get(self, "parsing_mode")

    @parsing_mode.setter
    def parsing_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "parsing_mode", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Log query defining the scheduled view.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter(name="reduceRetentionPeriodImmediately")
    def reduce_retention_period_immediately(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.

        The following attributes are exported:
        """
        return pulumi.get(self, "reduce_retention_period_immediately")

    @reduce_retention_period_immediately.setter
    def reduce_retention_period_immediately(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "reduce_retention_period_immediately", value)

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        """
        return pulumi.get(self, "retention_period")

    @retention_period.setter
    def retention_period(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "retention_period", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Start timestamp in UTC in RFC3339 format.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "start_time", value)


@pulumi.type_token("sumologic:index/scheduledView:ScheduledView")
class ScheduledView(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_forwarding_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_name: Optional[pulumi.Input[builtins.str]] = None,
                 parsing_mode: Optional[pulumi.Input[builtins.str]] = None,
                 query: Optional[pulumi.Input[builtins.str]] = None,
                 reduce_retention_period_immediately: Optional[pulumi.Input[builtins.bool]] = None,
                 retention_period: Optional[pulumi.Input[builtins.int]] = None,
                 start_time: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a [Sumologic Scheduled View](https://help.sumologic.com/Manage/Scheduled-Views).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        failed_connections = sumologic.ScheduledView("failed_connections",
            index_name="failed_connections",
            query=\"\"\"_view=connections connectionStats
        | parse "connectionStats.CS *" as body
        | json field=body "exitCode", "isHttp2"
        | lookup org_name from shared/partners on partner_id=partnerid
        | timeslice 10m
        \"\"\",
            start_time="2019-09-01T00:00:00Z",
            retention_period=365)
        ```

        ## Import

        Scheduled Views can can be imported using the id. The list of scheduled views and their ids can be obtained using the Sumologic [scheduled views api][2].

        hcl

        ```sh
        $ pulumi import sumologic:index/scheduledView:ScheduledView failed_connections 1234567890
        ```

        [1]: https://help.sumologic.com/Manage/Scheduled-Views

        [2]: https://api.sumologic.com/docs/#operation/listScheduledViews

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] data_forwarding_id: An optional ID of a data forwarding configuration to be used by the scheduled view.
        :param pulumi.Input[builtins.str] index_id: The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        :param pulumi.Input[builtins.str] index_name: Name of the index (scheduled view).
        :param pulumi.Input[builtins.str] parsing_mode: Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        :param pulumi.Input[builtins.str] query: Log query defining the scheduled view.
        :param pulumi.Input[builtins.bool] reduce_retention_period_immediately: This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.int] retention_period: The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        :param pulumi.Input[builtins.str] start_time: Start timestamp in UTC in RFC3339 format.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduledViewArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [Sumologic Scheduled View](https://help.sumologic.com/Manage/Scheduled-Views).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sumologic as sumologic

        failed_connections = sumologic.ScheduledView("failed_connections",
            index_name="failed_connections",
            query=\"\"\"_view=connections connectionStats
        | parse "connectionStats.CS *" as body
        | json field=body "exitCode", "isHttp2"
        | lookup org_name from shared/partners on partner_id=partnerid
        | timeslice 10m
        \"\"\",
            start_time="2019-09-01T00:00:00Z",
            retention_period=365)
        ```

        ## Import

        Scheduled Views can can be imported using the id. The list of scheduled views and their ids can be obtained using the Sumologic [scheduled views api][2].

        hcl

        ```sh
        $ pulumi import sumologic:index/scheduledView:ScheduledView failed_connections 1234567890
        ```

        [1]: https://help.sumologic.com/Manage/Scheduled-Views

        [2]: https://api.sumologic.com/docs/#operation/listScheduledViews

        :param str resource_name: The name of the resource.
        :param ScheduledViewArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduledViewArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_forwarding_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_id: Optional[pulumi.Input[builtins.str]] = None,
                 index_name: Optional[pulumi.Input[builtins.str]] = None,
                 parsing_mode: Optional[pulumi.Input[builtins.str]] = None,
                 query: Optional[pulumi.Input[builtins.str]] = None,
                 reduce_retention_period_immediately: Optional[pulumi.Input[builtins.bool]] = None,
                 retention_period: Optional[pulumi.Input[builtins.int]] = None,
                 start_time: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduledViewArgs.__new__(ScheduledViewArgs)

            __props__.__dict__["data_forwarding_id"] = data_forwarding_id
            __props__.__dict__["index_id"] = index_id
            if index_name is None and not opts.urn:
                raise TypeError("Missing required property 'index_name'")
            __props__.__dict__["index_name"] = index_name
            __props__.__dict__["parsing_mode"] = parsing_mode
            if query is None and not opts.urn:
                raise TypeError("Missing required property 'query'")
            __props__.__dict__["query"] = query
            __props__.__dict__["reduce_retention_period_immediately"] = reduce_retention_period_immediately
            __props__.__dict__["retention_period"] = retention_period
            if start_time is None and not opts.urn:
                raise TypeError("Missing required property 'start_time'")
            __props__.__dict__["start_time"] = start_time
        super(ScheduledView, __self__).__init__(
            'sumologic:index/scheduledView:ScheduledView',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_forwarding_id: Optional[pulumi.Input[builtins.str]] = None,
            index_id: Optional[pulumi.Input[builtins.str]] = None,
            index_name: Optional[pulumi.Input[builtins.str]] = None,
            parsing_mode: Optional[pulumi.Input[builtins.str]] = None,
            query: Optional[pulumi.Input[builtins.str]] = None,
            reduce_retention_period_immediately: Optional[pulumi.Input[builtins.bool]] = None,
            retention_period: Optional[pulumi.Input[builtins.int]] = None,
            start_time: Optional[pulumi.Input[builtins.str]] = None) -> 'ScheduledView':
        """
        Get an existing ScheduledView resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] data_forwarding_id: An optional ID of a data forwarding configuration to be used by the scheduled view.
        :param pulumi.Input[builtins.str] index_id: The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        :param pulumi.Input[builtins.str] index_name: Name of the index (scheduled view).
        :param pulumi.Input[builtins.str] parsing_mode: Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        :param pulumi.Input[builtins.str] query: Log query defining the scheduled view.
        :param pulumi.Input[builtins.bool] reduce_retention_period_immediately: This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
               
               The following attributes are exported:
        :param pulumi.Input[builtins.int] retention_period: The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        :param pulumi.Input[builtins.str] start_time: Start timestamp in UTC in RFC3339 format.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduledViewState.__new__(_ScheduledViewState)

        __props__.__dict__["data_forwarding_id"] = data_forwarding_id
        __props__.__dict__["index_id"] = index_id
        __props__.__dict__["index_name"] = index_name
        __props__.__dict__["parsing_mode"] = parsing_mode
        __props__.__dict__["query"] = query
        __props__.__dict__["reduce_retention_period_immediately"] = reduce_retention_period_immediately
        __props__.__dict__["retention_period"] = retention_period
        __props__.__dict__["start_time"] = start_time
        return ScheduledView(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataForwardingId")
    def data_forwarding_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        An optional ID of a data forwarding configuration to be used by the scheduled view.
        """
        return pulumi.get(self, "data_forwarding_id")

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> pulumi.Output[builtins.str]:
        """
        The Index ID of the scheduled view. It remains unchanged during resource updates, and any manual modifications will be disregarded. While it’s not mandatory, we recommend to ignore this via `ignore_changes = [index_id]`.
        """
        return pulumi.get(self, "index_id")

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the index (scheduled view).
        """
        return pulumi.get(self, "index_name")

    @property
    @pulumi.getter(name="parsingMode")
    def parsing_mode(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
        """
        return pulumi.get(self, "parsing_mode")

    @property
    @pulumi.getter
    def query(self) -> pulumi.Output[builtins.str]:
        """
        Log query defining the scheduled view.
        """
        return pulumi.get(self, "query")

    @property
    @pulumi.getter(name="reduceRetentionPeriodImmediately")
    def reduce_retention_period_immediately(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.

        The following attributes are exported:
        """
        return pulumi.get(self, "reduce_retention_period_immediately")

    @property
    @pulumi.getter(name="retentionPeriod")
    def retention_period(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
        """
        return pulumi.get(self, "retention_period")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[builtins.str]:
        """
        Start timestamp in UTC in RFC3339 format.
        """
        return pulumi.get(self, "start_time")

