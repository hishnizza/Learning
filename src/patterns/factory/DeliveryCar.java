/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public class DeliveryCar extends Delivery {

    @Override
    public Transport chooseTransport() {
        return Car::new;
    }
}
