package Array;

import java.util.Scanner;

public class TwoDArrayCondoApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========Create floor and Room=========");
        System.out.print("Enter floor(s): ");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter room(s): ");
        int room = Integer.parseInt(scanner.nextLine());

        System.out.println("=======================================");

        //initialize array condo
        String[][] condo = new String[floor][room];

        // F1-R01 : value to store in array2D
        for(int i = 0; i < floor; i++){
            for(int j = 0; j < room; j++){
                condo[i][j] = "F"+(i+1)+"-"+"RM"+(j+1);
            }
        }

        //print floor and room
        System.out.println("You have " + floor + " floors and " + room + " rooms in each floor: ");
        for(String[] cd : condo){
            for(String c: cd){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println("==============Check In==============");

        System.out.print("Enter room to check in: ");
        String roomToCheckIn = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //check in room
        for(int i = 0; i < floor; ++i){
            for( int j = 0; j < room; ++j){
                if(condo[i][j].equals(roomToCheckIn)){
                    condo[i][j] += "|" + name;
                }
            }
        }

        //print floor and room
        for(String[] cd : condo){
            for(String c: cd){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println("==============Check Out==============");
        System.out.print("Enter your name to check out: ");
        String nameToCheckOut = scanner.nextLine();

        //check out room
        for(int i = 0; i < floor; ++i){
            for( int j = 0; j < room; ++j){
                if(condo[i][j].contains(nameToCheckOut)){
                    String[] tokens = condo[i][j].split("\\|");
                    condo[i][j] = tokens[0]; //assign room
                }
            }
        }

        //print floor and room
        for(String[] cd : condo){
            for(String c: cd){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
