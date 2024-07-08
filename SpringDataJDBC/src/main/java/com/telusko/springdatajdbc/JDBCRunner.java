package com.telusko.springdatajdbc;

import com.letusko.springdatajdbc.dao.Implementer;
import com.letusko.springdatajdbc.dao.SpringDataJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCRunner implements CommandLineRunner {

    @Autowired
    private SpringDataJDBC jdbc;

    @Override
    public void run(String... args) throws Exception {
        jdbc.input(new Implementer(105,"Amadou","Paul"));
        jdbc.delete(101);
    }
}
