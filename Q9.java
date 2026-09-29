import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int min = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result < 0)
            System.out.println("First string comes before second.");
        else
            System.out.println("First string comes after second.");
    }
}