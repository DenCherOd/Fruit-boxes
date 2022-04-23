package fruit_boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit apple1 = new Apple();
        Fruit orange = new Orange();

        Box<Apple> boxApple = new Box(apple);
        Box<Apple> box2 = new Box(apple);
        Box<Orange> boxOrange = new Box(orange);

        List<Apple> apples = new ArrayList(Arrays.asList(apple, apple1));
        boxApple.put(apples);
        boxApple.put();
        System.out.println("Вес коробки с яблоками: " + boxApple.getWeight());

        box2.put();

        boxOrange.put();
        boxOrange.put();

        System.out.println("Вес коробки с апельсинами: " + boxOrange.getWeight());

        System.out.println("Высыпаем в коробку с яблоками box2");
        boxApple.merge(box2);
        System.out.println("Вес коробки с яблоками после пересыпания: " + boxApple.getWeight());

        System.out.println(boxApple.compare(boxOrange));
    }
}