package Floristic.flowers.flwrs;

public class Orchid extends Flower {
    public Orchid(String countryOforigin, int price, int expiryDays) {
        super(countryOforigin, price, expiryDays);
    }

    @Override
    public String getName() {
        return "Орхидея";
    }
}
