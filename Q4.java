public class Q4 {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors: " + visitors);

        System.out.println("Visitor entering: " + (++visitors));
        System.out.println("Visitor leaving: " + (visitors--));

        System.out.println("Final visitors: " + visitors);
    }
}