package ru.reuckiy.se;

public class Course {
    private String[] letArray;

    public Course() {
        this.letArray = new String[]{"Бег на 100 метров", "Прыжкки в длину"};
    }

    public void doIt(TeamMembers teamMembers) {
        System.out.println("Полоса препятствий: " + letArray[0] + ", " + letArray[1]);
    }
}
