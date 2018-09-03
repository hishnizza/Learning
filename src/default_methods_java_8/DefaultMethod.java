/**
 * author Maria.Gavrilova
 * copyright 05.08.2018 © Devellar
 */

package default_methods_java_8;

public class DefaultMethod implements InterfaceDefaultMethod1, InterfaceDefaultMethod2 {

    @Override
    public int getNumber() {
        return 25;
    }

    @Override
    public void method1() {
        System.out.println("Method1");
    }

//    @Override
//    public String getString() {
//        return "Class realization";
//    }

    static String getStaticString() {
        return "InterfaceDefaultMethod1 - get Static String" + num;
    }

    public static void main(String[] args) {
        DefaultMethod method = new DefaultMethod();
        System.out.println(InterfaceDefaultMethod1.getStaticString() + num);
        System.out.println(method.getString() + num);
        InterfaceDefaultMethod1 interfaceDefaultMethod1 = method;
        interfaceDefaultMethod1.method1();
        ((InterfaceDefaultMethod2) method).method2();

    }

    @Override
    public void method2() {
        System.out.println("Method2");

    }
}
