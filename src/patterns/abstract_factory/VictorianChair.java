/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

public class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("Victorian chair created successfully");
    }
}
