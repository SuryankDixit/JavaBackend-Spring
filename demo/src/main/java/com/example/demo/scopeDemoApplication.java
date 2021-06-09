package com.example.demo;

import com.example.componentscan.ComponentDAO;
import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.components")
public class scopeDemoApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(scopeDemoApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(basicDemoApplication.class, args);
//        PersonDAO pd1 = applicationContext.getBean(PersonDAO.class);
//        PersonDAO pd2 = applicationContext.getBean(PersonDAO.class);
//
//        LOGGER.info("{}",pd1);
//        LOGGER.info("{}",pd1.getJdbcConnection());
//        LOGGER.info("{}",pd1.getJdbcConnection());
//
//        LOGGER.info("{}",pd2);
//        LOGGER.info("{}",pd2.getJdbcConnection());

        // Add component package name at top  only then spring boot will search for this bean in that package
        ComponentDAO cd = applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}",cd.getJdbcConnection());
    }

}
