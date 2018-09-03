/**
 * author Maria.Gavrilova
 * copyright 19.07.2018 © Devellar
 */

package outer_inner_classes;

public abstract class AnonimousInnerClass {

    public abstract void print();
}

class InnerClass {

    public static void main(String[] args) {
        AnonimousInnerClass inClass = new AnonimousInnerClass() {
            @Override
            public void print() {
                System.out.println("This is overriden method of abstract public class");
            }
        };
        inClass.print();
    }

}
