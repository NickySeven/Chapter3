import java.util.Scanner;

public class EX3_22 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double d = Math.pow((Math.pow(x,2) + Math.pow(y,2)), 0.5);

        if (d >= 10){
            System.out.println("Point (" + x + " , " + y + ") is not in the circle.");
        }

        else{
            System.out.println("Point (" + x + " , " + y + ") is in the circle.");
        }
    }
}
