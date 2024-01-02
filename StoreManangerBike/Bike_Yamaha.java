package Project.src;

import java.util.Date;
import java.util.Scanner;

public class Bike_Yamaha extends Bike {
    public double getSurcharge() {
        return surcharge;
    }
    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    private double surcharge;
    
public void input(){
    Scanner a = new Scanner(System.in);
        System.out.println("Vui long nhap vao phu phi: ");
            surcharge = a.nextDouble();
            super.input();
}
public void output(){
        System.out.println("Surchare: "+getSurcharge());
        System.out.println("Discount: "+discount());
        System.out.println("Total Bill: "+totalBill());
        super.output();
}
    public double totalBill() {
        return getNum() * getPrice() + surcharge - discount();
    }

    public double discount() {
        return getNum() * getPrice() * 0.05;
    }
}
