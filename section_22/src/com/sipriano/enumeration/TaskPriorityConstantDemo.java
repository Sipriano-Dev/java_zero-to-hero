package com.sipriano.enumeration;

public class TaskPriorityConstantDemo {

    private PriorityEnum priorityEnum;

    public static void main(String[] args) {
        PriorityEnum priorityEnum1 = null;
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.LOW));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.HIGH));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.URGENT));
        System.out.println(PriorityEnum.URGENT);
    }

}
