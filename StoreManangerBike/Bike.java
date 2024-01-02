package Project.src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

interface IMotoBike {

}

public abstract class Bike {
    protected String bikeID;
    private String manufacturer;
    private Date entryDate;
    private double price;
    private double num;
    public abstract double discount();
        
    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void input() {
        Scanner a = new Scanner(System.in);
        SimpleDateFormat b = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nhap vao bikeID: ");
        bikeID = a.nextLine();
        System.out.println("Nhap vao Nha may san xuat: ");
        manufacturer = a.nextLine();
        System.out.println("Nhap vao ngay san xuat: ");
        try {
            entryDate = b.parse(a.nextLine());
        } catch (ParseException ex) {
            System.out.println("Loi!");
        }
        System.out.println("Nhap vao so luong xe: ");
        num = a.nextInt();
    }

    public void output() {
        System.out.println("Ma Xe:  " + getBikeID());
        System.out.println("Nha May San Xuat: " + getManufacturer());
        System.out.println("Ngay San Xuat: " + getEntryDate());
        System.out.println("Gia: " + getPrice());
        System.out.println("So Luong Xe: " + getNum());
    }
}
