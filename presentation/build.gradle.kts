plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "co.kr.hoigas.mvvm.presentation"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        minSdk = SdkVersions.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
    }
}

dependencies {
    implementation (project (":domain"))
    implementation (project (":data"))
    implementation (project (":core"))

    implementation(Dependency.KTX.CORE)
    implementation(Dependency.KTX.LIFECYCLE_RUNTIME)

    implementation(Dependency.AndroidX.ACTIVITY)

    implementation(platform(Dependency.Compose.BOM))
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.UI_GRAPHICS)
    implementation(Dependency.Compose.UI_TOOLING_PREVIEW)
    implementation(Dependency.Compose.MATERIAL3)

    testImplementation(Dependency.TestTool.JUNIT)

    androidTestImplementation(Dependency.AndroidTest.TEST_JUNIT)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO_CORE)

    androidTestImplementation(platform(Dependency.Compose.BOM))
    androidTestImplementation(Dependency.AndroidTestCompose.TEST_JUNIT4)
    debugImplementation(Dependency.DebugCompose.UI_TOOLING)
    debugImplementation(Dependency.DebugCompose.UI_TEST_MANIFEST)
}