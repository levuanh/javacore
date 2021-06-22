public class App {
    public static void main(String[] args) throws Exception {
        String name = "Le Vu Anh";
        System.out.println("My name is " + name);
        String address = "Techmaster";
        System.out.println("I am studying at " + address);
        int dob = 1992;
        int age = 2021 - dob;
        int currentYear = age + 1992;
        System.out.println("My age is " + age);
        System.out.println("Current year is " +currentYear);
        System.out.println("Division result is " + dob / 2);
        System.out.println("Multiple result is " + dob*2);
    }
}
