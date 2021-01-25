import java.util.Scanner;

public class EX3_31 {
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);

        double exchangeRate, dollarAmount, rmbAmount;
        int userChoice;

        System.out.println("Enter the exchange rate from dollars to RMB:");
        exchangeRate = s.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        userChoice = s.nextDouble();

        if(userChoice == 0){
        System.out.println("Enter the dollar amount:");
        dollarAmount = s.nextDouble();

        rmbAmount = dollarAmount * exchangeRate;
        System.out.println("$" + dollarAmount + "is" + rmbAmount + "yuan.");
        }

        else if (userChoice == 1){
        System.out.println("Enter the RMB amount:");
        rmbAmount = s.nextDouble();

        dollarAmount = rmbAmount/exchangeRate;
        System.out.println(rmbAmount + "yuan is $" + dollarAmount);
        }

        else {
        System.out.println("Invalid Choice.")}
    }
}
