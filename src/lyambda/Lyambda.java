/**
 * author Maria.Gavrilova
 * copyright 07.08.2018 © Devellar
 */

package lyambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lyambda {

    static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//    public static void main(String[] args) {
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
//    }

    public static void main(String[] args) {
        Collections.sort(names,
                (String a, String b) -> b.compareTo(a));
        Collections.sort(names,
                (a, b) -> b.compareTo(a));

        funcUsesLyambda(new LyambdaInterface() {
            @Override
            public int callMeLyambda(String str) {
                return 0;
            }
        });

        funcUsesLyambda((v) -> 0);


    }

    private static void funcUsesLyambda(LyambdaInterface li) {
        System.out.println("Lyambda is used");
    }

//    class Something {
//        String startsWith(String s) {
//            return String.valueOf(s.charAt(0));
//        }
//
//        Something something = new Something();
//        Converter<String, String> converter = something::startsWith;
//        String converted = converter.convert("Java");
//        System.out.println(converted);    // "J"
//    }
}
