import java.util.Random;
import java.util.Scanner;

/*
 * Labsheet 2 - Object Oriented Java

 * Course  : MCA 3rd Semester, College of Smart Computing
 *
 * Operators, loops and control statements.
 * Each question is a method of the class LabPrograms2.
 * main() creates an object of LabPrograms2 and calls the methods through a menu.
 */

class LabPrograms2 {

    Scanner sc = new Scanner(System.in);

    // ================= A. OPERATORS =================

    // ---------- Arithmetic Operators (Q1-Q3) ----------

    // 1. Area of triangle using Heron's formula
    void q1() {
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }

    // 2. Compound interest
    void q2() {
        System.out.print("Enter principal, rate (%) and time (years): ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;
        System.out.println("Amount           = " + amount);
        System.out.println("Compound Interest = " + ci);
    }

    // 3. Distance between two points
    void q3() {
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance = " + d);
    }

    // ---------- Unary Operators (Q4-Q5) ----------

    // 4. Visitor counter using prefix and postfix increment/decrement
    void q4() {
        int visitors = 0;
        int choice;
        do {
            System.out.println("\n1. Visitor enters (postfix  visitors++)");
            System.out.println("2. Visitor enters (prefix   ++visitors)");
            System.out.println("3. Visitor leaves (postfix  visitors--)");
            System.out.println("4. Visitor leaves (prefix   --visitors)");
            System.out.println("0. Close store");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                int before = visitors++;
                System.out.println("Value before = " + before + ", now inside = " + visitors);
            } else if (choice == 2) {
                int after = ++visitors;
                System.out.println("Value after  = " + after + ", now inside = " + visitors);
            } else if (choice == 3) {
                if (visitors > 0) {
                    int before = visitors--;
                    System.out.println("Value before = " + before + ", now inside = " + visitors);
                } else {
                    System.out.println("Store is already empty.");
                }
            } else if (choice == 4) {
                if (visitors > 0) {
                    int after = --visitors;
                    System.out.println("Value after  = " + after + ", now inside = " + visitors);
                } else {
                    System.out.println("Store is already empty.");
                }
            }
        } while (choice != 0);
        System.out.println("Visitors still inside at closing: " + visitors);
    }

