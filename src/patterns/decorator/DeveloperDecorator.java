/**
 * author Maria.Gavrilova
 * copyright 26.07.2018 © Devellar
 */

package patterns.decorator;

public class DeveloperDecorator implements Developer {

    Developer developer;
    Object s;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void makeJob() {
        developer.makeJob();
    }
}
