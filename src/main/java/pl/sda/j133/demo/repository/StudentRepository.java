package pl.sda.j133.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.j133.demo.model.Student;

/*
CRUD
CREATE (Save)
READ(FindAll, findById)
UPODATE (Save)
DELETE(DELETE,deleteById)
EXISTS
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
}
