package edu.internship.behavioral.chain_of_responsibility;

import edu.internship.behavioral.chain_of_responsibility.middleware.Middleware;
import edu.internship.behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware;
import edu.internship.behavioral.chain_of_responsibility.middleware.ThrottlingMiddleware;
import edu.internship.behavioral.chain_of_responsibility.middleware.UserExistsMiddleware;
import edu.internship.behavioral.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;


    public static void main(String[] args) throws IOException {
        initialize();
        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }


    private static void initialize() {
        server = new Server();
        server.register("admin@gmail.com", "pass");
        server.register("user@gmail.com", "pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }
}
