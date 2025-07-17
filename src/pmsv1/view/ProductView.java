package pmsv1.view;

import pmsv1.exception.ProductException;
import pmsv1.model.Product;
import pmsv1.service.ProductService;
import pmsv1.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private final static Scanner scanner = new Scanner(System.in);
    private final static ProductService service = new ProductServiceImpl();

    public static void menu(){
        System.out.println("===================| PMS Menu |===================");
        System.out.print("""
                1. Create product
                2. Update product by id
                3. Delete product by id
                4. Get all product
                5. Get product by id
                0. Exit
                ==================================================
                """);
    }

    public static void operationProcess(int option){
        switch (option){
            case 1: {
                System.out.println("================| Create Product |================");
                while (true){
                    try{
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter product price: ");
                        Double price = Double.parseDouble(scanner.nextLine());

                        System.out.print("Enter product qty: ");
                        Integer qty = Integer.parseInt(scanner.nextLine());

                        Product product = new Product(name, price, qty);
                        if(service.createProduct(product)){
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("Created product successfully");
                            break;
                        }else {
                            System.out.println("!! Failed to create product");
                        }
                    }catch (ProductException | NumberFormatException e){
                        System.out.println(e.getMessage());
                    }
                }
                break;
            }
            case 2:{
                System.out.println("================| Update Product |================");
                while (true){
                    try{
                        System.out.print("Enter product id: ");
                        Long id = Long.parseLong(scanner.nextLine());

                        Product existProduct = service.getProductById(id);

                        System.out.print("Enter product name: ");
                        existProduct.setName(scanner.nextLine());

                        System.out.print("Enter product price: ");
                        existProduct.setPrice(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Enter product qty: ");
                        existProduct.setQty(Integer.parseInt(scanner.nextLine()));

                        if(service.updateProductById(id, existProduct)){
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("Updated product successfully");
                            break;
                        }else {
                            System.out.println("!! Failed to update product");
                        }
                    }catch (ProductException | NumberFormatException | NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                }
                break;
            }
            case 3:{
                System.out.println("================| Delete Product |================");
                while (true){
                    try{
                        System.out.print("Enter product id: ");
                        Long id = Long.parseLong(scanner.nextLine());

                        if(service.deleteProductById(id)){
                            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                            System.out.println("Deleted product successfully");
                            break;
                        }else {
                            System.out.println("!! Failed to delete product");
                        }
                    }catch (ProductException | NumberFormatException | NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                }
                break;
            }
            case 4:{
                List<Product> products = service.getAlProducts();
                System.out.println("=================| Product Lists |================");
                for(Product p : products){
                    System.out.println(p);
                }
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                break;
            }
            case 5:{
                System.out.print("Enter product id: ");
                Long id = Long.parseLong(scanner.nextLine());
                Product existProduct = service.getProductById(id);
                System.out.println(existProduct);
                break;
            }
            case 0:
                System.out.println("Exiting....");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    public static void run(){
        while (true){
            menu();
            try{
                System.out.print("Enter an option: ");
                int option;
                option = Integer.parseInt(scanner.nextLine());

                if(option == 0){
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }

                operationProcess(option);
            }catch (NumberFormatException e){
                System.out.println("!! Option must be a number!");
            }
        }
    }
}
