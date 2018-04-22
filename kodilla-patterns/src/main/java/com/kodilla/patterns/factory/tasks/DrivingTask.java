package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;
    boolean isAlreadyExecuted=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        if (isAlreadyExecuted) {
            return "Task " + taskName+  " is executed!";
        }else{
            return "Task to execute "+taskName+" "+where+" "+using;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isAlreadyExecuted;
    }
}
