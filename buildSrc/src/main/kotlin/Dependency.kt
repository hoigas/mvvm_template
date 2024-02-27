import Versions.LIFECYCLE_VERSION
import Versions.NAV_VERSION

object Versions {
    const val LIFECYCLE_VERSION = "2.7.0"
    const val NAV_VERSION = "2.7.7"
}

object Dependency {
    object AndroidX {
        const val ACTIVITY = "androidx.activity:activity-compose:1.8.2"

    }

    object Compose {
        const val BOM = "androidx.compose:compose-bom:2023.08.00" // BOM(Bill of Materials) 버전만 지정하여 모든 Compose 라이브러리의 버전을 관리
        const val UI = "androidx.compose.ui:ui"
        const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val MATERIAL3 = "androidx.compose.material3:material3"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:1.12.0"
        const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$LIFECYCLE_VERSION"
    }

    object TestTool {
        const val JUNIT = "junit:junit:4.13.2"
    }

    object AndroidTest {
        const val TEST_JUNIT = "androidx.test.ext:junit:1.1.5"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object AndroidTestCompose {
        const val TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
    }

    object DebugCompose {
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling"
        const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }

    object DaggerHilt {}

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
        const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object OkHttp {
        const val BOM = "com.squareup.okhttp3:okhttp-bom:4.12.0"
        const val OKHTTP = "com.squareup.okhttp3:okhttp"
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor"
    }

    object Coroutines {
        const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0"
    }

    object NavComponent {
    }
}
