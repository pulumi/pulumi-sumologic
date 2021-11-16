module github.com/pulumi/pulumi-sumologic/provider

go 1.16

replace (
	github.com/SumoLogic/terraform-provider-sumologic => github.com/pulumi/terraform-provider-sumologic v0.0.0-20211116140311-c2043c5cef8d
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)

require (
	github.com/SumoLogic/terraform-provider-sumologic v0.0.0-20210426212630-3d1ee33f0f3a
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)
