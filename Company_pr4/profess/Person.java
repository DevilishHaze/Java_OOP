package Company_pr4.profess;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  " Возраст : " + age +
                ", Имя : " + name ;
    }

    public Person(int age, String name){
        this.name=name;
        this.age=age;

    }
}
