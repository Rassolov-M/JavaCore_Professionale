package lesson1.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

//        taskOne();
//        taskTwo();
        taskThree();

    }

    public static void taskTwo() {
        String[] arrString = {"A", "B", "C"};
        System.out.println("Начальный тип массива "+Arrays.toString(arrString));

        primitiveArrayToList(arrString);
    }


    public static void taskOne() {
        Integer arrInt[] = {1, 2};
        String arrString[] = {"A", "B"};

        swapped(arrInt, 0, 1);
        swapped(arrString, 0, 1);
    }

    private static void swapped(Object[] array, int i, int j) {
        System.out.println("Задача 1: " + Arrays.toString(array));
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        System.out.println("Результат замены: " + Arrays.toString(array) + "\n");
    }

    public static <T> void primitiveArrayToList(T[] arr) {
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Конвертация: "+alt);
    }


    public static void taskThree() {
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println("Корзина яблок " + boxWithApple.getWeight());
        System.out.println("Корзина апельсинов  " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox().toString());
        System.out.println(anotherBoxWithOranges.getBox().toString());
    }

}