package animals;

/**
 * author Maria.Gavrilova
 * copyright 17.07.2018 © Devellar
 */

public abstract class Animals implements IAnimals {

    private int age;
    public String name;
    protected String face;

    Animals() {

    }

    @Override
    public void name(String name) {
        this.name = name;

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateAgeRemaining () {
        return max_age - getAge();
    }

    protected abstract void getVoice();

    private int getksjmkl(){
        return 5;
    }

    public static void makeNoise() {
        System.out.println(
                "Parent makes noise!"
        );
    }

}
