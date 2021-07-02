import java.util.Arrays;
import java.util.Scanner;

public class ReadingJava {
   public static void main(String args[]) {
	  String soSanh ="Java";
	  int count, index = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("nhap do dai mang:");
      int length = scan.nextInt();
      String [] javaArray = new int[length];
      System.out.println("Nhap gia tri phan tu:");

      for(int i=0; i<length; i++ ) {
         javaArray[i] = scan.nextInt();
      }

      System.out.println(Arrays.toString(javaArray));
	  for(i = 0; i < length; i++)
        {
            if(javaArray[i].equals(soSanh))
            {
                count++;
				index = i;
            }
        }
        System.out.println("So lan xuat hien cua Java:"+ count);
		System.out.println("Index cua Java:"+ index;
	  
   }
}