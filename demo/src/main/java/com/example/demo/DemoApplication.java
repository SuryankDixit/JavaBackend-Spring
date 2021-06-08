package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication		// automatically scans packages and subpackages where this is in
public class DemoApplication {

	public static void main(String[] args) {
		/*
			tut1 : without using any annotations
			BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
			int idx = bs.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 3);
			System.out.println(idx);
		 */

		/*
			tut2
			1.	What are the beans: @Component(binary search and sort)
			2.	What are the dependencies of a bean :@Autowired:(sort algo for binary search)
			3.	Where to search for beans : @ComponentScan	// no need to do this
			All the beans will be managed by Application Context
		 */
		// run method returns application context back;
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 3));
		
	}

}
