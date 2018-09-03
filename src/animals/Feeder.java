package animals;

/**
 * author Maria.Gavrilova
 * copyright 18.07.2018 © Devellar
 */

public class Feeder {

    public static void feed(Animals animal) {
        if (animal.getClass().equals(Dog.class)) {
            System.out.println("Pedigree is yamy-yamy");

        } else if (animal.getClass().equals(Cat.class)) {
            System.out.println("Origin is yamy-yamy");
        } else if (animal.getClass().equals(Snake.class)) {
            System.out.println("Mouse is yamy-yamy");
        }
    }
}
