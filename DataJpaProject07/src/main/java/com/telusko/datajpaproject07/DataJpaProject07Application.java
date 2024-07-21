package com.telusko.datajpaproject07;

import com.telusko.datajpaproject07.services.VaccineServiceImpl;
import com.telusko.datajpaproject07.view.ResultView1;
import com.telusko.datajpaproject07.view.ResultView2;
import com.telusko.datajpaproject07.view.ResultView3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject07Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject07Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

        System.out.println("=".repeat(90) + "\n ResultView1:");
        service.fetchByPriceLessThan(5640.52, ResultView1.class)
                .forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany()));

        System.out.println("=".repeat(90) + "\n ResultView2:");
        service.fetchByPriceLessThan(5640.52, ResultView2.class)
                .forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany() + " " + v.getPrice()));

        System.out.println("=".repeat(90) + "\n ResultView3:");
        service.fetchByPriceLessThan(5640.52, ResultView3.class)
                .forEach(v -> System.out.println(v.getVaccineName()));
        System.out.println("=".repeat(90));


    }
}
