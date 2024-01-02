package Project.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Listbike1 {
    ArrayList<Bike> a = new ArrayList<>();
    Scanner b = new Scanner(System.in);

    public void addNew() {
        int choice;
        System.out.println("Vui long chon loai xe 1.Honda/2.Yamaha");
        choice = b.nextInt();
        b.nextLine();
        Bike newBike;
        switch (choice) {
            case 1:
               newBike = new Bike_Honda();
                newBike.input();
                a.add(newBike);
                break;
            case 2:
                newBike = new Bike_Yamaha();
                newBike.input();
                a.add(newBike);
            default:
                System.out.println("Lua chon khong hop le:");
                break;
        }
    }

    public void update(String bikeID) {
        for (Bike bike : a) {
            if (bike.getBikeID().equals(bikeID)) {
                bike.input();
                return;
            }
        }
        System.out.println("Bike not found!");
    }

    public void delete(String bikeID) {
        a.removeIf(bike -> bike.getBikeID().equals(bikeID));
    }

    public void find(String bikeID) {
        for (Bike bike : a) {
            if (bike.getBikeID().equals(bikeID)) {
                bike.output();
                return;
            }
        }
        System.out.println("Bike not found!");
    }

    public void showBikes() {
        if (a.isEmpty()) {
            System.out.println("No bikes in the list");
        } else {
            System.out.println("List of Bikes:");
            for (Bike bike : a) {
                bike.output();
                System.out.println("------------------");
            }
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Them xe moi");
            System.out.println("2. Cap nhat thong tin cua xe ");
            System.out.println("3. Xoa xe");
            System.out.println("4. Find Bike");
            System.out.println("5. Hien thi ra thong tin cua cac xe");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            Scanner c = new Scanner(System.in);
            choice = c.nextInt();
            c.nextLine();
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    System.out.println("Enter bikeID to update:");
                    String updateID = c.nextLine();
                    update(updateID);
                    break;
                case 3:
                    System.out.println("Enter bikeID to delete:");
                    String deleteID = c.nextLine();
                    delete(deleteID);
                    break;
                case 4:
                    System.out.println("Enter bikeID to find:");
                    String findID = c.nextLine();
                    find(findID);
                    break;
                case 5:
                    showBikes();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        Listbike1 bikeList = new Listbike1();
        bikeList.menu();
    }

}
