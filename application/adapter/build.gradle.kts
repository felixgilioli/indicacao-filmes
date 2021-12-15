import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.6.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.6.0"
}

tasks.getByName<BootJar>("bootJar") {
    mainClass.set("br.com.felixgilioli.indicacaofilmes.adapter.ApplicationKt")
}

dependencies {
    implementation(project(":application:core"))
    implementation(project(":application:port"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.keycloak:keycloak-spring-boot-starter")
    implementation(platform("org.keycloak.bom:keycloak-adapter-bom:15.0.2"))
    implementation("org.springframework.boot:spring-boot-starter-security")
}