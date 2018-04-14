package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
final class TaskList {
    private List<String> tasks;

    public TaskList(){
        this.tasks=new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    void addTask(final String newTask){
        tasks.add(newTask);
    }
    String getTask(int index){
      return tasks.get(index);
    }
}
