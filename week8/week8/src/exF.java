import java.util.Scanner;

public class exF {
    static Scanner ler = new Scanner(System.in);

    public static double[] readBankRates() {
        final int K = 6;
        double[] rates = new double[K];
        for (int i = 0; i < K; i++) {
            rates[i] = ler.nextDouble();
        }
        return rates;
    }

    public static void showFinalValue(double amount, double[] rates) {
        final int K = 6;
        double rate;
        double[] crescentAmount = new double[K];
        for (int i = 0; i < K; i++) {
            rate = amount * rates[i];
            crescentAmount[i] = amount + rate;
            amount = amount + rate;
        }
        System.out.printf("final value=%.2f\n", crescentAmount[K - 1]);
    }

    public static void main(String[] args) {
        double[] rates = readBankRates();
        double firstAmount = ler.nextInt();
        showFinalValue(firstAmount, rates);
    }
}
