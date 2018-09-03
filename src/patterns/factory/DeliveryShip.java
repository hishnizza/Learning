/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public class DeliveryShip extends Delivery {

    @Override
    protected Transport chooseTransport() {
        return Ship::new;
    }
}
