/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.config.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import tech.ndongoel.studentmanager.handler.EmployeeHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EmployeeRouter {
    @Bean
    RouterFunction<ServerResponse> employee(EmployeeHandler employeeHandler) {
        return route(GET("/employee"), employeeHandler::getAll);
    }
}
