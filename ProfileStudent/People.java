package Project.src;

import java.util.Scanner;

public class People {
    String Hovaten, Gioitinh, Ngaysinh, Diachi;

    public People() {
    }

    public People(String Hovaten, String Gioitinh, String Ngaysinh, String Diachi) {
        this.Hovaten = Hovaten;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void input() {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter FullName: ");
            Hovaten = a.nextLine();

        System.out.println("Vui long nhap Gioi tinh: ");
            Gioitinh = a.nextLine();

        System.out.println("Vui long nhap Ngay Sinh: ");
            Ngaysinh = a.nextLine();

        System.out.println("Vui long nhap Dia Chi: ");
            Diachi = a.nextLine();
    }

    public void output() {
        System.out.println("Ho Ten Sinh Vien: "+getHovaten());
        System.out.println("Gioi Tinh: "+getGioitinh());
        System.out.println("Ngay Sinh: "+getNgaysinh());
        System.out.println("Dia Chi: "+getDiachi());

 }
}
