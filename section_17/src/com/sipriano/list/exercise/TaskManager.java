package com.sipriano.list.exercise;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {
        makeToDoList();
    }

    public static List<Task> makeToDoList() {

        List<Task> list = new ArrayList<>();
        Task task1 = new Task("Complete assignment");
        Task task2 = new Task("Go for a run");
        Task task3 = new Task("Buy groceries");

        list.add(task1);
        list.add(task2);
        list.add(task3);

        list.get(1).setCompleted(true);

        for (Task e : list) {
            System.out.println((list.indexOf(e)+1) + ". Complete assignment - Completed: " + e.isCompleted());
        }

        return list;

    }


}
