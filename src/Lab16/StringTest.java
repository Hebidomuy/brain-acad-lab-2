package Lab16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
//Задание 2
        String str = " abc"; // литерал
        String str1 = new String(" abc\t"); //создание строки через new
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data); // создание из массива символов
        String str3 = " abc";
        String str4 = new String(str.getBytes());  //создание из массива байт
        StringBuilder builder = new StringBuilder(" abc");
        String str5 = new String(builder); //использование StringBuilder
//Задание 3
        String str6 = " Апельсин,Яблоко,Гранат,Груша";
        String[] str7 = str6.split(",");
        String max = "";
        for (String strs : str7) {
            System.out.println(strs);
            if (strs.length() > max.length()) {
                max = strs;
            }
        }
        System.out.println(max.toLowerCase());
        System.out.println(max.substring(0, 3));
        String str8 = " Я_новая_строка  ";
        System.out.println(str8.trim().replace('_', ' '));

        Scanner in = new Scanner(System.in);
        System.out.print("Вы ввели: ");
        String text = in.nextLine();
        if (text.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (text.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (text.contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }
//Задание 4
        System.out.println(" 4 -------------------");
        StringBuilder st = new StringBuilder(" ");
        st.append(str)
                .append(str1)
                .append(str2)
                .append(str3)
                .append("\n")
                .append(str4)
                .append(str5)
                .append(str6)
                .append("\n")
                .append(str8);
        System.out.println(st.reverse().toString());
    }
}