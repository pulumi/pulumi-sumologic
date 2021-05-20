import * as pulumi from "@pulumi/pulumi";
import * as sumologic from "@pulumi/sumologic";

const personalFolder = pulumi.output(sumologic.getPersonalFolder())
const folder = new sumologic.Folder("folder", {
    description: "A test folder",
    parentId: personalFolder.id,
});
export const folderName = folder.name;