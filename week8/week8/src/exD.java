import java.util.Scanner;

public class exD {
    public static int[] readGrades() {
        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();
        int[] grades = new int[N];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = ler.nextInt();
        }
        return grades;
    }

    public static void gradesFrequency(int[] grades) {
        int[] freqs = new int[21];
        for (int i = 0; i < grades.length; i++) {
            freqs[grades[i]]++;
        }
        for (int j=0; j< freqs.length; j++) {
            System.out.println(j + " " + freqs[j]);
        }
    }

    public static void main(String[] args) {
        int[] g = readGrades();
        gradesFrequency(g);
    }
}

