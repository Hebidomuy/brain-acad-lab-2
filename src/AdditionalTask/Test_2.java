package AdditionalTask;

import java.util.Arrays;

public class Test_2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5};

        int tt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                tt += 1;
            }
        }

        int[] result = new int[arr.length - tt];
        tt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                tt += 1;
            } else {
                result[i - tt] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));

//        int[] distinct = removeDuplicates(arr);
//        System.out.println(Arrays.toString(distinct));
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
