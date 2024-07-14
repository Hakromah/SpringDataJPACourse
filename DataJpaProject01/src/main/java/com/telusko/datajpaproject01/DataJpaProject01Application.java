package com.telusko.datajpaproject02;

import com.telusko.datajpaproject02.entity.Student;
import com.telusko.datajpaproject02.repository.IStudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class DataJpaProject01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject01Application.class, args);
        IStudentRepository repo = container.getBean(IStudentRepository.class);
        System.out.println("Proxy Class created by Spring is -> " + repo.getClass().getName());

        Student st = new Student();
        st.setName("Harsh");
        st.setAge(25);
        st.setCity("Istanbul");
        repo.save(st);
        System.out.println("data saved successfully");

    }

}
