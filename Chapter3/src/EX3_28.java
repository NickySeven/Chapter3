import java.util.Scanner;

public class EX3_28 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        w1 = w1 / 2;
        h1 = h1 / 2;

        System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        w2 = w2 / 2;
        h2 = h2 / 2;

        double x1m = x1 + w1;
        double y1m = y1 + h1;
        double x1s = x1 - w1;
        double y1s = y1 - h1;
        double x2m = x2 + w2;
        double y2m = y2 + h2;
        double x2s = x2 - w2;
        double y2s = y2 - h2;

        if (x1m == x2m && x1s == x2s && y1m == y2m && y1s == y2s)
        {System.out.println("r1 adn r2 are identical");
        }

        else if (x1m <= x2m && x1s >= x2s && y1m <= y2m && y1s => y2s){
        System.out.println("r1 is inside r2");
        }

        else if (x2m <- x1m && x2s >= x1s && y2m <= y1m && y2s => y1s){
        System.out.println("r2 is inside r1"):
        }

        else is (x1m < x2s || x1s > x2m || y1m < y2s || y2s > y1m ){
        System.out.println("r2 does not overlap r1"):
        }

        else {System.out.println("r2 overlaps r1");
        }

    }
}
