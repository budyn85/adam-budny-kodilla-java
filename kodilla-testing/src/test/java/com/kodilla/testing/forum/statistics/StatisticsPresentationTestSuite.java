package com.kodilla.testing.forum.statistics;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsPresentationTestSuite {
    @Test
    public void testCalculateAdvStatisticsWith1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();
        int usersCount = 1000;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add("Adam" + n);
        }
        int postsCount = 1000;
        int commentsCount = 10000;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(10, statisticsPresentation.getAvgCommentPerPost(), 0);
        assertEquals(10, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(1, statisticsPresentation.getAvgPostPerUser(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsWith0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();
        int usersCount = 100;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add("Adam" + n);
        }
        int postsCount = 0;
        int commentsCount = 100;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(0, statisticsPresentation.getAvgCommentPerPost(), 0);
        assertEquals(1, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(0, statisticsPresentation.getAvgPostPerUser(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsWith0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();
        int usersCount = 100;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add("Adam" + n);
        }
        int postsCount = 100;
        int commentsCount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(0, statisticsPresentation.getAvgCommentPerPost(), 0);
        assertEquals(0, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(1, statisticsPresentation.getAvgPostPerUser(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();
        int usersCount = 100;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add("Adam" + n);
        }
        int postsCount=100;
        int commentsCount=200 ;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(0, statisticsPresentation.getAvgCommentPerPost(), 0);
        assertEquals(2, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(1, statisticsPresentation.getAvgPostPerUser(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation();
        int usersCount = 0;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            usersNamesList.add("Adam" + n);
        }
        int postsCount=100;
        int commentsCount=200 ;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsPresentation.calculateAdvStatistics(statisticsMock);
        statisticsPresentation.showStatistics();

        //Then
        assertEquals(2, statisticsPresentation.getAvgCommentPerPost(), 2);
        assertEquals(0, statisticsPresentation.getAvgCommentPerUser(), 0);
        assertEquals(0, statisticsPresentation.getAvgPostPerUser(), 0);
    }
}
