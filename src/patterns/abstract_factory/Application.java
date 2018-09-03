/**
 * author Maria.Gavrilova
 * copyright 25.07.2018 © Devellar
 */

package patterns.abstract_factory;

public class Application {

    private Chair chair;
    private Table table;

    public Application(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        table = furnitureFactory.createTable();
    }

    public void createFurnitureSet() {
        chair.create();
        table.create();
    }
}
