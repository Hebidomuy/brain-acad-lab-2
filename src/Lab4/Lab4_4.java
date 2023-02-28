package Lab4;

public class Lab4_4 {
    public static void main(String[] args) {
        if (calculateFactorial(7) > 1000)
            System.out.print("Достигнут максимально возможный результат");
        else System.out.print(calculateFactorial(7));    }
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

