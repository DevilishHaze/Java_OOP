package Company_pr4.vehicles;

import Company_pr4.details.Engine;
import Company_pr4.profess.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }



    public void start(){
        System.out.println("Поехали!");
    }
    public void stop(){
        System.out.println("Стоп!");
    }
    public void turnRight(){
        System.out.println("Поверни направо!");
    }
    public void turnLeft(){
    System.out.println("Поверни налево!");
}

    @Override
    public String toString() {
        return "Марка : " + brand  +
                ", Класс : " + carClass  +
                ", Вес : " + weight +
                ",  \nВодитель : " + driver +
                ", \nДвигатель: " + engine ;
    }
}


