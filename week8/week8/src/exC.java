import java.util.Scanner;

public class exC {
    public static int[] readSequence() {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        int[] a = new int[num];
        for (int i=0; i<num; i++) {
            a[i] = ler.nextInt();
        }
        return a;
    }
    public static boolean checkIncrease(int[] b) {
        boolean ascend = true;
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] >= b[j]) {
                    ascend = false;
                }
            }
        }
        return ascend;
    }

    public static void main(String[] args) {
        int[] arrNum = readSequence();
        if (checkIncrease(arrNum)) {
            System.out.println("always ascending = true");
        } else {
            System.out.println("always ascending = false");
        }
    }
}
