package AdditionalTask;

import java.util.Arrays;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Test_1 {
    public static String reverse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        int n = str.length();
        char[] temp = new char[n];
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
        return String.copyValueOf(temp);
    }

    public static void main(String[] args) {
        String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        str = reverse(str);

        System.out.println("The reversed string is " + str);

        System.out.println();
        System.out.println();

        String[] strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

//        int stringsLength = strings.length;
//        String[] result = new String[stringsLength];
//        for (int i = 0; i < stringsLength; i++) {
//            result[i] = strings[stringsLength - 1 - i];
//        }
//        System.out.println(Arrays.toString(result));

        System.out.println();
        System.out.println();

        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = strings[i];
            strings[i] = temp;
        }

        System.out.println(Arrays.toString(strings));
    }
}


//int tmp = array[i];
//array[i] = array[array.length - i - 1];
//array[array.length - i - 1] = tmp;

//String[][] strArray = {{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница"},{"Суббота", "Воскресенье"}};
// System.out.println(String.join(", ", strArray[][]));
//int[] temp = new int[week.length];

//for (int i = 0; i < week.length; i++) {
//  temp[week.length - 1 - i] = week[i];
//}
//for (int i = 0; i < week.length; i++) {
//    week[i] = temp[i];
// }
//}

//if (str == null || str.equals("")){
//    return str;
// }
// int n = str.length();
// char[] temp = new char[n];
// for (int i = 0; i < n; i++){
//   temp[n - i - 1] = str.charAt(i);
// }
// return String.copyValueOf(temp);
//  }
//public static void main(String[] args) {
//String str = "Понедельник Вторник Среда Четверг Пятница Суббота Воскресенье";
//str = reverse(str);

//System.out.println(str);
//}
//}