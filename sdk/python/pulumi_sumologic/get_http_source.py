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

__all__ = [
    'GetHttpSourceResult',
    'AwaitableGetHttpSourceResult',
    'get_http_source',
    'get_http_source_output',
]

@pulumi.output_type
class GetHttpSourceResult:
    """
    A collection of values returned by getHttpSource.
    """
    def __init__(__self__, category=None, collector_id=None, description=None, id=None, multiline=None, name=None, timezone=None, url=None):
        if category and not isinstance(category, str):
            raise TypeError("Expected argument 'category' to be a str")
        pulumi.set(__self__, "category", category)
        if collector_id and not isinstance(collector_id, int):
            raise TypeError("Expected argument 'collector_id' to be a int")
        pulumi.set(__self__, "collector_id", collector_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if multiline and not isinstance(multiline, bool):
            raise TypeError("Expected argument 'multiline' to be a bool")
        pulumi.set(__self__, "multiline", multiline)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if timezone and not isinstance(timezone, str):
            raise TypeError("Expected argument 'timezone' to be a str")
        pulumi.set(__self__, "timezone", timezone)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def category(self) -> builtins.str:
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="collectorId")
    def collector_id(self) -> Optional[builtins.int]:
        return pulumi.get(self, "collector_id")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def multiline(self) -> builtins.bool:
        return pulumi.get(self, "multiline")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def timezone(self) -> builtins.str:
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter
    def url(self) -> builtins.str:
        return pulumi.get(self, "url")


class AwaitableGetHttpSourceResult(GetHttpSourceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHttpSourceResult(
            category=self.category,
            collector_id=self.collector_id,
            description=self.description,
            id=self.id,
            multiline=self.multiline,
            name=self.name,
            timezone=self.timezone,
            url=self.url)


def get_http_source(collector_id: Optional[builtins.int] = None,
                    id: Optional[builtins.int] = None,
                    name: Optional[builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHttpSourceResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_sumologic as sumologic

    this = sumologic.get_http_source(collector_id=121212,
        name="source_name")
    ```

    A HTTP Source can be looked up by using a combination of `collector_id` & `name`.
    If either `id` or `name` are not present, the data source block fails with a panic (at this point).

    ## Attributes reference

    The following attributes are exported:

    - `id` - The internal ID of the collector. This can be used to attach sources to the collector.
    - `name` - The name of the collector.
    - `description` - The description of the collector.
    - `category` - The default source category for any source attached to this collector.
    - `timezone` - The time zone to use for this collector. The value follows the [tzdata][2] naming convention.
    - `multiline` - Multiline processing enabled or not.
    - `url` - The HTTP endpoint to use for sending data to this source.
    """
    __args__ = dict()
    __args__['collectorId'] = collector_id
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('sumologic:index/getHttpSource:getHttpSource', __args__, opts=opts, typ=GetHttpSourceResult).value

    return AwaitableGetHttpSourceResult(
        category=pulumi.get(__ret__, 'category'),
        collector_id=pulumi.get(__ret__, 'collector_id'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        multiline=pulumi.get(__ret__, 'multiline'),
        name=pulumi.get(__ret__, 'name'),
        timezone=pulumi.get(__ret__, 'timezone'),
        url=pulumi.get(__ret__, 'url'))
def get_http_source_output(collector_id: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                           id: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                           name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHttpSourceResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_sumologic as sumologic

    this = sumologic.get_http_source(collector_id=121212,
        name="source_name")
    ```

    A HTTP Source can be looked up by using a combination of `collector_id` & `name`.
    If either `id` or `name` are not present, the data source block fails with a panic (at this point).

    ## Attributes reference

    The following attributes are exported:

    - `id` - The internal ID of the collector. This can be used to attach sources to the collector.
    - `name` - The name of the collector.
    - `description` - The description of the collector.
    - `category` - The default source category for any source attached to this collector.
    - `timezone` - The time zone to use for this collector. The value follows the [tzdata][2] naming convention.
    - `multiline` - Multiline processing enabled or not.
    - `url` - The HTTP endpoint to use for sending data to this source.
    """
    __args__ = dict()
    __args__['collectorId'] = collector_id
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('sumologic:index/getHttpSource:getHttpSource', __args__, opts=opts, typ=GetHttpSourceResult)
    return __ret__.apply(lambda __response__: GetHttpSourceResult(
        category=pulumi.get(__response__, 'category'),
        collector_id=pulumi.get(__response__, 'collector_id'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        multiline=pulumi.get(__response__, 'multiline'),
        name=pulumi.get(__response__, 'name'),
        timezone=pulumi.get(__response__, 'timezone'),
        url=pulumi.get(__response__, 'url')))
