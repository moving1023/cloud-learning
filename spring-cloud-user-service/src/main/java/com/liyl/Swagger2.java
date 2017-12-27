package com.liyl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.RequestHandlerProvider;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: 李毅霖.
 * @Description: Swagger2 配置类
 * @Date: 2017/12/27
 * @Modified by .
 */
@Configuration
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
						.apiInfo(apiInfo())
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.liyl.controller"))
						.paths(PathSelectors.any())
						.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
					.title("springboot利用swagger构建api文档")
					.description("简单优雅的restfun风格，http://blog.csdn.net/saytime")
					.termsOfServiceUrl("http://blog.csdn.net/saytime")
					.version("1.0.0")
					.build();
	}
}
