package Company_pr4.vehicles;

import Company_pr4.details.Engine;
import Company_pr4.profess.Driver;

public class Lorry extends Car{
    private int carryingCapacity;

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int carryingCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;

    }

    @Override
    public String toString() {
        return super.toString()  +
                "\nГрузоподъемность : " + carryingCapacity ;
    }
}
