/**
 * author Maria.Gavrilova
 * copyright 05.08.2018 © Devellar
 */

package outer_inner_classes;

public class Outer {
    void outerMethod() {
        final int x = 98;
        class Inner {
            public void innerMethod() {
                System.out.println("x = " + x);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
