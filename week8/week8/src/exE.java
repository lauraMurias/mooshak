import java.util.Scanner;

public class exE {
    public static double salaryAverage(double sum, int numP) {
        double average = sum / numP;
        return average;
    }
    public static void lessThanAverage(double[] salary, String[] people, double average, int numP) {
        for (int i = 0; i < numP; i++) {
            if (salary[i] < average) {
                System.out.println(people[i]);
            }
        }
    }
    public static void peopleSalary() {
        Scanner ler = new Scanner(System.in);
        double[] salary = new double[19];
        String[] people = new String[19];
        String name = "";
        int i = 0, numPeople = 0;
        double sum = 0.0;
        name = ler.next();
        people[i] = name;
        while (!"end".equals(name) && i < 20) {
            numPeople++;
            salary[i] = ler.nextDouble();
            sum += salary[i];
            i++;
            name = ler.next();
            people[i] = name;
        }
        System.out.printf("%.1f\n", salaryAverage(sum, numPeople));
        double average = salaryAverage(sum, numPeople);
        lessThanAverage(salary, people, average, numPeople);
    }
    public static void main(String[] args) {
        peopleSalary();
    }
}
