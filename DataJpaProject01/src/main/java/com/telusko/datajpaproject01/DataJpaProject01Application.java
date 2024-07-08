package com.telusko.datajpaproject01;

import com.telusko.datajpaproject01.entity.Student;
import com.telusko.datajpaproject01.repository.IStudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaProject01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject01Application.class, args);
        IStudentRepository repo = container.getBean(IStudentRepository.class);
        System.out.println("class created by Spring is -> " + repo.getClass().getName());

        Student st = new Student();
        st.setName("Harsh");
        st.setAge(25);
        st.setCity("Istanbul");
        repo.save(st);
        System.out.println("data saved successfully");


    }

}
