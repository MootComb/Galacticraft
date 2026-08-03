pluginManagement {
    repositories {
        mavenLocal {
            content {
                includeGroup("dev.galacticraft")
                includeGroup("dev.galacticraft.mojarn")
            }
        }
        maven("https://maven.fabricmc.net/") {
            name = "Fabric"
            content {
                includeGroup("net.fabricmc")
                includeGroup("net.fabricmc.fabric-api")
                includeGroup("fabric-loom")
            }
        }
        gradlePluginPortal()
    }
}

rootProject.name = "Galacticraft"
