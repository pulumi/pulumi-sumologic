// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the ability to create, read, delete, and update folders for [Monitors](https://help.sumologic.com/?cid=10020).
// > If Fine Grain Permission (FGP) feature is enabled with Monitors Content at one's Sumo Logic account, one can also set those permission details under this monitor folder resource. For further details about FGP, please see this [Monitor Permission document](https://help.sumologic.com/Visualizations-and-Alerts/Alerts/Monitors#configure-permissions-to-monitors-folders).
//
// ## Example Monitor Folder
//
// NOTE: Monitor folders are considered a different resource from Library content folders.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sumologic.NewMonitorFolder(ctx, "tf_monitor_folder_1", &sumologic.MonitorFolderArgs{
//				Name:        pulumi.String("Terraform Managed Monitors"),
//				Description: pulumi.String("A folder for monitors managed by terraform."),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Monitor folders can be imported using the monitor folder identifier, such as:
//
// hcl
//
// ```sh
// $ pulumi import sumologic:index/monitorFolder:MonitorFolder tf_monitor_folder_1 0000000000ABC123
// ```
//
// [1]: https://help.sumologic.com/?cid=10020
// [2]: https://help.sumologic.com/Visualizations-and-Alerts/Alerts/Monitors#configure-permissions-to-monitors-folders
type MonitorFolder struct {
	pulumi.CustomResourceState

	ContentType pulumi.StringPtrOutput `pulumi:"contentType"`
	CreatedAt   pulumi.StringOutput    `pulumi:"createdAt"`
	CreatedBy   pulumi.StringOutput    `pulumi:"createdBy"`
	// The description of the monitor folder.
	Description pulumi.StringOutput  `pulumi:"description"`
	IsLocked    pulumi.BoolPtrOutput `pulumi:"isLocked"`
	IsMutable   pulumi.BoolOutput    `pulumi:"isMutable"`
	IsSystem    pulumi.BoolOutput    `pulumi:"isSystem"`
	ModifiedAt  pulumi.StringOutput  `pulumi:"modifiedAt"`
	ModifiedBy  pulumi.StringOutput  `pulumi:"modifiedBy"`
	// The name of the monitor folder. The name must be alphanumeric.
	Name pulumi.StringOutput `pulumi:"name"`
	// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
	ObjPermissions MonitorFolderObjPermissionArrayOutput `pulumi:"objPermissions"`
	// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
	ParentId       pulumi.StringOutput    `pulumi:"parentId"`
	PostRequestMap pulumi.StringMapOutput `pulumi:"postRequestMap"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryFolder`
	Type    pulumi.StringPtrOutput `pulumi:"type"`
	Version pulumi.IntOutput       `pulumi:"version"`
}

