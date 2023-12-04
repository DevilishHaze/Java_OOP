package zoo.Animals;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Рацион животного:\nСухой,влажный корм,пакетики.");

    }

    @Override
    public void makeNoise() {
        System.out.println(" Кот по имени" + name + " делает Мяу!Шшш!!Мур-мур!");
    }

    @Override
    public void  getDescription() {
        System.out.println("Кот по имени"+ name);
    }
}
