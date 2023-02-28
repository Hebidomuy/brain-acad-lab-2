package Lab15;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

       Mobile mobile = new Mobile();
       DialPhone dialPhone = new DialPhone();
       Multicooker1 multicooker1 = new Multicooker1();
       Oven oven = new Oven();
       SmartPhone smartPhone = new SmartPhone();


        AbstractDevice[] array = new AbstractDevice[5];
        array[0] = new Mobile();
        array[1] = new DialPhone();
        array[2] = new Multicooker1();
        array[3] = new Oven();
        array[4] = new SmartPhone();
        staticPowerOff(array);

        EmailSender[] arr = new EmailSender[2];
        arr[0] = new SmartPhone();
        arr[1] = new Post();
        mailingLetters(arr);
    }

    static void staticPowerOff(AbstractDevice[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].powerOff();
        }
    }
    static void mailingLetters(EmailSender[] arr) {
         for (int i = 0; i < arr.length; i++) {
             arr[i].sendMail();
         }
    }
}
