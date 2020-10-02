public class FactorialCalculator {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                String s = args[i];
                if (!s.matches("^[-]?[\\d]+$")) {
                    System.out.printf("'%s' isn't a valid number\n", s);
                    return;
                }
                long num = Long.parseLong(s);
                if (num < 0) {
                    System.out.println("Enter a positive number");
                    return;
                }
                if (num > 20L) {
                    System.out.printf("%d! too big\n", num);
                    return;
                }
                System.out.printf("%s! = %d\n", s, fact(num));
            }
        }
    }

    private static long fact(long x) {
        if (x < 0) return -1L;
        if (x == 0 || x == 1) return 1L;
        return fact(x - 1) * x;
    }
}
