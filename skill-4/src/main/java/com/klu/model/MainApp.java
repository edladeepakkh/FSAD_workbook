package com.klu.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        Student student = context.getBean("student", Student.class);
        student.display();
    }
}
