/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.config.router;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import tech.ndongoel.studentmanager.entity.Employee;
import tech.ndongoel.studentmanager.handler.EmployeeHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EmployeeRouter {
    @Bean
    @RouterOperation(
            method = RequestMethod.GET,
            path = "/employees",
            operation =
            @Operation(
                    description = "Find all employees",
                    operationId = "findEmployees",
                    tags = "Employees",
                    responses = {
                            @ApiResponse(
                                    responseCode = "200",
                                    description = "Not empty employee's list",
                                    content = {
                                            @Content(
                                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                                    array = @ArraySchema(schema = @Schema(implementation = Employee.class)))
                                    }),
                            @ApiResponse(
                                    responseCode = "400",
                                    description = "Empty employee's list",
                                    content = {
                                            @Content(
                                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                                    schema = @Schema(example = "Employee list is empty !"))
                                    })
                    }))
    RouterFunction<ServerResponse> employee(EmployeeHandler employeeHandler) {
        return route(GET("/employees"), req -> employeeHandler.findAll());
    }
}
