import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MountainRanges {

    public static int FindMountainPeaks(int[] height){

        if(height.length==1){
            return 1;
        }

        int count=0;
        int element = 1;
        a: for(int i=0; i<height.length; i++){
            int left = i;
            b: for(int j=i+2; j<height.length; j++){
                int right =j;
                if(height[element]>height[left] && height[element]>height[right]){
                    count++;
                    element++;
                    break b;
                }
                else {
                    element++;
                    break b;
                }
            }
        }

        if(height[height.length-1] > height[height.length-2]){
            count++;
        }

        if(height[0]>height[1]){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] height;

        while (true){
            System.out.print("Enter the sequence of heights(Ex: 5, 6, 2, 4 or Enter 'exit' to exit!): ");
            String sHeights = scanner.nextLine().trim().replace(" ", "");

            if (sHeights.equalsIgnoreCase("exit")) {
                break;
            }

            if (sHeights.isEmpty()) {
                System.out.println("Input was empty. Please enter valid numbers.");
                continue;
            }

            try{
                String[] strings = sHeights.split(",");
                height = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
                System.out.println("Parameters: " + Arrays.toString(height));
                System.out.println("Mountain ranges have " + FindMountainPeaks(height) + " peaks.");

                System.out.println("===============================");
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please input number with comma.");
            }

        }

    }
}
