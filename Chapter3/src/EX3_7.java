import java.util.Scanner;

public class EX3_7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfDollars == 1) {
            System.out.println(" " + numberOfDollars + " dollar");
        }
        else if (numberOfDollars > 1){
            System.out.println(" " + numberOfDollars + " dollars");
        }

        if (numberOfQuarters == 1) {
            System.out.println(" " + numberOfQuarters + " quarter");
        }
        else if (numberOfQuarters > 1){
            System.out.println(" " + numberOfQuarters + " quarters");
        }

        if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime");
        }
        else if(numberOfDimes > 1){
            System.out.println(" " + numberOfDimes + " dimes");
        }

        if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel");
        }
        else if (numberOfNickels > 1){
            System.out.println(" " + numberOfNickels + " nickels");
        }

        if (numberOfPennies == 1){
            System.out.println(" " + numberOfPennies + " penny");
        }
        else if (numberOfPennies > 1){
            System.out.println(" " + numberOfPennies + " pennies");
        }
    }
}
