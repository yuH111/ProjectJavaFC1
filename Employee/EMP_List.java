package Employee.src;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_List {
    ArrayList<Employee> b = new ArrayList<>();

    public void addNew() {
        Scanner a = new Scanner(System.in);
        int choice;
        System.out.println("Vui Long chon 1.PartTime/2.FullTime");
        choice = a.nextInt();
        Employee newEmployee;
        switch (choice) {
            case 1:
                newEmployee = new PartTime();
                newEmployee.intput();
                b.add(newEmployee);
                break;
            case 2:
                newEmployee = new FullTime();
                newEmployee.intput();
                b.add(newEmployee);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }
    }

    public void upDate(String EmpID) {
        for (Employee employee : b) {
            if (employee.getEmpID().endsWith(EmpID)) {
                employee.intput();
            }

        }
        System.out.println("Khong co nhan vien!");

    }

    public void find(String EmpID) {
        for (Employee employee : b) {
            if (employee.getEmpID().endsWith(EmpID)) {
                employee.output();
            }

        }
        System.out.println("Khong co nhan vien!");
    }

    public void delete(String EmpID) {
        b.removeIf(Employee -> Employee.getEmpID().equals(EmpID));
    }

    public void showEmployee() {
        if (b.isEmpty()) {
            System.out.println("Khong co danh sach nhan vien:");
        } else {
            System.out.println("Danh sach nhan vien: ");
            for (Employee employee : b) {
                employee.output();
                System.out.println("---------------------------------");
            }
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1.Them nhan vien moi ");
            System.out.println("2.Cap nhan thong tin nhan vien ");
            System.out.println("3.Tim thong tin nhan vien");
            System.out.println("4.Xoa thong tin nhan vien ");
            System.out.println("5.Hien thi ra thong tin nhan vien");
            System.out.println("6. Exit");
            System.out.println("Nhap vao su lua chon cua ban:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    System.out.println("Nhap vao ID ban can cap nhat thong tin cho nhan vien:");
                    String ab = sc.nextLine();
                    upDate(ab);
                    break;
                case 3:
                    System.out.println("Nhap vao id ban can tim: ");
                    String ac = sc.nextLine();
                    find(ac);
                    break;
                case 4:
                    System.out.println("Nhap vao id nhan vien ban can xoa: ");
                    String ad = sc.nextLine();
                    delete(ad);
                    break;
                case 5:
                    showEmployee();
                    break;
                case 6:
                    System.out.println("Thoat khoi program......");
                    break;
                default:
                    System.out.println("Lua chon khong hop le: ");
                    break;

            }
        } while (choice != 0);

    }

    public static void main(String[] args) {
        EMP_List a = new EMP_List();
        a.menu();
    }
}