    // 5. Negative value using unary minus
    void q5() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int neg = -n;
        System.out.println("Original = " + n);
        System.out.println("Negative = " + neg);
    }

    // ---------- Assignment Operator (Q6-Q7) ----------

    // 6. Halve a number using /= until it is less than 1
    void q6() {
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        int steps = 0;
        while (n >= 1) {
            n /= 2;
            steps++;
            System.out.println("Step " + steps + ": " + n);
        }
        System.out.println("Total steps = " + steps);
    }

    // 7. Accumulate 7 days rainfall using +=
    void q7() {
        double total = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall (mm) for day " + day + ": ");
            total += sc.nextDouble();
        }
        System.out.println("Total rainfall in 7 days = " + total + " mm");
    }

    // ---------- Relational Operators (Q8-Q9) ----------

    // 8. Valid triangle from three angles
    void q8() {
        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Not a valid triangle");
    }

    // 9. Lexicographic comparison without built-in compare functions
    void q9() {
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        int len = s1.length() < s2.length() ? s1.length() : s2.length();
        int result = 0; // 0 equal, -1 first smaller, 1 first greater
        for (int i = 0; i < len; i++) {
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
        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else
            System.out.println("Both strings are equal");
    }

    // ---------- Logical Operators (Q10-Q11) ----------

    // 10. Leap year and within a given range
    void q10() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter range start year and end year: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = year >= start && year <= end;
        if (leap && inRange)
            System.out.println(year + " is a leap year and within the range");
        else if (leap)
            System.out.println(year + " is a leap year but outside the range");
        else if (inRange)
            System.out.println(year + " is within the range but not a leap year");
        else
            System.out.println(year + " is neither a leap year nor within the range");
    }

    // 11. Pass if (theory >= 40 AND practical >= 50) OR overall >= 50
    void q11() {
        System.out.print("Enter theory marks (out of 100): ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical marks (out of 100): ");
        double practical = sc.nextDouble();
        double overall = (theory + practical) / 2;
        System.out.println("Overall percentage = " + overall + "%");
        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    // ---------- Ternary Operator (Q12-Q13) ----------

    // 12. Smallest of four numbers using nested ternary
    void q12() {
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
        System.out.println("Smallest number = " + smallest);
    }

    // 13. Vowel, consonant, digit or special symbol using ternary
    void q13() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch);
        String type = Character.isDigit(ch) ? "Digit"
                : Character.isLetter(ch)
                        ? ((lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                                ? "Vowel"
                                : "Consonant")
                        : "Special symbol";
        System.out.println("'" + ch + "' is a " + type);
    }

    // ---------- Bitwise Operators (Q14-Q15) ----------

    // 14. Swap two integers using XOR
    void q14() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap : a = " + a + ", b = " + b);
    }

    // 15. Count set bits
    void q15() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count += temp & 1;
            temp >>>= 1;
        }
        System.out.println("Binary of " + n + " = " + Integer.toBinaryString(n));
        System.out.println("Number of set bits = " + count);
    }

    // ---------- Shift Operators (Q16-Q17) ----------

    // 16. Multiply / divide by powers of two using shifts
    void q16() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter power of two (k, for 2^k): ");
        int k = sc.nextInt();
        System.out.println(n + " * 2^" + k + " = " + (n << k) + "   (n << k)");
        System.out.println(n + " / 2^" + k + " = " + (n >> k) + "   (n >> k)");
    }

    // 17. Rotate bits of an integer left by 2 positions (32-bit)
    void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rotated = (n << 2) | (n >>> 30);
        System.out.println("Original : " + String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0')
                + " (" + n + ")");
        System.out.println("Rotated  : " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0')
                + " (" + rotated + ")");
    }

    // ================= B. LOOPS & CONTROL STATEMENTS =================

    // ---------- for loop (Q18-Q19) ----------

    // 18. First 20 Fibonacci terms
    void q18() {
        long a = 0, b = 1;
        System.out.println("First 20 terms of Fibonacci series:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 19. Armstrong numbers between 1 and 1000
    void q19() {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int n = 1; n <= 1000; n++) {
            int digits = String.valueOf(n).length();
            int temp = n, sum = 0;
            while (temp > 0) {
                sum += (int) Math.pow(temp % 10, digits);
                temp /= 10;
            }
            if (sum == n)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    // ---------- do-while loop (Q20-Q21) ----------

    // 20. Accept password until correct
    void q20() {
        final String PASSWORD = "java123";
        String input;
        do {
            System.out.print("Enter password: ");
            input = sc.next();
            if (!input.equals(PASSWORD))
                System.out.println("Wrong password, try again.");
        } while (!input.equals(PASSWORD));
        System.out.println("Access granted!");
        System.out.println("(Hint: the password set in this program is " + PASSWORD + ")");
    }

    // 21. Factors of a number
    void q21() {
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int i = 1;
        System.out.print("Factors of " + n + ": ");
        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }

    // ---------- while loop (Q22-Q23) ----------

    // 22. Reverse digits of an integer
    void q22() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n < 0)
            rev = -rev;
        System.out.println("Reversed number = " + rev);
    }

    // 23. Palindrome using while loop
    void q23() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n >= 0 && rev == n)
            System.out.println(n + " is a Palindrome");
        else
            System.out.println(n + " is NOT a Palindrome");
    }

    // ---------- for-each loop (Q24-Q25) ----------

    // 24. Maximum and minimum in an array using for-each
    void q24() {
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    // 25. Average marks of students in a 2D array using for-each
    void q25() {
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        double[][] marks = new double[students][subjects];
        for (int i = 0; i < students; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextDouble();
        }
        int studentNo = 1;
        double grandTotal = 0;
        for (double[] row : marks) {
            double sum = 0;
            for (double m : row)
                sum += m;
            grandTotal += sum;
            System.out.println("Student " + studentNo + " average = " + (sum / subjects));
            studentNo++;
        }
        System.out.println("Overall class average = " + (grandTotal / (students * subjects)));
    }

    // ================= C. switch-case, continue, break =================

    // ---------- switch-case (Q26-Q27) ----------

    // 26. Weekday or weekend
    void q26() {
        System.out.print("Enter day number (1-7, 1 = Monday): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    // 27. Grade meaning
    void q27() {
        System.out.print("Enter grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    // ---------- continue (Q28) ----------

    // 28. Print 1 to 50 skipping perfect squares
    void q28() {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // ---------- break (Q29) ----------

    // 29. Random numbers until one is divisible by both 7 and 13
    void q29() {
        Random rand = new Random();
        int attempts = 0;
        while (true) {
            int num = rand.nextInt(100) + 1; // 1 to 100
            attempts++;
            System.out.print(num + " ");
            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("\nFound " + num + " (divisible by 7 and 13) after " + attempts + " attempts");
                break;
            }
        }
    }

    // ================= Mixed Advanced (Q30) =================

    // 30. Power of 4 check (shifts), toggle 3rd bit (bitwise),
    // multiplication table with continue and break
    void q30() {
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // (a) power of 4 using shift operators:
        // must be a power of 2, and the single set bit must be at an even position
        int temp = n;
        int shifts = 0;
        while (temp > 1) {
            temp >>= 1;
            shifts++;
        }
        boolean powerOfTwo = n > 0 && (n & (n - 1)) == 0;
        if (powerOfTwo && shifts % 2 == 0)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is NOT a power of 4");

        // (b) toggle the 3rd bit (bit position 2, counting from the right, starting at
        // 1)
        int toggled = n ^ (1 << 2);
        System.out.println("Before toggling 3rd bit : " + Integer.toBinaryString(n) + " (" + n + ")");
        System.out.println("After toggling 3rd bit  : " + Integer.toBinaryString(toggled) + " (" + toggled + ")");

        // (c) + (d) multiplication table of the toggled number (1 to 20)
        System.out.println("Multiplication table of " + toggled + ":");
        for (int i = 1; i <= 20; i++) {
            int product = toggled * i;
            if (product % 48 == 0 && product != 0) { // checked first: every multiple of 48 is also a multiple of 6
                System.out.println("Reached multiple of 48 (" + product + "). Stopping.");
                break;
            }
            if (product % 6 == 0)
                continue;
            System.out.println(toggled + " x " + i + " = " + product);
        }
    }
}

public class Labsheet2 {
    public static void main(String[] args) {
        LabPrograms2 lab = new LabPrograms2(); // object of the class
        Scanner sc = lab.sc;
        int choice;

        do {
            System.out.println("\n============ LABSHEET 2 - JAVA (OOP) ============");
            System.out.println("A. OPERATORS");
            System.out.println("  1. Heron's area            2. Compound interest     3. Distance of 2 points");
            System.out.println("  4. Visitor counter         5. Negative value");
            System.out.println("  6. Halve with /=           7. Rainfall with +=");
            System.out.println("  8. Valid triangle (angles) 9. Compare two strings");
            System.out.println(" 10. Leap year in range     11. Pass/fail (theory-practical)");
            System.out.println(" 12. Smallest of four       13. Char type (ternary)");
            System.out.println(" 14. XOR swap               15. Count set bits");
            System.out.println(" 16. Shift multiply/divide  17. Rotate bits left by 2");
            System.out.println("B. LOOPS");
            System.out.println(" 18. Fibonacci (20 terms)   19. Armstrong 1-1000");
            System.out.println(" 20. Password (do-while)    21. Factors (do-while)");
            System.out.println(" 22. Reverse digits         23. Palindrome (while)");
            System.out.println(" 24. Max/Min (for-each)     25. Average marks 2D (for-each)");
            System.out.println("C. SWITCH / CONTINUE / BREAK");
            System.out.println(" 26. Weekday/Weekend        27. Grade meaning");
            System.out.println(" 28. Skip perfect squares   29. Random until 7 and 13");
            System.out.println(" 30. Mixed advanced");
            System.out.println("  0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    lab.q1();
                    break;
                case 2:
                    lab.q2();
                    break;
                case 3:
                    lab.q3();
                    break;
                case 4:
                    lab.q4();
                    break;
                case 5:
                    lab.q5();
                    break;
                case 6:
                    lab.q6();
                    break;
                case 7:
                    lab.q7();
                    break;
                case 8:
                    lab.q8();
                    break;
                case 9:
                    lab.q9();
                    break;
                case 10:
                    lab.q10();
                    break;
                case 11:
                    lab.q11();
                    break;
                case 12:
                    lab.q12();
                    break;
                case 13:
                    lab.q13();
                    break;
                case 14:
                    lab.q14();
                    break;
                case 15:
                    lab.q15();
                    break;
                case 16:
                    lab.q16();
                    break;
                case 17:
                    lab.q17();
                    break;
                case 18:
                    lab.q18();
                    break;
                case 19:
                    lab.q19();
                    break;
                case 20:
                    lab.q20();
                    break;
                case 21:
                    lab.q21();
                    break;
                case 22:
                    lab.q22();
                    break;
                case 23:
                    lab.q23();
                    break;
                case 24:
                    lab.q24();
                    break;
                case 25:
                    lab.q25();
                    break;
                case 26:
                    lab.q26();
                    break;
                case 27:
                    lab.q27();
                    break;
                case 28:
                    lab.q28();
                    break;
                case 29:
                    lab.q29();
                    break;
                case 30:
                    lab.q30();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
