package homework4.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionsFramework {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list5 = new ArrayList();
        ArrayList<Integer> list7 = new ArrayList();
        ArrayList<Integer> list23 = new ArrayList();
        ArrayList<Integer> list27 = new ArrayList();
        ArrayList<Integer> list25 = new ArrayList();
        ArrayList<Integer> list37 = new ArrayList();
        ArrayList<Integer> list35 = new ArrayList();
        ArrayList<Integer> list57 = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        for (Integer integer : list) {
            if (!hashSet.add(integer)) {
                System.out.println("Not all of elements are unique.");
                break;
            }
        }

        for (Integer integer : list) {
            if (integer % 2 == 0) {
                list2.add(integer);
            }
            if (integer % 3 == 0) {
                list3.add(integer);
            }
            if (integer % 5 == 0) {
                list5.add(integer);
            }
            if (integer % 7 == 0) {
                list7.add(integer);
            }
            if (integer % 2 == 0 && integer % 3 == 0) {
                list23.add(integer);
            }
            if (integer % 5 == 0 && integer % 7 == 0) {
                list57.add(integer);
            }
            if (integer % 2 == 0 && integer % 7 == 0) {
                list27.add(integer);
            }
            if (integer % 3 == 0 && integer % 7 == 0) {
                list37.add(integer);
            }
            if (integer % 2 == 0 && integer % 5 == 0) {
                list25.add(integer);
            }
            if (integer % 3 == 0 && integer % 5 == 0) {
                list35.add(integer);
            }
        }
        System.out.println("\nElements divided by 2");
        System.out.println(list2);
        System.out.println("\nElements divided by 3");
        System.out.println(list3);
        System.out.println("\nElements divided by 5");
        System.out.println(list5);
        System.out.println("\nElements divided by 7");
        System.out.println(list7);
        System.out.println("\nElements divided by 2 and 3");
        System.out.println(list23);
        System.out.println("\nElements divided by 5 and 7");
        System.out.println(list57);
        System.out.println("\nElements divided by 2 and 7");
        System.out.println(list27);
        System.out.println("\nElements divided by 3 and 7");
        System.out.println(list37);
        System.out.println("\nElements divided by 2 and 5");
        System.out.println(list25);
        System.out.println("\nElements divided by 3 and 5");
        System.out.println(list35);
    }
}
