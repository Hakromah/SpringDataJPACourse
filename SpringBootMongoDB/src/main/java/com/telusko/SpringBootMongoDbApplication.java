package com.telusko;

import com.telusko.service.CustomerDto;
import com.telusko.service.CustomerServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMongoDbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringBootMongoDbApplication.class, args);

        CustomerServiceImp service = container.getBean(CustomerServiceImp.class);
        CustomerDto dto = new CustomerDto();

        dto.setName("Paul");
        dto.setCity("Istanbul");
        dto.setCxNo(4);

        String status = service.registerCustomerInfo(dto);
        System.out.println(status);

        // find all
        service.fetchAllCustomers().forEach(System.out::println);

    }

}
