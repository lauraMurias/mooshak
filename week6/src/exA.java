import java.util.Scanner;

public class exA {
    public static int countDigits(int num) {
        int count=0;
        do {
            num /= 10;
            count++;
        } while (num>0);
        return (count);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, n, countnum=0, sum=0, k=0;
        final int K = 5;
        n = ler.nextInt();
        num = ler.nextInt();
        k++;
        while ((countDigits(num) < n) && (k <= K)) {
            countnum++;
            sum += num;
            if (k < K) {num = ler.nextInt();}
            k++;
        }
        if (countnum == 0) {
            System.out.println("0.00");
        } else {
            System.out.printf("%.2f\n", (double) sum / countnum);
        }
    }
}
