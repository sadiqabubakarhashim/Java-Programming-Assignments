
public class Fibonacci {
    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {

            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }
}
