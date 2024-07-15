package com.telusko.datajpaproject05;

import com.telusko.datajpaproject05.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject05Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject05Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

        System.out.println("=".repeat(90) + "\n" + "Find By Vaccine Price");
        service.fetchByPrice(3500.50).forEach(System.out::println);// it will print all vaccines with 3500.50


        System.out.println("=".repeat(90) + "\n" + "Find By Vaccine Name");
        service.fetchByVaccineName("Sputnik").forEach(System.out::println);

        System.out.println("=".repeat(90) + "\n" + "Find By Vaccine Company's Name");
        service.fetchByVaccineCompany("pfizer").forEach(System.out::println);
        System.out.println("-".repeat(90));

        service.fetchByPriceBetween(458.6, 3500.5).forEach(System.out::println);

    }
}
