/* Created by El Hadji M. NDONGO  */
/* on 31 10 2023 */
/* Project: student-manager */

package tech.ndongoel.studentmanager.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.ndongoel.studentmanager.entity.enums.Gender;

import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name",length = 150)
    private String lastName;

    private String email;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String qualification;

    private String salary;

    public Employee(String firstName, String lastName, String email, LocalDate dateOfBirth, Gender gender, String qualification, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.qualification = qualification;
        this.salary = salary;
    }
}
