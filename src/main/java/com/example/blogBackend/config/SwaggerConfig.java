package com.example.blogBackend.config;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setName("IDRA WEB PORTAL AND CMS (Java) Team");
        contact.setUrl("https://www.example.com");
        contact.setEmail("api.docs@co.cnsbd.com");
        License mitLicense = new License().name("MIT License").url("https://www.example.com/licenses/mit/");
        Info info = new Info()
                .title("Blog App")
                .version("1.0.0")
                .contact(contact)
                .description("This API exposes endpoints to manage Blog App (Java).")
                .termsOfService("https://www.example.com/terms")
                .license(mitLicense);
        return new OpenAPI()
                .info(info);
    }
}