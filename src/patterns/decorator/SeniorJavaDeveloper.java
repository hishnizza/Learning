/**
 * author Maria.Gavrilova
 * copyright 26.07.2018 © Devellar
 */

package patterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void codeReview() {
        System.out.println("Senior Java Developer reviews code");
    }

    @Override
    public void makeJob() {
        super.makeJob();
        codeReview();
    }
}
