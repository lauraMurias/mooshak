import java.util.Scanner;

public class exF {
    public static double cone(double r, double h) {
        double result;
        double R = Math.pow(r,2);
        result = 1.0/3.0*Math.PI*R*h;
        return result;
    }

    public static double sphere(double r) {
        double result;
        double R = Math.pow(r,3);
        result = 4.0/3.0*Math.PI*R;
        return result;
    }

    public static double cylinder(double r, double h) {
        double result;
        double R = Math.pow(r,2);
        result = Math.PI*R*h;
        return result;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String input = ler.next();
        double r, h, v=0;
        while (!input.equals("end")) {
            switch (input) {
                case "cone":
                    r = ler.nextDouble();
                    h  =ler.nextDouble();
                    System.out.printf("%.2f\n", cone(r,h));
                    break;
                case "cylinder":
                    r = ler.nextDouble();
                    h  =ler.nextDouble();
                    System.out.printf("%.2f\n", cylinder(r,h));
                    break;
                case "sphere":
                    r = ler.nextDouble();
                    System.out.printf("%.2f\n", sphere(r));
                    break;
            }


            input = ler.next();
        }
    }
}
