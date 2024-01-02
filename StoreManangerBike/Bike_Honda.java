package Project.src;

import java.util.Date;

public class Bike_Honda extends Bike {
    private String state;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double totalBill() {
        return getNum() * getPrice() - discount();
    }

    public double discount() {
        if (state.equals("new")) {
            return getNum() * getPrice() * 0.1;
        }

        else if (state.equals("old")) {
            return getNum() * getPrice() * 0.5;
        } else {
            return 0;
        }

    }

    public void output() {
        super.output();
    }
}
