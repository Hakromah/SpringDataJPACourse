package com.telusko.datajpaproject03;

import com.telusko.datajpaproject03.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject03Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject03Application.class, args);
        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
//        service.fetchDetails(false, "vaccineName", "vaccineCompany", "price")
//                .forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany()));

//        service.fetchPageDetails(2, 5, true, "vaccineName", "vaccineCompany")
//                .forEach(System.out::println);// this is not dynamic

        // Pagination
        // I give 5 as pageSize and I have 21 records in DB so, I will get 4 pages + 1 extra page
        service.fetchDetailsPagination(5);
    }
}
