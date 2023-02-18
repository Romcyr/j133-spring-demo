package pl.sda.j133.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.j133.demo.model.Student;
import pl.sda.j133.demo.repository.StudentRepository;

import java.util.List;
@Slf4j
@Service

public class StudentService {
  private StudentRepository studentRepository;
  public StudentService (StudentRepository studentRepository){
    this.studentRepository = studentRepository;
  }

  public List<Student> getAll(){
    return studentRepository.findAll();
  }
  public void delete(Long studentId){
    studentRepository.deleteById(studentId);
  }
}
