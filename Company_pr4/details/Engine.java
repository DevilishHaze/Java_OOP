package Company_pr4.details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;

    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return
                "\nМощность : " + power +
                ",  Компания производитель : " + company;
    }
}
