import java.util.Scanner;

public class exH {
    public static int numDig(int num) {
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num > 0);

        return count;
    }

    public static boolean isPalindrome(int num) {
        boolean pal = true;
        int dn;
        dn = numDig(num);
        int comps = dn/2, dr, dl; //dr: digito à direita; dl: digito à esquerda
        for (int i=1; i<=comps; i++) {
            dr = num%10;
            int p = (int)Math.pow(10,(dn-i));
            dl = num/p;
            dl = dl%10;
            num = num/10;
            p = (int)Math.pow(10,dn-(i+1));
            num = num%p;
            dn--;
            if (dl != dr) {
                pal = false;
            }
        }

        return pal;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, k=0;
        final int K = 5;
        do {
            num = ler.nextInt();
            k++;
        } while (!isPalindrome(num) && (k < K));
        if (isPalindrome(num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("attempts exceeded");
        }
    }
}
