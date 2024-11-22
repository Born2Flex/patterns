package edu.internship.behavioral.template.movie;

public record Rental(Movie movie, int daysRented) {
    public double getRentalPrice() {
        return movie.getPriceCode().calculate(daysRented);
    }
}
