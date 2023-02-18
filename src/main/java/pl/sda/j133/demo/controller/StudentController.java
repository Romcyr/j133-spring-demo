package pl.sda.j133.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.sda.j133.demo.model.Student;
import pl.sda.j133.demo.repository.StudentRepository;
import pl.sda.j133.demo.service.StudentService;

import java.util.List;
//GET DELETE PATCH POST PUT

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
  private StudentService studentService;
  public StudentController (StudentService studentService) {
    this.studentService = studentService;
  }

  //read
  // http://localhost:8080/student
  @GetMapping()
  public List<Student> getStudentList(){
    log.info("Ktoś pyta o listę studentów.");
    return studentService.getAll();
  }

  //delete
  // http://localhost:8080/studentId=1
  @DeleteMapping
  public void deleteStudent(@RequestParam Long studentId){
    studentService.delete(studentId);
  }

}
