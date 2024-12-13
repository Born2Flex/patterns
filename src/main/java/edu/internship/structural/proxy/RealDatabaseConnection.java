package edu.internship.structural.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RealDatabaseConnection implements DatabaseConnection {
    private final String databaseUrl;
    private Connection connection;

    public RealDatabaseConnection(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        createConnection();
    }

    private void createConnection() {
        try {
            System.out.println("Loading JDBC driver...");
            connection = DriverManager.getConnection(databaseUrl, "", "");
            System.out.println("Connection established.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        try (Statement statement = connection.createStatement();) {
            System.out.println("Fetching data from database...");
            ResultSet resultSet = statement.executeQuery("SELECT first_name, last_name FROM users");
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                users.add(new User(firstName, lastName));
                System.out.println("Fetched Data: " + firstName + " " + lastName);
            }
            return users;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getById(long id) {
        try (PreparedStatement statement = connection.prepareStatement("SELECT first_name, last_name FROM users WHERE id = ?")) {
            statement.setLong(1, id);
            System.out.println("Fetching data by ID from database...");
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println("Fetched data: " + firstName + " " + lastName);
                return new User(firstName, lastName);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}