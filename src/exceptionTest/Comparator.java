/**
 * author Maria.Gavrilova
 * copyright 23.07.2018 © Devellar
 */

package exceptionTest;

import java.util.NoSuchElementException;

public class Comparator {

    public static void assertEquals(int a, int b) throws Exception {
        if (!(a == b))
            throw new Exception();
    }

    public static void assertEquals(double a, double b) {
        if (a == b) {
            throw new NoSuchElementException();
        }
    }

    public static void assertEquals(float a, float b) {
        if (a == b) {
            throw new OutOfMemoryError("dfsf");
        }
    }

    public static void assertEquals(String a, String b) throws GetOutOfMyLifeException {
        if (!a.equals(b)) {
            throw new GetOutOfMyLifeException();
        }
    }
}

