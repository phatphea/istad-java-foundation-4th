package Method;

public class Recursive {
    public static void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        System.out.println(sumDigit(12345));
        System.out.println(sumMoreToSingleDigit(12345));
    }

    private static int sumDigit(int num) {

        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
    public static int sumMoreToSingleDigit(int num){

        if(num<10){
            return num;
        }else {
            return sumMoreToSingleDigit(sumDigit(num));
        }
    }
}
