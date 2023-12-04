package zoo.Animals;

public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(" Медведь  по имение"+name+" делает Бэээеее!");
    }

    @Override
    public void eat() {
System.out.println("Рацион животного:\nВсеяден.Предпочтительно мясо.");
    }

    @Override
    public void getDescription() {
        System.out.println("Медведь по имени"+name);

    }
}