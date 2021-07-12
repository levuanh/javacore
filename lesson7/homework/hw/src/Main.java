import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
		productList.add(new Product("1", "sp1", "mo ta 1", 30000000L, 1, 2, "brand 1", Category.LAPTOP));
        productList.add(new Product("2", "sp2", "mo ta 2", 10000000L, 1, 2, "brand 2", Category.PHONE));
        productList.add(new Product("3", "sp3", "mo ta 3", 30000000L, 1, 2, "brand 3", Category.LAPTOP));
        productList.add(new Product("4", "sp4", "mo ta 4", 20000000L, 1, 2, "brand 4", Category.APPLE));
    
;

        Scanner sc = new Scanner(System.in);
        System.out.println("Chon phuong thuc nhap");
        int inputNumber = Integer.parseInt(sc.nextLine());

        //1. via category
        switch (inputNumber) {
            case 1:
            {
                System.out.println("chon danh muc: 1 - Phone, 2 - Laptop, 3 - Apple, 4 - Accessories");
                int inputCat = Integer.parseInt(sc.nextLine());
                switch (inputCat) {
                    case 1:
                        for (Product product : productList) {
                            if (product.getCategory().toString().equals("PHONE")) {
                                System.out.println(product);
                            }
                        }
                        break;
                    case 2:
                        for (Product product : productList) {
                            if (product.getCategory().toString().equals("LAPTOP")) {
                                System.out.println(product);
                            }
                        }
                        break;
                    case 3:
                        for (Product product : productList) {
                            if (product.getCategory().toString().equals("APPLE")) {
                                System.out.println(product);
                            }
                        }
                        break;
                    case 4:
                        for (Product product : productList) {
                            if (product.getCategory().toString().equals("ACCESSORIES")) {
                                System.out.println(product);
                            }
                        }
                        break;
                    default: System.out.println("Invalid input value");
                }
            }
            break;
           
            case 2:
            {
                System.out.println("nhap nhan hieu: ");
                String brandName = sc.nextLine();
              
                for (Product product: productList) {
                    if (product.getBrand().equalsIgnoreCase(brandName)) {
                        System.out.println(product);
                        
                    }else {
                    System.out.println("nhap sai");
                }
					
                }
            }

            break;
            

         
            case 3 : {
                System.out.println("nhap ten san pham: ");
                String inputName = sc.nextLine();
                boolean isNameValid = false;
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(inputName)) {
                        System.out.println(product);
                  
                    } else {
                    System.out.println("nhap sai");
                }
                }
			}
                break;
                
            
            default: System.out.println("nhap sai");
        }
    }
}
