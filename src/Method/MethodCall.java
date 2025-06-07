package Method;

import java.util.Scanner;

public class MethodCall {

    public static void main(String[] args){
        MethodDemo methodDemo = new MethodDemo();
//        methodDemo.printLabel();
//        System.out.println(methodDemo.sumNumber(20,10,30,40,50));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pay per hour: ");
        double pay = scanner.nextDouble();
        System.out.print("Enter hour worked: ");
        double hour = scanner.nextDouble();
        System.out.println(methodDemo.calculatePay(pay,hour));
    }
}
