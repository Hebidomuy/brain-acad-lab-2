package Lab15;

class Mobile extends Phone {
    int simCount;
    String display;

   public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");
    }

   public void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон выключется.");
    }

   public void call() {
        System.out.println("Выбираем контакт из меню, звоним.");
    }
}
