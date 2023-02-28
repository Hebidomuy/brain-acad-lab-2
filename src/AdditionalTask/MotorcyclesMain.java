package AdditionalTask;

public class MotorcyclesMain {
    public static void main(String[] args) {
        Motorcycle[] motorcycles = new Motorcycle[50];

        for (int i = 0; i < 50; i++) {
            motorcycles[i] = new Motorcycle(String.valueOf(i + 1));
        }

        while (true) {
            if (motorcycles.length > 1) {
                for (int i = 0; i < motorcycles.length; i++) {
                    motorcycles[i].traveledTheDistance(motorcycles[i].gasTank / 2);
                }
                motorcycles = Motorcycle.refueling(motorcycles);
            } else {
                motorcycles[0].traveledTheDistance(motorcycles[0].gasTank);
                break;
            }
        }
        System.out.println(motorcycles[0].getDistance());


//        int motorcycleCount = 50;
//        int km = 100;
//        int destvie1 = km / 2;
//        System.out.println("Мы проехали " + destvie1 + " km.");
//        System.out.println("Все мотоциклы остались с наполовину заполненными баками.");
//        int destvie2 = motorcycleCount / 2;
//        System.out.println("Перелили топливо с одной половины мотоциклов в другую половину.");
//        System.out.println("Теперь у нас " + destvie2 + " мотоциклов с полным баком.");
//        int destvie3 = destvie1;
//        System.out.println("Мы проехали еще " + destvie3 + " km.");
//        for (float i = 25; i >= 7; i /= 2) {
//            System.out.println("Подилили мотоцикли с наполовину заполненными баками. Чтобы узнать сколько мотоциклов с полным баком " + i);
//        }
    }
}