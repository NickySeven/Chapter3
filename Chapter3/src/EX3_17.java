import java.util.Scanner;

public class EX3_17 {
    public static void main(String[] args){
       int scissors = 0;
       int rock = 1;
       int paper = 2;

       System.out.println("Scissors(0) Rock(1) Paper(2)");
       int computer = (int)(Math.random() * 3);

       Scanner input = new Scanner (System.in);
       int choice = input.nextInt();

       System.out.print("The computer is ");

       switch (computer){
           case 0: System.out.print("Scissors. "); break;
           case 1: System.out.print("Rock. "); break;
           case 2: System.out.print("Paper. "); break;
       }

       System.out.print("You are ");

       switch (choice){
           case 0: System.out.print("Scissors. "); break;
           case 1: System.out.print("Rock. "); break;
           case 2: System.out.print("Paper. "); break;
       }

       if (computer == choice){
           System.out.println("It is a draw");
       }
       else if(computer== 0 && choice == 2 || computer == 1 && choice == 0 || computer == 2 && choice == 1){
           System.out.println("Computer won");
       }
       else if(choice == 0 && computer == 2 || choice == 1 && computer == 0 || choice == 2 && computer == 1){
           System.out.println("You won!");
       }
    }
}
