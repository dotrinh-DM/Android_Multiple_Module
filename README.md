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
#### add below to: Android_Multiple_Module/app/build.gradle
    implementation project(path: ':metaverse')

#### add below to: libs folder
    add: Android_Multiple_Module/metaverse/build/outputs/aar/metaverse-release.aar
    to: abc/app/libs/metaverse-release.aar
    (Switching Project view to Project mode (not Android mode) and after that add aar/jar to libs folder (or any folder))
    