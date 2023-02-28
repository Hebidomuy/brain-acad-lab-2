package Lab4;

import java.io.*;
import java.util.*;

public class Lab4_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 5; a++) {
            sum += a;
            if (a == 1) System.out.println("\nПонедельник");
            if (a == 2) System.out.println("\nВторник");
            if (a == 3) System.out.println("\nСреда");
            if (a == 4) System.out.println("\nЧетверг");
            if (a == 5) System.out.println("\nПятница");
            System.out.println("Это робочий день");
        }
       for (int b = 6; b <= 7; b++) {
            sum += b;
            if (b == 6) System.out.println("\nСуббота");
            if (b == 7) System.out.println("\nВоскресенье");
            System.out.println("Это выходной день!");
            }
        }
    }