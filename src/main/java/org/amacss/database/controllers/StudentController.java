package org.amacss.database.controllers;

import java.util.List;
import org.amacss.database.models.Student;
import org.amacss.database.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private StudentRepository repository;
  
  @RequestMapping(value="/", method = RequestMethod.GET)
  public List<Student> getAllStudents(){
    return repository.findAll();
  }
  
  @RequestMapping(value="/{studentNumber}", method = RequestMethod.GET)
  public Student getStudentByStudentNumber(@PathVariable("studentNumber") int studentNumber) {
    return repository.findStudentByStudentNumber(studentNumber);
  }
}
