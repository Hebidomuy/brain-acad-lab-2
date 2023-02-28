package Lab11;

public class MathUtil {
    public static int calculateFactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static long[] calculateArithmetic(long a, long b, long c) {
        long[] result = new long[(int) a];
        for (int i = 0; i < a; i++) {
            result[i] = b;
            b = b + c;
            result[(int) a - 1] = b;
        }
        return result;
    }

    public static long[] calculateGeometric(long r, long t, long y) {
        long[] result = new long[(int) r];
        for (int i = 0; i < r; i++) {
            result[i] = t;
            t = t * y;
        }
        result[(int) r - 1] = t;
        return result;
    }
}