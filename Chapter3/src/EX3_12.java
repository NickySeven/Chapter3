import java.util.Scanner;

public class EX3_12 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter three digit integer:");
        int number = input.nextInt();

        int a = number / 100;
        int b = number % 10;

        if (a == b){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number+ " is not a palindrome");
        }
    }
}
