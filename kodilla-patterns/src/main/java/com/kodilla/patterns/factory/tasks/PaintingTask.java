package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isAlreadyExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        if (isAlreadyExecuted) {
            return "Task " + taskName+  " is executed!";
        }else{
            return "Task to execute "+taskName+" "+color+" "+whatToPaint;
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
