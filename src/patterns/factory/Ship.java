/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.factory;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Your parcel will be delivered by SHIP as soon as possible");
    }
}
