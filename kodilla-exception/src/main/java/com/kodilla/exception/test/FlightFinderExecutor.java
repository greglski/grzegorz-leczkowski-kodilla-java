package com.kodilla.exception.test;

public class FlightFinderExecutor {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Nice"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Nic"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Rome"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
    }
}
