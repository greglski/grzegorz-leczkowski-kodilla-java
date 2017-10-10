package com.kodilla.good.patterns.challenges.flights;

public final class InterconnectionFlight {
    private final String departure;
    private final String interconnection;
    private final String destination;

    public InterconnectionFlight(final String departure, final String interconnection, final String destination) {
        this.departure = departure;
        this.interconnection = interconnection;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getInterconnection() {
        return interconnection;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterconnectionFlight that = (InterconnectionFlight) o;

        if (!departure.equals(that.departure)) return false;
        if (!interconnection.equals(that.interconnection)) return false;
        return destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + interconnection.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }
}
