public class EX3_34 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three points for p0, p1 and p2:");

    double x0 = input.nextDouble();
    double y0 = input.nextDouble();
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    String p0 = "(" + x0 + "," + y0 + ")";
    String p1 = "(" + x1 + "," + y1 + ")";
    String p2 = "(" + x2 + "," + y2 + ")";

    String s = " not ";

    if (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1)) && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1))) {
    double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    if (c == 0) {
    s = " ";
        }
    }

    System.out.println(p2 + " is " + s + " on the line segment from " + p0 + " to " +p1);

    }
}
