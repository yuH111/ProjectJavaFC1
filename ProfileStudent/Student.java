package Project.src;

import java.util.Scanner;

public class Student extends People {
    String MaSv, email;
    float mark;

    public Student() {
    }

    public Student(String MaSv, String email, float mark, String fullname, String gender, String birthday,
            String address) {
        super(fullname, gender, birthday, address);
        this.MaSv = MaSv;
        this.email = email;
        this.mark = mark;
    }

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Loi! Vui long nhap lai: ");
        }
        return false;
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.out.println("Yeu cau: mark >= 0 & mark <= 10");
        }
        return false;
    }

    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lai MaSv: ");
        MaSv = scan.nextLine();
        System.out.println("Nhap lai email: ");
        while (true) {
            String inputEmail = scan.nextLine();
            if (setEmail(inputEmail)) {
                break;
            }
            System.out.println("Nhap lai email !!!");
        }
        System.out.println("Nhap lai mark: ");
        while (!setMark(Float.parseFloat(scan.nextLine()))) {
            System.out.println("Nhap lai mail !!!");
        }
    }

    public void output() {
        super.output();
        System.out.println("Ho Ten: "+getHovaten());
        System.out.println("Gioi Sinh: "+getGioitinh());
        System.out.println("Ngay Sinh: "+getNgaysinh());
        System.out.println("Dia Chi: "+getDiachi());

    }

    public boolean checkCerfiticate() {
        return mark >= 8;
    }
}
