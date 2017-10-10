package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class DestinationFinder implements FlightFinder {
    private String destination;

    public DestinationFinder(String destination) {
        this.destination = destination;
    }

    @Override
    public void findFlight() {
        Set<Flight> flightsWithDestination = (new AllFlightsSet()).getAllFlightsSet().stream()
                .filter(f -> f.getDestination().equals(destination))
                .collect(Collectors.toSet());

        if (flightsWithDestination.size() == 0) {
            System.out.println("No flights to destination: " + destination);
        } else {
            System.out.println("Please find our flights to destination: " + destination);
            flightsWithDestination.stream()
                    .map(f -> "Departure: " + f.getDeparture() + " : destination: " + f.getDestination())
                    .forEach(System.out::println);
        }
    }
}
