package Search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
//        int[] arr = {9,2,3,5,6,1};
//        System.out.println("Original value:");
//        for(int i: arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        Arrays.sort(arr);
//        System.out.println("After sort:");
//        for(int i: arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        System.out.println("Binary Search number 1");
//        Arrays.binarySearch(arr, 1);
//        System.out.println("Index: " + Arrays.binarySearch(arr, 1));

        int[] arr = new int[2000];
        //assign value to array from 1 to 2000
        int size = arr.length;
        int i=0;
        while (size>0){
            arr[i] = ++i;
            --size;
        }

        //binary search
        int luckyNumber = 369;
        int indexFound = -1;

        int low = 0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = (high + low)/2;
            if (arr[mid] == luckyNumber) {
                indexFound = mid;
                break;
            } else if (arr[mid] < luckyNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.printf("Element found at index [%d]", indexFound);

    }
}
