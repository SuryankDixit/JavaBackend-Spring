package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration	// java way of doing spring app
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		// Creates new Application Context
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		applicationContext.close();
	}
}