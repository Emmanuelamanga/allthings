plugins {
	java
	id("org.springframework.boot") version "3.0.6"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.databaseproject"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	runtimeOnly("com.mysql:mysql-connector-j")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")

	implementation("javax.persistence:persistence-api:1.0.2")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	
}

tasks.withType<Test> {
	useJUnitPlatform()
}
