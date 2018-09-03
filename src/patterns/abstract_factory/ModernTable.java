/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Modern table created successfully");
    }
}
