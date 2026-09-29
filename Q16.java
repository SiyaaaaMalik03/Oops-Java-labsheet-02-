import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int p = sc.nextInt();

        int multiplied = n << p;
        int divided = n >> p;

        System.out.println("After multiplication by 2^" + p +
                           " = " + multiplied);
        System.out.println("After division by 2^" + p +
                           " = " + divided);
    }
}