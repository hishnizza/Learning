/**
 * author Maria.Gavrilova
 * copyright 19.07.2018 © Devellar
 */

package outer_inner_classes;

public class WithStaticInnerClass {

    private static class StaticInnerClass {

        private static void print() {
            System.out.println("Static inner class");
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.print();
    }
}
