package com.telusko.springjdbcapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("dao")// I give bean ID *dao* is optional
public class ImplementerDaoImpl implements IImplementerDao {

    // let get the connection from connection pool
    @Autowired
    private DataSource dataSource; // dataSource interface object accessed

    public String SQL_QUERY = "SELECT * FROM implementers";

    List<Implementer> implementers;// Pojo Class

    @Override
    public List<Implementer> getImplementerInfo() {
        System.out.println("DataSource implementation class name :" + dataSource.getClass().getName());

        try {
            Connection connection = dataSource.getConnection();
            System.out.println("Connection name from Hikari CP : " + connection.getClass().getName());

            PreparedStatement pstmnt = connection.prepareStatement(SQL_QUERY);

            ResultSet rs = pstmnt.executeQuery();

            implementers = new ArrayList<>();

            while (rs.next()) {
                Implementer impl = new Implementer();
                impl.setId(rs.getInt(1));
                impl.setName(rs.getNString(2));
                impl.setCity(rs.getNString(3));

                implementers.add(impl); // we have added all these three data to Implementer class

            }
//            rs.next();
//            rs.getInt(1);
//            rs.getString(2);
//            rs.getString(3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return implementers;
    }
}
