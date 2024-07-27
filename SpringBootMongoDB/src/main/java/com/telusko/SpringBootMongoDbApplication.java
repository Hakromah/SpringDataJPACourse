package com.telusko;

import com.telusko.service.CustomerDto;
import com.telusko.service.CustomerServiceImp;
import com.telusko.util.IDGenerated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMongoDbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringBootMongoDbApplication.class, args);

        CustomerServiceImp service = container.getBean(CustomerServiceImp.class);
        CustomerDto dto = new CustomerDto();
        //String id= IDGenerated.generateId();

//        dto.setId(IDGenerated.generateId());
//        dto.setName("Susan");
//        dto.setCxNo(4);
//        dto.setCity("Istanbul");
//
//        String status = service.registerCustomerInfo(dto);
//        System.out.println(status);

        // find all
        service.fetchAllCustomers().forEach(System.out::println);

    }

}
