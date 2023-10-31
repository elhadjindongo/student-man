/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import tech.ndongoel.studentmanager.entity.Employee;
import tech.ndongoel.studentmanager.services.EmployeeServices;

@Component
@RequiredArgsConstructor
public class EmployeeHandler {

    private final EmployeeServices employeeService;


    public  Mono<ServerResponse> getAll(ServerRequest req) {
        return ServerResponse.ok().bodyValue(this.employeeService.getAll());
    }
}
