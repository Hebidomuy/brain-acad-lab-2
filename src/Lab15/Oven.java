package Lab15;

public class Oven extends Multicooker{
    void initTimer(int timer){}

    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Oven запускается.");
    }
    public void cook() {
        System.out.println("Втыкаем вилку в розетку, печь включается.");
    }
}
