package in.karthik.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Profile({"default","qa"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
.apis(RequestHandlerSelectors.basePackage("in.karthik"))
				.paths(PathSelectors.ant("/api/**"))
				.build()
				//.apiInfo(apiInfo())
				;
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"EMPLOYEE APP", 
				"SAMPLE", 
				"3.2GA", 
				"http://karthik.in", 
				new Contact("karthik", "http://abcd.com", "karthik@gmail.com"), 
				"PS", "http://pentagonspace.in",
				Collections.emptyList());
	}
}
