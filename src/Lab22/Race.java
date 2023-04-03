package Lab22;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    public static AtomicLong startRaceTime = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(2);
        List<RaceCarRunnable> cars = new ArrayList<>();
        cars.add(new RaceCarRunnable("Car1", 220, 500, startSignal));
        cars.add(new RaceCarRunnable("Car2", 200, 500, startSignal));

        List<Thread> carThreads = new ArrayList<>();
        for (RaceCarRunnable car : cars) {
            carThreads.add(new Thread(car));
        }
        startRace(carThreads);
        startSignal.await();
        String formattedTime = Race.convertToTime(startRaceTime);
        long minFinishTime = Long.MAX_VALUE;
        RaceCarRunnable winner = null;
        for (RaceCarRunnable car : cars) {
            System.out.println(car.getName() + " finished in " + car.getFinishTime() + "ms");
            if (car.getFinishTime() < minFinishTime) {
                minFinishTime = car.getFinishTime();
                winner = car;
            }
        }
        System.out.println("The winner is " + winner.getName() + " with a time of " + winner.getFinishTime() + "ms");
        System.out.println(formattedTime);
        System.out.println("end race ");
        System.out.println("end main thread ");
    }

    public static void startRace(List<Thread> cars) throws InterruptedException {
        Thread startThread = new Thread(new Runnable() {
            public void run() {
                for (int i = 3; i > 0; i--) {
                    System.out.println(i + "...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("GO!!!");
                for (Thread car : cars) {
                    car.start();
                }
                System.out.println("end thread 4");
            }
        });
        startThread.start();
        startRaceTime.set(System.currentTimeMillis());
        startThread.join();
    }

    static String convertToTime(AtomicLong time) {
        SimpleDateFormat format = new SimpleDateFormat("mm:ss.SSS");
        return format.format(time);
    }
}