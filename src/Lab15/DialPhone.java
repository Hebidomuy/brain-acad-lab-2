package Lab15;

public class DialPhone extends Phone implements Caller {
    boolean hasAnswerphone;

    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. DialPhone запускается.");
    }

    public void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон выключется.");
    }

    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }

    public void autoAnswer() {
        System.out.println("Автоматический ответ");
    }
}
