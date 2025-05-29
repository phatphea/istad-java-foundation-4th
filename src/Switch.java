import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter B: ");
        int b = Integer.parseInt(scanner.nextLine());


        String operator;
        while(true){
            System.out.print("Input operator (+,-,*,/): ");
            operator = scanner.nextLine();

            if(operator.equalsIgnoreCase("Exit")){
                System.out.println("Good bye!");
                break;
            }

            if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
                continue;
            }


            switch (operator){
                case "+":
                    System.out.print("The result is: " + (a+b));
                    break;
                case "-":
                    System.out.print("The result is: " + (a-b));
                    break;
                case "*":
                    System.out.print("The result is: " + (a*b));
                    break;
                case "/":
                    if(b==0){
                        System.out.println("B can not 0!");
                        break;
                    }
                    double result = (double) a/b;
                    System.out.printf("The result is: %.2f",result);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println();
        }
    }
}
