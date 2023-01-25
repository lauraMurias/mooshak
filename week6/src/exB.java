import java.util.Scanner;

public class exB {
    public static void stats(int approved, int failed) {
        int cont1=0, cont2=0;
        System.out.print("- Approved: ");
        do {
            if (approved != 0) {
                System.out.print("*");
                cont1++;
            }
        } while (cont1<approved);
        System.out.println();

        System.out.print("- Failed: ");
        do {
            if (failed != 0) {
                System.out.print("*");
                cont2++;
            }
        } while (cont2<failed);
        System.out.println();
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numStudents, numSubjects, approved, failed;
        numStudents = ler.nextInt();
        numSubjects = ler.nextInt();
        for (int i=0; i<numSubjects; i++) {
            approved = 0;
            failed = 0;
            String subjectName = ler.next();
            approved = ler.nextInt();
            failed = numStudents - approved;
            System.out.println("Subject: " + subjectName);
            stats(approved, failed);
        }

    }
}
