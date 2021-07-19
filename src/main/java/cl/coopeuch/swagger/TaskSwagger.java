package cl.coopeuch.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class TaskSwagger {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("cl.coopeuch.controllers"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Tasks Service API",
				"Tasks Service API Description",
				"1.0.0",
				"https://www.coopeuch.cl/",
				new Contact("Manuel Guerrero", "https://www.coopeuch.cl/", "contacto@coopeuch.cl"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}
