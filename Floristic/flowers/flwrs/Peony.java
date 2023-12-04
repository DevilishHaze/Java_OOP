package Floristic.flowers.flwrs;

public class Peony extends Flower {
    public Peony(String countryOforigin, int price, int expiryDays) {
        super(countryOforigin, price, expiryDays);
    }

    @Override
    public String getName() {
        return "Пион";
    }
}
