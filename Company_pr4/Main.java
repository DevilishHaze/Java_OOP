package Company_pr4;

import Company_pr4.details.Engine;
import Company_pr4.profess.Driver;
import Company_pr4.vehicles.Car;
import Company_pr4.vehicles.Lorry;
import Company_pr4.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver(25, "Иван", 5);
        Driver driver2 = new Driver(45,"Ибрагим",25);
        Driver driver3 = new Driver(33,"Владимир",15);

        Engine engine1 = new Engine(200, "Honda Motor Company ");
        Car car1 = new Car("Toyota", "Sedan", 1500, driver1, engine1);
        Lorry lorry1 = new Lorry("Volvo", "Truck", 5000,driver2,engine1,5000);
        SportCar sportCar1 = new SportCar("Ferrari", "Sports", 1200, driver3, engine1, 300);

        // Выводим информацию
        System.out.println("Легковой автомобиль:");
        System.out.println(car1);
        car1.start();
        car1.turnLeft();
        System.out.println();

        System.out.println("Грузовик:");
        System.out.println(lorry1);
        lorry1.start();
        lorry1.turnRight();
        lorry1.stop();
        System.out.println();

        System.out.println("Спортивный автомобиль:");
        System.out.println(sportCar1);
        sportCar1.turnRight();
        sportCar1.stop();
    }
}

