package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class KodillaCourseTasksTestSuite {
    @Test
    public void testKodillaParticipantCount() {
        //Given
        KodillaParticipant participant1 = new KodillaParticipant("Michael Grant");
        KodillaParticipant participant2 = new KodillaParticipant("Emma Wadson");
        KodillaParticipant participant3 = new KodillaParticipant("Jason Hulk");
        KodillaParticipant participant4 = new KodillaParticipant("Vanessa May");

        KodillaTask restApiTask = new RestApiTask();
        KodillaTask springTask = new SpringTask();
        KodillaTask facadeTask = new FacadeTask();

        //When
        restApiTask.addParticipant(participant1);
        restApiTask.addParticipant(participant3);
        restApiTask.addParticipant(participant4);

        springTask.addParticipant(participant1);
        springTask.addParticipant(participant2);

        facadeTask.addParticipant(participant2);
        facadeTask.addParticipant(participant3);
        facadeTask.addParticipant(participant4);

        int restApiTasksParticipantsList = restApiTask.getParticipantList().size();
        int springTasksParticipantsList = springTask.getParticipantList().size();
        int facadeTasksParticipantsList = facadeTask.getParticipantList().size();

        //Then
        Assert.assertEquals(3, restApiTasksParticipantsList);
        Assert.assertEquals(1, springTasksParticipantsList);
        Assert.assertEquals(2, facadeTasksParticipantsList);
    }

    @Test
    public void testKodillaMentorsCheckParticipants() {
        //Given
        KodillaParticipant participant1 = new KodillaParticipant("Michael Grant");
        KodillaParticipant participant2 = new KodillaParticipant("Emma Wadson");
        KodillaParticipant participant3 = new KodillaParticipant("Jason Hulk");
        KodillaParticipant participant4 = new KodillaParticipant("Vanessa May");

        KodillaTask restApiTask = new RestApiTask();
        KodillaTask springTask = new SpringTask();
        KodillaTask facadeTask = new FacadeTask();

        KodillaMentor mentor1 = new KodillaMentor("Albert Einstein");
        KodillaMentor mentor2 = new KodillaMentor("Maria Skłodowska-Curie");

        //When
        restApiTask.registerObserver(mentor1);
        restApiTask.registerObserver(mentor2);
        springTask.registerObserver(mentor1);
        facadeTask.registerObserver(mentor2);

        restApiTask.addParticipant(participant1);
        restApiTask.addParticipant (participant2);
        restApiTask.addParticipant (participant3);

        springTask.addParticipant (participant2);
        springTask.addParticipant (participant4);


        facadeTask.addParticipant (participant1);
        facadeTask.addParticipant (participant3);
        facadeTask.addParticipant (participant4);

        int mentor1KodillaTasks = mentor1.getUpdateCount();
        int mentor2KodillaTasks = mentor2.getUpdateCount();

        //Then
        Assert.assertEquals(4, mentor1KodillaTasks);
        Assert.assertEquals(5, mentor2KodillaTasks);
    }
}

