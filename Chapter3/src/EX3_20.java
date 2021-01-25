import java.util.Scanner;

public class EX3_20 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter temperature in Fahrenheit between -58 and 41:");
            double ta = input.nextDouble();

            System.out.println("Enter the wind speed (>=2) in miles per hour:");
            double v = input.nextDouble();

            double windChill = 0;

            if(ta < -58 || ta > 41){
                System.out.println("The temperature input is incorrect.");
            }

            if(v < 2){
                System.out.println("The wind speed input is incorrect.");
            }

            windChill = 35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v,0.16))) + (0.4275 * ta * (Math.pow(v,0.16)));

            System.out.println("The wind chill index is " + windChill);
    }
}
