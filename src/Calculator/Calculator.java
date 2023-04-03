package Calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String expression = sc.nextLine();
        double result = calculate(expression);
        System.out.println("Результат: " + result);
    }

    private static double calculate(String expression) {
        // Решаем действия в скобках
        Pattern pattern = Pattern.compile("\\(([^()]+)\\)");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            String subExpression = matcher.group(1);
            double subResult = calculate(subExpression);
            expression = expression.replace("(" + subExpression + ")", Double.toString(subResult));
            matcher.reset(expression);
        }
        // Решаем умножение и деление
        pattern = Pattern.compile("(-?\\d*\\.?\\d+)\\s*([*/])\\s*(-?\\d+\\.?\\d*)");
        matcher = pattern.matcher(expression);
        while (matcher.find()) {
            double num1 = Double.parseDouble(matcher.group(1));
            double num2 = Double.parseDouble(matcher.group(3));
            char operator = matcher.group(2).charAt(0);
            double subResult = operator == '*' ? num1 * num2 : num1 / num2;
            expression = expression.replace(matcher.group(), Double.toString(subResult));
            matcher.reset(expression);
        }
        // Решаем сложение и вычитание
        pattern = Pattern.compile("(-?\\d*\\.?\\d+)\\s*([+-])\\s*(-?\\d+\\.?\\d*)");
        matcher = pattern.matcher(expression);
        double result = 0;
        while (matcher.find()) {
            double num1 = Double.parseDouble(matcher.group(1));
            double num2 = Double.parseDouble(matcher.group(3));
            char operator = matcher.group(2).charAt(0);
            result = operator == '+' ? num1 + num2 : num1 - num2;
            expression = expression.replace(matcher.group(), Double.toString(result));
            matcher.reset(expression);
        }
        return Double.parseDouble(expression);
    }
}