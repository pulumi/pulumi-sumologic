# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .aws_inventory_source import *
from .aws_xray_source import *
from .cloud_syslog_source import *
from .cloud_to_cloud_source import *
from .cloudfront_source import *
from .cloudtrail_source import *
from .cloudwatch_source import *
from .collector import *
from .collector_ingest_budget_assignment import *
from .connection import *
from .content import *
from .dashboard import *
from .elb_source import *
from .field import *
from .field_extraction_rule import *
from .folder import *
from .gcp_source import *
from .get_caller_identity import *
from .get_collector import *
from .get_http_source import *
from .get_my_user_id import *
from .get_personal_folder import *
from .get_role import *
from .http_source import *
from .ingest_budget import *
from .ingest_budget_v2 import *
from .kinesis_metrics_source import *
from .lookup_table import *
from .metadata_source import *
from .monitor import *
from .monitor_folder import *
from .partition import *
from .password_policy import *
from .polling_source import *
from .provider import *
from .role import *
from .s3_audit_source import *
from .s3_source import *
from .saml_configuration import *
from .scheduled_view import *
from .subdomain import *
from .user import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    config,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "sumologic:index/awsInventorySource:AwsInventorySource":
                return AwsInventorySource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/awsXraySource:AwsXraySource":
                return AwsXraySource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/cloudSyslogSource:CloudSyslogSource":
                return CloudSyslogSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/cloudToCloudSource:CloudToCloudSource":
                return CloudToCloudSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/cloudfrontSource:CloudfrontSource":
                return CloudfrontSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/cloudtrailSource:CloudtrailSource":
                return CloudtrailSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/cloudwatchSource:CloudwatchSource":
                return CloudwatchSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/collector:Collector":
                return Collector(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/collectorIngestBudgetAssignment:CollectorIngestBudgetAssignment":
                return CollectorIngestBudgetAssignment(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/connection:Connection":
                return Connection(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/content:Content":
                return Content(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/dashboard:Dashboard":
                return Dashboard(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/elbSource:ElbSource":
                return ElbSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/field:Field":
                return Field(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/fieldExtractionRule:FieldExtractionRule":
                return FieldExtractionRule(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/folder:Folder":
                return Folder(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/gcpSource:GcpSource":
                return GcpSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/httpSource:HttpSource":
                return HttpSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/ingestBudget:IngestBudget":
                return IngestBudget(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/ingestBudgetV2:IngestBudgetV2":
                return IngestBudgetV2(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/kinesisMetricsSource:KinesisMetricsSource":
                return KinesisMetricsSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/lookupTable:LookupTable":
                return LookupTable(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/metadataSource:MetadataSource":
                return MetadataSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/monitor:Monitor":
                return Monitor(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/monitorFolder:MonitorFolder":
                return MonitorFolder(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/partition:Partition":
                return Partition(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/passwordPolicy:PasswordPolicy":
                return PasswordPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/pollingSource:PollingSource":
                return PollingSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/role:Role":
                return Role(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/s3AuditSource:S3AuditSource":
                return S3AuditSource(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/s3Source:S3Source":
                return S3Source(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/samlConfiguration:SamlConfiguration":
                return SamlConfiguration(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/scheduledView:ScheduledView":
                return ScheduledView(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/subdomain:Subdomain":
                return Subdomain(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "sumologic:index/user:User":
                return User(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("sumologic", "index/awsInventorySource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/awsXraySource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/cloudSyslogSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/cloudToCloudSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/cloudfrontSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/cloudtrailSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/cloudwatchSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/collector", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/collectorIngestBudgetAssignment", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/connection", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/content", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/dashboard", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/elbSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/field", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/fieldExtractionRule", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/folder", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/gcpSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/httpSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/ingestBudget", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/ingestBudgetV2", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/kinesisMetricsSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/lookupTable", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/metadataSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/monitor", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/monitorFolder", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/partition", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/passwordPolicy", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/pollingSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/role", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/s3AuditSource", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/s3Source", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/samlConfiguration", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/scheduledView", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/subdomain", _module_instance)
    pulumi.runtime.register_resource_module("sumologic", "index/user", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:sumologic":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("sumologic", Package())

_register_module()