package Lab14;

public class SecurityGuard extends Employee implements Test{

    public SecurityGuard(String fio, int phoneNumber) {
        super(fio, phoneNumber);
    }

    public void talkOnTheRadio() {
        System.out.println("Охранник говорит по рации");
    }

    @Override
    public void toDoWork() {
        System.out.println("Охранник: следит за сохранностью товара, но и осуществляет контроль за порядком и безопасностью.");
    }

    @Override
    public String toString() {
        return "SecurityGuard{}";
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, guard!");
    }
}
