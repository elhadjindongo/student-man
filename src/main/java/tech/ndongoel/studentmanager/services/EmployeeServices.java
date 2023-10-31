/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.ndongoel.studentmanager.entity.Employee;
import tech.ndongoel.studentmanager.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServices {

    private final EmployeeRepository employeeRepository;


    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }
}
