import java.util.Scanner;

public class testeA {
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
        boolean stop = false;
        final int K = 5;
        n = ler.nextInt();
        do {
            num = ler.nextInt();
            if (countDigits(num) < n) {
                countnum++;
                sum += num;
                k++;
            } else {
                stop = true;
            }
        } while ((stop == false) && (k < K));
        if (countnum == 0) {
            System.out.println("0.00");
        } else {
            System.out.printf("%.2f\n", (double) sum / countnum);
        }
    }
}
