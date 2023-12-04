package zoo.Animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(" Пес по имени" + name + " делает Гав-гав!Ауу!");
    }

    @Override
    public void eat() {
        System.out.println("Рацион животного:\nСухой,влажный корм.Мясо");
    }

    @Override
    public void getDescription() {
        System.out.println("Пес по имени " + name);
    }
}
