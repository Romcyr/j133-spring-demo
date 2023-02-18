package pl.sda.j133.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.j133.demo.model.Student;
import pl.sda.j133.demo.service.StudentService;

import java.util.List;
//GET DELETE PATCH POST PUT

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
  private StudentService studentService;

  @GetMapping()
  public List<Student> getStudentList(){
    log.info("Ktoś pyta o listę studentów.");
    return studentService.getAll();
  }
}
