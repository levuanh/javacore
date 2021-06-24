import java.util.Scanner;
public class Bmi {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap chi so can nang(kg): ");
      double canNang = sc.nextDouble();
      System.out.print("Nhap chi so chieu cao(m): ");
      double chieuCao = sc.nextDouble();
      double BMI = canNang / (chieuCao * chieuCao);
      System.out.print("Chi so BMI la " + BMI);
   }
}