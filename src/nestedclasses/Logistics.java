package nestedclasses;

public class Logistics {

    void showTransactionStatus(String status){
        class Success{
            void displayStatus(){
                System.out.println("Goods are shipped!");
            }
        }
        class Fail{
            void displayStatus(){
                System.out.println("Goods are unshipped!");
            }
        }
        class Pending{
            void displayStatus(){
                System.out.println("Goods are on the way!");
            }
        }

        switch (status){
            case "success":
                Success success = new Success();
                success.displayStatus();
                break;
            case "fail":
                Fail fail = new Fail();
                fail.displayStatus();
                break;
            case "pending":
                Pending pending = new Pending();
                pending.displayStatus();
                break;
            default:
                System.out.println("Invalid input!!");
        }
    }
}
