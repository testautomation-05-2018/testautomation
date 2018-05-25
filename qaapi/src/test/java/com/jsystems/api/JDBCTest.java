package com.jsystems.api;

import com.jsystems.api.models.errorModels.TestUser;
import com.jsystems.api.serviceDao.serviceJdbc.UserServiceDao;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JDBCTest {

    @Test
    @DisplayName("JDBC Test")
    public void jdbcTest(){
        UserServiceDao userServiceDao = new UserServiceDao();
        TestUser testUser = userServiceDao.getOne(1l);
        System.out.println(testUser.toString());

        assertTrue(testUser.getId() == 1);
        assertTrue(testUser.getName().equals("Piotr"));
        assertTrue(testUser.getSurname().equals("Kowalski"));
    }
}
