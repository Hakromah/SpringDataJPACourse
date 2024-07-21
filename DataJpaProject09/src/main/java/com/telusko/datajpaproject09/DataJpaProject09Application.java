package com.telusko.datajpaproject09;


import com.telusko.datajpaproject09.entity.CustomerInfo;
import com.telusko.datajpaproject09.services.CustomerServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class DataJpaProject09Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject09Application.class, args);

        CustomerServiceImp service = container.getBean(CustomerServiceImp.class);

        // Let get OBJ of CustomerInfo
        CustomerInfo cif = new CustomerInfo();
        cif.setCname("Fatumata");
        cif.setCity("Monrovia");
        cif.setDob(LocalDateTime.of(2002, 12, 3, 1, 10).minusNanos(7));
        cif.setRegDate(LocalDate.of(2024, 1, 15));
        cif.setRegTime(LocalTime.now());

        String status = service.regCustomerInfo(cif);
        System.out.println(status);

        // FETCH DATA FROM THE DATABASE
        service.fetchAllCx().forEach(System.out::println);
    }

}
