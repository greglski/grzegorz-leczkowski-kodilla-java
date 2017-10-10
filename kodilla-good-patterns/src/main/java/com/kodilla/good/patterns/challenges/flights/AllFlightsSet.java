package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public final class AllFlightsSet {
    private final Set<Flight> allFlightsSet;

    public AllFlightsSet() {
        allFlightsSet = new HashSet<>();
        allFlightsSet.add(new Flight("Warszawa", "Gdańsk"));
        allFlightsSet.add(new Flight("Gdańsk", "Warszawa"));
        allFlightsSet.add(new Flight("Radom", "Wrocław"));
        allFlightsSet.add(new Flight("Warszawa", "Olsztyn"));
        allFlightsSet.add(new Flight("Warszawa", "Kraków"));
        allFlightsSet.add(new Flight("Kraków", "Warszawa"));
        allFlightsSet.add(new Flight("Kraków", "Rzeszów"));
    }

    public Set<Flight> getAllFlightsSet() {
        return allFlightsSet;
    }
}
