package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Friday shopping", "Jeans,T-shirt",2.0);
                case PAINTINGTASK:
                    return new PaintingTask("LagoonBlue ", "Ral5010","Car");
                case DRIVINGTASK:
                    return new DrivingTask("Italy sunshine","Turyn,Roma,Neapol","Porsche GT3");
                default:
                    return null;
            }

        }
}

