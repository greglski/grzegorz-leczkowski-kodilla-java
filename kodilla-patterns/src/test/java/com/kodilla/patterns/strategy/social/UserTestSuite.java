package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mil = new Millenials("Miller");
        User ygen = new YGeneration("Young");
        User zgen = new ZGeneration("Ziggy");
        //When
        String milShare = mil.sharePost();
        System.out.println("Miller uses " + milShare);
        String ygenShare = ygen.sharePost();
        System.out.println("Young uses " + ygenShare);
        String zgenShare = zgen.sharePost();
        System.out.println("Ziggy uses " + zgenShare);
        //Then
        Assert.assertEquals("Facebook", milShare);
        Assert.assertEquals("Twitter", ygenShare);
        Assert.assertEquals("Snapchat", zgenShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User milStrange = new Millenials("Strange Miller");
        //When
        String milStrangeShare = milStrange.sharePost();
        System.out.println("Strange Miller uses " + milStrangeShare);
        milStrange.setPublisher(new TwitterPublisher());
        milStrangeShare = milStrange.sharePost();
        System.out.println("Strange Miller now uses " + milStrangeShare);
        //Then
        Assert.assertEquals("Twitter", milStrangeShare);
    }
}
