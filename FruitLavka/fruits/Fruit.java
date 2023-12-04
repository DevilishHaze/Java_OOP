package FruitLavka.fruits;

public  abstract class Fruit {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }
    final void  printManufacturerInfo(){
        System.out.println("Made in Russian Federation");
    }
    public  abstract double calculateCost();
}
