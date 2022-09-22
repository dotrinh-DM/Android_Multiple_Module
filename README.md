# 1. Export module: metaverse
#### add below to: Android_Multiple_Module/metaverse/build.gradle
    //export aar
    task jar(type: Jar, dependsOn: 'assembleRelease') {
        from fileTree(dir: 'build/intermediates/classes/release')
    }

#### run in terminal at root of proj
    bash gradlew jar
#### result:
    Android_Multiple_Module/metaverse/build/outputs/aar/metaverse-release.aar

# 2. Import module: metaverse
