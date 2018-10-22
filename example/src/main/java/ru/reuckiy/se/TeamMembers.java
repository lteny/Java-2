package ru.reuckiy.se;

public class TeamMembers extends Team {
    private String NAME_TEAM = "Sparta";
    public String[] membersArray;

    public TeamMembers() {
        membersArray = new String[]{"Bob", "Tom", "Jack", "Robert"};
    }

    public void showTeamInfo() {
        System.out.println("Состав комманды - " + NAME_TEAM + ":");
        for (String members : membersArray) {
            System.out.println(members);
        }
    }

    @Override
    public void showResult() {
        final int[] jumpArray = new int[4];
        final int[] runArray = new int[4];
        for (int i = 0; i < jumpArray.length; i++) {
            final double lengthJump = (int) (5 + Math.random() * 10);
            jumpArray[i] += lengthJump;
        }
        for (int j = 0; j < runArray.length; j++) {
            final double timeRun = (int) (20 + Math.random() * 40);
            runArray[j] += timeRun;
        }
        System.out.println(membersArray[0] + " - Пробежал 100 метров за " + runArray[0] + " сек." + " и совершил прыжок на " + jumpArray[0] + " метров");
        System.out.println(membersArray[1] + " - Пробежал 100 метров за " + runArray[1] + " сек." + " и совершил прыжок на " + jumpArray[1] + " метров");
        System.out.println(membersArray[2] + " - Пробежал 100 метров за " + runArray[2] + " сек." + " и совершил прыжок на " + jumpArray[2] + " метров");
        System.out.println(membersArray[3] + " - Пробежал 100 метров за " + runArray[3] + " сек." + " и совершил прыжок на " + jumpArray[3] + " метров");
    }
}
