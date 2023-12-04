package zoo;

import zoo.Animals.Animal;
import zoo.Animals.Bear;
import zoo.Animals.Cat;
import zoo.Animals.Dog;
import zoo.vet.Veterinar;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(" Барбос"),
                new Cat(" Мурзик"),
                new Bear(" Борис")
        };

        Veterinar vet = new Veterinar();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
          System.out.println();
       }

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            System.out.println();
        }
}}
