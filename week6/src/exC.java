import java.util.Scanner;

public class exC {
    public static boolean isTriangle(double a, double b, double c) {
        boolean triangle;
        if ((a + b) > c && (a + c) > b && (b + c) > a){
            triangle = true;
        } else {
            triangle = false;
        }

        return triangle;
    }

    public static double angle(double a, double b, double c) {
        double rad=0;
        double a2 = Math.pow(a,2);
        double b2 = Math.pow(b,2);
        double c2 = Math.pow(c,2);
        rad = Math.acos((a2 + b2 - c2)/(2*a*b));
        rad = 180*rad/Math.PI;
        return rad;
    }

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double a = ler.nextFloat();
        double b = ler.nextFloat();
        double c = ler.nextFloat();
        if (isTriangle(a,b,c)) {
            System.out.printf("a=%.2f\n", a);
            System.out.printf("b=%.2f\n", b);
            System.out.printf("c=%.2f\n", c);
            System.out.printf("ang(a,b)=%.2f\n", angle(a,b,c));
            System.out.printf("ang(a,c)=%.2f\n", angle(a,c,b));
            System.out.printf("ang(b,c)=%.2f\n", angle(b,c,a));
        } else {
            System.out.println("impossible");
        }
    }
}
