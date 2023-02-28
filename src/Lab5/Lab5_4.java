package Lab5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab5_4 {
    public static void main(String[] args) {
        int [][] mas = new int[10][10];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 200 - 100);
//                System.out.println(Arrays.deepToString(mas));
                //System.out.println(array[i][j] + "\t");
                //Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
            }
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println();
        int min = 600;
        int max = -600;
        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas[i].length; j += 3) {

                if (i > 2 && i <= 5) {
                    if (min > mas[i][j]) {
                        min = mas[i][j];
                    }
                    if (max < mas[i][j]) {
                        max = mas[i][j];
                    }
                    System.out.print(mas[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("минимальное значение " + min);
        System.out.println("максимальное значение " + max);
        System.out.println("Сумма:" + (min + max));
    }
}