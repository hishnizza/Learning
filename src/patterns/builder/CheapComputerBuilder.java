/**
 * author Maria.Gavrilova
 * copyright 24.07.2018 © Devellar
 */

package patterns.builder;

public class CheapComputerBuilder extends ComputerBuilder {

    @Override
    public void buildDisplay() {
        computer.setDisplay("Everest");
    }

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("AMD");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse");
    }
}
