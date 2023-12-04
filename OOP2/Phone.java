package OOP2;

import java.util.Objects;

public class Phone implements java.io.Serializable {
    private int number;
    private int weight;
    private String model;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "номер =" + number +
                ", вес =" + weight +
                ", модель ='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && weight == phone.weight && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, weight, model);
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void receiveCall(String Call_name) {
        System.out.println("Звонит " + Call_name);
    }

    public void receiveCall(String Call_name, int Caller_number) {
        System.out.println("Звонит " + Call_name + " номер " + Caller_number);
            }



    public void sendMessage(String message, int... polychatelsPhones) {
System.out.println();
        for (int polychatel_phone : polychatelsPhones) {
            System.out.println(" Cобщение на номер " + polychatel_phone + ": " + message);
        }
    }
    }
