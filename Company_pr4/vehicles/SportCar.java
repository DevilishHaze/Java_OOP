package Company_pr4.vehicles;

import Company_pr4.details.Engine;
import Company_pr4.profess.Driver;

public class SportCar extends Car{
    private double  max_speed;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, double max_speed) {
        super(brand, carClass, weight, driver, engine);
        this.max_speed = max_speed;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\nМаксимальная скорость : " + max_speed;
    }
}
