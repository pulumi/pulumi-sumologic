// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the ability to create, read, delete, and update [Monitors](https://help.sumologic.com/?cid=10020).
//
// ## Example SLO Monitors
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := sumologic.NewMonitor(ctx, "tfSloMonitor1", &sumologic.MonitorArgs{
// 			ContentType:     pulumi.String("Monitor"),
// 			EvaluationDelay: pulumi.String("5m"),
// 			IsDisabled:      pulumi.Bool(false),
// 			MonitorType:     pulumi.String("Slo"),
// 			Notifications: MonitorNotificationArray{
// 				&MonitorNotificationArgs{
// 					Notification: &MonitorNotificationNotificationArgs{
// 						ConnectionType: pulumi.String("Email"),
// 						MessageBody:    pulumi.String("Triggered {{TriggerType}} Alert on {{Name}}: {{QueryURL}}"),
// 						Recipients: pulumi.StringArray{
// 							pulumi.String("abc@example.com"),
// 						},
// 						Subject:  pulumi.String("Monitor Alert: {{TriggerType}} on {{Name}}"),
// 						TimeZone: pulumi.String("PST"),
// 					},
// 					RunForTriggerTypes: pulumi.StringArray{
// 						pulumi.String("Critical"),
// 						pulumi.String("ResolvedCritical"),
// 					},
// 				},
// 			},
// 			Playbook: pulumi.String("test playbook"),
// 			SloId:    pulumi.String("0000000000000009"),
// 			TriggerConditions: &MonitorTriggerConditionsArgs{
// 				SloSliCondition: &MonitorTriggerConditionsSloSliConditionArgs{
// 					Critical: &MonitorTriggerConditionsSloSliConditionCriticalArgs{
// 						SliThreshold: pulumi.Float64(99.5),
// 					},
// 					Warning: &MonitorTriggerConditionsSloSliConditionWarningArgs{
// 						SliThreshold: pulumi.Float64(99.9),
// 					},
// 				},
// 			},
// 			Type: pulumi.String("MonitorsLibraryMonitor"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = sumologic.NewMonitor(ctx, "tfSloMonitor2", &sumologic.MonitorArgs{
// 			ContentType:     pulumi.String("Monitor"),
// 			EvaluationDelay: pulumi.String("5m"),
// 			IsDisabled:      pulumi.Bool(false),
// 			MonitorType:     pulumi.String("Slo"),
// 			SloId:           pulumi.String("0000000000000009"),
// 			TriggerConditions: &MonitorTriggerConditionsArgs{
// 				SloBurnRateCondition: &MonitorTriggerConditionsSloBurnRateConditionArgs{
// 					Critical: &MonitorTriggerConditionsSloBurnRateConditionCriticalArgs{
// 						BurnRateThreshold: pulumi.Float64(10),
// 						TimeRange:         pulumi.String("1d"),
// 					},
// 					Warning: &MonitorTriggerConditionsSloBurnRateConditionWarningArgs{
// 						BurnRateThreshold: pulumi.Float64(5),
// 						TimeRange:         pulumi.String("1d"),
// 					},
// 				},
// 			},
// 			Type: pulumi.String("MonitorsLibraryMonitor"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Monitor Folders
//
// <<<<<<< HEAD
// NOTE: Monitor folders are considered a different resource from Library content folders.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := sumologic.NewMonitorFolder(ctx, "tfMonitorFolder1", &sumologic.MonitorFolderArgs{
// 			Description: pulumi.String("a folder for monitors"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// =======
// NOTE: Monitor folders are considered a different resource from Library content folders. See [MonitorFolder][2] for more details.
// > > > > > > > v2.11.0
//
// ## The `triggerConditions` block
//
// A `triggerConditions` block configures conditions for sending notifications.
// ### Example
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
// ### Arguments
// A `triggerConditions` block contains one or more subblocks of the following types:
// - `logsStaticCondition`
// - `metricsStaticCondition`
// - `logsOutlierCondition`
// - `metricsOutlierCondition`
// - `logsMissingDataCondition`
// - `metricsMissingDataCondition`
//
// Subblocks should be limited to at most 1 missing data condition and at most 1 static / outlier condition.
//
// Here is a summary of arguments for each condition type (fields which are not marked as `Required` are optional):
// #### logsStaticCondition
//   - `field`
//   - `critical`
//     - `timeRange` (Required)
//     - `alert` (Required)
//       - `threshold`
//       - `thresholdType`
//     - `resolution` (Required)
//       - `threshold`
//       - `thresholdType`
//   - `warning`
//     - `timeRange` (Required)
//     - `alert` (Required)
//       - `threshold`
//       - `thresholdType`
//     - `resolution` (Required)
//       - `threshold`
//       - `thresholdType`
// #### metricsStaticCondition
//   - `critical`
//     - `timeRange` (Required)
//     - `occurrenceType` (Required)
//     - `alert` (Required)
//       - `threshold`
//       - `thresholdType`
//     - `resolution` (Required)
//       - `threshold`
//       - `thresholdType`
//   - `warning`
//     - `timeRange` (Required)
//     - `occurrenceType` (Required)
//     - `alert` (Required)
//       - `threshold`
//       - `thresholdType`
//     - `resolution` (Required)
//       - `threshold`
//       - `thresholdType`
// #### logsOutlierCondition
//   - `field`
//   - `direction`
//   - `critical`
//      - `window`
//      - `consecutive`
//      - `threshold`
//   - `warning`
//      - `window`
//      - `consecutive`
//      - `threshold`
// #### metricsOutlierCondition
//   - `direction`
//   - `critical`
//      - `baselineWindow`
//      - `threshold`
//   - `warning`
//     - `baselineWindow`
//     - `threshold`
// #### logsMissingDataCondition
//   - `timeRange` (Required)
// #### metricsMissingDataCondition
//   - `timeRange` (Required)
//   - `triggerSource` (Required)
// #### sloSliCondition
//   - `critical`
//     - `sliThreshold` (Required) : The remaining SLI error budget threshold percentage [0,100).
//   - `warning`
//     - `sliThreshold` (Required)
//
// #### sloBurnRateCondition
//   - `critical`
//     - `timeRange` (Required) : The relative time range for the burn rate percentage evaluation.
//     - `burnRateThreshold` (Required) : The burn rate percentage threshold.
//   - `warning`
//     - `timeRange` (Required)
//     - `burnRateThreshold` (Required)
//
// ## The `triggers` block
//
// The `triggers` block is deprecated. Please use `triggerConditions` to specify notification conditions.
//
// Here's an example logs monitor that uses `triggers` to specify trigger conditions:
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := sumologic.NewMonitor(ctx, "tfLogsMonitor1", &sumologic.MonitorArgs{
// 			ContentType: pulumi.String("Monitor"),
// 			Description: pulumi.String("tf logs monitor"),
// 			IsDisabled:  pulumi.Bool(false),
// 			MonitorType: pulumi.String("Logs"),
// 			Notifications: MonitorNotificationArray{
// 				&MonitorNotificationArgs{
// 					Notification: &MonitorNotificationNotificationArgs{
// 						ConnectionType: pulumi.String("Email"),
// 						MessageBody:    pulumi.String("Triggered {{TriggerType}} Alert on {{Name}}: {{QueryURL}}"),
// 						Recipients: pulumi.StringArray{
// 							pulumi.String("abc@example.com"),
// 						},
// 						Subject:  pulumi.String("Monitor Alert: {{TriggerType}} on {{Name}}"),
// 						TimeZone: pulumi.String("PST"),
// 					},
// 					RunForTriggerTypes: pulumi.StringArray{
// 						pulumi.String("Critical"),
// 						pulumi.String("ResolvedCritical"),
// 					},
// 				},
// 				&MonitorNotificationArgs{
// 					Notification: &MonitorNotificationNotificationArgs{
// 						ConnectionId:   pulumi.String("0000000000ABC123"),
// 						ConnectionType: pulumi.String("Webhook"),
// 					},
// 					RunForTriggerTypes: pulumi.StringArray{
// 						pulumi.String("Critical"),
// 						pulumi.String("ResolvedCritical"),
// 					},
// 				},
// 			},
// 			Queries: MonitorQueryArray{
// 				&MonitorQueryArgs{
// 					Query: pulumi.String("_sourceCategory=event-action info"),
// 					RowId: pulumi.String("A"),
// 				},
// 			},
// 			Triggers: MonitorTriggerArray{
// 				&MonitorTriggerArgs{
// 					DetectionMethod: pulumi.String("StaticCondition"),
// 					OccurrenceType:  pulumi.String("ResultCount"),
// 					Threshold:       pulumi.Float64(40),
// 					ThresholdType:   pulumi.String("GreaterThan"),
// 					TimeRange:       pulumi.String("15m"),
// 					TriggerSource:   pulumi.String("AllResults"),
// 					TriggerType:     pulumi.String("Critical"),
// 				},
// 				&MonitorTriggerArgs{
// 					DetectionMethod: pulumi.String("StaticCondition"),
// 					OccurrenceType:  pulumi.String("ResultCount"),
// 					Threshold:       pulumi.Float64(40),
// 					ThresholdType:   pulumi.String("LessThanOrEqual"),
// 					TimeRange:       pulumi.String("15m"),
// 					TriggerSource:   pulumi.String("AllResults"),
// 					TriggerType:     pulumi.String("ResolvedCritical"),
// 				},
// 			},
// 			Type: pulumi.String("MonitorsLibraryMonitor"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Monitors can be imported using the monitor ID, such ashcl
//
// ```sh
//  $ pulumi import sumologic:index/monitor:Monitor test 1234567890
// ```
//
//  [1]https://help.sumologic.com/?cid=10020 [2]monitor_folder.html.markdown
type Monitor struct {
	pulumi.CustomResourceState

	// The display name when creating alerts. Monitor name will be used if `alertName` is not provided. All template variables can be used in `alertName` except `{{AlertName}}` and `{{ResultsJson}}`.
	AlertName pulumi.StringPtrOutput `pulumi:"alertName"`
	// The type of the content object. Valid value:
	// - `Monitor`
	ContentType pulumi.StringPtrOutput `pulumi:"contentType"`
	CreatedAt   pulumi.StringOutput    `pulumi:"createdAt"`
	CreatedBy   pulumi.StringOutput    `pulumi:"createdBy"`
	// The description of the monitor.
	Description     pulumi.StringPtrOutput `pulumi:"description"`
	EvaluationDelay pulumi.StringOutput    `pulumi:"evaluationDelay"`
	// Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
	GroupNotifications pulumi.BoolPtrOutput `pulumi:"groupNotifications"`
	// Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
	IsDisabled pulumi.BoolPtrOutput `pulumi:"isDisabled"`
	IsLocked   pulumi.BoolOutput    `pulumi:"isLocked"`
	IsMutable  pulumi.BoolOutput    `pulumi:"isMutable"`
	IsSystem   pulumi.BoolOutput    `pulumi:"isSystem"`
	ModifiedAt pulumi.StringOutput  `pulumi:"modifiedAt"`
	ModifiedBy pulumi.StringOutput  `pulumi:"modifiedBy"`
	// The type of monitor. Valid values:
	// - `Logs`: A logs query monitor.
	// - `Metrics`: A metrics query monitor.
	// - `Slo`: A SLO based monitor  (beta).
	MonitorType pulumi.StringOutput `pulumi:"monitorType"`
	// The name of the monitor. The name must be alphanumeric.
	Name pulumi.StringOutput `pulumi:"name"`
	// The notifications the monitor will send when the respective trigger condition is met.
	Notifications MonitorNotificationArrayOutput `pulumi:"notifications"`
	// The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
	ParentId pulumi.StringOutput `pulumi:"parentId"`
	// Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
	Playbook       pulumi.StringPtrOutput `pulumi:"playbook"`
	PostRequestMap pulumi.StringMapOutput `pulumi:"postRequestMap"`
	// All queries from the monitor.
	Queries MonitorQueryArrayOutput `pulumi:"queries"`
	// Identifier of the SLO definition for the monitor. This is only applicable & required for Slo `monitorType`.
	SloId pulumi.StringPtrOutput `pulumi:"sloId"`
	// The current status for this monitor. Values are:
	// - `Critical`
	// - `Warning`
	// - `MissingData`
	// - `Normal`
	// - `Disabled`
	Statuses pulumi.StringArrayOutput `pulumi:"statuses"`
	// Defines the conditions of when to send notifications. NOTE: `triggerConditions` supplants the `triggers` argument.
	TriggerConditions MonitorTriggerConditionsPtrOutput `pulumi:"triggerConditions"`
	// Defines the conditions of when to send notifications.
	//
	// Deprecated: The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
	Triggers MonitorTriggerArrayOutput `pulumi:"triggers"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryMonitor`
	Type    pulumi.StringPtrOutput `pulumi:"type"`
	Version pulumi.IntOutput       `pulumi:"version"`
}

// NewMonitor registers a new resource with the given unique name, arguments, and options.
func NewMonitor(ctx *pulumi.Context,
	name string, args *MonitorArgs, opts ...pulumi.ResourceOption) (*Monitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitorType == nil {
		return nil, errors.New("invalid value for required argument 'MonitorType'")
	}
	var resource Monitor
	err := ctx.RegisterResource("sumologic:index/monitor:Monitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitor gets an existing Monitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorState, opts ...pulumi.ResourceOption) (*Monitor, error) {
	var resource Monitor
	err := ctx.ReadResource("sumologic:index/monitor:Monitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Monitor resources.
type monitorState struct {
	// The display name when creating alerts. Monitor name will be used if `alertName` is not provided. All template variables can be used in `alertName` except `{{AlertName}}` and `{{ResultsJson}}`.
	AlertName *string `pulumi:"alertName"`
	// The type of the content object. Valid value:
	// - `Monitor`
	ContentType *string `pulumi:"contentType"`
	CreatedAt   *string `pulumi:"createdAt"`
	CreatedBy   *string `pulumi:"createdBy"`
	// The description of the monitor.
	Description     *string `pulumi:"description"`
	EvaluationDelay *string `pulumi:"evaluationDelay"`
	// Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
	GroupNotifications *bool `pulumi:"groupNotifications"`
	// Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
	IsDisabled *bool   `pulumi:"isDisabled"`
	IsLocked   *bool   `pulumi:"isLocked"`
	IsMutable  *bool   `pulumi:"isMutable"`
	IsSystem   *bool   `pulumi:"isSystem"`
	ModifiedAt *string `pulumi:"modifiedAt"`
	ModifiedBy *string `pulumi:"modifiedBy"`
	// The type of monitor. Valid values:
	// - `Logs`: A logs query monitor.
	// - `Metrics`: A metrics query monitor.
	// - `Slo`: A SLO based monitor  (beta).
	MonitorType *string `pulumi:"monitorType"`
	// The name of the monitor. The name must be alphanumeric.
	Name *string `pulumi:"name"`
	// The notifications the monitor will send when the respective trigger condition is met.
	Notifications []MonitorNotification `pulumi:"notifications"`
	// The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
	ParentId *string `pulumi:"parentId"`
	// Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
	Playbook       *string           `pulumi:"playbook"`
	PostRequestMap map[string]string `pulumi:"postRequestMap"`
	// All queries from the monitor.
	Queries []MonitorQuery `pulumi:"queries"`
	// Identifier of the SLO definition for the monitor. This is only applicable & required for Slo `monitorType`.
	SloId *string `pulumi:"sloId"`
	// The current status for this monitor. Values are:
	// - `Critical`
	// - `Warning`
	// - `MissingData`
	// - `Normal`
	// - `Disabled`
	Statuses []string `pulumi:"statuses"`
	// Defines the conditions of when to send notifications. NOTE: `triggerConditions` supplants the `triggers` argument.
	TriggerConditions *MonitorTriggerConditions `pulumi:"triggerConditions"`
	// Defines the conditions of when to send notifications.
	//
	// Deprecated: The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
	Triggers []MonitorTrigger `pulumi:"triggers"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryMonitor`
	Type    *string `pulumi:"type"`
	Version *int    `pulumi:"version"`
}

type MonitorState struct {
	// The display name when creating alerts. Monitor name will be used if `alertName` is not provided. All template variables can be used in `alertName` except `{{AlertName}}` and `{{ResultsJson}}`.
	AlertName pulumi.StringPtrInput
	// The type of the content object. Valid value:
	// - `Monitor`
	ContentType pulumi.StringPtrInput
	CreatedAt   pulumi.StringPtrInput
	CreatedBy   pulumi.StringPtrInput
	// The description of the monitor.
	Description     pulumi.StringPtrInput
	EvaluationDelay pulumi.StringPtrInput
	// Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
	GroupNotifications pulumi.BoolPtrInput
	// Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
	IsDisabled pulumi.BoolPtrInput
	IsLocked   pulumi.BoolPtrInput
	IsMutable  pulumi.BoolPtrInput
	IsSystem   pulumi.BoolPtrInput
	ModifiedAt pulumi.StringPtrInput
	ModifiedBy pulumi.StringPtrInput
	// The type of monitor. Valid values:
	// - `Logs`: A logs query monitor.
	// - `Metrics`: A metrics query monitor.
	// - `Slo`: A SLO based monitor  (beta).
	MonitorType pulumi.StringPtrInput
	// The name of the monitor. The name must be alphanumeric.
	Name pulumi.StringPtrInput
	// The notifications the monitor will send when the respective trigger condition is met.
	Notifications MonitorNotificationArrayInput
	// The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
	ParentId pulumi.StringPtrInput
	// Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
	Playbook       pulumi.StringPtrInput
	PostRequestMap pulumi.StringMapInput
	// All queries from the monitor.
	Queries MonitorQueryArrayInput
	// Identifier of the SLO definition for the monitor. This is only applicable & required for Slo `monitorType`.
	SloId pulumi.StringPtrInput
	// The current status for this monitor. Values are:
	// - `Critical`
	// - `Warning`
	// - `MissingData`
	// - `Normal`
	// - `Disabled`
	Statuses pulumi.StringArrayInput
	// Defines the conditions of when to send notifications. NOTE: `triggerConditions` supplants the `triggers` argument.
	TriggerConditions MonitorTriggerConditionsPtrInput
	// Defines the conditions of when to send notifications.
	//
	// Deprecated: The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
	Triggers MonitorTriggerArrayInput
	// The type of object model. Valid value:
	// - `MonitorsLibraryMonitor`
	Type    pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (MonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorState)(nil)).Elem()
}

type monitorArgs struct {
	// The display name when creating alerts. Monitor name will be used if `alertName` is not provided. All template variables can be used in `alertName` except `{{AlertName}}` and `{{ResultsJson}}`.
	AlertName *string `pulumi:"alertName"`
	// The type of the content object. Valid value:
	// - `Monitor`
	ContentType *string `pulumi:"contentType"`
	CreatedAt   *string `pulumi:"createdAt"`
	CreatedBy   *string `pulumi:"createdBy"`
	// The description of the monitor.
	Description     *string `pulumi:"description"`
	EvaluationDelay *string `pulumi:"evaluationDelay"`
	// Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
	GroupNotifications *bool `pulumi:"groupNotifications"`
	// Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
	IsDisabled *bool   `pulumi:"isDisabled"`
	IsLocked   *bool   `pulumi:"isLocked"`
	IsMutable  *bool   `pulumi:"isMutable"`
	IsSystem   *bool   `pulumi:"isSystem"`
	ModifiedAt *string `pulumi:"modifiedAt"`
	ModifiedBy *string `pulumi:"modifiedBy"`
	// The type of monitor. Valid values:
	// - `Logs`: A logs query monitor.
	// - `Metrics`: A metrics query monitor.
	// - `Slo`: A SLO based monitor  (beta).
	MonitorType string `pulumi:"monitorType"`
	// The name of the monitor. The name must be alphanumeric.
	Name *string `pulumi:"name"`
	// The notifications the monitor will send when the respective trigger condition is met.
	Notifications []MonitorNotification `pulumi:"notifications"`
	// The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
	ParentId *string `pulumi:"parentId"`
	// Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
	Playbook       *string           `pulumi:"playbook"`
	PostRequestMap map[string]string `pulumi:"postRequestMap"`
	// All queries from the monitor.
	Queries []MonitorQuery `pulumi:"queries"`
	// Identifier of the SLO definition for the monitor. This is only applicable & required for Slo `monitorType`.
	SloId *string `pulumi:"sloId"`
	// The current status for this monitor. Values are:
	// - `Critical`
	// - `Warning`
	// - `MissingData`
	// - `Normal`
	// - `Disabled`
	Statuses []string `pulumi:"statuses"`
	// Defines the conditions of when to send notifications. NOTE: `triggerConditions` supplants the `triggers` argument.
	TriggerConditions *MonitorTriggerConditions `pulumi:"triggerConditions"`
	// Defines the conditions of when to send notifications.
	//
	// Deprecated: The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
	Triggers []MonitorTrigger `pulumi:"triggers"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryMonitor`
	Type    *string `pulumi:"type"`
	Version *int    `pulumi:"version"`
}

// The set of arguments for constructing a Monitor resource.
type MonitorArgs struct {
	// The display name when creating alerts. Monitor name will be used if `alertName` is not provided. All template variables can be used in `alertName` except `{{AlertName}}` and `{{ResultsJson}}`.
	AlertName pulumi.StringPtrInput
	// The type of the content object. Valid value:
	// - `Monitor`
	ContentType pulumi.StringPtrInput
	CreatedAt   pulumi.StringPtrInput
	CreatedBy   pulumi.StringPtrInput
	// The description of the monitor.
	Description     pulumi.StringPtrInput
	EvaluationDelay pulumi.StringPtrInput
	// Whether or not to group notifications for individual items that meet the trigger condition. Defaults to true.
	GroupNotifications pulumi.BoolPtrInput
	// Whether or not the monitor is disabled. Disabled monitors will not run and will not generate or send notifications.
	IsDisabled pulumi.BoolPtrInput
	IsLocked   pulumi.BoolPtrInput
	IsMutable  pulumi.BoolPtrInput
	IsSystem   pulumi.BoolPtrInput
	ModifiedAt pulumi.StringPtrInput
	ModifiedBy pulumi.StringPtrInput
	// The type of monitor. Valid values:
	// - `Logs`: A logs query monitor.
	// - `Metrics`: A metrics query monitor.
	// - `Slo`: A SLO based monitor  (beta).
	MonitorType pulumi.StringInput
	// The name of the monitor. The name must be alphanumeric.
	Name pulumi.StringPtrInput
	// The notifications the monitor will send when the respective trigger condition is met.
	Notifications MonitorNotificationArrayInput
	// The ID of the Monitor Folder that contains this monitor. Defaults to the root folder.
	ParentId pulumi.StringPtrInput
	// Notes such as links and instruction to help you resolve alerts triggered by this monitor. {{Markdown}} supported. It will be enabled only if available for your organization. Please contact your Sumo Logic account team to learn more.
	Playbook       pulumi.StringPtrInput
	PostRequestMap pulumi.StringMapInput
	// All queries from the monitor.
	Queries MonitorQueryArrayInput
	// Identifier of the SLO definition for the monitor. This is only applicable & required for Slo `monitorType`.
	SloId pulumi.StringPtrInput
	// The current status for this monitor. Values are:
	// - `Critical`
	// - `Warning`
	// - `MissingData`
	// - `Normal`
	// - `Disabled`
	Statuses pulumi.StringArrayInput
	// Defines the conditions of when to send notifications. NOTE: `triggerConditions` supplants the `triggers` argument.
	TriggerConditions MonitorTriggerConditionsPtrInput
	// Defines the conditions of when to send notifications.
	//
	// Deprecated: The field `triggers` is deprecated and will be removed in a future release of the provider -- please use `trigger_conditions` instead.
	Triggers MonitorTriggerArrayInput
	// The type of object model. Valid value:
	// - `MonitorsLibraryMonitor`
	Type    pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (MonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorArgs)(nil)).Elem()
}

type MonitorInput interface {
	pulumi.Input

	ToMonitorOutput() MonitorOutput
	ToMonitorOutputWithContext(ctx context.Context) MonitorOutput
}

func (*Monitor) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (i *Monitor) ToMonitorOutput() MonitorOutput {
	return i.ToMonitorOutputWithContext(context.Background())
}

func (i *Monitor) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorOutput)
}

// MonitorArrayInput is an input type that accepts MonitorArray and MonitorArrayOutput values.
// You can construct a concrete instance of `MonitorArrayInput` via:
//
//          MonitorArray{ MonitorArgs{...} }
type MonitorArrayInput interface {
	pulumi.Input

	ToMonitorArrayOutput() MonitorArrayOutput
	ToMonitorArrayOutputWithContext(context.Context) MonitorArrayOutput
}

type MonitorArray []MonitorInput

func (MonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
}

func (i MonitorArray) ToMonitorArrayOutput() MonitorArrayOutput {
	return i.ToMonitorArrayOutputWithContext(context.Background())
}

func (i MonitorArray) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorArrayOutput)
}

// MonitorMapInput is an input type that accepts MonitorMap and MonitorMapOutput values.
// You can construct a concrete instance of `MonitorMapInput` via:
//
//          MonitorMap{ "key": MonitorArgs{...} }
type MonitorMapInput interface {
	pulumi.Input

	ToMonitorMapOutput() MonitorMapOutput
	ToMonitorMapOutputWithContext(context.Context) MonitorMapOutput
}

type MonitorMap map[string]MonitorInput

func (MonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (i MonitorMap) ToMonitorMapOutput() MonitorMapOutput {
	return i.ToMonitorMapOutputWithContext(context.Background())
}

func (i MonitorMap) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorMapOutput)
}

type MonitorOutput struct{ *pulumi.OutputState }

func (MonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (o MonitorOutput) ToMonitorOutput() MonitorOutput {
	return o
}

func (o MonitorOutput) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return o
}

type MonitorArrayOutput struct{ *pulumi.OutputState }

func (MonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
}

func (o MonitorArrayOutput) ToMonitorArrayOutput() MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) Index(i pulumi.IntInput) MonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].([]*Monitor)[vs[1].(int)]
	}).(MonitorOutput)
}

type MonitorMapOutput struct{ *pulumi.OutputState }

func (MonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (o MonitorMapOutput) ToMonitorMapOutput() MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) MapIndex(k pulumi.StringInput) MonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].(map[string]*Monitor)[vs[1].(string)]
	}).(MonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorInput)(nil)).Elem(), &Monitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorArrayInput)(nil)).Elem(), MonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorMapInput)(nil)).Elem(), MonitorMap{})
	pulumi.RegisterOutputType(MonitorOutput{})
	pulumi.RegisterOutputType(MonitorArrayOutput{})
	pulumi.RegisterOutputType(MonitorMapOutput{})
}
