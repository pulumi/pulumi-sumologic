### Configure the Sumo Logic Provider
```hcl
# Setup authentication variables. See "Authentication" section for more details.
variable "sumologic_access_id" {
    type = string
    description = "Sumo Logic Access ID"
}
variable "sumologic_access_key" {
    type = string
    description = "Sumo Logic Access Key"
    sensitive = true
}

provider "sumologic" {
    access_id   = "${var.sumologic_access_id}"
    access_key  = "${var.sumologic_access_key}"
    environment = "us2"
}

# Create a collector
resource "sumologic_collector" "collector" {
    name = "MyCollector"
}

# Create a HTTP source
resource "sumologic_http_source" "http_source" {
    name         = "http-source"
    category     = "my/source/category"
    collector_id = "${sumologic_collector.collector.id}"
}
```
### Configure the Sumo Logic Provider in Admin Mode
```hcl
variable "sumologic_access_id" {
  type = string
  description = "Sumo Logic Access ID"
}
variable "sumologic_access_key" {
  type = string
  description = "Sumo Logic Access Key"
  sensitive = true
}
provider "sumologic" {
    access_id   = "${var.sumologic_access_id}"
    access_key  = "${var.sumologic_access_key}"
    environment = "us2"
    admin_mode  = true
}

# Look up the Admin Recommended Folder
data "sumologic_admin_recommended_folder" "folder" {}

# Create a folder underneath the Admin Recommended Folder (which requires Admin Mode)
resource "sumologic_folder" "test" {
    name        = "test"
    description = "A test folder"
    parent_id   = data.sumologic_admin_recommended_folder.folder.id
}
```