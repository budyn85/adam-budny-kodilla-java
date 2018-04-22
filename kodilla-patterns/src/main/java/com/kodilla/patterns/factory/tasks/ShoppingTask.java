package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isAlreadyExecuted=false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        if (isAlreadyExecuted) {
            return "Task " + taskName+  " is executed!";
        }else{
            return "Task to execute"+" "+taskName+" "+whatToBuy+" "+quantity;
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
