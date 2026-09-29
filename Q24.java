import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}