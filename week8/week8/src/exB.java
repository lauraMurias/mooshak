import java.util.Scanner;

public class exB {
    public static int returnMin(int[] arrNum, int cont) {
        int menor=1000000000;
        for (int i = 0; i < cont; i++) {
            if (arrNum[i] < menor) {
                menor = arrNum[i];
            }
        }
        return menor;
    }

    public static int returnOccurrences(int[] arrNum, int cont) {
        int occurrences=0;
        for (int i=0; i<cont; i++) {
            if (arrNum[i] == returnMin(arrNum,cont)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void showNumbers() {
        Scanner ler = new Scanner(System.in);
        int[] arrNum = new int[50];
        int cont = 0;
        int num;
        for (int i = 0; i < arrNum.length; i++) {
            num = ler.nextInt();
            if (num >= 0) {
                arrNum[i] = num;
                cont++;
            } else {
                i = arrNum.length;
            }
        }
        if (cont>0) {
            System.out.println("min=" + returnMin(arrNum, cont));
            System.out.println("occurrences=" + returnOccurrences(arrNum, cont));
        }
    }

    public static void main(String[] args) {
        showNumbers();
    }
}

