package com.telusko.datajpaproject06;

import com.telusko.datajpaproject06.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject06Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject06Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

        service.fetchByPriceLessThan(5600.68).forEach(v -> System.out.println(
                v.getVaccineName() + ": " + v.getVaccineCompany()));

    }
}
