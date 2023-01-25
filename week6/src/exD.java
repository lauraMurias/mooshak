import java.util.Scanner;

public class exD {
    public static int factorial(int num) {
        int fact=1;
        do {
            fact *= num;
            num--;
        } while (num>0);
        return fact;
    }

    public static int combinations(int m, int n, int p) {
        int nFact, mFact, pFact;
        mFact = factorial(m);
        nFact = factorial(n);
        if (p==0) {
            pFact = 1;
        } else {
            pFact = factorial(p);
        }

        return mFact/(nFact*pFact);
    }

    public static int permutations(int m, int p) {
        int nCombinations;
        int mFact, pFact;

        mFact = factorial(m);
        if (p==0) {
            pFact = 1;
        } else {
            pFact = factorial(p);
        }
        return mFact/pFact;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int m = ler.nextInt();
        int n = ler.nextInt();
        int p = m - n;
        if (m>=n) {
            System.out.printf("C(%d,%d)=%d\n", m, n, combinations(m, n, p));
            System.out.printf("P(%d,%d)=%d\n", m, n, permutations(m, p));
        }
    }
}

