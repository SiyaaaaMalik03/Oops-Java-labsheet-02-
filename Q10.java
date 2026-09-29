import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter lower range: ");
        int low = sc.nextInt();

        System.out.print("Enter upper range: ");
        int high = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= low && year <= high)
            System.out.println("Year is leap and within range.");
        else
            System.out.println("Condition not satisfied.");
    }
}