// NewMonitorFolder registers a new resource with the given unique name, arguments, and options.
func NewMonitorFolder(ctx *pulumi.Context,
	name string, args *MonitorFolderArgs, opts ...pulumi.ResourceOption) (*MonitorFolder, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MonitorFolder
	err := ctx.RegisterResource("sumologic:index/monitorFolder:MonitorFolder", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorFolder gets an existing MonitorFolder resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorFolder(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorFolderState, opts ...pulumi.ResourceOption) (*MonitorFolder, error) {
	var resource MonitorFolder
	err := ctx.ReadResource("sumologic:index/monitorFolder:MonitorFolder", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorFolder resources.
type monitorFolderState struct {
	ContentType *string `pulumi:"contentType"`
	CreatedAt   *string `pulumi:"createdAt"`
	CreatedBy   *string `pulumi:"createdBy"`
	// The description of the monitor folder.
	Description *string `pulumi:"description"`
	IsLocked    *bool   `pulumi:"isLocked"`
	IsMutable   *bool   `pulumi:"isMutable"`
	IsSystem    *bool   `pulumi:"isSystem"`
	ModifiedAt  *string `pulumi:"modifiedAt"`
	ModifiedBy  *string `pulumi:"modifiedBy"`
	// The name of the monitor folder. The name must be alphanumeric.
	Name *string `pulumi:"name"`
	// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
	ObjPermissions []MonitorFolderObjPermission `pulumi:"objPermissions"`
	// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
	ParentId       *string           `pulumi:"parentId"`
	PostRequestMap map[string]string `pulumi:"postRequestMap"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryFolder`
	Type    *string `pulumi:"type"`
	Version *int    `pulumi:"version"`
}

type MonitorFolderState struct {
	ContentType pulumi.StringPtrInput
	CreatedAt   pulumi.StringPtrInput
	CreatedBy   pulumi.StringPtrInput
	// The description of the monitor folder.
	Description pulumi.StringPtrInput
	IsLocked    pulumi.BoolPtrInput
	IsMutable   pulumi.BoolPtrInput
	IsSystem    pulumi.BoolPtrInput
	ModifiedAt  pulumi.StringPtrInput
	ModifiedBy  pulumi.StringPtrInput
	// The name of the monitor folder. The name must be alphanumeric.
	Name pulumi.StringPtrInput
	// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
	ObjPermissions MonitorFolderObjPermissionArrayInput
	// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
	ParentId       pulumi.StringPtrInput
	PostRequestMap pulumi.StringMapInput
	// The type of object model. Valid value:
	// - `MonitorsLibraryFolder`
	Type    pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (MonitorFolderState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorFolderState)(nil)).Elem()
}

type monitorFolderArgs struct {
	ContentType *string `pulumi:"contentType"`
	CreatedAt   *string `pulumi:"createdAt"`
	CreatedBy   *string `pulumi:"createdBy"`
	// The description of the monitor folder.
	Description string  `pulumi:"description"`
	IsLocked    *bool   `pulumi:"isLocked"`
	IsMutable   *bool   `pulumi:"isMutable"`
	IsSystem    *bool   `pulumi:"isSystem"`
	ModifiedAt  *string `pulumi:"modifiedAt"`
	ModifiedBy  *string `pulumi:"modifiedBy"`
	// The name of the monitor folder. The name must be alphanumeric.
	Name *string `pulumi:"name"`
	// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
	ObjPermissions []MonitorFolderObjPermission `pulumi:"objPermissions"`
	// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
	ParentId       *string           `pulumi:"parentId"`
	PostRequestMap map[string]string `pulumi:"postRequestMap"`
	// The type of object model. Valid value:
	// - `MonitorsLibraryFolder`
	Type    *string `pulumi:"type"`
	Version *int    `pulumi:"version"`
}

// The set of arguments for constructing a MonitorFolder resource.
type MonitorFolderArgs struct {
	ContentType pulumi.StringPtrInput
	CreatedAt   pulumi.StringPtrInput
	CreatedBy   pulumi.StringPtrInput
	// The description of the monitor folder.
	Description pulumi.StringInput
	IsLocked    pulumi.BoolPtrInput
	IsMutable   pulumi.BoolPtrInput
	IsSystem    pulumi.BoolPtrInput
	ModifiedAt  pulumi.StringPtrInput
	ModifiedBy  pulumi.StringPtrInput
	// The name of the monitor folder. The name must be alphanumeric.
	Name pulumi.StringPtrInput
	// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
	ObjPermissions MonitorFolderObjPermissionArrayInput
	// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
	ParentId       pulumi.StringPtrInput
	PostRequestMap pulumi.StringMapInput
	// The type of object model. Valid value:
	// - `MonitorsLibraryFolder`
	Type    pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (MonitorFolderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorFolderArgs)(nil)).Elem()
}

type MonitorFolderInput interface {
	pulumi.Input

	ToMonitorFolderOutput() MonitorFolderOutput
	ToMonitorFolderOutputWithContext(ctx context.Context) MonitorFolderOutput
}

func (*MonitorFolder) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorFolder)(nil)).Elem()
}

func (i *MonitorFolder) ToMonitorFolderOutput() MonitorFolderOutput {
	return i.ToMonitorFolderOutputWithContext(context.Background())
}

func (i *MonitorFolder) ToMonitorFolderOutputWithContext(ctx context.Context) MonitorFolderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorFolderOutput)
}

// MonitorFolderArrayInput is an input type that accepts MonitorFolderArray and MonitorFolderArrayOutput values.
// You can construct a concrete instance of `MonitorFolderArrayInput` via:
//
//	MonitorFolderArray{ MonitorFolderArgs{...} }
type MonitorFolderArrayInput interface {
	pulumi.Input

	ToMonitorFolderArrayOutput() MonitorFolderArrayOutput
	ToMonitorFolderArrayOutputWithContext(context.Context) MonitorFolderArrayOutput
}

type MonitorFolderArray []MonitorFolderInput

func (MonitorFolderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorFolder)(nil)).Elem()
}

func (i MonitorFolderArray) ToMonitorFolderArrayOutput() MonitorFolderArrayOutput {
	return i.ToMonitorFolderArrayOutputWithContext(context.Background())
}

func (i MonitorFolderArray) ToMonitorFolderArrayOutputWithContext(ctx context.Context) MonitorFolderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorFolderArrayOutput)
}

// MonitorFolderMapInput is an input type that accepts MonitorFolderMap and MonitorFolderMapOutput values.
// You can construct a concrete instance of `MonitorFolderMapInput` via:
//
//	MonitorFolderMap{ "key": MonitorFolderArgs{...} }
type MonitorFolderMapInput interface {
	pulumi.Input

	ToMonitorFolderMapOutput() MonitorFolderMapOutput
	ToMonitorFolderMapOutputWithContext(context.Context) MonitorFolderMapOutput
}

type MonitorFolderMap map[string]MonitorFolderInput

