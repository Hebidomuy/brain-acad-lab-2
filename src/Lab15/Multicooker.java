package Lab15;

abstract class Multicooker extends AbstractDevice {

   public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Multicooker запускается.");
    }

   public void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон выключется.");
    }

   public abstract void cook();
}
