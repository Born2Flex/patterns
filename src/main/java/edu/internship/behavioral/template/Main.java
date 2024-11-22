package edu.internship.behavioral.template;

import edu.internship.behavioral.template.customer.Customer;
import edu.internship.behavioral.template.movie.Movie;
import edu.internship.behavioral.template.movie.MovieType;
import edu.internship.behavioral.template.movie.Rental;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StatementFormatter formatter = new RegularStatementFormatter();
        Customer customer = prepareCustomer();
        System.out.println(formatter.formatStatement(customer));

        formatter = new HtmlStatementFormatter();
        System.out.println(formatter.formatStatement(customer));
    }

    private static Customer prepareCustomer() {
        List<Rental> rentals = new ArrayList<>();
        rentals.add(new Rental(new Movie(MovieType.REGULAR, "Forest"), 5));
        rentals.add(new Rental(new Movie(MovieType.NEW_RELEASE, "Wonka"), 13));
        rentals.add(new Rental(new Movie(MovieType.DRAMA, "Juliet"), 2));
        return new Customer("John", rentals);
    }
}
