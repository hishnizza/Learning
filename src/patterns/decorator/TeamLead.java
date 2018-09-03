/**
 * author Maria.Gavrilova
 * copyright 26.07.2018 © Devellar
 */

package patterns.decorator;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public void makeJob() {
        super.makeJob();
        sendReport();
    }

    public void sendReport() {
        System.out.println("Team Lead sends report.");
    }
}
