import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.6.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.6.0"
    id("com.google.cloud.tools.jib") version "3.1.4"
}

val mainClass = "br.com.felixgilioli.indicacaofilmes.adapter.ApplicationKt"

jib {
    to {
        image = "felixgilioli/indicacao-filmes"
    }
    container {
        ports = listOf("8081")
        mainClass = mainClass
    }
}


tasks.getByName<BootJar>("bootJar") {
    mainClass.set(mainClass)
}

dependencies {
    implementation(project(":application:core"))
    implementation(project(":application:port"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.keycloak:keycloak-spring-boot-starter")
    implementation(platform("org.keycloak.bom:keycloak-adapter-bom:15.0.2"))
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    runtimeOnly("org.postgresql:postgresql")
}