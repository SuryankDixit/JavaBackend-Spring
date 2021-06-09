package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration    // java way of doing spring app
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);


        SomeCdiBusiness business =
				applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
	}
}