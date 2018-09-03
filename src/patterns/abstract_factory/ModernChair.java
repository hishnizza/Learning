/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Modern chair created successfully");
    }
}
