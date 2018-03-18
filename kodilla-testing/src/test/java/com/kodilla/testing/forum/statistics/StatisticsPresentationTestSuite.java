package com.kodilla.testing.forum.statistics;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsPresentationTestSuite {
    @Test
    public List<String> testCalculateAdvStatisticsWith0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation(statisticsMock);
         int usersCount = 100;
        public List<String> usersNames() {
            List<String> usersNamesList = new ArrayList<>();
            for (int n = 1; n <= usersCount; n++) {
                usersNamesList.add("Adam" + n);
            };
        return usersNames;
        }
            int postsCount = 0;
            int commentsCount = 100;

            when(statisticsMock.usersNames()).thenReturn(usersNames);
            when(statisticsMock.postsCount()).thenReturn(postsCount);
            when(statisticsMock.commentsCount()).thenReturn(commentsCount);

            //When
            statisticsPresentation.calculateAdvStatistics(statisticsMock);
            statisticsPresentation.showStatistics();

            //Then
            assertEquals(commentsCount / postsCount, statisticsPresentation.getAvgCommentPerPost(), 0);
            assertEquals(commentsCount / usersCount, statisticsPresentation.getAvgCommentPerUser(), 0);
            assertEquals(postsCount / usersCount, statisticsPresentation.getAvgPostPerUser(), 0);
        }

        private
    }
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();

        int usersCount = 100;
        List<String> usersNamesList = generateListOfNUsersNames(usersCount);
        int postsCount = 1000;
        int commentsCount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(commentsCount / postsCount, statisticsPresentation.getAvgCommentPerPost(), 0);
        assertEquals(commentsCount / usersCount, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(postsCount / usersCount, statisticsPresentation.getAvgPostPerUser(), 0);
    }

    private List<String> generateListOfNUsersNames(int usersCount) {
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add(userName);
        }
        return usersNamesList;
    }
}
