package SpringBoot.demo.Controller;

import SpringBoot.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController // Step 1 use this annotation on top of class
public class DemoController {

    //Method to print "Hello Rohit welcome to the Spring Boot............" in console

    @RequestMapping("/hello")   //Step 2 use this annotation to create endpoint
    public void hello(){
        System.out.println("Hello Rohit welcome to the Spring Boot in console.................");
    }
    //Print out on Browser

    @RequestMapping("/welcome")
    public String welcome(){
        return "HEllo Rohit Welcome to the Spring boot on browser . . . . . . ... ";
    }

    @RequestMapping("/add")
    public String add(){
        int a = 50;
        int b = 20;
        return "sum of two number is "+(a + b);
    }
    @RequestMapping("/employee")
    public ArrayList<String> Employee(){
        ArrayList<String> name = new ArrayList<>();
        name.add("Rohit");
        name.add("Richa");
        name.add("Samyak");
        name.add("Gaurav");
        System.out.println("Employee names "+name); // Print in Console
        return name;                                // Print On Browser
    }
    @RequestMapping("/student")
    public Student getStudent(){
        return new Student("Rohit ",23, "Computer Science");
    }
    @RequestMapping("/getemployee")
    public Student.Employee getEmployee(){
        Student.Employee obj2= new Student.Employee("Rohan",23,"IT");
        Student.Employee obj3= new Student.Employee("Rohit",21,"CS");
        System.out.println(obj3);
        return obj2;
    }
    @RequestMapping("/getinpute")
    public String getinpute(@RequestParam String name ,@RequestParam String surname){

    return "The person name is: "+name+" "+surname;
    }
}
