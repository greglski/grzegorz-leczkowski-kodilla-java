package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCountTestSuite {
   @Test
   public void testCalculateAdvStatistics() {
       // Given
       Statistics statisticsMock = mock(Statistics.class);

       List<String> usersNamesMock = new ArrayList<>();
       usersNamesMock.add("Ann");
       usersNamesMock.add("John");
       usersNamesMock.add("George");
       usersNamesMock.add("Jimi");
       usersNamesMock.add("Mona");
       when(statisticsMock.usersNames()).thenReturn(usersNamesMock);

       when(statisticsMock.postsCount()).thenReturn(10);

       when(statisticsMock.commentsCount()).thenReturn(40);

       StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);
       statisticsCount.calculateAdvStatistics();

       // When
       double testPostsAvgPerUser = statisticsCount.getPostsAvgPerUser();
       double testCommentsAvgPerUser = statisticsCount.getCommentsAvgPerUser();
       double testCommentsAvgPerPost = statisticsCount.getCommentsAvgPerPost();
       // Then
       Assert.assertEquals(2, testPostsAvgPerUser, 0.0);
       Assert.assertEquals(8, testCommentsAvgPerUser, 0.0);
       Assert.assertEquals(4, testCommentsAvgPerPost, 0.0);
   }
}
