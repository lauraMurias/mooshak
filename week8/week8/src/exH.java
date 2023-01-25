import java.util.Scanner;

public class exH {
    static Scanner ler = new Scanner(System.in);

    public static int[] readNumbers(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ler.nextInt();
        }
        return arr;
    }

    public static void rotate(int[] arr, int N) {
        String input = ler.next();
        while (!"exit".equals(input)) {
            if ("right".equals(input)) {
                for (int i = 0; i < 1; i++) {
                    int last;
                    last = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = last;
                }
                for (int i = 0; i< arr.length; i++) {
                    System.out.print("[" + arr[i] + "]");
                }
                System.out.println();
            }
            if ("left".equals(input)) {
                for (int i = 0; i < 1; i++) {
                    int first;
                    first = arr[0];
                    for (int j = 0; j < arr.length-1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length-1] = first;
                }
                for (int i = 0; i< arr.length; i++) {
                    System.out.print("[" + arr[i] + "]");
                }
                System.out.println();
            }
            input = ler.next();
        }
    }

    public static void main(String[] args) {
        int N = ler.nextInt();
        int[] arr = readNumbers(N);
        rotate(arr, N);
    }
}
