/**
 * author Maria.Gavrilova
 * copyright 05.08.2018 © Devellar
 */

package default_methods_java_8;

public interface InterfaceDefaultMethod1 {

    int num = 5;

    int getNumber();
    default String getString() {
        return "InterfaceDefaultMethod1" + num;
    }

    static String getStaticString() {
        return "InterfaceDefaultMethod1 - get Static String" + num;
    }

    void method1();
}
