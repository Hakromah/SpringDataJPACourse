package com.telusko.datajpaproject08;

import com.telusko.datajpaproject08.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject08Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject08Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
        //service.findVaccineCompanyName("Pivotal").forEach(System.out::println);
        //service.findVaccineCompanyName("Pivotal", "Pfizer").forEach(System.out::println);

        //service.findVaccinePriceRange(22546.2, 5241.52).forEach(System.out::println);

        // FOR NON-SELECT OPERATIONS
        //int updated = service.updateVaccinePrice(4500.50, "AstraZeneca");
        //System.out.println(updated);

        // int deleted = service.deleteVaccinePriceRange(3500.50, 4551.50);
        //System.out.println(deleted);

        // RAW SQL QUERY
        int rowsaff = service.insertVaccineDetails(44, 9000.20, "Prestij", "Prestij Vac");
        System.out.println(rowsaff);
    }
}
