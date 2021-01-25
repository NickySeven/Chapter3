import java.util.Scanner;

public class EX3_18 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight of package:");
        double w = input.nextDouble();
        double cost = 0;

        if(w > 0 && w <= 1){
            cost = 3.5;
        }

        else if (w > 1 && w <=3){
            cost = 5.5;
        }

        else if (w > 10 && w <= 20){
             cost = 10.5;
        }

        if (cost == 0){
            System.out.println("Package can not be shipped");
        }
        else {
            System.out.println("The cost of shipping is " +cost);
        }
    }
}
