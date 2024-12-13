package edu.internship.structural.proxy;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseProxy("");
        databaseConnection.getAll();
        databaseConnection.getAll();
        System.out.println();
        databaseConnection.getById(4L);
        databaseConnection.getById(4L);
    }
}