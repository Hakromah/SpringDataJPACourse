package com.telusko.datajpaproject04;

import com.telusko.datajpaproject04.entity.Vaccine;
import com.telusko.datajpaproject04.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataJpaProject04Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject04Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

        //Vaccine v1 = new Vaccine();
        //service.searchByGivenVaccineInfo(v1, true, "vaccineName", "vaccineCompany").forEach(System.out::println);

        //System.out.println(service.searchVaccineById(252));
        //service.searchVaccineByIds(List.of(252, 253)).forEach(System.out::println);

        //service.searchVaccineByVaccine(new Vaccine()).forEach(System.out::println);

        // #1 JPA Repository delete methods
//        String status = service.removeVaccineByIds(
//                List.of(152, 153, 154, 202, 203, 204, 252, 253, 254, 302, 303, 304, 352, 353, 354));
//        System.out.println(status);

        // #2 JPA Repository delete methods
        String status = service.removeVaccineByIdsCrud(List.of(102, 103, 104));
        System.out.println(status);

    }
}
