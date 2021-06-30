import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      String str, strDaoNguoc = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Nhap mot string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         strDaoNguoc = strDaoNguoc + str.charAt(i);
 
      if (str.equals(strDaoNguoc))
         System.out.println(str + " la Palindrome");
      else
         System.out.println(str + "khong phai la Palindrome");
 
   }
}