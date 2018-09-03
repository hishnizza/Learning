package animals;

/**
 * author Maria.Gavrilova
 * copyright 17.07.2018 © Devellar
 */

public class Cat extends Animals {

    @Override
    protected void getVoice() {
        System.out.println("nyav-nyav");
    }

    public static void makeNoise() {
        System.out.println("Cat makes noise!");
    }



}
