package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private final String departure;
    private final String destination;

    public Flight(final String departure, final String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departure.equals(flight.departure)) return false;
        return destination.equals(flight.destination);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }
}
