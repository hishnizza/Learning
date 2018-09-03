/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

public class VictorianTable implements Table {

    @Override
    public void create() {
        System.out.println("Victorian table created successfully");
    }
}
