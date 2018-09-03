/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public class DeliveryTruck extends Delivery {
    @Override
    public Transport chooseTransport() {
        return Truck::new;
    }
}
