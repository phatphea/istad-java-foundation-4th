package exceptionhandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void inputScore(double score) throws ScoreFormatException{
        if(score < 0 || score > 100){
            throw new ScoreFormatException("Invalid score");
        }else {
            System.out.println(STR."Accepted score: \{score}");
        }
    }

    //validate is match to a menu
    static boolean isMatchOption(String input, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean isMatch = true;
        try(Scanner scanner = new Scanner(System.in)) {
            while(true){
                try {
                    System.out.print("Enter the number: ");
                    double score = Double.parseDouble(scanner.nextLine());

                    if(score==0){
                        break;
                    }
                    else {
                        inputScore(score);
                    }
                }catch (ScoreFormatException e){
                    System.out.println(e);
                }catch (NumberFormatException e){
                    System.out.println("Value must be number!");
                }
            }
        }


    }

}
