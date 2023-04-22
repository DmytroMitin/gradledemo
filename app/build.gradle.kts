plugins {
    scala

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.17")

    implementation("com.chuusai:shapeless_2.12:2.3.10")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

scala {
    zincVersion.set("1.8.0")
}

//https://stackoverflow.com/questions/54878493/scala-build-error-on-java-11-using-intellijidea
tasks.withType<ScalaCompile>() {
    targetCompatibility = ""
    scalaCompileOptions.additionalParameters = listOf("-target:17")
}

application {
    mainClass.set("gradledemo.App")
}
