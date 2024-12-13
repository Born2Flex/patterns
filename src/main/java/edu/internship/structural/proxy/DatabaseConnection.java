package edu.internship.structural.proxy;

import java.util.List;

public interface DatabaseConnection {
    List<User> getAll();
    User getById(long id);
}