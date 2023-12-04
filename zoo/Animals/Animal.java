package zoo.Animals;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public abstract void getDescription();


}
