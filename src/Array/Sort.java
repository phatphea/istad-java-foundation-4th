package Array;

public class Sort {
    public static void main(String[] args){
        int[] arr = {10, 4, 5, 6, 2, 19};

        //printing value
        System.out.println("Before sort: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("======================");

        //Bubble sort
//        for(int i=0; i<arr.length-1; ++i){
//            for(int j=0;j<arr.length - 1 - i; ++j){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println("After bubble sort: ");
//        for(int num : arr){
//            System.out.print(num + " ");
//        }
//        System.out.println();

        // selection sort
        for(int i=0; i < arr.length -1; i++){
            int minIndex = i;
            //find index the smallest element
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        //after sort
        System.out.println("After selection sort: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        //reverse sorted array
        //two pointer
        int start =0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }

        //after revers
        System.out.println("After revers by two pointer:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
