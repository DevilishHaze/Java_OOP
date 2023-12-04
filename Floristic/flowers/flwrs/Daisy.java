package Floristic.flowers.flwrs;

public class Daisy extends Flower {
    public Daisy(String countryOforigin, int price, int expiryDays) {
        super(countryOforigin, price, expiryDays);
    }

    @Override
    public String getName() {
        return "Маргаритка";
    }
}
