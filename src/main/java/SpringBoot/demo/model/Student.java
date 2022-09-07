package SpringBoot.demo.model;

public class Student {
    String name;
    int age;
    String course;

    // Parameterize Constructor .....> right click nd select generate then select constructor


    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    // Second Class in one class
    public static class Employee{
        String name;
        int age;
        String Department;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            Department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDepartment() {
            return Department;
        }

        public void setDepartment(String department) {
            Department = department;
        }
    }
}
