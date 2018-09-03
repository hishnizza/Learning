/**
 * author Maria.Gavrilova
 * copyright 24.07.2018 © Devellar
 */

package patterns.builder;

public class NewComputer {

    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder computerBuilder = new CheapComputerBuilder();

        director.setComputerBuilder(computerBuilder);
        director.constructComputer();

        Computer computer = director.getComputer();
        System.out.println(computer.getDisplay());
        System.out.println(computer.getSystemBlock());
        System.out.println(computer.getManipulators());
    }
}
