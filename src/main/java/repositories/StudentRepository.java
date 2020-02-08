package repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import models.Student;

public interface  StudentRepository extends MongoRepository<Student, String>{
  Student getStudentByStudentNumer(int StudentNumber);
}
