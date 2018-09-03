/**
 * author Maria.Gavrilova
 * copyright 24.07.2018 © Devellar
 */

package patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){} //private constructor

    public static Singleton getInstance() { //we can get class object only via this method
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton; //the only one class object exists
    }
}
