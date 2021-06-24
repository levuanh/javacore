import java.util.Scanner;
public class Pitago {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double canh1, canh2, canhHuyen;          
        System.out.print("Nhap gia tri canh vuong 1: ");
        canh1 = sc.nextDouble();
        System.out.print("Nhap gia tri canh cuong 2: ");
        canh2 = sc.nextDouble();
        canhHuyen = Math.sqrt((canh1*canh1)+(canh2*canh2));
        System.out.println("Gia tri canh huyen: " + canhHuyen);
    }
    
}
