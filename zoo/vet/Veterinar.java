package zoo.vet;

import zoo.Animals.Animal;

public class Veterinar {
    public void treatAnimal(Animal animal){
        System.out.println("Ветеринар обслуживает");
        animal.getDescription();
    }
}
