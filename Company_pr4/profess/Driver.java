package Company_pr4.profess;
public class Driver extends Person {
    private int driving_exp;

    public Driver(int age, String name, int driving_exp) {
        super(age, name);
        this.driving_exp = driving_exp;
    }

    public void setDriving_exp(int driving_exp) {
        this.driving_exp = driving_exp;
    }

    public int getDriving_exp() {
        return driving_exp;

    }

    @Override
    public String toString() {
        return super.toString()  +
                " ,Стаж вождения : " + driving_exp;
    }
}


