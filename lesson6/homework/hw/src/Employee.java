import java.util.Scanner;

public class Employee {
    private String employeeID;
    private String employeeName;
    private Integer employeeAge;
    private String employeePhoneNumber;
    private String employeeEmail;
    private Long employeeBaseSalary;

    public Employee(String employeeID, String employeeName, Integer employeeAge, String employeePhoneNumber, String employeeEmail, Long employeeBaseSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeBaseSalary = employeeBaseSalary;
    }

    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
		return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Long getEmployeeBaseSalary() {
        return employeeBaseSalary;
    }

    public void setEmployeeBaseSalary(Long employeeBaseSalary) {
        this.employeeBaseSalary = employeeBaseSalary;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        setEmployeeID(sc.nextLine());
        setEmployeeName(sc.nextLine());
        setEmployeeAge(Integer.parseInt(sc.nextLine()));
        setEmployeePhoneNumber(sc.nextLine());
        setEmployeeEmail(sc.nextLine());
        setEmployeeBaseSalary(Long.parseLong(sc.nextLine()));
    }
}
