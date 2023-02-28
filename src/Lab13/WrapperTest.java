package Lab13;


import java.sql.Date;

public class WrapperTest {
    public static void main(String[] args) {
//Задаине 2
        Character c1 = 'c';
        Character c2 = Character.valueOf('c');
        Character c3 = new Character('c');

        Integer i1 = 10;
        Integer i2 = Integer.valueOf("10");
        Integer i3 = new Integer("10");
        Integer i4 = Integer.parseInt("10");

        Boolean boolean1 = true;
        Boolean boolean2 = Boolean.valueOf("true");
        Boolean boolean3 = new Boolean("true");
        Boolean boolean4 = Boolean.parseBoolean("true");

        Long l1 = 20L;
        Long l2 = Long.valueOf("20");
        Long l3 = new Long("20");
        Long l4 = Long.parseLong("20");

        Float f1 = 1.1f;
        Float f2 = Float.valueOf("1.1f");
        Float f3 = new Float("1.1f");
        Float f4 = Float.parseFloat("1.1f");

        Double d1 = 2.1d;
        Double d2 = Double.valueOf("2.1d");
        Double d3 = new Double("2.1d");
        Double d4 = Double.parseDouble("2.1d");

        Short s1 = 15;
        Short s2 = Short.valueOf("15");
        Short s3 = new Short("15");
        Short s4 = Short.parseShort("15");

        Byte b1 = 5;
        Byte b2 = Byte.valueOf("5");
        Byte b3 = new Byte("5");
        Byte b4 = Byte.parseByte("5");
//Задание 3
        Double d = Double.valueOf("5.0596d");
        byte b0 = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        float f = d.floatValue();
        long l = d.longValue();
//Задание 4
        Double a = 7d;
        Double b = 0.0d;
        Double nanValue = a / b;
        Double infinityValue = b / b;
        if (Double.isNaN(nanValue)) {
            System.out.println("«Переменная {{имя переменной}} = NaN»");
        }
        if (Double.isInfinite(nanValue)) {
            System.out.println("«Переменная {{имя переменной}} = Infinity»");
        }
        if (Double.isNaN(infinityValue)) {
            System.out.println("«Переменная {infinityValue} = NaN»");
        }
        if (Double.isInfinite(infinityValue)) {
            System.out.println("«Переменная {{имя переменной}} = Infinity»");
        }
        System.out.println();
        System.out.println(nanValue);
        System.out.println(infinityValue);

        System.out.println();
//Задание 5
        Long q = 128000L;
        Long w = 127L;
        System.out.println(q.compareTo(w));
    }
}

