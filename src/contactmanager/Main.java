package contactmanager;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void menu(){
        System.out.println("""
                ==========| Menu |==========
                1. Add contact
                2. View all contacts
                3. Search contact by name
                4. Exit
                ============================""");

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
        Scanner scanner = new Scanner(System.in);

        ContactManagerServices services = new ContactManagerImpl();

        int option = 0;
        do {

            menu();
            System.out.print("Enter the option -> ");

            String input = scanner.nextLine();
            if(isMatchOption(input, "[1-4]")){
                option = Integer.parseInt(input);
            }

            switch (option){
                case 1:{

                    System.out.println("===============================");
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    if(services.addContact(name, phone, email)){
                        System.out.println("===============================");
                        System.out.println("Created contact successfully");
                    }else {
                        System.out.println("Failed to create contact");
                    }
                    break;
                }
                case 2:{
                    List<Contact> contacts = services.viewAllContacts();
                    System.out.println("===========| Contact Lists |===========");
                    System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Phone", "Email");
                    for(Contact c : contacts){
                        System.out.printf("%-5d %-10s %-15s %-10s\n",
                                c.getId(),
                                c.getName(),
                                c.getPhone(),
                                c.getEmail()
                        );
                    }
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");

                    break;
                }
                case 3:{
                    try{
                        System.out.println("===============================");
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        Contact contact = services.searchContactByName(name);
                        System.out.println("===========| Contact Lists |===========");
                        System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Phone", "Email");
                        System.out.printf("%-5d %-10s %-15s %-10s\n",
                                contact.getId(),
                                contact.getName(),
                                contact.getPhone(),
                                contact.getEmail()
                        );
                    }catch (NullPointerException e){
                        System.out.println("Contact not found!");
                    }
                }
                    break;
                case 4:
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalided option!");
            }

        }while (option!=4);
    }

}
