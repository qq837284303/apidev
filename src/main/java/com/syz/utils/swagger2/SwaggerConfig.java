package com.syz.utils.swagger2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by K on 2020/2/17.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enabled}")
    private Boolean enabled;



    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("耀祖")
                .enable(enabled)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.syz.controller"))
                .build();//build 工厂模式
    }

    public ApiInfo apiInfo(){
        Contact contact = new Contact("Syz", "https://blog.csdn.net/qq_38648933", "837284303@qq.com");  //作者信息
        return new ApiInfoBuilder()
                .title("微信小程序api接口文档")
                .contact(contact)
                .build();
//        return new ApiInfo(
//                "微信小程序API开发",
//                "record YZ api",
//                "1.0",
//                "https://blog.csdn.net/qq_38648933",
//                new Contact("", "", ""),
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0",
//                new ArrayList<VendorExtension>());

    }
}
