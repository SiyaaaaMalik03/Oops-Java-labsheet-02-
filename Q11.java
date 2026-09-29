import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();

        double overall = (theory + practical) / 2;

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student passes.");
        else
            System.out.println("Student fails.");
    }
}