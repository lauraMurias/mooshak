import java.util.Scanner;

public class exJ {
    static Scanner ler = new Scanner(System.in);
    static final int PEOPLE = 100;
    static final int TOPTHREE = 3;

    public static int numberOfPeople(int[] salary, String[] people) {
        int numP = 0;
        String name;
        do {
            name = ler.nextLine();
            if (!name.equals("END")) {
                people[numP] = name;
                salary[numP] = ler.nextInt();
                numP++;
                ler.nextLine();
            }
        } while (!name.equals("END"));

        return numP;
    }

    public static void orderSalariesAndNames(int[] salary, String[] people, int numP) {
        for (int i = 0; i < numP - 1; i++) {
            for (int j = i + 1; j < numP; j++) {
                if (salary[i] <= salary[j]) {
                    if (salary[i] < salary[j]) {
                        int temp1 = salary[i];
                        String temp2 = people[i];
                        salary[i] = salary[j];
                        people[i] = people[j];
                        salary[j] = temp1;
                        people[j] = temp2;
                    } else {
                        if (people[i].compareTo(people[j]) > 0) {
                            String temp3;
                            int temp4 = salary[i];
                            temp3 = people[i];
                            people[i] = people[j];
                            people[j] = temp3;
                            salary[i] = salary[j];
                            salary[j] = temp4;

                        }
                    }
                }
            }
        }
    }

    public static void showTopThree(int[] salary, String[] people, int numP) {
        String temp;
        int i = 0;
        do {
            System.out.printf("#%d:%s:%d\n", i + 1, people[i], salary[i]);
            i++;
        } while (i<TOPTHREE && i < numP);
    }

    public static void main(String[] args) {
        int[] salary = new int[PEOPLE];
        String[] people = new String[PEOPLE];
        int numP = numberOfPeople(salary, people);
        orderSalariesAndNames(salary, people, numP);
        showTopThree(salary, people, numP);
    }
}