package Floristic.flowers.flwrs;

public   class Flower {
    protected String countryOforigin;
    protected int price;
    protected int expiryDays;

    public Flower(String countryOforigin, int price, int expiryDays) {
        this.countryOforigin = countryOforigin;
        this.price = price;
        this.expiryDays = expiryDays;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return getName();
    }
}

