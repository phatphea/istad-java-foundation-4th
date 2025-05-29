import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {9,2,3,5,6,1};
        System.out.println("Original value:");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("After sort:");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Binary Search number 1");
        Arrays.binarySearch(arr, 1);
        System.out.println("Index: " + Arrays.binarySearch(arr, 1));
    }
}
