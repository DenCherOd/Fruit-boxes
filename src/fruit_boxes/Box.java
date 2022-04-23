package fruit_boxes;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final T fruit;
    private List<T> amount;

    public Box(T fruit) {
        this.fruit = fruit;
        this.amount = new ArrayList<T>();
    }

    public void put() {
        this.amount.add(this.fruit);
    }

    public void put(List<T> fruits) {
        this.amount.addAll(fruits);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruits : amount) {
            weight += fruits.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (this.fruit.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void merge(Box<T> box) {
        this.amount.addAll(box.amount);
        box.amount.clear();
    }
}