public class PrimeFibonacci {
    public static void main(String[] args) {
        System.out.println("To print the prime and Fibonacci numbers below 100000");

        int a = 0, b = 1;

        while (a < 100000) {
            if (isPrime(a)) {
                System.out.println(a);
            }
            int next = a + b;
            a = b;
            b = next;
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
