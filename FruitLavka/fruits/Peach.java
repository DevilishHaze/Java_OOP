package FruitLavka.fruits;

import FruitLavka.fruits.Fruit;

public class Peach extends Fruit {
    public Peach(double weight) {
        super(weight);
    }

    @Override
    public double calculateCost() {
        return 270 * getWeight();
    }
}
