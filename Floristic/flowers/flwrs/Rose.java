package Floristic.flowers.flwrs;

import Floristic.flowers.flwrs.Flower;

public class Rose extends Flower {
    public Rose(String countryOforigin, int price, int expiryDays) {
        super(countryOforigin, price, expiryDays);
    }

    @Override
    public String getName() {
        return "Роза";
    }
}
