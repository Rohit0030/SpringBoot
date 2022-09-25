package SpringBoot.demo.controller;

import SpringBoot.demo.model.Student;
import SpringBoot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDBContoller {
    @Autowired
    StudentService service;
    // C
    @PostMapping("/add_stu_db")
    public String add_Student(@RequestBody Student student){
        return service.add(student);
    }
}
