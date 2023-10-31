/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.config.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.ndongoel.studentmanager.entity.Employee;
import tech.ndongoel.studentmanager.entity.enums.Gender;
import tech.ndongoel.studentmanager.repository.EmployeeRepository;

import java.time.LocalDate;

@Configuration
public class DBInitializer {

    @Bean
    CommandLineRunner initDB(EmployeeRepository employeeRepository) {
        return args -> {
            System.out.println("*********************** DB Init *************************");
            employeeRepository.save(
                    new Employee(
                            "El Hadji", "NDONGO", "ndongoel@gtech.com", LocalDate.of(1996, 1, 15), Gender.MALE, "Software Engineer", "35k"));
            employeeRepository.save(
                    new Employee(
                            "Ousseynou", "NGOM", "ousseynou@gtech.com", LocalDate.of(1995, 6, 23), Gender.MALE, "Devops & Cloud Engineer", "30k"));
            employeeRepository.save(
                    new Employee(
                            "Amina", "NDIAYE", "amina@gtech.com", LocalDate.of(1999, 2, 11), Gender.FEMALE, "Digital Assistant", "29k"));

        };
    }
}
