package com.telusko.datajpaproject02;

import com.telusko.datajpaproject02.entity.Vaccine;
import com.telusko.datajpaproject02.services.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DataJpaProject02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject02Application.class, args);

        VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

//        Vaccine v1 = new Vaccine("Pfizer","Comirnaty",1500.50);
//        String msg = service.registerVaccineInfo(v1);
//        System.out.println(msg);

        // Let's save multiple records in one go using saveAll() method
        Vaccine v = new Vaccine(3,"Maths", "Math Company", 1000.68);
//        Vaccine v3 = new Vaccine("React", "Meta", 458.60);
//        Vaccine v4 = new Vaccine("Spring", "Pivotal", 254.90);

        Iterable<Vaccine> vaccineList = service.registerMultipleVaccines(Arrays.asList(v));
        vaccineList.forEach(System.out::println);

        System.out.println("Count of Records: " + service.getCount());

        Integer id = 1;
        Boolean status = service.checkAvailability(1);
        if (status) {
            System.out.println("Vaccine with Id: " + id + " is available");
        } else {
            System.out.println("Vaccine with Id: " + id + " is not available");
        }

        // get all vaccines from DB
//        service.getAllVaccines().forEach(vaccine -> System.out.println(vaccine));
//
//        // Let's get all specific vaccine ids from DB
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(2);
//        list.add(6);
//        list.add(4);
//        list.add(5);
//        service.getAllVaccines(list).forEach(vaccine -> System.out.println(vaccine));

        Vaccine vc = service.fetchVaccineById(2);
        System.out.println(vc);

        //Delete
        System.out.println(service.deleteVaccineById(2));


    }

}
