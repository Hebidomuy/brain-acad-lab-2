package Lab5;

public class Lab5_2_3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 12};
        int max = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max + "  ");
    }
}


