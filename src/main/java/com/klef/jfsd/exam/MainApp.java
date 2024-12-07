package com.klef.jfsd.exam;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Demonstrate Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Demonstrate Setter Autowiring
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
