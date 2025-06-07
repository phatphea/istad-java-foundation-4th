package Array;

import java.io.FileNotFoundException;
import java.util.*;

public class OperaionWithArray {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner scanner = new Scanner(System.in);
//
//        int[] arr = {10, 4, 5, 6, 2, 19};
//
//        //printing value
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        //insert element to a specific position
//        int elementToInsert = 1;
//        int positionToInsert = 2;
//
//        int[] newArr = new int[arr.length+1];
//        for(int i =0, j=0; i<newArr.length; i++){
//            if(i==positionToInsert){
//                newArr[i] = elementToInsert;
//            }else {
//                newArr[i] = arr[j];
//                j++;
//            }
//        }
//        arr=newArr;
//
//        //printing new arrays
//        System.out.println("New array: ");
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        //Delete element
//        System.out.println("Delete number 2");
//        int elementToDelete = 2;
//        int count = 0;
//        for(int num : arr){
//            if(num!=elementToDelete){
//                count++;
//            }
//        }
//        int[] arrAfterDelete = new int[count];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] != elementToDelete){
//                arrAfterDelete[j] = arr[i];
//                j++;
//            }
//        }
//
//        arr=arrAfterDelete;
//        for(int i : arr){
//            System.out.print(i + " ");
//        }

        Scanner scanner = new Scanner(System.in);

        int[] arr = {2,4,5};
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.print("Enter position you want to insert: ");
        int position = scanner.nextInt();
        System.out.print("Enter value to insert: ");
        int value = scanner.nextInt();

        //create new array for inserting element
        int[] newArr = new int[arr.length+1];

        for(int i=0, j=0; i<newArr.length; i++){
            if(i==position){
                newArr[i] = value;
            }else {
                newArr[i] = arr[j];
                j++;
            }
        }

        arr = newArr;

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
