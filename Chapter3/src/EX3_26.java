import java.util.Scanner;

public class EX3_26 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int a = input.nextInt();
        boolean divBy5 = false;
        boolean divBy6 = false;

        if (a % 5 ==0){
            divBy5 = true;
        }
        if (a % 6 == 0){
            divBy6 = true;
        }

        System.out.println("Is " +a+ " divisible by 5 and 6? "+ (divBy5 && divBy6));
        System.out.println("Is " +a+ " divisible by 5 or 6? " + (divBy5 || divBy6));
        System.out.println("Is " +a+ " divisible by 5 or 6, but not both? " + (divBy5 ^ divBy6));
    }
}
