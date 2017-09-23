package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("30000000")));
        europe.addCountry(new Country("France", new BigDecimal("40000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1300000000")));
        asia.addCountry(new Country("India", new BigDecimal("1200000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("100000000")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egypt", new BigDecimal("20000000")));
        africa.addCountry(new Country("Libia", new BigDecimal("10000000")));
        africa.addCountry(new Country("Morocco", new BigDecimal("20000000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        // When
        BigDecimal resultPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("2800000000");

        // Then
        Assert.assertEquals(expectedPeopleQuantity, resultPeopleQuantity);
    }
}
