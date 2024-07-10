package com.telusko.datajpaproject2;

import com.telusko.datajpaproject2.entity.Phone;
import com.telusko.datajpaproject2.services.PhoneService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DataJpaProject2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject2Application.class, args);
        PhoneService service = container.getBean(PhoneService.class);

        Phone ph1 = new Phone("Smsung", 1200.00, "Samsung");
        Phone ph2 = new Phone("Motorola", 1200.00, "Motorola");
        Phone ph3 = new Phone("Nokia", 1200.00, "Nokia");
        Phone ph4 = new Phone("Iphone", 1200.00, "Iphone");

        Iterable<Phone> list = service.registerAllPhoneInfo(Arrays.asList(ph1, ph2, ph3, ph4));
        list.forEach(phone -> System.out.println(phone));

        service.getAllPhones().forEach(phone -> System.out.println(phone));

        System.out.println("Total phone is " + service.getCount());
    }

}
