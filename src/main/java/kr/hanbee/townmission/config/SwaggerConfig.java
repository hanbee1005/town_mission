package kr.hanbee.townmission.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "town mission API",
                version = "v1",
                description = "ref - townMission-API",
                contact = @Contact(name = "Hanbee Son",
                        email = "sonhanbi1002@gmail.com",
                        url = "www.example.com"
                )
        ),
        servers = {
                @Server(url = "http://localhost:9090/app", description = "local-server"),
        },
        security = {
                @SecurityRequirement(name = "bearerToken"),
        }
)

@SecuritySchemes({
        @SecurityScheme(
                name = "bearerToken",
                type = SecuritySchemeType.HTTP,
                scheme = "bearer",
                bearerFormat = "JWT"
        ),
})
@Configuration
public class SwaggerConfig {
    String[] loginPaths = {"/api/auth/**"};
    String[] allPaths = {"/**"};

    @Bean
    public GroupedOpenApi authOpenApi() {
        return GroupedOpenApi.builder().group("auth-API").pathsToMatch(loginPaths).build();
    }

    @Bean
    public GroupedOpenApi allOpenApi() {
        return GroupedOpenApi.builder().group("all-API").pathsToMatch(allPaths).build();
    }

}