package SpringBoot.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Step 1 use this annotation on top of class
public class DemoController {

    //Method to print "Hello Rohit welcome to the Spring Boot............" in console
    @RequestMapping("/hello") //Step 2 use this annotation to create endpoint
    public void hello(){
        System.out.println("Hello Rohit welcome to the Spring Boot in console..............");
    }
    //Print out on Browser
    @RequestMapping("/welcome")
    public String welcome(){
        return "HEllo Rohit Welcome to the Spring boot on browser . . . . . . . ";
    }

    @RequestMapping("/add")
    public String add(){
        int a = 50;
        int b = 20;
        return "sum of two number is "+(a + b);
    }

}
