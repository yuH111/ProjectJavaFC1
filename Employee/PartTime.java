package Employee.src;

import java.util.Scanner;

public class PartTime extends Employee {
    private int numberworkofday;
    private double Senioririty;
	public int getNumberworkofday() {
		return numberworkofday;
	}
	public void setNumberworkofday(int numberworkofday) {
		this.numberworkofday = numberworkofday;
	}
	public double getSenioririty() {
		return Senioririty;
	}
	public void setSenioririty(double senioririty) {
		Senioririty = senioririty;
	}
    public void intput(){
        Scanner a = new Scanner ( System.in);
          super.intput();
            System.out.println("Vui long nhap vao so ngay lam viec: ");
                numberworkofday = a.nextInt();
            System.out.println("Vui long nhap vao so nam lam viec: ");
                Senioririty = a.nextDouble();
    }
    public void output(){
       super.output();
        System.out.println("So ngay lam viec: "+getNumberworkofday());
        System.out.println("So nam lam viec: "+getSenioririty());
        System.out.println("Tong luong: "+calculateSalary() );
    }
    public double calculateSalaryAllowance() {
        if (Senioririty >= 10) {
            return basicsalary * numberworkofday/26 + 500000;
        } else if (Senioririty >= 5) {
            return basicsalary * numberworkofday/26 + 300000;

        } else {
            return 0;
        }
    }
    public double calculateSalary() {
        return calculateSalaryAllowance();
    }
}
