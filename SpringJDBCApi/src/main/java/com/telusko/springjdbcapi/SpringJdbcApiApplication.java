package com.telusko.springjdbcapi;

import com.telusko.springjdbcapi.dao.ImplementerDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApiApplication.class, args);
        ImplementerDaoImpl dao = container.getBean(ImplementerDaoImpl.class);

        dao.getImplementerInfo().forEach(System.out::println);

    }

}
