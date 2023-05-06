package com.vladderugin.spring.rest;

import com.vladderugin.spring.rest.configuration.MyConfig;
import com.vladderugin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        System.out.println(communication.getAllEmployees());
//
//        System.out.println(communication.getEmployee(26));
//
//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
//        employee.setId(31);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(31);
    }
}
