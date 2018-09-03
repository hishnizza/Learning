package animals;

/**
 * author Maria.Gavrilova
 * copyright 17.07.2018 © Devellar
 */

public class Dog extends Animals {

    public String name = "fgd";
    private String face = "fgfd0";

    @Override
    public void getVoice() {
        System.out.println("gav-gav");
    }

    public void giveLeg() {
        System.out.println("LEG");
    }
}
