package lesson1.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {


        arrRevers();

    }

    public static void arrRevers() {
        Integer arr[] = {1, 2};
        String  arrString[] = {"A","B","C"};
        swapped(arr, 0, 1);
        swapped(arrString, 0, 1);
    }

    private static void swapped(Object[] array, int i, int j) {
        System.out.println("Задача 1: "+ Arrays.toString(array));
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        System.out.println("\n" + "Результат замены: "+Arrays.toString(array));

    }


}