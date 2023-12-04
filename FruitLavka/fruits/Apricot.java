package FruitLavka.fruits;

public class Apricot extends Fruit{
    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double calculateCost() {
        return 100 * getWeight();
    }
}
