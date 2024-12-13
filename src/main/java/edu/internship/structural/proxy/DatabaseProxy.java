package edu.internship.structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseProxy implements DatabaseConnection {
    private RealDatabaseConnection realDatabaseConnection;
    private final String databaseUrl;
    private Map<Long, User> cache = new HashMap<>();

    public DatabaseProxy(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public List<User> getAll() {
        if (realDatabaseConnection == null) {
            System.out.println("Initializing real database connection...");
            realDatabaseConnection = new RealDatabaseConnection(databaseUrl);
        }
        return realDatabaseConnection.getAll();
    }

    @Override
    public User getById(long id) {
        if (cache.containsKey(id)) {
            System.out.println("Cache hit: Returning data for ID " + id);
            return cache.get(id);
        } else {
            if (realDatabaseConnection == null) {
                System.out.println("Initializing real database connection...");
                realDatabaseConnection = new RealDatabaseConnection(databaseUrl);
            }
            User data = realDatabaseConnection.getById(id);
            if (data != null) {
                cache.put(id, data);
            }
            return data;
        }
    }
}
