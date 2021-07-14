package vip.ph.mongo.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Just be alive
 * @version 1.0
 * @date 2021年04月18日 20:22
 */
@Configuration
@EnableOpenApi
public class Swagger3Config implements WebMvcConfigurer {

    private final SwaggerProperties swaggerProperties;

    public Swagger3Config(SwaggerProperties swaggerProperties) {
        this.swaggerProperties = swaggerProperties;
    }

    @Bean
    public Docket createRestApi(){

        Docket build = new Docket(DocumentationType.OAS_30).pathMapping("/")
                .groupName("胖虎")
                .enable(swaggerProperties.getEnable())
                .apiInfo(apiInfo())
                .host(swaggerProperties.getTryHost())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

        return build;
    }

    /**
     * API 页面上半部分展示信息
     * @return
     */
    private ApiInfo apiInfo(){

        ApiInfo apiInfo = new ApiInfoBuilder().title(swaggerProperties.getApplicationName() + "API Doc")
                .description(swaggerProperties.getApplicationDescription())
                .contact(new Contact("Just", "https://www.baidu.com", "123456789@qq.com"))
                .version(swaggerProperties.getApplicationVersion())
                .build();
        return apiInfo;
    }


}