package Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ScriptException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш пример: ");
        String num = in.nextLine();
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        engine.eval(num);
        System.out.println(engine.get("result"));
    }
}