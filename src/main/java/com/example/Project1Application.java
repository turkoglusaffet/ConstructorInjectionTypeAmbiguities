package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Person;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Person.xml"});
		Person person = (Person) context.getBean("PersonBean");
		System.out.println(person);

	}
}
