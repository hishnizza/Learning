/**
 * author Maria.Gavrilova
 * copyright 26.07.2018 © Devellar
 */

package patterns.decorator;

public class JavaDeveloper implements Developer {
    @Override
    public void makeJob() {
        System.out.println("Java Developer writers Java code. ");
    }
}
