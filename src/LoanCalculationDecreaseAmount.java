import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static com.google.common.base.Strings.repeat;

public class LoanCalculationDecreaseAmount {

    public static String padRight(String input, int length, char padChar) {
        if (input.length() >= length) {
            return input;
        }
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static String padRight(String input, int length) {
        char padChar = ' ';
        if (input.length() >= length) {
            return input;
        }
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        double loan, rate, installment, interest, principal, debtBalance;
        double totalInstallment = 0, totalInterest = 0;
        int monthLoan;
        Scanner cin = new Scanner(System.in);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy");
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.print("Enter Money for Loan = ");
        loan = cin.nextDouble();
        System.out.print("Enter Interest Rate =% ");
        rate = cin.nextDouble() / 100;
        System.out.print("Enter Month         = ");
        monthLoan = cin.nextInt();
        LocalDate dateReceived = LocalDate.now();

        System.out.println("Date Received       = " + dateReceived.format(df) + "\n");

        // Use padRight for header formatting
        System.out.println(padRight("Month", 12) + padRight("Installment", 15) +
                padRight("Principal", 12) + padRight("Interest", 12) +
                padRight("Debt Balance", 15));
        System.out.println(repeat("-", 66));

        debtBalance = loan;
        principal = loan/monthLoan;

        LocalDate currentMonth = dateReceived;

        for(int i = 1; i<=monthLoan; i++){
            interest = debtBalance * rate ;
            installment = principal + interest;
            debtBalance-=principal;

            totalInterest = (loan*rate) * (monthLoan+1)/2;
            totalInstallment+=installment;

            currentMonth = currentMonth.plusMonths(1);
            System.out.println(
                        padRight(currentMonth.format(df), 12,'-') +
                                padRight(cf.format(installment), 15,'-') +
                                padRight(cf.format(principal), 12,'-') +
                                padRight(cf.format(interest), 12,'-') +
                                padRight(cf.format(debtBalance), 15,'-')
                );
        }
        System.out.println(repeat("=", 66));
        System.out.println("Total Interest      =" + cf.format(totalInterest));
        System.out.println("Total Installment   =" + cf.format(totalInstallment));
    }
}
