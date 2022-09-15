package SpringBoot.demo.controller;


import SpringBoot.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {


    // access_spec return_type method_name() { CODE }

    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello, Welcome to Spring Boot .......");
    }


    @RequestMapping("/welcome")
    public String welcome(){

        return "Welcome to Spring boot Application .....";
    }

    @RequestMapping("/course")
    public ArrayList<String> getCourse(){

        ArrayList<String> course= new ArrayList<>();
        course.add("Java");
        course.add("Spring Boot");
        course.add("Microservices");

        return course;
    }

    @RequestMapping("/student")
    public Student getStudent(){

        return new Student("Rohit",23,"CS");
    }


    @RequestMapping("/get_first_student")
    public Student getFirstStudent(){

        ArrayList<Student> students= new ArrayList<>();
        Student obj= new Student("Rohit",23,"CS");
        Student obj2= new Student("Richa",21,"CS");
        Student obj3= new Student("Samyak",22,"CS");
        students.add(obj);
        students.add(obj2);
        students.add(obj3);

        return students.get(0);
    }

}
