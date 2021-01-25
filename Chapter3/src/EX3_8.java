import java.util.Scanner;

public class EX3_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int temp = 0;

        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }

        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
