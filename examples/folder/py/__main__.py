"""A Python Pulumi program"""

import pulumi
import pulumi_sumologic as sumologic

personal_folder = sumologic.get_personal_folder()

folder = sumologic.Folder("py-folder",
                          description="A test folder",
                          parent_id=personal_folder.id)

pulumi.export("folder-name", folder.name)