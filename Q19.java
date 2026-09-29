public class Q19 {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}