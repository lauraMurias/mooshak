import java.util.Scanner;

public class exA {
    static Scanner ler = new Scanner(System.in);
    public static void mostrarAverage(int N) {
        int[] notas;
        notas = new int[N];
        int sum = 0, failures=0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = ler.nextInt();
            sum += notas[i];
            if (notas[i]<10) {
                failures++;
            }
        }
        double media = (double)sum/N;
        System.out.println("average=" + media);
        System.out.println("failures=" + failures);
    }
    public static void main(String[] args) {
        int N = ler.nextInt();
        mostrarAverage(N);
    }
}
