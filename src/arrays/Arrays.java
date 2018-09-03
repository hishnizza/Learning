/**
 * author Maria.Gavrilova
 * copyright 19.07.2018 © Devellar
 */

package arrays;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Arrays {

    public static void main(String[] args) {
//        String [] contact = {"sex", "relax"};
//        int [][] num = {{5,6},{3,2}};
//
//        String [][] contactList = new String [3][2];
//
//        contactList[0][0] = "Vasya";
//        contactList[0][1] = "123456789";
//        contactList[1][0] = "Masha";
//        contactList[1][1] = "987654321";
//        contactList[2][0] = "Petya";
//        contactList[2][1] = "45321789";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(contactList[i][0] + "'s phone number is: " + contactList[i][1]);
//        }

        //заполнить матрицу последовательными цифрами
//        int[][] numbers = new int[8][6];
//        int k = 0;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                numbers[i][j] = k;
//                System.out.println(numbers[i][j]);
//                k++;
//            }
//        }



//        String[][] array = new String[5][9];
//        System.out.println(array.length);     //кол-во строк
//        System.out.println(array[0].length);  //кол-во столбцов

        // склеивание двух массивов
//        String [][] contact = new String[1][2];
//        contact[0][0] = "00";
//        contact[0][1] = "01";
//        String [][] contact_2 = new String [2][3];
//        contact_2[0][0] = "2_00";
//        contact_2[0][1] = "2_01";
//        contact_2[0][2] = "2_02";
//        contact_2[1][0] = "2_10";
//        contact_2[1][1] = "2_11";
//        contact_2[1][2] = "2_12";
//        String [][] added = new String[contact.length + contact_2.length][contact[0].length + contact_2[0].length];
//        System.arraycopy(contact, 0, added, 0, contact.length);
//        System.arraycopy(contact_2, 0, added, contact.length, contact_2.length);
//        System.out.println(added.length + " " + added[0].length);
//        System.out.println(added.length + " " + added[2].length);
//        System.out.println(added[0][0] + " " + added[0][1] + "\n"
//                + added[1][0] + " " + added[1][1] + " " + added[1][2] + "\n"
//                + added[2][0] + " " + added[2][1] + " " + added[2][2]);
//
//
//        String [][] added_2 = new String[contact.length + contact_2.length][contact[0].length + contact_2[0].length];
//        System.arraycopy(contact_2, 0, added_2, 0, contact_2.length);
//        System.arraycopy(contact, 0, added_2, contact_2.length, contact.length);
//        System.out.println(added_2.length + " " + added_2[0].length);
//        System.out.println(added_2.length + " " + added_2[2].length);
//        System.out.println(added_2[0][0] + " " + added_2[0][1] + " " + added_2[0][2] + "\n"
//                + added_2[1][0] + " " + added_2[1][1] + " " + added_2[1][2] + "\n"
//                + added_2[2][0] + " " + added_2[2][1]);

        //взять часть массива
//        int[][] big = new int [3][2];
//        big[0][0] = 0;
//        big[0][1] = 1;
//        big[1][0] = 2;
//        big[1][1] = 3;
//        big[2][0] = 4;
//        big[2][1] = 5;
//        int[][] small = new int [1][1];
//
//        System.arraycopy(big, 1, small, 0, small.length);
//        System.out.println(small[0][0] + " " + small[0][1]);

        //выбрать элементы массива, которые начинаюся на букву Я
//        String [] words = {"Яблоко", "Массон", "Ясеня", "Убунта", "Марокко", "Я"};
//        ArrayList<String> selectedWords = new ArrayList<>();
//        for (String word : words) {
//            if (word.startsWith("Я")) {
//                selectedWords.add(word);
//            }
//        }
//        System.out.println(selectedWords);

        //сортировка массива
//        String [] words = {"Яблоко", "Массон", "Ясеня", "Убунта", "Марокко", "Я"};
//        java.util.Arrays.sort(words);
//        System.out.println(java.util.Arrays.asList(words));

        //копирование массива
//        Integer[] num = {2,16,48,6,7,8,19,1};
//        java.util.Arrays.sort(num, 2, 6);
//        System.out.println(java.util.Arrays.asList(num));

//        Integer [] copy = java.util.Arrays.copyOf(num, num.length);
//        System.out.println(java.util.Arrays.deepToString(copy));
//
//        Integer[] copy_2 = java.util.Arrays.copyOf(num, 3);
//        System.out.println(java.util.Arrays.deepToString(copy_2));
//
//        Integer[] copy_3 = java.util.Arrays.copyOfRange(num, 2, 5);
//        System.out.println(java.util.Arrays.deepToString(copy_3));

        //сравнение массивов
//        Integer[] arr = {1,2,3,4,5,6};
//        Integer[] arr_3 = {1,2,3,4,5,6};
//        Integer[] arr_2 = {6,5,4,3,2,1};
//        System.out.println(java.util.Arrays.equals(arr, arr_2));
//        System.out.println(java.util.Arrays.equals(arr, arr_3));

    }
}
