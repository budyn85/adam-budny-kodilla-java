package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private final String mentorName;
    private int updateCount = 0;

    public KodillaMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void notification(KodillaTask kodillaTask) {
        System.out.println(mentorName + ": new participant  has finished his homework in task: " + kodillaTask.getTaskName());
        System.out.println("You have " + kodillaTask.getParticipantList().size() + " tasks to verify\n");
        updateCount++;
    }
}

