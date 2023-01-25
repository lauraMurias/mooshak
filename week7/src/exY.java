import java.util.Scanner;

public class exY {
    static Scanner ler = new Scanner(System.in);
    public static int readPositiveValue() {
        int num;
        do {
            num = ler.nextInt();
        } while (num<=0);
        return num;
    }
    public static void showTablesInRange(int num1, int num2) {
        if (num1<num2) {
            for (int i=num1; i<=num2; i++) {
                System.out.println("Multiplication table of " + i);
                showTableOfNumber(i);
            }
        } else if (num2<num1){
            for (int i=num2; i<=num1; i++) {
                System.out.println("Multiplication table of " + i);
                showTableOfNumber(i);
            }
        } else if (num1 == num2) {
            System.out.println("Multiplication table of " + num1);
            showTableOfNumber(num1);
        }
    }
    public static void showTableOfNumber(int num) {
        int result;
        for (int i=1; i<=10; i++) {
            result = num*i;
            System.out.printf("%d x %d = %d\n", num, i, result);
        }
    }


    public static void main(String[] args){
        int num1= readPositiveValue();
        int num2 = readPositiveValue();
        showTablesInRange(num1,num2);
    }
}
