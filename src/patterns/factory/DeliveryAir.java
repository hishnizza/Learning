/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public class DeliveryAir extends Delivery {
    @Override
    protected Transport chooseTransport() {
        return new Air();
    }
}
