import java.util.Scanner;

public class exI {
    static Scanner ler = new Scanner(System.in);
    public static void readNames(int[] ent, String[] ppl, int[] fl) {
        int p = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ppl[p] = ler.nextLine();
                fl[p] = j;
                ent[p] = i;
                p++;
            }
        }
    }

    public static void searchName(int[] ent, String[] ppl, int[] fl) {
        String search = ler.nextLine();
        boolean found = false;
        for (int i = 0; i < 12; i++) {
            if (search.equals(ppl[i])) {
                found = true;
                System.out.println("name=" + ppl[i]);
                System.out.println("entrance=" + ent[i]);
                System.out.println("floor=" + fl[i]);
            }
        }
        if (!found) {
            System.out.println("Do not live in the building");
        }
    }

    public static void main(String[] args) {
        int[] entrances = new int[12];
        int[] floor = new int[12];
        String[] people = new String[12];
        readNames(entrances,people,floor);
        searchName(entrances,people,floor);
    }
}
