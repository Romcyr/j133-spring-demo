package pl.sda.j133.demo.service;

import pl.sda.j133.demo.model.Student;
import pl.sda.j133.demo.repository.StudentRepository;

import java.util.List;

public class StudentService {
  private StudentRepository studentRepository;

  public List<Student> getAll(){
    return studentRepository.findAll();


  }
}
