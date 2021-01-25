import java.util.Scanner;

public class EX3_14 {
    public static void main(String[]args){
        System.out.println("Guess 0 for Heads and 1 for Tails:");

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int generate = (int) (Math.random() * 2);

        if (guess == generate){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("You are incorrect.");
        }
    }
}
