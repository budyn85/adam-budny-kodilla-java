package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaTask implements Observable {
    private final List<KodillaParticipant> participantList;
    private final List<Observer> observers;
    private final String taskName;

    public KodillaTask(String taskName) {
        participantList = new ArrayList<>();
        observers = new ArrayList<>();
        this.taskName = taskName;
    }

    public void addParticipant(KodillaParticipant participant) {
        participantList.add(participant);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.notification(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<KodillaParticipant> getParticipantList() {
        return participantList;
    }

    public String getTaskName() {
        return taskName;
    }
}
