package collectionframeworks.pms;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    static void menu(){
        System.out.print("""
                ============| PMS | ===========
                1. Create Product
                2. Update Product By ID
                3. Delete Product By ID
                4. Get All Products
                5. Get Product By ID
                0. Exit
                ===============================
                """);
    }

    //validate is match to a menu
    static boolean isMatchOption(String input, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductServices services = new ProductServiceImpl();

        int option = -1;
        do {

            menu();
            System.out.print("Enter the option -> ");

            String input = scanner.nextLine();
            if(isMatchOption(input, "[0-5]")){
                option = Integer.parseInt(input);
            }

            switch (option){
                case 1:{
                    Product product = new Product();

                    System.out.println("===============================");
                    System.out.print("Enter product name: ");
                    product.setName(scanner.nextLine());
                    System.out.print("Enter product price: ");
                    product.setPrice(Double.parseDouble(scanner.nextLine()));
                    System.out.print("Enter product quantity: ");
                    product.setQty(Integer.parseInt(scanner.nextLine()));

                    if(services.create(product)){
                        System.out.println("===============================");
                        System.out.println("Created product successfully");
                    }else {
                        System.out.println("Failed to create product");
                    }
                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 4:{
                    List<Product> products = services.getAll();
                    System.out.println("===========| Product Lists |===========");
                    System.out.printf("%-5s %-15s %-10s %-10s\n", "ID", "Name", "Price", "Quantity");
                    for(Product p : products){
                        System.out.printf("%-5d %-15s %-10.2f %-10d\n",
                                p.getId(),
                                p.getName(),
                                p.getPrice(),
                                p.getQty()
                        );
                    }
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                case 5:{
                    System.out.print("Enter Id: ");
                    Long id = Long.parseLong(scanner.nextLine());
                    Product product = services.getById(id);
                    System.out.println("===========| Product Lists |===========");
                    System.out.printf("%-5s %-15s %-10s %-10s\n", "ID", "Name", "Price", "Quantity");
                    System.out.printf("%-5d %-15s %-10.2f %-10d\n",
                            product.getId(),
                            product.getName(),
                            product.getPrice(),
                            product.getQty()
                    );
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    break;
                }

                case 0:
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalided option!");
            }

        }while (option!=0);
    }
}
