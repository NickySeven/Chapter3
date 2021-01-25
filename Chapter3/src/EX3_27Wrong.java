import java.util.Scanner;

public class EX3_27Wrong {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if((x < 100) && (y < 200)){
            System.out.println("The point is in the triangle.");
        }
        else if ((0 > x) || (0 > y) || (x < 100) || (y<100)){
            System.out.println("The point is not in the triangle");
        }
    }
}
