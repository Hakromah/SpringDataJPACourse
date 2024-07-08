package com.letusko.springdatajdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class SpringDataJDBC {

    @Autowired
    private JdbcTemplate jdbc;

    private static final String SQL_DELETE = "DELETE FROM IMPLEMENTERS WHERE ID = ?";
    // let get the connection
    private static final String SQL_QUERY = "INSERT INTO IMPLEMENTERS(id, name, city) VALUES(?,?,?)";

    // to store data
    public void input(Implementer impl) {
        // to store the data we use 'update'
        int row = jdbc.update(SQL_QUERY, impl.getId(), impl.getName(), impl.getCity());
        System.out.println("Rows affected " + row);
    }

    // to delete data
    public void delete(Integer id) {
        int rows = jdbc.update(SQL_DELETE, id);
        if (rows != 0) {
            System.out.println("Row affected " + rows + " and Record with ID " + id + " is deleted");
        } else {
            System.out.println("ID " + id + "is not existing in the record");
        }
    }

}