func (MonitorFolderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorFolder)(nil)).Elem()
}

func (i MonitorFolderMap) ToMonitorFolderMapOutput() MonitorFolderMapOutput {
	return i.ToMonitorFolderMapOutputWithContext(context.Background())
}

func (i MonitorFolderMap) ToMonitorFolderMapOutputWithContext(ctx context.Context) MonitorFolderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorFolderMapOutput)
}

type MonitorFolderOutput struct{ *pulumi.OutputState }

func (MonitorFolderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorFolder)(nil)).Elem()
}

func (o MonitorFolderOutput) ToMonitorFolderOutput() MonitorFolderOutput {
	return o
}

func (o MonitorFolderOutput) ToMonitorFolderOutputWithContext(ctx context.Context) MonitorFolderOutput {
	return o
}

func (o MonitorFolderOutput) ContentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringPtrOutput { return v.ContentType }).(pulumi.StringPtrOutput)
}

func (o MonitorFolderOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o MonitorFolderOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// The description of the monitor folder.
func (o MonitorFolderOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

func (o MonitorFolderOutput) IsLocked() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.BoolPtrOutput { return v.IsLocked }).(pulumi.BoolPtrOutput)
}

func (o MonitorFolderOutput) IsMutable() pulumi.BoolOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.BoolOutput { return v.IsMutable }).(pulumi.BoolOutput)
}

func (o MonitorFolderOutput) IsSystem() pulumi.BoolOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.BoolOutput { return v.IsSystem }).(pulumi.BoolOutput)
}

func (o MonitorFolderOutput) ModifiedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.ModifiedAt }).(pulumi.StringOutput)
}

func (o MonitorFolderOutput) ModifiedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.ModifiedBy }).(pulumi.StringOutput)
}

// The name of the monitor folder. The name must be alphanumeric.
func (o MonitorFolderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// `objPermission` construct represents a Permission Statement associated with this Folder. A set of `objPermission` constructs can be specified under a single Folder. An `objPermission` construct can be used to control permissions Explicitly associated with a Folder. But, it cannot be used to control permissions Inherited from a Parent / Ancestor Folder.  Default FGP would be still set to the Folder upon creation (e.g. the creating user would have full permission), even if no `objPermission` construct is specified at a Folder and the FGP feature is enabled at the account.
func (o MonitorFolderOutput) ObjPermissions() MonitorFolderObjPermissionArrayOutput {
	return o.ApplyT(func(v *MonitorFolder) MonitorFolderObjPermissionArrayOutput { return v.ObjPermissions }).(MonitorFolderObjPermissionArrayOutput)
}

// The identifier of the Monitor Folder that contains this Monitor Folder. Defaults to the root folder.
func (o MonitorFolderOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringOutput { return v.ParentId }).(pulumi.StringOutput)
}

func (o MonitorFolderOutput) PostRequestMap() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringMapOutput { return v.PostRequestMap }).(pulumi.StringMapOutput)
}

// The type of object model. Valid value:
// - `MonitorsLibraryFolder`
func (o MonitorFolderOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

func (o MonitorFolderOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *MonitorFolder) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type MonitorFolderArrayOutput struct{ *pulumi.OutputState }

func (MonitorFolderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorFolder)(nil)).Elem()
}

func (o MonitorFolderArrayOutput) ToMonitorFolderArrayOutput() MonitorFolderArrayOutput {
	return o
}

func (o MonitorFolderArrayOutput) ToMonitorFolderArrayOutputWithContext(ctx context.Context) MonitorFolderArrayOutput {
	return o
}

func (o MonitorFolderArrayOutput) Index(i pulumi.IntInput) MonitorFolderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorFolder {
		return vs[0].([]*MonitorFolder)[vs[1].(int)]
	}).(MonitorFolderOutput)
}

type MonitorFolderMapOutput struct{ *pulumi.OutputState }

func (MonitorFolderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorFolder)(nil)).Elem()
}

func (o MonitorFolderMapOutput) ToMonitorFolderMapOutput() MonitorFolderMapOutput {
	return o
}

func (o MonitorFolderMapOutput) ToMonitorFolderMapOutputWithContext(ctx context.Context) MonitorFolderMapOutput {
	return o
}

func (o MonitorFolderMapOutput) MapIndex(k pulumi.StringInput) MonitorFolderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorFolder {
		return vs[0].(map[string]*MonitorFolder)[vs[1].(string)]
	}).(MonitorFolderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorFolderInput)(nil)).Elem(), &MonitorFolder{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorFolderArrayInput)(nil)).Elem(), MonitorFolderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorFolderMapInput)(nil)).Elem(), MonitorFolderMap{})
	pulumi.RegisterOutputType(MonitorFolderOutput{})
	pulumi.RegisterOutputType(MonitorFolderArrayOutput{})
	pulumi.RegisterOutputType(MonitorFolderMapOutput{})
}
