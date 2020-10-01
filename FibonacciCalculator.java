public class FibonacciCalculator {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                String s = args[i];
                if (!s.matches("^[-]?[\\d]+$")) {
                    System.out.printf("'%s' isn't a valid number\n", s);
                    return;
                }
                long num = Long.parseLong(s);
                System.out.printf("fib %s = %d\n", s, fib(num));
            }
        } else {
            for (long i = 0; i < 10; i++) {
                System.out.printf("fib %d -> %d\n", i, fib(i));
            }
        }
    }

    private static Long fib(long n) {
        if (n < 0) return -1L;
        if (n == 0) {
            return 0L;
        } else if (n == 1L) {
            return 1L;
        }

        return fib(n - 2) + fib(n - 1);
    }
}
