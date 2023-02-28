package Lab15;

public class SmartPhone extends Mobile implements Caller, EmailSender{
    String os;

    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. SmartPhone запускается.");
    }

    public void runApp() {
    }

    @Override
    public String editMail(String str) {
        return null;
    }

    @Override
    public String createMail(String str) {
        return null;
    }

    @Override
    public void sendMail() {
        System.out.println("5555555555");
    }

    @Override
    public void call() {
    }

}
