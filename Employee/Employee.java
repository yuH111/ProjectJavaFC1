package Employee.src;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Employee implements IEMPLOYEE {
    private String EmpID;
    private String Empname;
    private LocalDate DateofBirth;
    private int Age;
    public String getAge() {
        ///
        ///
        //
        //
        //
        return Age;
    }
    public void setAGe(String getAge) {
        Age = Age;
    }
    public String getEmpID() {
        return EmpID;
    }
    public void setEmpID(String empID) {
        EmpID = empID;
    }
    public String getEmpname() {
        return Empname;
    }
    public void setEmpname(String empname) {
        Empname = empname;
    }
    public LocalDate getDateofBirth() {
        return DateofBirth;
    }
    public void setDateofBirth(LocalDate dateofBirth) {
        DateofBirth = dateofBirth;
    }
public void intput(){
    Scanner a = new Scanner(System.in);
        System.out.println("Enter EmpID: ");
            EmpID = a.nextLine();
        System.out.println("Enter EmpName: ");
            Empname = a.nextLine();
        System.out.println("Enter Date: ");
            DateofBirth = LocalDate.now();
    }
public void output(){
        System.out.println(" EmpID: "+ getEmpID());
        System.out.println(" EmpName: "+getEmpname());
        System.out.println(" Date: "+getDateofBirth());
}    
}
