import java.util.Scanner;

public class EX3_11Maybe {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number:");
        int month = input.nextInt();

        System.out.println("Enter the year:");
        int year = input.nextInt();

        int days = 31;

        switch (month){
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    days = 29; break;
                }
                else {
                    days = 28; break;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;

        }

        switch(month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
        }

        System.out.println(month + " " + year + " had " +days + " days");
    }
}
