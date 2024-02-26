plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "co.kr.hoigas.mvvm.template"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        applicationId = "co.kr.hoigas.mvvm.template"
        minSdk = SdkVersions.minSdk
        targetSdk = SdkVersions.targetSdk
        versionCode = AppVersions.androidVersionCode
        versionName = AppVersions.androidVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation (project (":domain"))
    implementation (project (":data"))
    implementation (project (":presentation"))
    implementation (project (":core"))

    testImplementation(Dependency.TestTool.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.TEST_JUNIT)
}