import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoanCalculationFixedAmount {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //get current date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = currentDate.format(formatter);
        DecimalFormat df = new DecimalFormat("$#0.00");

        System.out.print("Enter loan : ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter Interest Rate (%) : ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter Month : ");
        double month = scanner.nextDouble();
        System.out.println("Date Receive : " + formattedDate);
        System.out.println();

        double installment, principal=0, remainingLoan, interest=0;

        double monthlyInterestRate = interestRate / 100;
        installment = (loanAmount * monthlyInterestRate) / (1 - Math.pow((1 + monthlyInterestRate), -month)); //month 1 to n-1

        // Print newfeatures.table header
        System.out.printf("%-15s %-14s %-13s %-11s %-11s%n",
                "Month", "Installment", "Principal", "Interest", "Debt Balance");

        double totalInstallment = 0;
        double totalInterest =0;
        //first remaining loan
        remainingLoan = loanAmount;

        for(int round =1; round <= month; round++){
            interest = remainingLoan * monthlyInterestRate ;
            principal = installment - interest;

            if(round == month){
                //final installment
                installment = remainingLoan + interest;
                remainingLoan =0;
            }else {
                remainingLoan -= principal;
            }

            LocalDate futureDate = currentDate.plusMonths(round);
            // Print the row
            System.out.printf("%-15s %-14s %-13s %-11s %-11s\n",
                    futureDate.format(formatter),
                    df.format(installment),
                    df.format(principal),
                    df.format(interest),
                    df.format(Math.max(remainingLoan, 0)));

            //sum total
            totalInstallment += installment;
            totalInterest += interest;

        }
        System.out.println("===================================================================");
        System.out.println("Total Installment      = "+df.format(totalInstallment));
        System.out.println("Total Interest         = "+df.format(totalInterest));
    }

}
