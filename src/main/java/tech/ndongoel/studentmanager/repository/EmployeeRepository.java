/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023     */
/* Project: student-manager       */

package tech.ndongoel.studentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ndongoel.studentmanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
