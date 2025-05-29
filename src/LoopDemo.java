import java.util.Scanner;


public class LoopDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Create array and sum, avarge
//        int[] arr;
//        System.out.print("Enter the size of arrays: ");
//        int size = scanner.nextInt();
//
//        arr = new int[size];
//        int index = 0;
//        for(int i=0; i<arr.length; ++i){
//            System.out.print("Enter the element "+index+": ");
//            arr[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        int num =0;
//        for (int j : arr) {
//            num = j;
//            sum += num;
//        }
//        System.out.println("Sum is: "+sum);
//        double avg = (double) sum / arr.length;
//        System.out.println("Average is: " + avg);


        //Create array and find max number
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        int start=0;
        for(int i=0;i<arr.length;++i){
            System.out.printf("Enter the element [%d]: ",start);
            arr[i] = scanner.nextInt();
            start++;
        }

        System.out.println("All element of array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        //Find max number
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max is : "+max);

    }

}
