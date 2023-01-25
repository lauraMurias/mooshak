import java.util.Scanner;

public class exG {
    static Scanner ler = new Scanner(System.in);

    public static int[] nums(int lim) {
        int[] arr = new int[lim];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ler.nextInt();
        }
        return arr;
    }

    public static void reverse(int[] arr, int lim) {
        int[] reversedArr = new int[lim];
        int aux = lim - 1;
        for (int i = 0; i < lim; i++) {
            reversedArr[i] = arr[aux];
            System.out.println(reversedArr[i]);
            aux--;
        }
    }

    public static void main(String[] args) {
        int lim = ler.nextInt();
        int[] arr = nums(lim);
        reverse(arr,lim);
    }
}
