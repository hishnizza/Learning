package animals;

/**
 * author Maria.Gavrilova
 * copyright 17.07.2018 © Devellar
 */

public class Main {

    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.setAge(6);
        System.out.println(cat.calculateAgeRemaining());
        System.out.println(cat.getAge());
        cat.name("Vasya");
        System.out.println(cat.name);
        cat.getVoice();

        Dog dog = new Dog();
        dog.getVoice();
        dog.name = "Sharik";
        System.out.println("DOG: " + dog.name);
        System.out.println("CAT: " + cat.name);
        dog.setAge(12);
        System.out.println("DOG: " + dog.calculateAgeRemaining());
        System.out.println("CAT: " + cat.calculateAgeRemaining());
        System.out.println("DOG: " + dog.getAge());
        System.out.println("CAT: " + cat.getAge());

        Dog dog_2 = new Dog();
        dog_2.getVoice();
        dog_2.name = "Sharik_2";
        System.out.println("DOG: " + dog.name);
        System.out.println("DOG_2: " + dog_2.name);
        System.out.println("CAT: " + cat.name);
        dog_2.setAge(2);
        System.out.println("DOG: " + dog.calculateAgeRemaining());
        System.out.println("DOG_2: " + dog_2.calculateAgeRemaining());
        System.out.println("CAT: " + cat.calculateAgeRemaining());
        System.out.println("DOG: " + dog.getAge());
        System.out.println("DOG_2: " + dog_2.getAge());
        System.out.println("CAT: " + cat.getAge());

        IAnimals cat_int = new Cat();
        System.out.println(cat_int.getAge());
        cat_int.name("Sherry");

        // Полиморфизм
        Animals animal = new Cat();
        animal.getVoice();

        animal = new Dog();
        animal.getVoice();



        Animals doog = new Dog();
        Animals caat = new Cat();
        Animals snake = new Snake();

        Feeder.feed(doog);
        Feeder.feed(caat);
        Feeder.feed(snake);

        Dog d = new Dog();
        Dog c = new Dog();
        System.out.println(d.equals(c)); //false

        // HIDING static method
        Cat catNoise = new Cat();
        catNoise.makeNoise();

        Animals animalsNoise = new Cat();
        animalsNoise.makeNoise();

        Cat.makeNoise();
        Animals.makeNoise();
    }
}













