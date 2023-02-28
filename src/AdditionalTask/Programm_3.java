package AdditionalTask;

import java.util.Scanner;

public class Programm_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = in.nextInt();
            System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);

            System.out.println("Для выхода из программы нажмите цифру 1, для подолжения введите любую другую цифру");
            a = in.nextInt();
        }
        while (a != 1);
        in.close();
    }
}
