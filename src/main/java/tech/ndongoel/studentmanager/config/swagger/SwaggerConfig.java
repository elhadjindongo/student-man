/* Created by El Hadji M. NDONGO  */
/* on 01 11 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI SwaggerConfiguration() {
        return new OpenAPI().info(
                new Info()
                        .title("Employee management APIs")
                        .version("1.0")
                        .description("Employee Management Documentation APIs v1.0")
        );

    }
}
