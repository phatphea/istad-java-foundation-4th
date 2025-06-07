package Method;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args){
//        int[] arr = {5,4,3,7,19};
//        int target = 10;
//        //result = [2,3]
//
//        int[] resultOfSum = sumTwo(arr, target);
//        System.out.println(Arrays.toString(resultOfSum));
        System.out.println(validatePalindrome("noon"));
        System.out.println(isValidPalindrome("A Santa A Santa"));
    }
    public static int[] sumTwo(int[] arrNum, int target) {

        return new int[0];
    }

    public static boolean validatePalindrome(String palindrome){

        int start =0;
        int end = palindrome.length()-1;
        while (start<end){
            if(palindrome.charAt(start)!=palindrome.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isValidPalindrome(String palindrome){

        String cleaned = palindrome.replaceAll("[^a-zA-Z]","");
        cleaned = cleaned.toLowerCase();

        int start =0;
        int end = cleaned.length()-1;
        while (start<end){
            if(cleaned.charAt(start)!=cleaned.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
