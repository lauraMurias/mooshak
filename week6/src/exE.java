import java.util.Scanner;

public class exE {
    public static int countDig(long num, long nextNum) {
        int cont1=0, cont2=0;
        long aux1=num, aux2= nextNum;
        do {
            aux1 /= 10;
            cont1++;
            aux2 /= 10;
            cont2++;
        } while ((aux1>0) && (aux2>0));
        return cont1;
    }

    public static int compareDig(long num, long nextNum) {
        int count = 0, dig1, dig2;
        int nc = countDig(num,nextNum);
        for (int i=0; i<nc; i++) {
            dig1 = (int)num%10;
            dig2 = (int)nextNum%10;
            if (dig1 == dig2) count++;
            num /= 10;
            nextNum /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt(), maior=0;
        long num, nextNum, par1=0, par2=0;
        int nComp;
        for (int i=0; i<n; i++) {
            num = ler.nextInt();
            nextNum = ler.nextInt();
            nComp = compareDig(num,nextNum);
            if (maior<=nComp) {
                maior = nComp;
                par1 = num;
                par2 = nextNum;
            }
        }
        if (maior > 0) {
            System.out.println(par1 + "/" + par2);
        } else {
            System.out.println("no results");
        }
    }
}
