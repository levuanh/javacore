import java.util.Scanner;

public class Coder extends Employee {
    private Integer otTime;

    public Coder(String employeeID, String employeeName, Integer employeeAge, String employeePhoneNumber, String employeeEmail, Long employeeBaseSalary, Integer otTime) {
        super(employeeID, employeeName, employeeAge, employeePhoneNumber, employeeEmail, employeeBaseSalary);
        this.otTime = otTime;
    }

    public Coder() {
    }

    public Integer getOtTime() {
        return otTime;
    }

    public void setOtTime(Integer otTime) {
        this.otTime = otTime;
    }

    public String getCoderSalary() {
        return formatSalary(getEmployeeBaseSalary() + getOtTime() * 200000;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin Coder");
        super.input();
        otTime = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return " ID Coder=" + getEmployeeID() +" Ten Nhan vien=" + getEmployeeName() +" Luong" + getCoderSalary();
    }
}