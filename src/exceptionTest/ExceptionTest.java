/**
 * author Maria.Gavrilova
 * copyright 23.07.2018 © Devellar
 */

package exceptionTest;

public class ExceptionTest {

    public static void main(String[] args) throws GetOutOfMyLifeException {
//        int a = 5;
//        int b = 8;
//        try {
//            Comparator.assertEquals(a, b);
//        } catch (Exception e) {
//            throw new Error("jdfkdjfkfd");
//        } finally {
//            System.out.println("finally block");
//        }

        compareString();
    }
//
//    private void compare() throws Exception {
//        try {
//            Comparator.assertEquals(6,7);
//        } finally {
//            System.out.println("finally");
//        }
//        Comparator.assertEquals(15.6, 18.6);
//    }
//
//    private void compareFloat() {
//        Comparator.assertEquals(1.5f, 4.6f);
//    }

    private static void compareString() throws GetOutOfMyLifeException {
        Comparator.assertEquals("sfsf", "fdgd");
    }

}
