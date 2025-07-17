public class ArmstrongNumber {

    static void isArmstrongNumber(int left, int right){

        for(int i=left; i<=right; i++){

            int temp = i;
            int sum = 0;

            //find a total digit of number
            int totalDigit = (int)Math.log10(temp)+1;

            while (temp>0){

                //find last digit
                int lastDigit = temp % 10;

                //sum digit
                sum += (int)Math.pow(lastDigit, totalDigit);
                temp /= 10;
            }

            //validate if sum = number, so number is Armstrong number
            if(sum==i){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int left = 0, right = 10000;
        isArmstrongNumber(left, right);
    }
}
