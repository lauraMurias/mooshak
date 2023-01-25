import java.util.Scanner;

public class exI {
    public static void fibonnaci(int num) {
        int f1 = 1, f2 = 1, nextf=0;    //nextf = next number in the fibonacci sequence
        if (num == 0 || num == 1) {
            System.out.println("is a Fibonacci number");
        } else {
            do {
                nextf = f1 + f2;
                if (nextf == num) {
                    System.out.println("is a Fibonacci number");
                } else {
                    f1 = f2;
                    f2 = nextf;
                }
            } while (((f1 + f2) <= num) && (num != nextf));
            if ((f2 + f1) > num) {
                System.out.println("is not a Fibonacci number");
            }
        }
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        fibonnaci(num);
    }
}
