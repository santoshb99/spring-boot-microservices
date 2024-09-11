package com.testlab.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Organization Service REST APIs",
				description = "Organization Service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Santosh",
						email = "santoshbehara.sb@gmail.com"
//						url="https://www.dummy.com"
				),
				license = @License(
						name = "Apache 2.0"
//						url="https://www.dummy.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Organization-Service Doc"
//				url="https://www.dummy.com"
		)
)

@SpringBootApplication
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
