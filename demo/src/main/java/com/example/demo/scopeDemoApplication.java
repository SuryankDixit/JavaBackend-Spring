package com.example.demo;

import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class scopeDemoApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(scopeDemoApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(basicDemoApplication.class, args);
        PersonDAO pd1 = applicationContext.getBean(PersonDAO.class);
        PersonDAO pd2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}",pd1);
        LOGGER.info("{}",pd1.getJdbcConnection());

        LOGGER.info("{}",pd2);
        LOGGER.info("{}",pd2.getJdbcConnection());
    }

}
