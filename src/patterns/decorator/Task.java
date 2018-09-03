/**
 * author Maria.Gavrilova
 * copyright 26.07.2018 © Devellar
 */

package patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        developer.makeJob();
    }
}
