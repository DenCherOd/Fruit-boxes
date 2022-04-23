package toListMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Hello ", "World", "!"};
        String[] array2 = {"1", "2", "3"};
        System.out.println(toList(array));
        System.out.println(toList(array2));
    }

    public static <T> List<T> toList(T[] array) {
        return new ArrayList<>(List.of(array));
    }
}