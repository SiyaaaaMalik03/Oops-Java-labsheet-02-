import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether n is a power of 4
        boolean powerOf4 = n > 0 && (n & (n - 1)) == 0
                && (n & 0x55555555) != 0;

        if (powerOf4)
            System.out.println(n + " is a power of 4.");
        else
            System.out.println(n + " is not a power of 4.");

        // Toggle the 3rd bit (bit position 2)
        int toggled = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit: " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {

            int value = n * i;

            // Skip multiples of 6
            if (i % 6 == 0)
                continue;

            // Stop at multiples of 48
            if (value % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + value);
        }
    }
}