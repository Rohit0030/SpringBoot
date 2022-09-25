package SpringBoot.demo.service;

import SpringBoot.demo.model.Student;
import SpringBoot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String add(Student student){
         repository.save(student);//insert Student data in DATABASE
        return "Student added successfully to DB........... :)";
    }
}
