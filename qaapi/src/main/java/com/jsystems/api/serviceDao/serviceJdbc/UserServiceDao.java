package com.jsystems.api.serviceDao.serviceJdbc;

import com.jsystems.api.models.errorModels.TestUser;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserServiceDao {

    public TestUser getOne(Long id) {
        String sql = "select * from testuser where id = " + id;
        TestUser userTest = new TestUser();
        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            ResultSet wynik = statement.executeQuery(sql);
            System.out.println(wynik.toString());

            while (wynik.next()) {
                userTest.setId(wynik.getLong(1));
                userTest.setName(wynik.getString(2));
                userTest.setSurname(wynik.getString(3));
            }
            wynik.close();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userTest;
    }

    public List<TestUser> getAll() {
        List<TestUser> testUsers = new ArrayList<TestUser>();

        try {
            Statement statement = DatabaseConnector.getConnection().createStatement();
            String sql = "select * from testuser";
            ResultSet wynik = statement.executeQuery(sql);
//            testUsers = ladujDane(wynik);
            while (wynik.next()) {
                TestUser testUser = new TestUser();

                testUser.setId(wynik.getLong(1));
                testUser.setName(wynik.getString(2));
                testUser.setSurname(wynik.getString(3));

                testUsers.add(testUser);
            }
            wynik.close();
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testUsers;
    }

    public void saveOne(TestUser testUser) {
        String sql = "insert into testuser (id, name, surname) values (" + testUser.getId() + ", '" + testUser.getName() + "', '" + testUser.getSurname() + "')";
        try {
            DatabaseConnector.getConnection().createStatement().executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
