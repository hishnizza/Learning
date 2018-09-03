/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

import java.util.Random;

public class Client {

    private static Application configuration() {
        Application app = null;
        FurnitureFactory factory;
        int r = 1 + new Random().nextInt(2);
        System.out.println(r);
        switch (r) {
            case 1 :
                factory = new ModernFurnitureFactory();
                app = new Application(factory);
                break;
            case 2 :
                factory = new VictorianFurnitureFactory();
                app = new Application(factory);
                break;
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configuration();
        app.createFurnitureSet();
    }
}
