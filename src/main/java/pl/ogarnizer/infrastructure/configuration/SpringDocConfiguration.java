package pl.ogarnizer.infrastructure.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.ogarnizer.OgarnizerAPIApplication;

@Configuration
public class SpringDocConfiguration {
    @Bean
    public GroupedOpenApi groupedOpenApi(){
        return GroupedOpenApi.builder()
                .group("default")
                .pathsToMatch("/**")
                .packagesToScan(OgarnizerAPIApplication.class.getPackageName())
                .build();
    }

    @Bean
    public OpenAPI springDocOpenApi(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Ogarnizer Random Data application")
                        .contact(contact())
                        .version("1.0")
                );
    }

    private Contact contact(){
        return new Contact()
                .name("Maciej Przestrzelski")
                .email("przestrzelski.maciej1@gmail.com");
    }
}
