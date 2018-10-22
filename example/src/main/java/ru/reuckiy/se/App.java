package ru.reuckiy.se;

/**
 * Example
 *
 */
public class App {
    public static void main(String[] args) {
        TeamMembers teamMembers = new TeamMembers();
        Course course = new Course();
        teamMembers.showTeamInfo();
        course.doIt(teamMembers);
        teamMembers.showResult();
    }
}
