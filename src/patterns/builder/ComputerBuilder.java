/**
 * author Maria.Gavrilova
 * copyright 24.07.2018 © Devellar
 */

package patterns.builder;

public abstract class ComputerBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createComputer() {
        computer = new Computer();
    }

    public abstract void buildDisplay();
    public abstract void buildSystemBlock();
    public abstract void buildManipulators();
}
