# Configs for SQL SERVER

## Aplication

```bash
spring.datasource.url=jdbc:sqlserver://localhost;databaseName=master
spring.datasource.username=sa
spring.datasource.password=12345
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServer2012Dialect
spring.jpa.hibernate.ddl-auto = create-drop
```

## Pom

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>com.microsoft.sqlserver</groupId>
			<artifactId>mssql-jdbc</artifactId>
			<scope>runtime</scope>
		</dependency>
```

## SQL common props

```java
import javax.persistence.*;

@Entity
@Table(name = "table here")
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

```

