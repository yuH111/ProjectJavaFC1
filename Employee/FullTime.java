package Employee.src;

import java.util.Scanner;

public class FullTime extends Employee {
    private double cofficients;
    private double Senioririty;

    public double getCofficients() {
        return cofficients;
    }

    public void setCofficients(double cofficients) {
        this.cofficients = cofficients;
    }

    public double getSenioririty() {
        return Senioririty;
    }

    public void setSenioririty(double senioririty) {
        Senioririty = senioririty;
    }

    public void input() {
        Scanner b = new Scanner(System.in);
        super.intput();
        System.out.println("Vui Long nhap vao he so luong cua Full Time: ");
            cofficients = b.nextDouble();
        System.out.println("Vui long nhap vao so nam lam viec: ");
            Senioririty = b.nextDouble();
    }

    public void output() {
        super.output();
        System.out.println(" He So Luong FullTime: " + getCofficients());
        System.out.println(" Senioririty: "+getSenioririty());
        System.out.println(" Tong Luong: "+calculateSalary());
    }

    public double calculateSalaryAllowance() {
        if (Senioririty >= 10) {
            return basicsalary * cofficients + 1000000;
        } else if (Senioririty >= 5) {
            return basicsalary * cofficients + 500000;

        } else {
            return 0;
        }
    }
    public void assA(){
        /*asdasdasdasdasd
         * asdasdasdasd
         * asdasdasd
         * asdasdasd
         * asdassdss
         */
    }
    public double calculateSalary() {
        return calculateSalaryAllowance();
    }

}
