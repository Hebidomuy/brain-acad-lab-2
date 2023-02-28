package Lab11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int factorial = MathUtil.calculateFactorial(4);
        System.out.println(factorial);
        System.out.println();

        long[] arifmetica = MathUtil.calculateArithmetic(10L, 4L, 5L);
        System.out.println(Arrays.toString(arifmetica));
        System.out.println();

        long[] geometric = MathUtil.calculateGeometric(50L, 10L, 2L);
        System.out.println(Arrays.toString(geometric));
    }
}
