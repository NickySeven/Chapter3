import java.util.Scanner;

public class EX3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        isbn = isbn % 100000000;

        int d2 = isbn / 10000000;
        isbn = isbn % 10000000;

        int d3 = isbn / 1000000;
        isbn = isbn % 1000000;

        int d4 = isbn / 100000;
        isbn = isbn % 100000;

        int d5 = isbn / 10000;
        isbn = isbn % 10000;

        int d6 = isbn / 1000;
        isbn = isbn % 1000;

        int d7 = isbn / 100;
        isbn = isbn % 100;

        int d8 = isbn / 10;

        int d9 = isbn % 10;

        int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 +d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (checkSum == 10) {
            System.out.println("The ISBN-10 number is " + (d1)+(d2)+(d3)+(d4)+(d5)+(d6)+(d7)+(d8)+(d9) + ("X"));
        }
        else{
            System.out.println("The ISBN-10 number is " + (d1)+(d2)+(d3)+(d4)+(d5)+(d6)+(d7)+(d8)+(d9)  + (checkSum));
        }
    }
}
