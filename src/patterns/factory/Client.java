/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

import java.util.Random;

public class Client {

    private static Delivery delivery;

    public static void main(String[] args) {
        configure();
        delivery.deliverMyParcel();
    }

    private static void configure() {
        int r = 1 + new Random().nextInt(4);
        System.out.println(r);
        switch (r) {
            case 1 :
                delivery = new DeliveryShip();
                break;
            case 2 :
                delivery = new DeliveryCar();
                break;
            case 3 :
                delivery = new DeliveryTruck();
                break;
            case 4:
                delivery = new DeliveryAir();
                break;
        }
    }
}
