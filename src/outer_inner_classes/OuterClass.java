/**
 * author Maria.Gavrilova
 * copyright 19.07.2018 © Devellar
 */

package outer_inner_classes;

public class OuterClass {

    private String name = "Masha";

    private class InnerClass {

        private void print() {
            System.out.println("This is private incapsulated inner method written by: " + name);
        }
    }

    public void getInner() {
        String face = "round";
        InnerClass innerClass = new InnerClass();
        innerClass.print();
        class innerLocal {
            private String getName() {
                System.out.println(name + face);
                return face;
            }

        }
    }
}
