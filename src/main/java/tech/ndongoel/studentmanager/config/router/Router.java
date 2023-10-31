/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.config.router;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import tech.ndongoel.studentmanager.config.helper.DateTimeCustomSerializer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class Router {

    @Bean
    RouterFunction<ServerResponse> hello() {
        return route(GET("/hello"),
                req -> ok().bodyValue(new Hello("Hello", "El Hadji NDONGO", LocalDateTime.now())));
    }

    record Hello(String message, String author, @JsonSerialize(using = DateTimeCustomSerializer.class) LocalDateTime date) {

    }
}
