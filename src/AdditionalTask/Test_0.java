package AdditionalTask;

import java.util.Arrays;

public class Test_0 {
//    public static void main(String[] args) {
//        int [] mas = new int[3];
//
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * 100);
//        }
//        System.out.println(Arrays.toString(mas));
//
//        boolean flag = true;
//
//        for (int i = 1; i < mas.length; i++) {
//            if (mas[i] <= mas[i - 1]) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println("Массив является строго возрастающей последовательностью");
//        } else {
//            System.out.println("Массив не является строго возрастающей последовательностью");
//        }
//    }
    public static void main(String[] args) {
        int [] mas = new int[3];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mas));

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                System.out.println("Массив не является строго возрастающей последовательностью");
                break;
            }
            if (i == mas.length - 1) {
                System.out.println("Массив является строго возрастающей последовательностью");
            }
        }

    }
}