import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rainfall = sc.nextDouble();

            total += rainfall;
        }

        System.out.println("Total rainfall = " + total);
    }
}