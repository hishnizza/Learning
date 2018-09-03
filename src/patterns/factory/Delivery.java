/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public abstract class Delivery {


    public void deliverMyParcel() {
        Transport transport = chooseTransport();
        transport.deliver();
    }

    protected abstract Transport chooseTransport();

}
