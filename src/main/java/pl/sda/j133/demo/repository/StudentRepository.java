package pl.sda.j133.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.j133.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
