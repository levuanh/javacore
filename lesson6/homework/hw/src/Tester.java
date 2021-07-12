import java.util.Scanner;

public class Tester extends Employee {
    private int bugNumber;

    public Tester(String employeeID, String employeeName, Integer employeeAge, String employeePhoneNumber, String employeeEmail, Long employeeBaseSalary, int bugNumber) {
        super(employeeID, employeeName, employeeAge, employeePhoneNumber, employeeEmail, employeeBaseSalary);
        this.bugNumber = bugNumber;
    }

    public Tester() {
    }

    public int getBugNumber() {
        return bugNumber;
    }

    public void setBugNumber(int bugNumber) {
        this.bugNumber = bugNumber;
    }

    public String getTotalSalary() {
        return getEmployeeBaseSalary() + bugNumber * 50000L;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin Tester");
        super.input();
        bugNumber = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return " ID Tester=" + getEmployeeID() +" Ten Nhan vien=" + getEmployeeName() +" Luong" + getTotalSalary();
    }
}
